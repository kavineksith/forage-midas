# Midas Task 3 — Answer

## waldorf's balance after all transactions


⚠️  Automatic parsing could not find waldorf's balance.

**Check the Actions log for the section:**
`=== Lines containing 'balance' or 'waldorf' ===`
and
`=== LAST 150 LINES OF LOG ===`

These are printed directly to the Actions step output above — no download needed.
Find the last balance value next to waldorf and apply `math.floor()`.


---

*(No BEGIN…END block found in test output)*

---

## Files created / modified

| File | Path | Action |
|------|------|--------|
| `TransactionRecord.java`        | `entity/`             | Created — JPA entity |
| `TransactionRepository.java`    | `repository/`         | Created — Spring Data repo |
| `DatabaseConduit.java`          | `component/`          | Written — `save()` + `process()` |
| `TransactionKafkaListener.java` | `component/`          | Rewritten — wires DatabaseConduit |
| `application.yml`               | `src/main/resources/` | Updated — H2 + JPA config |
| `TransactionListener.java`      | `component/`          | **Deleted** — wrong filename |

---

## Full test output

<details>
<summary>Click to expand (full, untruncated)</summary>

```
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------< com.jpmc:midas-core >-------------------------
[INFO] Building midas-core 1.0.0
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ midas-core ---
[INFO] Copying 1 resource from src/main/resources to target/classes
[INFO] Copying 0 resource from src/main/resources to target/classes
[INFO] 
[INFO] --- compiler:3.11.0:compile (default-compile) @ midas-core ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ midas-core ---
[INFO] Copying 5 resources from src/test/resources to target/test-classes
[INFO] 
[INFO] --- compiler:3.11.0:testCompile (default-testCompile) @ midas-core ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- surefire:3.1.2:test (default-test) @ midas-core ---
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running com.jpmc.midascore.TaskThreeTests
10:59:34.851 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.jpmc.midascore.TaskThreeTests]: TaskThreeTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
10:59:34.944 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.jpmc.midascore.MidasCoreApplication for test class com.jpmc.midascore.TaskThreeTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2026-05-14T10:59:35.835Z  INFO 2506 --- [           main] k.utils.Log4jControllerRegistration$     : Registered kafka:type=kafka.Log4jController MBean
2026-05-14T10:59:35.854Z  INFO 2506 --- [           main] org.apache.zookeeper.common.X509Util     : Setting -D jdk.tls.rejectClientInitiatedRenegotiation=true to disable client-initiated TLS renegotiation
2026-05-14T10:59:35.973Z  INFO 2506 --- [-kit-executor-1] kafka.server.ControllerServer            : Formatting /tmp/kafka-6379817192481770054/controller_0 with metadata.version 3.3-IV0.
2026-05-14T10:59:35.975Z  INFO 2506 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Starting controller
2026-05-14T10:59:35.975Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Transition from SHUTDOWN to STARTING
2026-05-14T10:59:35.976Z  INFO 2506 --- [-kit-executor-3] kafka.server.SharedServer                : [SharedServer id=0] Starting SharedServer
2026-05-14T10:59:36.000Z  INFO 2506 --- [-kit-executor-2] o.a.k.s.network.EndpointReadyFutures     : authorizerStart completed for endpoint CONTROLLER. Endpoint is now READY.
2026-05-14T10:59:36.073Z  INFO 2506 --- [-kit-executor-3] kafka.log.UnifiedLog$                    : [LogLoader partition=__cluster_metadata-0, dir=/tmp/kafka-6379817192481770054/controller_0] Loading producer state till offset 0 with message format version 2
2026-05-14T10:59:36.074Z  INFO 2506 --- [-kit-executor-3] kafka.log.UnifiedLog$                    : [LogLoader partition=__cluster_metadata-0, dir=/tmp/kafka-6379817192481770054/controller_0] Reloading from producer snapshot and rebuilding producer state from offset 0
2026-05-14T10:59:36.074Z  INFO 2506 --- [-kit-executor-3] kafka.log.UnifiedLog$                    : [LogLoader partition=__cluster_metadata-0, dir=/tmp/kafka-6379817192481770054/controller_0] Producer state recovery took 0ms for snapshot load and 0ms for segment recovery from offset 0
2026-05-14T10:59:36.113Z  INFO 2506 --- [-kit-executor-3] kafka.raft.KafkaMetadataLog$             : Initialized snapshots with IDs SortedSet() from /tmp/kafka-6379817192481770054/controller_0/__cluster_metadata-0
2026-05-14T10:59:36.142Z  INFO 2506 --- [piration-reaper] ExpirationService$ExpiredOperationReaper : [raft-expiration-reaper]: Starting
2026-05-14T10:59:36.200Z  INFO 2506 --- [-kit-executor-3] org.apache.kafka.raft.QuorumState        : [RaftManager id=0] Completed transition to Unattached(epoch=0, voters=[0], electionTimeoutMs=1028) from null
2026-05-14T10:59:36.204Z  INFO 2506 --- [-kit-executor-3] org.apache.kafka.raft.QuorumState        : [RaftManager id=0] Completed transition to CandidateState(localId=0, epoch=1, retries=1, voteStates={0=GRANTED}, highWatermark=Optional.empty, electionTimeoutMs=1452) from Unattached(epoch=0, voters=[0], electionTimeoutMs=1028)
2026-05-14T10:59:36.209Z  INFO 2506 --- [-kit-executor-3] org.apache.kafka.raft.QuorumState        : [RaftManager id=0] Completed transition to Leader(localId=0, epoch=1, epochStartOffset=0, highWatermark=Optional.empty, voterStates={0=ReplicaState(nodeId=0, endOffset=Optional.empty, lastFetchTimestamp=-1, lastCaughtUpTimestamp=-1, hasAcknowledgedLeader=true)}) from CandidateState(localId=0, epoch=1, retries=1, voteStates={0=GRANTED}, highWatermark=Optional.empty, electionTimeoutMs=1452)
2026-05-14T10:59:36.304Z  INFO 2506 --- [-kit-executor-2] kafka.network.ConnectionQuotas           : Updated connection-accept-rate max connection creation rate to 2147483647
2026-05-14T10:59:36.317Z  INFO 2506 --- [-kit-executor-2] kafka.network.DataPlaneAcceptor          : Awaiting socket connections on localhost:46367.
2026-05-14T10:59:36.317Z  INFO 2506 --- [-kit-executor-2] kafka.network.DataPlaneAcceptor          : Opened wildcard endpoint localhost:46367
2026-05-14T10:59:36.332Z  INFO 2506 --- [-kit-executor-2] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Created data-plane acceptor and processors for endpoint : ListenerName(CONTROLLER)
2026-05-14T10:59:36.336Z  INFO 2506 --- [-request-thread] kafka.raft.RaftSendThread                : [kafka-0-raft-outbound-request-thread]: Starting
2026-05-14T10:59:36.339Z  INFO 2506 --- [-raft-io-thread] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Starting
2026-05-14T10:59:36.355Z  INFO 2506 --- [-raft-io-thread] org.apache.kafka.raft.LeaderState        : [RaftManager id=0] High watermark set to LogOffsetMetadata(offset=1, metadata=Optional[(segmentBaseOffset=0,relativePositionInSegment=91)]) for the first time for epoch 1 based on indexOfHw 0 and voters [ReplicaState(nodeId=0, endOffset=Optional[LogOffsetMetadata(offset=1, metadata=Optional[(segmentBaseOffset=0,relativePositionInSegment=91)])], lastFetchTimestamp=-1, lastCaughtUpTimestamp=-1, hasAcknowledgedLeader=true)]
2026-05-14T10:59:36.357Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] initializeNewPublishers: The loader is still catching up because we have loaded up to offset -1, but the high water mark is 1
2026-05-14T10:59:36.359Z  INFO 2506 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for controller quorum voters future
2026-05-14T10:59:36.359Z  INFO 2506 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for controller quorum voters future
2026-05-14T10:59:36.361Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Starting broker
2026-05-14T10:59:36.372Z  INFO 2506 --- [-raft-io-thread] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Registered the listener org.apache.kafka.image.loader.MetadataLoader@801453245
2026-05-14T10:59:36.377Z  INFO 2506 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Fetch]: Starting
2026-05-14T10:59:36.378Z  INFO 2506 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Produce]: Starting
2026-05-14T10:59:36.379Z  INFO 2506 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Request]: Starting
2026-05-14T10:59:36.380Z  INFO 2506 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-ControllerMutation]: Starting
2026-05-14T10:59:36.385Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] maybePublishMetadata(LOG_DELTA): The loader is still catching up because we have not loaded a controller record as of offset 0 and high water mark is 1
2026-05-14T10:59:36.392Z  INFO 2506 --- [-kit-executor-2] o.a.kafka.controller.QuorumController    : [QuorumController id=0] Creating new QuorumController with clusterId zFRokSANRQOHQqTfaMQNow.
2026-05-14T10:59:36.392Z  INFO 2506 --- [-kit-executor-3] kafka.log.LogManager                     : Log directory /tmp/kafka-6379817192481770054/broker_0_data0 not found, creating it.
2026-05-14T10:59:36.392Z  INFO 2506 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Fetch]: Starting
2026-05-14T10:59:36.393Z  INFO 2506 --- [-raft-io-thread] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Registered the listener org.apache.kafka.controller.QuorumController$QuorumMetaLogListener@537309134
2026-05-14T10:59:36.393Z  INFO 2506 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Produce]: Starting
2026-05-14T10:59:36.393Z  INFO 2506 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Request]: Starting
2026-05-14T10:59:36.394Z  INFO 2506 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-ControllerMutation]: Starting
2026-05-14T10:59:36.395Z  INFO 2506 --- [0-event-handler] o.a.kafka.controller.QuorumController    : [QuorumController id=0] Becoming the active controller at epoch 1, next write offset 1.
2026-05-14T10:59:36.397Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for controller quorum voters future
2026-05-14T10:59:36.397Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for controller quorum voters future
2026-05-14T10:59:36.398Z  WARN 2506 --- [0-event-handler] o.a.kafka.controller.QuorumController    : [QuorumController id=0] Performing controller activation. The metadata log appears to be empty. Appending 1 bootstrap record(s) in metadata transaction at metadata.version 3.6-IV2 from bootstrap source 'testkit'. Setting the ZK migration state to NONE since this is a de-novo KRaft cluster.
2026-05-14T10:59:36.400Z  INFO 2506 --- [0-event-handler] o.a.k.controller.OffsetControlManager    : [QuorumController id=0] Replayed BeginTransactionRecord(name='Bootstrap records') at offset 1.
2026-05-14T10:59:36.402Z  INFO 2506 --- [0-event-handler] o.a.k.controller.FeatureControlManager   : [QuorumController id=0] Replayed a FeatureLevelRecord setting metadata version to 3.6-IV2
2026-05-14T10:59:36.403Z  INFO 2506 --- [0-event-handler] o.a.k.controller.OffsetControlManager    : [QuorumController id=0] Replayed EndTransactionRecord() at offset 4.
2026-05-14T10:59:36.405Z  INFO 2506 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Starting
2026-05-14T10:59:36.406Z  INFO 2506 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Recorded new controller, from now on will use node localhost:46367 (id: 0 rack: null)
2026-05-14T10:59:36.416Z  INFO 2506 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Starting
2026-05-14T10:59:36.442Z  INFO 2506 --- [-kit-executor-3] kafka.network.ConnectionQuotas           : Updated connection-accept-rate max connection creation rate to 2147483647
2026-05-14T10:59:36.443Z  INFO 2506 --- [-kit-executor-3] kafka.network.DataPlaneAcceptor          : Awaiting socket connections on localhost:34831.
2026-05-14T10:59:36.443Z  INFO 2506 --- [-kit-executor-3] kafka.network.DataPlaneAcceptor          : Opened wildcard endpoint localhost:34831
2026-05-14T10:59:36.445Z  INFO 2506 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for the controller metadata publishers to be installed
2026-05-14T10:59:36.447Z  INFO 2506 --- [-kit-executor-3] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Created data-plane acceptor and processors for endpoint : ListenerName(EXTERNAL)
2026-05-14T10:59:36.448Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] maybePublishMetadata(LOG_DELTA): The loader finished catching up to the current high water mark of 5
2026-05-14T10:59:36.448Z  INFO 2506 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for the controller metadata publishers to be installed
2026-05-14T10:59:36.449Z  INFO 2506 --- [-kit-executor-2] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Enabling request processing.
2026-05-14T10:59:36.453Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing SnapshotGenerator with a snapshot at offset 4
2026-05-14T10:59:36.454Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing FeaturesPublisher with a snapshot at offset 4
2026-05-14T10:59:36.454Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing DynamicConfigPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:59:36.454Z  INFO 2506 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Starting
2026-05-14T10:59:36.455Z  INFO 2506 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for all of the authorizer futures to be completed
2026-05-14T10:59:36.457Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing DynamicClientQuotaPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:59:36.457Z  INFO 2506 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Recorded new controller, from now on will use node localhost:46367 (id: 0 rack: null)
2026-05-14T10:59:36.457Z  INFO 2506 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for all of the authorizer futures to be completed
2026-05-14T10:59:36.458Z  INFO 2506 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for all of the SocketServer Acceptors to be started
2026-05-14T10:59:36.458Z  INFO 2506 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for all of the SocketServer Acceptors to be started
2026-05-14T10:59:36.459Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing ScramPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:59:36.460Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing DelegationTokenPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:59:36.462Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing ControllerMetadataMetricsPublisher with a snapshot at offset 4
2026-05-14T10:59:36.464Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing AclPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:59:36.477Z  INFO 2506 --- [eaper-0-Produce] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Produce]: Starting
2026-05-14T10:59:36.478Z  INFO 2506 --- [0-DeleteRecords] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-DeleteRecords]: Starting
2026-05-14T10:59:36.479Z  INFO 2506 --- [r-0-ElectLeader] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-ElectLeader]: Starting
2026-05-14T10:59:36.478Z  INFO 2506 --- [nReaper-0-Fetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Fetch]: Starting
2026-05-14T10:59:36.481Z  INFO 2506 --- [r-0-RemoteFetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-RemoteFetch]: Starting
2026-05-14T10:59:36.496Z  INFO 2506 --- [per-0-Heartbeat] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Heartbeat]: Starting
2026-05-14T10:59:36.497Z  INFO 2506 --- [per-0-Rebalance] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Rebalance]: Starting
2026-05-14T10:59:36.528Z  INFO 2506 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Starting
2026-05-14T10:59:36.529Z  INFO 2506 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Recorded new controller, from now on will use node localhost:46367 (id: 0 rack: null)
2026-05-14T10:59:36.533Z  INFO 2506 --- [r-event-handler] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Incarnation rWRFKW90RYWNXP_2GXKiSQ of broker 0 in cluster zFRokSANRQOHQqTfaMQNow is now STARTING.
2026-05-14T10:59:36.545Z  INFO 2506 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Starting
2026-05-14T10:59:36.561Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the broker metadata publishers to be installed
2026-05-14T10:59:36.563Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the broker metadata publishers to be installed
2026-05-14T10:59:36.563Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the controller to acknowledge that we are caught up
2026-05-14T10:59:36.564Z  INFO 2506 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing BrokerMetadataPublisher with a snapshot at offset 4
2026-05-14T10:59:36.564Z  INFO 2506 --- [r-event-handler] k.s.metadata.BrokerMetadataPublisher     : [BrokerMetadataPublisher id=0] Publishing initial metadata at offset OffsetAndEpoch(offset=4, epoch=1) with metadata.version 3.6-IV2.
2026-05-14T10:59:36.565Z  INFO 2506 --- [r-event-handler] kafka.log.LogManager                     : Loading logs from log dirs ArraySeq(/tmp/kafka-6379817192481770054/broker_0_data0)
2026-05-14T10:59:36.569Z  INFO 2506 --- [r-event-handler] kafka.log.LogManager                     : No logs found to be loaded in /tmp/kafka-6379817192481770054/broker_0_data0
2026-05-14T10:59:36.580Z  INFO 2506 --- [r-event-handler] kafka.log.LogManager                     : Loaded 0 logs in 14ms
2026-05-14T10:59:36.588Z  INFO 2506 --- [r-event-handler] kafka.log.LogManager                     : Starting log cleanup with a period of 300000 ms.
2026-05-14T10:59:36.591Z  INFO 2506 --- [r-event-handler] kafka.log.LogManager                     : Starting log flusher with a default period of 9223372036854775807 ms.
2026-05-14T10:59:36.595Z  INFO 2506 --- [0-event-handler] o.a.k.controller.ClusterControlManager   : [QuorumController id=0] Replayed initial RegisterBrokerRecord for broker 0: RegisterBrokerRecord(brokerId=0, isMigratingZkBroker=false, incarnationId=rWRFKW90RYWNXP_2GXKiSQ, brokerEpoch=5, endPoints=[BrokerEndpoint(name='EXTERNAL', host='localhost', port=34831, securityProtocol=0)], features=[BrokerFeature(name='metadata.version', minSupportedVersion=1, maxSupportedVersion=14)], rack=null, fenced=true, inControlledShutdown=false)
2026-05-14T10:59:36.602Z  INFO 2506 --- [r-event-handler] kafka.log.LogCleaner                     : Starting the log cleaner
2026-05-14T10:59:36.608Z  INFO 2506 --- [leaner-thread-0] kafka.log.LogCleaner$CleanerThread       : [kafka-log-cleaner-thread-0]: Starting
2026-05-14T10:59:36.616Z  INFO 2506 --- [rFailureHandler] k.s.ReplicaManager$LogDirFailureHandler  : [LogDirFailureHandler]: Starting
2026-05-14T10:59:36.620Z  INFO 2506 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Starting up.
2026-05-14T10:59:36.622Z  INFO 2506 --- [nSenderThread-0] kafka.server.AddPartitionsToTxnManager   : [AddPartitionsToTxnSenderThread-0]: Starting
2026-05-14T10:59:36.623Z  INFO 2506 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Startup complete.
2026-05-14T10:59:36.623Z  INFO 2506 --- [r-event-handler] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Starting up.
2026-05-14T10:59:36.625Z  INFO 2506 --- [r-event-handler] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Startup complete.
2026-05-14T10:59:36.625Z  INFO 2506 --- [r-event-handler] k.s.metadata.BrokerMetadataPublisher     : [BrokerMetadataPublisher id=0] Updating metadata.version to 14 at offset OffsetAndEpoch(offset=4, epoch=1).
2026-05-14T10:59:36.626Z  INFO 2506 --- [rSenderThread-0] k.c.t.TransactionMarkerChannelManager    : [TxnMarkerSenderThread-0]: Starting
2026-05-14T10:59:36.629Z  INFO 2506 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Successfully registered broker 0 with broker epoch 5
2026-05-14T10:59:36.648Z  INFO 2506 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] The broker has caught up. Transitioning from STARTING to RECOVERY.
2026-05-14T10:59:36.648Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the controller to acknowledge that we are caught up
2026-05-14T10:59:36.648Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the initial broker metadata update to be published
2026-05-14T10:59:36.648Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the initial broker metadata update to be published
2026-05-14T10:59:36.650Z  INFO 2506 --- [-kit-executor-3] kafka.server.KafkaConfig                 : KafkaConfig values: 
	advertised.listeners = null
	alter.config.policy.class.name = null
	alter.log.dirs.replication.quota.window.num = 11
	alter.log.dirs.replication.quota.window.size.seconds = 1
	authorizer.class.name = 
	auto.create.topics.enable = true
	auto.include.jmx.reporter = true
	auto.leader.rebalance.enable = true
	background.threads = 10
	broker.heartbeat.interval.ms = 2000
	broker.id = 0
	broker.id.generation.enable = true
	broker.rack = null
	broker.session.timeout.ms = 9000
	client.quota.callback.class = null
	compression.type = producer
	connection.failed.authentication.delay.ms = 100
	connections.max.idle.ms = 600000
	connections.max.reauth.ms = 0
	control.plane.listener.name = null
	controlled.shutdown.enable = true
	controlled.shutdown.max.retries = 3
	controlled.shutdown.retry.backoff.ms = 5000
	controller.listener.names = CONTROLLER
	controller.quorum.append.linger.ms = 25
	controller.quorum.election.backoff.max.ms = 1000
	controller.quorum.election.timeout.ms = 1000
	controller.quorum.fetch.timeout.ms = 2000
	controller.quorum.request.timeout.ms = 2000
	controller.quorum.retry.backoff.ms = 20
	controller.quorum.voters = [0@0.0.0.0:0]
	controller.quota.window.num = 11
	controller.quota.window.size.seconds = 1
	controller.socket.timeout.ms = 30000
	create.topic.policy.class.name = null
	default.replication.factor = 1
	delegation.token.expiry.check.interval.ms = 3600000
	delegation.token.expiry.time.ms = 86400000
	delegation.token.master.key = null
	delegation.token.max.lifetime.ms = 604800000
	delegation.token.secret.key = null
	delete.records.purgatory.purge.interval.requests = 1
	delete.topic.enable = true
	early.start.listeners = null
	fetch.max.bytes = 57671680
	fetch.purgatory.purge.interval.requests = 1000
	group.consumer.assignors = [org.apache.kafka.coordinator.group.assignor.RangeAssignor]
	group.consumer.heartbeat.interval.ms = 5000
	group.consumer.max.heartbeat.interval.ms = 15000
	group.consumer.max.session.timeout.ms = 60000
	group.consumer.max.size = 2147483647
	group.consumer.min.heartbeat.interval.ms = 5000
	group.consumer.min.session.timeout.ms = 45000
	group.consumer.session.timeout.ms = 45000
	group.coordinator.new.enable = false
	group.coordinator.threads = 1
	group.initial.rebalance.delay.ms = 0
	group.max.session.timeout.ms = 1800000
	group.max.size = 2147483647
	group.min.session.timeout.ms = 6000
	initial.broker.registration.timeout.ms = 60000
	inter.broker.listener.name = EXTERNAL
	inter.broker.protocol.version = 3.6-IV2
	kafka.metrics.polling.interval.secs = 10
	kafka.metrics.reporters = []
	leader.imbalance.check.interval.seconds = 300
	leader.imbalance.per.broker.percentage = 10
	listener.security.protocol.map = EXTERNAL:PLAINTEXT,CONTROLLER:PLAINTEXT
	listeners = EXTERNAL://localhost:0,CONTROLLER://localhost:0
	log.cleaner.backoff.ms = 15000
	log.cleaner.dedupe.buffer.size = 2097152
	log.cleaner.delete.retention.ms = 86400000
	log.cleaner.enable = true
	log.cleaner.io.buffer.load.factor = 0.9
	log.cleaner.io.buffer.size = 524288
	log.cleaner.io.max.bytes.per.second = 1.7976931348623157E308
	log.cleaner.max.compaction.lag.ms = 9223372036854775807
	log.cleaner.min.cleanable.ratio = 0.5
	log.cleaner.min.compaction.lag.ms = 0
	log.cleaner.threads = 1
	log.cleanup.policy = [delete]
	log.dir = /tmp/kafka-logs
	log.dirs = /tmp/kafka-6379817192481770054/broker_0_data0
	log.flush.interval.messages = 9223372036854775807
	log.flush.interval.ms = null
	log.flush.offset.checkpoint.interval.ms = 60000
	log.flush.scheduler.interval.ms = 9223372036854775807
	log.flush.start.offset.checkpoint.interval.ms = 60000
	log.index.interval.bytes = 4096
	log.index.size.max.bytes = 10485760
	log.local.retention.bytes = -2
	log.local.retention.ms = -2
	log.message.downconversion.enable = true
	log.message.format.version = 3.0-IV1
	log.message.timestamp.after.max.ms = 9223372036854775807
	log.message.timestamp.before.max.ms = 9223372036854775807
	log.message.timestamp.difference.max.ms = 9223372036854775807
	log.message.timestamp.type = CreateTime
	log.preallocate = false
	log.retention.bytes = -1
	log.retention.check.interval.ms = 300000
	log.retention.hours = 168
	log.retention.minutes = null
	log.retention.ms = null
	log.roll.hours = 168
	log.roll.jitter.hours = 0
	log.roll.jitter.ms = null
	log.roll.ms = null
	log.segment.bytes = 1073741824
	log.segment.delete.delay.ms = 60000
	max.connection.creation.rate = 2147483647
	max.connections = 2147483647
	max.connections.per.ip = 2147483647
	max.connections.per.ip.overrides = 
	max.incremental.fetch.session.cache.slots = 1000
	message.max.bytes = 1048588
	metadata.log.dir = /tmp/kafka-6379817192481770054/controller_0
	metadata.log.max.record.bytes.between.snapshots = 20971520
	metadata.log.max.snapshot.interval.ms = 3600000
	metadata.log.segment.bytes = 1073741824
	metadata.log.segment.min.bytes = 8388608
	metadata.log.segment.ms = 604800000
	metadata.max.idle.interval.ms = 500
	metadata.max.retention.bytes = 104857600
	metadata.max.retention.ms = 604800000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	min.insync.replicas = 1
	node.id = 0
	num.io.threads = 8
	num.network.threads = 3
	num.partitions = 1
	num.recovery.threads.per.data.dir = 1
	num.replica.alter.log.dirs.threads = null
	num.replica.fetchers = 1
	offset.metadata.max.bytes = 4096
	offsets.commit.required.acks = -1
	offsets.commit.timeout.ms = 5000
	offsets.load.buffer.size = 5242880
	offsets.retention.check.interval.ms = 600000
	offsets.retention.minutes = 10080
	offsets.topic.compression.codec = 0
	offsets.topic.num.partitions = 50
	offsets.topic.replication.factor = 1
	offsets.topic.segment.bytes = 104857600
	password.encoder.cipher.algorithm = AES/CBC/PKCS5Padding
	password.encoder.iterations = 4096
	password.encoder.key.length = 128
	password.encoder.keyfactory.algorithm = null
	password.encoder.old.secret = null
	password.encoder.secret = null
	principal.builder.class = class org.apache.kafka.common.security.authenticator.DefaultKafkaPrincipalBuilder
	process.roles = [broker, controller]
	producer.id.expiration.check.interval.ms = 600000
	producer.id.expiration.ms = 86400000
	producer.purgatory.purge.interval.requests = 1000
	queued.max.request.bytes = -1
	queued.max.requests = 500
	quota.window.num = 11
	quota.window.size.seconds = 1
	remote.log.index.file.cache.total.size.bytes = 1073741824
	remote.log.manager.task.interval.ms = 30000
	remote.log.manager.task.retry.backoff.max.ms = 30000
	remote.log.manager.task.retry.backoff.ms = 500
	remote.log.manager.task.retry.jitter = 0.2
	remote.log.manager.thread.pool.size = 10
	remote.log.metadata.custom.metadata.max.bytes = 128
	remote.log.metadata.manager.class.name = org.apache.kafka.server.log.remote.metadata.storage.TopicBasedRemoteLogMetadataManager
	remote.log.metadata.manager.class.path = null
	remote.log.metadata.manager.impl.prefix = rlmm.config.
	remote.log.metadata.manager.listener.name = null
	remote.log.reader.max.pending.tasks = 100
	remote.log.reader.threads = 10
	remote.log.storage.manager.class.name = null
	remote.log.storage.manager.class.path = null
	remote.log.storage.manager.impl.prefix = rsm.config.
	remote.log.storage.system.enable = false
	replica.fetch.backoff.ms = 1000
	replica.fetch.max.bytes = 1048576
	replica.fetch.min.bytes = 1
	replica.fetch.response.max.bytes = 10485760
	replica.fetch.wait.max.ms = 500
	replica.high.watermark.checkpoint.interval.ms = 5000
	replica.lag.time.max.ms = 30000
	replica.selector.class = null
	replica.socket.receive.buffer.bytes = 65536
	replica.socket.timeout.ms = 30000
	replication.quota.window.num = 11
	replication.quota.window.size.seconds = 1
	request.timeout.ms = 30000
	reserved.broker.max.id = 1000
	sasl.client.callback.handler.class = null
	sasl.enabled.mechanisms = [GSSAPI]
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.principal.to.local.rules = [DEFAULT]
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism.controller.protocol = GSSAPI
	sasl.mechanism.inter.broker.protocol = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	sasl.server.callback.handler.class = null
	sasl.server.max.receive.size = 524288
	security.inter.broker.protocol = PLAINTEXT
	security.providers = null
	server.max.startup.time.ms = 600000
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	socket.listen.backlog.size = 50
	socket.receive.buffer.bytes = 102400
	socket.request.max.bytes = 104857600
	socket.send.buffer.bytes = 102400
	ssl.cipher.suites = []
	ssl.client.auth = none
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.principal.mapping.rules = DEFAULT
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	transaction.abort.timed.out.transaction.cleanup.interval.ms = 10000
	transaction.max.timeout.ms = 900000
	transaction.partition.verification.enable = true
	transaction.remove.expired.transaction.cleanup.interval.ms = 3600000
	transaction.state.log.load.buffer.size = 5242880
	transaction.state.log.min.isr = 2
	transaction.state.log.num.partitions = 50
	transaction.state.log.replication.factor = 3
	transaction.state.log.segment.bytes = 104857600
	transactional.id.expiration.ms = 604800000
	unclean.leader.election.enable = false
	unstable.api.versions.enable = false
	zookeeper.clientCnxnSocket = null
	zookeeper.connect = null
	zookeeper.connection.timeout.ms = null
	zookeeper.max.in.flight.requests = 10
	zookeeper.metadata.migration.enable = false
	zookeeper.metadata.migration.min.batch.size = 200
	zookeeper.session.timeout.ms = 18000
	zookeeper.set.acl = false
	zookeeper.ssl.cipher.suites = null
	zookeeper.ssl.client.enable = false
	zookeeper.ssl.crl.enable = false
	zookeeper.ssl.enabled.protocols = null
	zookeeper.ssl.endpoint.identification.algorithm = HTTPS
	zookeeper.ssl.keystore.location = null
	zookeeper.ssl.keystore.password = null
	zookeeper.ssl.keystore.type = null
	zookeeper.ssl.ocsp.enable = false
	zookeeper.ssl.protocol = TLSv1.2
	zookeeper.ssl.truststore.location = null
	zookeeper.ssl.truststore.password = null
	zookeeper.ssl.truststore.type = null

2026-05-14T10:59:36.656Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the broker to be unfenced
2026-05-14T10:59:36.658Z  INFO 2506 --- [0-event-handler] o.a.k.controller.BrokerHeartbeatManager  : [QuorumController id=0] The request from broker 0 to unfence has been granted because it has caught up with the offset of its register broker record 5.
2026-05-14T10:59:36.662Z  INFO 2506 --- [0-event-handler] o.a.k.controller.ClusterControlManager   : [QuorumController id=0] Replayed BrokerRegistrationChangeRecord modifying the registration for broker 0: BrokerRegistrationChangeRecord(brokerId=0, brokerEpoch=5, fenced=-1, inControlledShutdown=0)
2026-05-14T10:59:36.690Z  INFO 2506 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] The broker has been unfenced. Transitioning from RECOVERY to RUNNING.
2026-05-14T10:59:36.690Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the broker to be unfenced
2026-05-14T10:59:36.690Z  INFO 2506 --- [-kit-executor-3] o.a.k.s.network.EndpointReadyFutures     : authorizerStart completed for endpoint EXTERNAL. Endpoint is now READY.
2026-05-14T10:59:36.691Z  INFO 2506 --- [-kit-executor-3] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Enabling request processing.
2026-05-14T10:59:36.692Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for all of the authorizer futures to be completed
2026-05-14T10:59:36.692Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for all of the authorizer futures to be completed
2026-05-14T10:59:36.692Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for all of the SocketServer Acceptors to be started
2026-05-14T10:59:36.692Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for all of the SocketServer Acceptors to be started
2026-05-14T10:59:36.692Z  INFO 2506 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Transition from STARTING to STARTED
2026-05-14T10:59:36.700Z  INFO 2506 --- [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
	auto.include.jmx.reporter = true
	bootstrap.servers = [localhost:34831]
	client.dns.lookup = use_all_dns_ips
	client.id = 
	connections.max.idle.ms = 300000
	default.api.timeout.ms = 60000
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retries = 2147483647
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS

2026-05-14T10:59:36.719Z  INFO 2506 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.6.2
2026-05-14T10:59:36.719Z  INFO 2506 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: c4deed513057c94e
2026-05-14T10:59:36.719Z  INFO 2506 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1778756376719
2026-05-14T10:59:36.724Z  INFO 2506 --- [| adminclient-1] o.a.kafka.common.utils.AppInfoParser     : App info kafka.admin.client for adminclient-1 unregistered
2026-05-14T10:59:36.724Z  INFO 2506 --- [| adminclient-1] o.a.k.c.a.i.AdminMetadataManager         : [AdminClient clientId=adminclient-1] Metadata update failed

org.apache.kafka.common.errors.TimeoutException: Timed out waiting to send the call. Call: fetchMetadata

2026-05-14T10:59:36.727Z  INFO 2506 --- [| adminclient-1] o.a.k.clients.admin.KafkaAdminClient     : [AdminClient clientId=adminclient-1] Timed out 1 remaining operation(s) during close.
2026-05-14T10:59:36.730Z  INFO 2506 --- [| adminclient-1] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2026-05-14T10:59:36.731Z  INFO 2506 --- [| adminclient-1] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2026-05-14T10:59:36.731Z  INFO 2506 --- [| adminclient-1] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2026-05-14T10:59:36.738Z  INFO 2506 --- [           main] com.jpmc.midascore.TaskThreeTests        : Starting TaskThreeTests using Java 17.0.18 with PID 2506 (started by runner in /home/runner/work/forage-midas/forage-midas)
2026-05-14T10:59:36.739Z  INFO 2506 --- [           main] com.jpmc.midascore.TaskThreeTests        : No active profile set, falling back to 1 default profile: "default"
2026-05-14T10:59:37.282Z  INFO 2506 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-05-14T10:59:37.329Z  INFO 2506 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 41 ms. Found 2 JPA repository interfaces.
2026-05-14T10:59:37.754Z  INFO 2506 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-05-14T10:59:37.789Z  INFO 2506 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.4.4.Final
2026-05-14T10:59:37.815Z  INFO 2506 --- [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-05-14T10:59:37.979Z  INFO 2506 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-05-14T10:59:38.001Z  INFO 2506 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-05-14T10:59:38.139Z  INFO 2506 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:midasdb user=SA
2026-05-14T10:59:38.140Z  INFO 2506 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-05-14T10:59:38.157Z  WARN 2506 --- [           main] org.hibernate.orm.deprecation            : HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-05-14T10:59:38.931Z  INFO 2506 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-05-14T10:59:38.969Z  INFO 2506 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-05-14T10:59:39.429Z  WARN 2506 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-05-14T10:59:39.614Z  INFO 2506 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:midasdb'
2026-05-14T10:59:39.712Z  INFO 2506 --- [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 5000
	auto.include.jmx.reporter = true
	auto.offset.reset = earliest
	bootstrap.servers = []
	check.crcs = true
	client.dns.lookup = use_all_dns_ips
	client.id = consumer-midas-consumer-group-1
	client.rack = 
	connections.max.idle.ms = 540000
	default.api.timeout.ms = 60000
	enable.auto.commit = false
	exclude.internal.topics = true
	fetch.max.bytes = 52428800
	fetch.max.wait.ms = 500
	fetch.min.bytes = 1
	group.id = midas-consumer-group
	group.instance.id = null
	heartbeat.interval.ms = 3000
	interceptor.classes = []
	internal.leave.group.on.close = true
	internal.throw.on.fetch.stable.offset.unsupported = false
	isolation.level = read_uncommitted
	key.deserializer = class org.apache.kafka.common.serialization.StringDeserializer
	max.partition.fetch.bytes = 1048576
	max.poll.interval.ms = 300000
	max.poll.records = 500
	metadata.max.age.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partition.assignment.strategy = [class org.apache.kafka.clients.consumer.RangeAssignor, class org.apache.kafka.clients.consumer.CooperativeStickyAssignor]
	receive.buffer.bytes = 65536
	reconnect.backoff.max.ms = 1000
	reconnect.backoff.ms = 50
	request.timeout.ms = 30000
	retry.backoff.ms = 100
	sasl.client.callback.handler.class = null
	sasl.jaas.config = null
	sasl.kerberos.kinit.cmd = /usr/bin/kinit
	sasl.kerberos.min.time.before.relogin = 60000
	sasl.kerberos.service.name = null
	sasl.kerberos.ticket.renew.jitter = 0.05
	sasl.kerberos.ticket.renew.window.factor = 0.8
	sasl.login.callback.handler.class = null
	sasl.login.class = null
	sasl.login.connect.timeout.ms = null
	sasl.login.read.timeout.ms = null
	sasl.login.refresh.buffer.seconds = 300
	sasl.login.refresh.min.period.seconds = 60
	sasl.login.refresh.window.factor = 0.8
	sasl.login.refresh.window.jitter = 0.05
	sasl.login.retry.backoff.max.ms = 10000
	sasl.login.retry.backoff.ms = 100
	sasl.mechanism = GSSAPI
	sasl.oauthbearer.clock.skew.seconds = 30
	sasl.oauthbearer.expected.audience = null
	sasl.oauthbearer.expected.issuer = null
	sasl.oauthbearer.jwks.endpoint.refresh.ms = 3600000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.max.ms = 10000
	sasl.oauthbearer.jwks.endpoint.retry.backoff.ms = 100
	sasl.oauthbearer.jwks.endpoint.url = null
	sasl.oauthbearer.scope.claim.name = scope
	sasl.oauthbearer.sub.claim.name = sub
	sasl.oauthbearer.token.endpoint.url = null
	security.protocol = PLAINTEXT
	security.providers = null
	send.buffer.bytes = 131072
	session.timeout.ms = 45000
	socket.connection.setup.timeout.max.ms = 30000
	socket.connection.setup.timeout.ms = 10000
	ssl.cipher.suites = null
	ssl.enabled.protocols = [TLSv1.2, TLSv1.3]
	ssl.endpoint.identification.algorithm = https
	ssl.engine.factory.class = null
	ssl.key.password = null
	ssl.keymanager.algorithm = SunX509
	ssl.keystore.certificate.chain = null
	ssl.keystore.key = null
	ssl.keystore.location = null
	ssl.keystore.password = null
	ssl.keystore.type = JKS
	ssl.protocol = TLSv1.3
	ssl.provider = null
	ssl.secure.random.implementation = null
	ssl.trustmanager.algorithm = PKIX
	ssl.truststore.certificates = null
	ssl.truststore.location = null
	ssl.truststore.password = null
	ssl.truststore.type = JKS
	value.deserializer = class org.springframework.kafka.support.serializer.JsonDeserializer

2026-05-14T10:59:39.716Z  INFO 2506 --- [           main] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2026-05-14T10:59:39.717Z  INFO 2506 --- [           main] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2026-05-14T10:59:39.717Z  INFO 2506 --- [           main] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2026-05-14T10:59:39.717Z  INFO 2506 --- [           main] o.a.kafka.common.utils.AppInfoParser     : App info kafka.consumer for consumer-midas-consumer-group-1 unregistered
2026-05-14T10:59:39.719Z  WARN 2506 --- [           main] o.s.w.c.s.GenericWebApplicationContext   : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Failed to start bean 'org.springframework.kafka.config.internalKafkaListenerEndpointRegistry'
2026-05-14T10:59:39.722Z  INFO 2506 --- [-kit-executor-4] kafka.server.BrokerServer                : [BrokerServer id=0] Transition from STARTED to SHUTTING_DOWN
2026-05-14T10:59:39.722Z  INFO 2506 --- [-kit-executor-4] kafka.server.BrokerServer                : [BrokerServer id=0] shutting down
2026-05-14T10:59:39.723Z  INFO 2506 --- [r-event-handler] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Beginning controlled shutdown.
2026-05-14T10:59:39.726Z  INFO 2506 --- [0-event-handler] o.a.k.controller.BrokerHeartbeatManager  : [QuorumController id=0] Unfenced broker 0 has requested and been granted an immediate shutdown.
2026-05-14T10:59:39.726Z  INFO 2506 --- [0-event-handler] o.a.k.controller.ClusterControlManager   : [QuorumController id=0] Replayed BrokerRegistrationChangeRecord modifying the registration for broker 0: BrokerRegistrationChangeRecord(brokerId=0, brokerEpoch=5, fenced=1, inControlledShutdown=0)
2026-05-14T10:59:39.754Z  INFO 2506 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] The controller has asked us to exit controlled shutdown.
2026-05-14T10:59:39.755Z  INFO 2506 --- [channel-manager] org.apache.kafka.queue.KafkaEventQueue   : [BrokerLifecycleManager id=0] beginShutdown: shutting down event queue.
2026-05-14T10:59:39.755Z  INFO 2506 --- [r-event-handler] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Transitioning from PENDING_CONTROLLED_SHUTDOWN to SHUTTING_DOWN.
2026-05-14T10:59:39.756Z  INFO 2506 --- [r-event-handler] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Shutting down
2026-05-14T10:59:39.756Z  INFO 2506 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Stopped
2026-05-14T10:59:39.756Z  INFO 2506 --- [r-event-handler] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Shutdown completed
2026-05-14T10:59:39.757Z  INFO 2506 --- [-kit-executor-4] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Stopping socket server request processors
2026-05-14T10:59:39.767Z  INFO 2506 --- [r-event-handler] k.s.BrokerToControllerChannelManagerImpl : Broker to controller channel manager for heartbeat shutdown
2026-05-14T10:59:39.767Z  INFO 2506 --- [-kit-executor-4] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Stopped socket server request processors
2026-05-14T10:59:39.768Z  INFO 2506 --- [-kit-executor-4] kafka.server.KafkaRequestHandlerPool     : [data-plane Kafka Request Handler on Broker 0], shutting down
2026-05-14T10:59:39.769Z  INFO 2506 --- [-kit-executor-4] kafka.server.KafkaRequestHandlerPool     : [data-plane Kafka Request Handler on Broker 0], shut down completely
2026-05-14T10:59:39.770Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Shutting down
2026-05-14T10:59:39.770Z  INFO 2506 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Stopped
2026-05-14T10:59:39.770Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Shutdown completed
2026-05-14T10:59:39.771Z  INFO 2506 --- [-kit-executor-4] kafka.server.KafkaApis                   : [KafkaApi-0] Shutdown complete.
2026-05-14T10:59:39.773Z  INFO 2506 --- [-kit-executor-4] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Shutting down.
2026-05-14T10:59:39.774Z  INFO 2506 --- [-kit-executor-4] k.c.transaction.TransactionStateManager  : [Transaction State Manager 0]: Shutdown complete
2026-05-14T10:59:39.774Z  INFO 2506 --- [-kit-executor-4] k.c.t.TransactionMarkerChannelManager    : [TxnMarkerSenderThread-0]: Shutting down
2026-05-14T10:59:39.774Z  INFO 2506 --- [rSenderThread-0] k.c.t.TransactionMarkerChannelManager    : [TxnMarkerSenderThread-0]: Stopped
2026-05-14T10:59:39.774Z  INFO 2506 --- [-kit-executor-4] k.c.t.TransactionMarkerChannelManager    : [TxnMarkerSenderThread-0]: Shutdown completed
2026-05-14T10:59:39.776Z  INFO 2506 --- [-kit-executor-4] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Shutdown complete.
2026-05-14T10:59:39.776Z  INFO 2506 --- [-kit-executor-4] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Shutting down.
2026-05-14T10:59:39.777Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Heartbeat]: Shutting down
2026-05-14T10:59:39.777Z  INFO 2506 --- [per-0-Heartbeat] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Heartbeat]: Stopped
2026-05-14T10:59:39.778Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Heartbeat]: Shutdown completed
2026-05-14T10:59:39.778Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Rebalance]: Shutting down
2026-05-14T10:59:39.778Z  INFO 2506 --- [per-0-Rebalance] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Rebalance]: Stopped
2026-05-14T10:59:39.779Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Rebalance]: Shutdown completed
2026-05-14T10:59:39.779Z  INFO 2506 --- [-kit-executor-4] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Shutdown complete.
2026-05-14T10:59:39.780Z  INFO 2506 --- [-kit-executor-4] kafka.server.ReplicaManager              : [ReplicaManager broker=0] Shutting down
2026-05-14T10:59:39.780Z  INFO 2506 --- [-kit-executor-4] k.s.ReplicaManager$LogDirFailureHandler  : [LogDirFailureHandler]: Shutting down
2026-05-14T10:59:39.780Z  INFO 2506 --- [-kit-executor-4] k.s.ReplicaManager$LogDirFailureHandler  : [LogDirFailureHandler]: Shutdown completed
2026-05-14T10:59:39.781Z  INFO 2506 --- [-kit-executor-4] kafka.server.ReplicaFetcherManager       : [ReplicaFetcherManager on broker 0] shutting down
2026-05-14T10:59:39.781Z  INFO 2506 --- [rFailureHandler] k.s.ReplicaManager$LogDirFailureHandler  : [LogDirFailureHandler]: Stopped
2026-05-14T10:59:39.782Z  INFO 2506 --- [-kit-executor-4] kafka.server.ReplicaFetcherManager       : [ReplicaFetcherManager on broker 0] shutdown completed
2026-05-14T10:59:39.782Z  INFO 2506 --- [-kit-executor-4] k.server.ReplicaAlterLogDirsManager      : [ReplicaAlterLogDirsManager on broker 0] shutting down
2026-05-14T10:59:39.782Z  INFO 2506 --- [-kit-executor-4] k.server.ReplicaAlterLogDirsManager      : [ReplicaAlterLogDirsManager on broker 0] shutdown completed
2026-05-14T10:59:39.782Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Fetch]: Shutting down
2026-05-14T10:59:39.783Z  INFO 2506 --- [nReaper-0-Fetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Fetch]: Stopped
2026-05-14T10:59:39.783Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Fetch]: Shutdown completed
2026-05-14T10:59:39.783Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-RemoteFetch]: Shutting down
2026-05-14T10:59:39.783Z  INFO 2506 --- [r-0-RemoteFetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-RemoteFetch]: Stopped
2026-05-14T10:59:39.784Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-RemoteFetch]: Shutdown completed
2026-05-14T10:59:39.784Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Produce]: Shutting down
2026-05-14T10:59:39.784Z  INFO 2506 --- [eaper-0-Produce] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Produce]: Stopped
2026-05-14T10:59:39.784Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Produce]: Shutdown completed
2026-05-14T10:59:39.784Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-DeleteRecords]: Shutting down
2026-05-14T10:59:39.785Z  INFO 2506 --- [0-DeleteRecords] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-DeleteRecords]: Stopped
2026-05-14T10:59:39.785Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-DeleteRecords]: Shutdown completed
2026-05-14T10:59:39.785Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-ElectLeader]: Shutting down
2026-05-14T10:59:39.786Z  INFO 2506 --- [r-0-ElectLeader] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-ElectLeader]: Stopped
2026-05-14T10:59:39.786Z  INFO 2506 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-ElectLeader]: Shutdown completed
2026-05-14T10:59:39.787Z  INFO 2506 --- [-kit-executor-4] kafka.server.AddPartitionsToTxnManager   : [AddPartitionsToTxnSenderThread-0]: Shutting down
2026-05-14T10:59:39.787Z  INFO 2506 --- [nSenderThread-0] kafka.server.AddPartitionsToTxnManager   : [AddPartitionsToTxnSenderThread-0]: Stopped
2026-05-14T10:59:39.787Z  INFO 2506 --- [-kit-executor-4] kafka.server.AddPartitionsToTxnManager   : [AddPartitionsToTxnSenderThread-0]: Shutdown completed
2026-05-14T10:59:39.787Z  INFO 2506 --- [-kit-executor-4] kafka.server.ReplicaManager              : [ReplicaManager broker=0] Shut down completely
2026-05-14T10:59:39.788Z  INFO 2506 --- [-kit-executor-4] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Shutting down
2026-05-14T10:59:39.788Z  INFO 2506 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Stopped
2026-05-14T10:59:39.788Z  INFO 2506 --- [-kit-executor-4] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Shutdown completed
2026-05-14T10:59:39.788Z  INFO 2506 --- [-kit-executor-4] k.s.BrokerToControllerChannelManagerImpl : Broker to controller channel manager for alter-partition shutdown
2026-05-14T10:59:39.788Z  INFO 2506 --- [-kit-executor-4] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Shutting down
2026-05-14T10:59:39.789Z  INFO 2506 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Stopped
2026-05-14T10:59:39.789Z  INFO 2506 --- [-kit-executor-4] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Shutdown completed
2026-05-14T10:59:39.789Z  INFO 2506 --- [-kit-executor-4] k.s.BrokerToControllerChannelManagerImpl : Broker to controller channel manager for forwarding shutdown
2026-05-14T10:59:39.789Z  INFO 2506 --- [-kit-executor-4] kafka.log.LogManager                     : Shutting down.
2026-05-14T10:59:39.790Z  INFO 2506 --- [-kit-executor-4] kafka.log.LogCleaner                     : Shutting down the log cleaner.
2026-05-14T10:59:39.790Z  INFO 2506 --- [-kit-executor-4] kafka.log.LogCleaner$CleanerThread       : [kafka-log-cleaner-thread-0]: Shutting down
2026-05-14T10:59:39.791Z  INFO 2506 --- [-kit-executor-4] kafka.log.LogCleaner$CleanerThread       : [kafka-log-cleaner-thread-0]: Shutdown completed
2026-05-14T10:59:39.794Z  INFO 2506 --- [leaner-thread-0] kafka.log.LogCleaner$CleanerThread       : [kafka-log-cleaner-thread-0]: Stopped
2026-05-14T10:59:39.801Z  INFO 2506 --- [-kit-executor-4] kafka.log.LogManager                     : Shutdown complete.
2026-05-14T10:59:39.802Z  INFO 2506 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Fetch]: Shutting down
2026-05-14T10:59:39.803Z  INFO 2506 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Fetch]: Stopped
2026-05-14T10:59:39.803Z  INFO 2506 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Fetch]: Shutdown completed
2026-05-14T10:59:39.803Z  INFO 2506 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Produce]: Shutting down
2026-05-14T10:59:39.803Z  INFO 2506 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Produce]: Stopped
2026-05-14T10:59:39.804Z  INFO 2506 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Produce]: Shutdown completed
2026-05-14T10:59:39.804Z  INFO 2506 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Request]: Shutting down
2026-05-14T10:59:39.804Z  INFO 2506 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Request]: Shutdown completed
2026-05-14T10:59:39.804Z  INFO 2506 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-ControllerMutation]: Shutting down
2026-05-14T10:59:39.804Z  INFO 2506 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Request]: Stopped
2026-05-14T10:59:39.804Z  INFO 2506 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-ControllerMutation]: Stopped
2026-05-14T10:59:39.804Z  INFO 2506 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-ControllerMutation]: Shutdown completed
2026-05-14T10:59:39.805Z  INFO 2506 --- [-kit-executor-4] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Shutting down socket server
2026-05-14T10:59:39.820Z  INFO 2506 --- [-kit-executor-4] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Shutdown completed
2026-05-14T10:59:39.821Z  INFO 2506 --- [-kit-executor-4] kafka.server.BrokerTopicStats            : Broker and topic stats closed
2026-05-14T10:59:39.821Z  INFO 2506 --- [-kit-executor-4] org.apache.kafka.queue.KafkaEventQueue   : [BrokerLifecycleManager id=0] closed event queue.
2026-05-14T10:59:39.822Z  INFO 2506 --- [-kit-executor-4] kafka.server.BrokerServer                : [BrokerServer id=0] shut down completed
2026-05-14T10:59:39.822Z  INFO 2506 --- [-kit-executor-4] kafka.server.BrokerServer                : [BrokerServer id=0] Transition from SHUTTING_DOWN to SHUTDOWN
2026-05-14T10:59:39.823Z  INFO 2506 --- [-kit-executor-1] kafka.server.ControllerServer            : [ControllerServer id=0] shutting down
2026-05-14T10:59:39.824Z  INFO 2506 --- [-kit-executor-1] ExpirationService$ExpiredOperationReaper : [raft-expiration-reaper]: Shutting down
2026-05-14T10:59:39.948Z  INFO 2506 --- [-kit-executor-1] ExpirationService$ExpiredOperationReaper : [raft-expiration-reaper]: Shutdown completed
2026-05-14T10:59:39.948Z  INFO 2506 --- [piration-reaper] ExpirationService$ExpiredOperationReaper : [raft-expiration-reaper]: Stopped
2026-05-14T10:59:39.949Z  INFO 2506 --- [-kit-executor-1] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Shutting down
2026-05-14T10:59:39.949Z  INFO 2506 --- [-kit-executor-1] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Beginning graceful shutdown
2026-05-14T10:59:39.949Z  INFO 2506 --- [-raft-io-thread] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Graceful shutdown completed
2026-05-14T10:59:39.949Z  INFO 2506 --- [-raft-io-thread] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Stopped
2026-05-14T10:59:39.950Z  INFO 2506 --- [-kit-executor-1] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Completed graceful shutdown of RaftClient
2026-05-14T10:59:39.951Z  INFO 2506 --- [-kit-executor-1] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Shutdown completed
2026-05-14T10:59:39.952Z  INFO 2506 --- [-kit-executor-1] kafka.raft.RaftSendThread                : [kafka-0-raft-outbound-request-thread]: Shutting down
2026-05-14T10:59:39.953Z  INFO 2506 --- [-request-thread] kafka.raft.RaftSendThread                : [kafka-0-raft-outbound-request-thread]: Stopped
2026-05-14T10:59:39.953Z  INFO 2506 --- [-kit-executor-1] kafka.raft.RaftSendThread                : [kafka-0-raft-outbound-request-thread]: Shutdown completed
2026-05-14T10:59:39.955Z  INFO 2506 --- [-kit-executor-1] o.a.k.s.i.log.ProducerStateManager       : [ProducerStateManager partition=__cluster_metadata-0]Wrote producer snapshot at offset 15 with 0 producer ids in 1 ms.
2026-05-14T10:59:39.963Z  INFO 2506 --- [-kit-executor-1] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Stopping socket server request processors
2026-05-14T10:59:39.966Z  INFO 2506 --- [-kit-executor-1] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Stopped socket server request processors
2026-05-14T10:59:39.967Z  INFO 2506 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [QuorumController id=0] QuorumController#beginShutdown: shutting down event queue.
2026-05-14T10:59:39.967Z  INFO 2506 --- [-kit-executor-1] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Shutting down socket server
2026-05-14T10:59:39.968Z  INFO 2506 --- [0-event-handler] o.a.kafka.controller.QuorumController    : [QuorumController id=0] writeNoOpRecord: event unable to start processing because of RejectedExecutionException (treated as TimeoutException).
2026-05-14T10:59:39.975Z  INFO 2506 --- [-kit-executor-1] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Shutdown completed
2026-05-14T10:59:39.976Z  INFO 2506 --- [-kit-executor-1] kafka.server.KafkaRequestHandlerPool     : [data-plane Kafka Request Handler on Broker 0], shutting down
2026-05-14T10:59:39.978Z  INFO 2506 --- [-kit-executor-1] kafka.server.KafkaRequestHandlerPool     : [data-plane Kafka Request Handler on Broker 0], shut down completely
2026-05-14T10:59:39.978Z  INFO 2506 --- [-kit-executor-1] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Shutting down
2026-05-14T10:59:39.978Z  INFO 2506 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Stopped
2026-05-14T10:59:39.978Z  INFO 2506 --- [-kit-executor-1] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Shutdown completed
2026-05-14T10:59:39.979Z  INFO 2506 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Fetch]: Shutting down
2026-05-14T10:59:39.979Z  INFO 2506 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Fetch]: Stopped
2026-05-14T10:59:39.979Z  INFO 2506 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Fetch]: Shutdown completed
2026-05-14T10:59:39.979Z  INFO 2506 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Produce]: Shutting down
2026-05-14T10:59:39.979Z  INFO 2506 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Produce]: Stopped
2026-05-14T10:59:39.979Z  INFO 2506 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Produce]: Shutdown completed
2026-05-14T10:59:39.979Z  INFO 2506 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Request]: Shutting down
2026-05-14T10:59:39.980Z  INFO 2506 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Request]: Shutdown completed
2026-05-14T10:59:39.980Z  INFO 2506 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-ControllerMutation]: Shutting down
2026-05-14T10:59:39.980Z  INFO 2506 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Request]: Stopped
2026-05-14T10:59:39.980Z  INFO 2506 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-ControllerMutation]: Stopped
2026-05-14T10:59:39.980Z  INFO 2506 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-ControllerMutation]: Shutdown completed
2026-05-14T10:59:39.980Z  INFO 2506 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [QuorumController id=0] closed event queue.
2026-05-14T10:59:39.982Z  INFO 2506 --- [-kit-executor-1] kafka.server.SharedServer                : [SharedServer id=0] Stopping SharedServer
2026-05-14T10:59:39.982Z  INFO 2506 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [MetadataLoader id=0] beginShutdown: shutting down event queue.
2026-05-14T10:59:39.983Z  INFO 2506 --- [r-event-handler] org.apache.kafka.queue.KafkaEventQueue   : [SnapshotGenerator id=0] close: shutting down event queue.
2026-05-14T10:59:39.983Z  INFO 2506 --- [r-event-handler] org.apache.kafka.queue.KafkaEventQueue   : [SnapshotGenerator id=0] closed event queue.
2026-05-14T10:59:39.983Z  INFO 2506 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [MetadataLoader id=0] closed event queue.
2026-05-14T10:59:39.984Z  INFO 2506 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [SnapshotGenerator id=0] closed event queue.
2026-05-14T10:59:39.985Z  INFO 2506 --- [-kit-executor-1] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2026-05-14T10:59:39.985Z  INFO 2506 --- [-kit-executor-1] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2026-05-14T10:59:39.985Z  INFO 2506 --- [-kit-executor-1] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2026-05-14T10:59:39.985Z  INFO 2506 --- [-kit-executor-1] o.a.kafka.common.utils.AppInfoParser     : App info kafka.server for 0 unregistered
2026-05-14T10:59:39.989Z  INFO 2506 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2026-05-14T10:59:39.995Z  INFO 2506 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2026-05-14T10:59:39.998Z  INFO 2506 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2026-05-14T10:59:40.010Z  INFO 2506 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2026-05-14T10:59:40.027Z ERROR 2506 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.context.ApplicationContextException: Failed to start bean 'org.springframework.kafka.config.internalKafkaListenerEndpointRegistry'
	at org.springframework.context.support.DefaultLifecycleProcessor.doStart(DefaultLifecycleProcessor.java:291) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.DefaultLifecycleProcessor$LifecycleGroup.start(DefaultLifecycleProcessor.java:471) ~[spring-context-6.1.6.jar:6.1.6]
	at java.base/java.lang.Iterable.forEach(Iterable.java:75) ~[na:na]
	at org.springframework.context.support.DefaultLifecycleProcessor.startBeans(DefaultLifecycleProcessor.java:260) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.DefaultLifecycleProcessor.onRefresh(DefaultLifecycleProcessor.java:205) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.finishRefresh(AbstractApplicationContext.java:981) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:334) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[spring-boot-test-3.2.5.jar:3.2.5]
	at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[spring-core-6.1.6.jar:6.1.6]
	at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[spring-core-6.1.6.jar:6.1.6]
	at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1454) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:553) ~[spring-boot-test-3.2.5.jar:3.2.5]
	at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[spring-boot-test-3.2.5.jar:3.2.5]
	at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:108) ~[spring-boot-test-3.2.5.jar:3.2.5]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:225) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:152) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.web.ServletTestExecutionListener.setUpRequestContextIfNecessary(ServletTestExecutionListener.java:191) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.web.ServletTestExecutionListener.prepareTestInstance(ServletTestExecutionListener.java:130) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:260) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:163) ~[spring-test-6.1.6.jar:6.1.6]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:378) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:383) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:378) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
	at java.base/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[na:na]
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:377) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:290) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:289) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:279) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at java.base/java.util.Optional.orElseGet(Optional.java:364) ~[na:na]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:278) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:106) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:105) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:69) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511) ~[na:na]
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511) ~[na:na]
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56) ~[surefire-junit-platform-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184) ~[surefire-junit-platform-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148) ~[surefire-junit-platform-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122) ~[surefire-junit-platform-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385) ~[surefire-booter-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162) ~[surefire-booter-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507) ~[surefire-booter-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495) ~[surefire-booter-3.1.2.jar:3.1.2]
Caused by: org.apache.kafka.common.KafkaException: Failed to construct kafka consumer
	at org.apache.kafka.clients.consumer.KafkaConsumer.<init>(KafkaConsumer.java:781) ~[kafka-clients-3.6.2.jar:na]
	at org.apache.kafka.clients.consumer.KafkaConsumer.<init>(KafkaConsumer.java:671) ~[kafka-clients-3.6.2.jar:na]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory$ExtendedKafkaConsumer.<init>(DefaultKafkaConsumerFactory.java:477) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createRawConsumer(DefaultKafkaConsumerFactory.java:461) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createKafkaConsumer(DefaultKafkaConsumerFactory.java:438) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createConsumerWithAdjustedProperties(DefaultKafkaConsumerFactory.java:415) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createKafkaConsumer(DefaultKafkaConsumerFactory.java:382) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createConsumer(DefaultKafkaConsumerFactory.java:359) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.KafkaMessageListenerContainer$ListenerConsumer.<init>(KafkaMessageListenerContainer.java:890) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.KafkaMessageListenerContainer.doStart(KafkaMessageListenerContainer.java:393) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.AbstractMessageListenerContainer.start(AbstractMessageListenerContainer.java:510) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.ConcurrentMessageListenerContainer.doStart(ConcurrentMessageListenerContainer.java:254) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.AbstractMessageListenerContainer.start(AbstractMessageListenerContainer.java:510) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.config.KafkaListenerEndpointRegistry.startIfNecessary(KafkaListenerEndpointRegistry.java:390) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.config.KafkaListenerEndpointRegistry.start(KafkaListenerEndpointRegistry.java:335) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.context.support.DefaultLifecycleProcessor.doStart(DefaultLifecycleProcessor.java:288) ~[spring-context-6.1.6.jar:6.1.6]
	... 91 common frames omitted
Caused by: org.apache.kafka.common.config.ConfigException: No resolvable bootstrap urls given in bootstrap.servers
	at org.apache.kafka.clients.ClientUtils.parseAndValidateAddresses(ClientUtils.java:101) ~[kafka-clients-3.6.2.jar:na]
	at org.apache.kafka.clients.ClientUtils.parseAndValidateAddresses(ClientUtils.java:60) ~[kafka-clients-3.6.2.jar:na]
	at org.apache.kafka.clients.ClientUtils.parseAndValidateAddresses(ClientUtils.java:56) ~[kafka-clients-3.6.2.jar:na]
	at org.apache.kafka.clients.consumer.KafkaConsumer.<init>(KafkaConsumer.java:707) ~[kafka-clients-3.6.2.jar:na]
	... 106 common frames omitted




============================
CONDITIONS EVALUATION REPORT
============================


Positive matches:
-----------------

    None


Negative matches:
-----------------

    None


Exclusions:
-----------

    None


Unconditional classes:
----------------------

    None



2026-05-14T10:59:40.038Z  WARN 2506 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.test.context.web.ServletTestExecutionListener] to prepare test instance [com.jpmc.midascore.TaskThreeTests@712eb075]

java.lang.IllegalStateException: Failed to load ApplicationContext for [WebMergedContextConfiguration@33da0fad testClass = com.jpmc.midascore.TaskThreeTests, locations = [], classes = [com.jpmc.midascore.MidasCoreApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true"], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@431cd9b2, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@57bc27f5, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@491b9b8, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@7d3e8655, org.springframework.kafka.test.context.EmbeddedKafkaContextCustomizer@56284a6c, org.springframework.boot.test.context.SpringBootTestAnnotation@bd59b35e], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:180) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.web.ServletTestExecutionListener.setUpRequestContextIfNecessary(ServletTestExecutionListener.java:191) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.web.ServletTestExecutionListener.prepareTestInstance(ServletTestExecutionListener.java:130) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:260) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:163) ~[spring-test-6.1.6.jar:6.1.6]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$10(ClassBasedTestDescriptor.java:378) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:383) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$11(ClassBasedTestDescriptor.java:378) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
	at java.base/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[na:na]
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:377) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:290) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:289) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:279) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at java.base/java.util.Optional.orElseGet(Optional.java:364) ~[na:na]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:278) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:106) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:105) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:69) ~[junit-jupiter-engine-5.10.2.jar:5.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511) ~[na:na]
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511) ~[na:na]
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[junit-platform-engine-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:198) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:169) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:93) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:58) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:141) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:57) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:103) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:85) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.junit.platform.launcher.core.DelegatingLauncher.execute(DelegatingLauncher.java:47) ~[junit-platform-launcher-1.10.2.jar:1.10.2]
	at org.apache.maven.surefire.junitplatform.LazyLauncher.execute(LazyLauncher.java:56) ~[surefire-junit-platform-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.execute(JUnitPlatformProvider.java:184) ~[surefire-junit-platform-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:148) ~[surefire-junit-platform-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:122) ~[surefire-junit-platform-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:385) ~[surefire-booter-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:162) ~[surefire-booter-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.booter.ForkedBooter.run(ForkedBooter.java:507) ~[surefire-booter-3.1.2.jar:3.1.2]
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:495) ~[surefire-booter-3.1.2.jar:3.1.2]
Caused by: org.springframework.context.ApplicationContextException: Failed to start bean 'org.springframework.kafka.config.internalKafkaListenerEndpointRegistry'
	at org.springframework.context.support.DefaultLifecycleProcessor.doStart(DefaultLifecycleProcessor.java:291) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.DefaultLifecycleProcessor$LifecycleGroup.start(DefaultLifecycleProcessor.java:471) ~[spring-context-6.1.6.jar:6.1.6]
	at java.base/java.lang.Iterable.forEach(Iterable.java:75) ~[na:na]
	at org.springframework.context.support.DefaultLifecycleProcessor.startBeans(DefaultLifecycleProcessor.java:260) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.DefaultLifecycleProcessor.onRefresh(DefaultLifecycleProcessor.java:205) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.finishRefresh(AbstractApplicationContext.java:981) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:334) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137) ~[spring-boot-test-3.2.5.jar:3.2.5]
	at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58) ~[spring-core-6.1.6.jar:6.1.6]
	at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46) ~[spring-core-6.1.6.jar:6.1.6]
	at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1454) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:553) ~[spring-boot-test-3.2.5.jar:3.2.5]
	at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137) ~[spring-boot-test-3.2.5.jar:3.2.5]
	at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:108) ~[spring-boot-test-3.2.5.jar:3.2.5]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:225) ~[spring-test-6.1.6.jar:6.1.6]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:152) ~[spring-test-6.1.6.jar:6.1.6]
	... 73 common frames omitted
Caused by: org.apache.kafka.common.KafkaException: Failed to construct kafka consumer
	at org.apache.kafka.clients.consumer.KafkaConsumer.<init>(KafkaConsumer.java:781) ~[kafka-clients-3.6.2.jar:na]
	at org.apache.kafka.clients.consumer.KafkaConsumer.<init>(KafkaConsumer.java:671) ~[kafka-clients-3.6.2.jar:na]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory$ExtendedKafkaConsumer.<init>(DefaultKafkaConsumerFactory.java:477) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createRawConsumer(DefaultKafkaConsumerFactory.java:461) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createKafkaConsumer(DefaultKafkaConsumerFactory.java:438) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createConsumerWithAdjustedProperties(DefaultKafkaConsumerFactory.java:415) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createKafkaConsumer(DefaultKafkaConsumerFactory.java:382) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createConsumer(DefaultKafkaConsumerFactory.java:359) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.KafkaMessageListenerContainer$ListenerConsumer.<init>(KafkaMessageListenerContainer.java:890) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.KafkaMessageListenerContainer.doStart(KafkaMessageListenerContainer.java:393) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.AbstractMessageListenerContainer.start(AbstractMessageListenerContainer.java:510) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.ConcurrentMessageListenerContainer.doStart(ConcurrentMessageListenerContainer.java:254) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.listener.AbstractMessageListenerContainer.start(AbstractMessageListenerContainer.java:510) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.config.KafkaListenerEndpointRegistry.startIfNecessary(KafkaListenerEndpointRegistry.java:390) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.kafka.config.KafkaListenerEndpointRegistry.start(KafkaListenerEndpointRegistry.java:335) ~[spring-kafka-3.1.4.jar:3.1.4]
	at org.springframework.context.support.DefaultLifecycleProcessor.doStart(DefaultLifecycleProcessor.java:288) ~[spring-context-6.1.6.jar:6.1.6]
	... 91 common frames omitted
Caused by: org.apache.kafka.common.config.ConfigException: No resolvable bootstrap urls given in bootstrap.servers
	at org.apache.kafka.clients.ClientUtils.parseAndValidateAddresses(ClientUtils.java:101) ~[kafka-clients-3.6.2.jar:na]
	at org.apache.kafka.clients.ClientUtils.parseAndValidateAddresses(ClientUtils.java:60) ~[kafka-clients-3.6.2.jar:na]
	at org.apache.kafka.clients.ClientUtils.parseAndValidateAddresses(ClientUtils.java:56) ~[kafka-clients-3.6.2.jar:na]
	at org.apache.kafka.clients.consumer.KafkaConsumer.<init>(KafkaConsumer.java:707) ~[kafka-clients-3.6.2.jar:na]
	... 106 common frames omitted

[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 5.288 s <<< FAILURE! -- in com.jpmc.midascore.TaskThreeTests
[ERROR] com.jpmc.midascore.TaskThreeTests.task_three_verifier -- Time elapsed: 0.018 s <<< ERROR!
java.lang.IllegalStateException: Failed to load ApplicationContext for [WebMergedContextConfiguration@33da0fad testClass = com.jpmc.midascore.TaskThreeTests, locations = [], classes = [com.jpmc.midascore.MidasCoreApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true"], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@431cd9b2, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@57bc27f5, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@491b9b8, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@7d3e8655, org.springframework.kafka.test.context.EmbeddedKafkaContextCustomizer@56284a6c, org.springframework.boot.test.context.SpringBootTestAnnotation@bd59b35e], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:180)
	at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
	at org.springframework.test.context.web.ServletTestExecutionListener.setUpRequestContextIfNecessary(ServletTestExecutionListener.java:191)
	at org.springframework.test.context.web.ServletTestExecutionListener.prepareTestInstance(ServletTestExecutionListener.java:130)
	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:260)
	at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:163)
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310)
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735)
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734)
	at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762)
	at java.base/java.util.Optional.orElseGet(Optional.java:364)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
Caused by: org.springframework.context.ApplicationContextException: Failed to start bean 'org.springframework.kafka.config.internalKafkaListenerEndpointRegistry'
	at org.springframework.context.support.DefaultLifecycleProcessor.doStart(DefaultLifecycleProcessor.java:291)
	at org.springframework.context.support.DefaultLifecycleProcessor$LifecycleGroup.start(DefaultLifecycleProcessor.java:471)
	at java.base/java.lang.Iterable.forEach(Iterable.java:75)
	at org.springframework.context.support.DefaultLifecycleProcessor.startBeans(DefaultLifecycleProcessor.java:260)
	at org.springframework.context.support.DefaultLifecycleProcessor.onRefresh(DefaultLifecycleProcessor.java:205)
	at org.springframework.context.support.AbstractApplicationContext.finishRefresh(AbstractApplicationContext.java:981)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627)
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754)
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456)
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:334)
	at org.springframework.boot.test.context.SpringBootContextLoader.lambda$loadContext$3(SpringBootContextLoader.java:137)
	at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:58)
	at org.springframework.util.function.ThrowingSupplier.get(ThrowingSupplier.java:46)
	at org.springframework.boot.SpringApplication.withHook(SpringApplication.java:1454)
	at org.springframework.boot.test.context.SpringBootContextLoader$ContextLoaderHook.run(SpringBootContextLoader.java:553)
	at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:137)
	at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:108)
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:225)
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:152)
	... 17 more
Caused by: org.apache.kafka.common.KafkaException: Failed to construct kafka consumer
	at org.apache.kafka.clients.consumer.KafkaConsumer.<init>(KafkaConsumer.java:781)
	at org.apache.kafka.clients.consumer.KafkaConsumer.<init>(KafkaConsumer.java:671)
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory$ExtendedKafkaConsumer.<init>(DefaultKafkaConsumerFactory.java:477)
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createRawConsumer(DefaultKafkaConsumerFactory.java:461)
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createKafkaConsumer(DefaultKafkaConsumerFactory.java:438)
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createConsumerWithAdjustedProperties(DefaultKafkaConsumerFactory.java:415)
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createKafkaConsumer(DefaultKafkaConsumerFactory.java:382)
	at org.springframework.kafka.core.DefaultKafkaConsumerFactory.createConsumer(DefaultKafkaConsumerFactory.java:359)
	at org.springframework.kafka.listener.KafkaMessageListenerContainer$ListenerConsumer.<init>(KafkaMessageListenerContainer.java:890)
	at org.springframework.kafka.listener.KafkaMessageListenerContainer.doStart(KafkaMessageListenerContainer.java:393)
	at org.springframework.kafka.listener.AbstractMessageListenerContainer.start(AbstractMessageListenerContainer.java:510)
	at org.springframework.kafka.listener.ConcurrentMessageListenerContainer.doStart(ConcurrentMessageListenerContainer.java:254)
	at org.springframework.kafka.listener.AbstractMessageListenerContainer.start(AbstractMessageListenerContainer.java:510)
	at org.springframework.kafka.config.KafkaListenerEndpointRegistry.startIfNecessary(KafkaListenerEndpointRegistry.java:390)
	at org.springframework.kafka.config.KafkaListenerEndpointRegistry.start(KafkaListenerEndpointRegistry.java:335)
	at org.springframework.context.support.DefaultLifecycleProcessor.doStart(DefaultLifecycleProcessor.java:288)
	... 35 more
Caused by: org.apache.kafka.common.config.ConfigException: No resolvable bootstrap urls given in bootstrap.servers
	at org.apache.kafka.clients.ClientUtils.parseAndValidateAddresses(ClientUtils.java:101)
	at org.apache.kafka.clients.ClientUtils.parseAndValidateAddresses(ClientUtils.java:60)
	at org.apache.kafka.clients.ClientUtils.parseAndValidateAddresses(ClientUtils.java:56)
	at org.apache.kafka.clients.consumer.KafkaConsumer.<init>(KafkaConsumer.java:707)
	... 50 more

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   TaskThreeTests.task_three_verifier » IllegalState Failed to load ApplicationContext for [WebMergedContextConfiguration@33da0fad testClass = com.jpmc.midascore.TaskThreeTests, locations = [], classes = [com.jpmc.midascore.MidasCoreApplication], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = ["org.springframework.boot.test.context.SpringBootTestContextBootstrapper=true"], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@431cd9b2, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@57bc27f5, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.client.TestRestTemplateContextCustomizer@491b9b8, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@7d3e8655, org.springframework.kafka.test.context.EmbeddedKafkaContextCustomizer@56284a6c, org.springframework.boot.test.context.SpringBootTestAnnotation@bd59b35e], resourceBasePath = "src/main/webapp", contextLoader = org.springframework.boot.test.context.SpringBootContextLoader, parent = null]
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.350 s
[INFO] Finished at: 2026-05-14T10:59:40Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.1.2:test (default-test) on project midas-core: 
[ERROR] 
[ERROR] Please refer to /home/runner/work/forage-midas/forage-midas/target/surefire-reports for the individual test results.
[ERROR] Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```

</details>
