package com.jpmc.midascore.entity;

import jakarta.persistence.*;

/**
 * JPA entity that persists a validated financial transaction.
 *
 * Design decisions:
 * ─────────────────
 * • Separate class (not modifying Transaction.java) — Transaction is a DTO
 *   owned by the messaging layer; mixing persistence annotations into it would
 *   violate SRP and couple two concerns.
 * • @ManyToOne to UserRecord — many transactions can share the same sender or
 *   recipient, satisfying the many-to-one relationship requirement.
 * • LAZY fetch — avoids unnecessary JOINs when only the amount is needed.
 * • amount stored as float to match Transaction DTO without silent precision loss.
 */
@Entity
@Table(name = "transaction_record")
public class TransactionRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sender_id", nullable = false)
    private UserRecord sender;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "recipient_id", nullable = false)
    private UserRecord recipient;

    @Column(nullable = false)
    private float amount;

    /** Required by JPA. */
    protected TransactionRecord() {}

    public TransactionRecord(UserRecord sender, UserRecord recipient, float amount) {
        this.sender    = sender;
        this.recipient = recipient;
        this.amount    = amount;
    }

    public long getId()              { return id; }
    public UserRecord getSender()    { return sender; }
    public UserRecord getRecipient() { return recipient; }
    public float getAmount()         { return amount; }
}
