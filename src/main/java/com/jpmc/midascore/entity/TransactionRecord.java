package com.jpmc.midascore.entity;

import jakarta.persistence.*;

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

    /**
     * The incentive awarded by the external Incentive API for this transaction.
     * Added to the recipient's balance but NOT deducted from the sender's balance.
     */
    @Column(nullable = false)
    private float incentive;

    protected TransactionRecord() {
    }

    public TransactionRecord(UserRecord sender, UserRecord recipient, float amount, float incentive) {
        this.sender    = sender;
        this.recipient = recipient;
        this.amount    = amount;
        this.incentive = incentive;
    }

    public long       getId()        { return id; }
    public UserRecord getSender()    { return sender; }
    public UserRecord getRecipient() { return recipient; }
    public float      getAmount()    { return amount; }
    public float      getIncentive() { return incentive; }
}