# Midas Task 5 — Answer

## Task 5 — TaskFiveTests output

```
---begin output ---
Balance {amount=0.0}
Balance {amount=1326.98}
Balance {amount=2567.52}
Balance {amount=2740.33}
Balance {amount=140.96999}
Balance {amount=10.419973}
Balance {amount=845.49005}
Balance {amount=657.49}
Balance {amount=99.189995}
Balance {amount=3434.0002}
Balance {amount=2157.1902}
Balance {amount=779421.3}
Balance {amount=0.0}
---end output ---
```

---

## Full Task 5 log

<details><summary>Click to expand</summary>

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
[INFO] Running com.jpmc.midascore.TaskFiveTests
12:51:36.880 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.jpmc.midascore.TaskFiveTests]: TaskFiveTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
12:51:36.969 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.jpmc.midascore.MidasCoreApplication for test class com.jpmc.midascore.TaskFiveTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2026-05-14T12:51:37.757Z  INFO 2537 --- [           main] k.utils.Log4jControllerRegistration$     : Registered kafka:type=kafka.Log4jController MBean
2026-05-14T12:51:37.776Z  INFO 2537 --- [           main] org.apache.zookeeper.common.X509Util     : Setting -D jdk.tls.rejectClientInitiatedRenegotiation=true to disable client-initiated TLS renegotiation
2026-05-14T12:51:37.907Z  INFO 2537 --- [-kit-executor-1] kafka.server.ControllerServer            : Formatting /tmp/kafka-13682998343891688674/controller_0 with metadata.version 3.3-IV0.
2026-05-14T12:51:37.909Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Transition from SHUTDOWN to STARTING
2026-05-14T12:51:37.909Z  INFO 2537 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Starting controller
2026-05-14T12:51:37.910Z  INFO 2537 --- [-kit-executor-3] kafka.server.SharedServer                : [SharedServer id=0] Starting SharedServer
2026-05-14T12:51:37.932Z  INFO 2537 --- [-kit-executor-2] o.a.k.s.network.EndpointReadyFutures     : authorizerStart completed for endpoint CONTROLLER. Endpoint is now READY.
2026-05-14T12:51:38.004Z  INFO 2537 --- [-kit-executor-3] kafka.log.UnifiedLog$                    : [LogLoader partition=__cluster_metadata-0, dir=/tmp/kafka-13682998343891688674/controller_0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:38.005Z  INFO 2537 --- [-kit-executor-3] kafka.log.UnifiedLog$                    : [LogLoader partition=__cluster_metadata-0, dir=/tmp/kafka-13682998343891688674/controller_0] Reloading from producer snapshot and rebuilding producer state from offset 0
2026-05-14T12:51:38.006Z  INFO 2537 --- [-kit-executor-3] kafka.log.UnifiedLog$                    : [LogLoader partition=__cluster_metadata-0, dir=/tmp/kafka-13682998343891688674/controller_0] Producer state recovery took 0ms for snapshot load and 1ms for segment recovery from offset 0
2026-05-14T12:51:38.040Z  INFO 2537 --- [-kit-executor-3] kafka.raft.KafkaMetadataLog$             : Initialized snapshots with IDs SortedSet() from /tmp/kafka-13682998343891688674/controller_0/__cluster_metadata-0
2026-05-14T12:51:38.067Z  INFO 2537 --- [piration-reaper] ExpirationService$ExpiredOperationReaper : [raft-expiration-reaper]: Starting
2026-05-14T12:51:38.120Z  INFO 2537 --- [-kit-executor-3] org.apache.kafka.raft.QuorumState        : [RaftManager id=0] Completed transition to Unattached(epoch=0, voters=[0], electionTimeoutMs=1443) from null
2026-05-14T12:51:38.126Z  INFO 2537 --- [-kit-executor-3] org.apache.kafka.raft.QuorumState        : [RaftManager id=0] Completed transition to CandidateState(localId=0, epoch=1, retries=1, voteStates={0=GRANTED}, highWatermark=Optional.empty, electionTimeoutMs=1736) from Unattached(epoch=0, voters=[0], electionTimeoutMs=1443)
2026-05-14T12:51:38.129Z  INFO 2537 --- [-kit-executor-3] org.apache.kafka.raft.QuorumState        : [RaftManager id=0] Completed transition to Leader(localId=0, epoch=1, epochStartOffset=0, highWatermark=Optional.empty, voterStates={0=ReplicaState(nodeId=0, endOffset=Optional.empty, lastFetchTimestamp=-1, lastCaughtUpTimestamp=-1, hasAcknowledgedLeader=true)}) from CandidateState(localId=0, epoch=1, retries=1, voteStates={0=GRANTED}, highWatermark=Optional.empty, electionTimeoutMs=1736)
2026-05-14T12:51:38.262Z  INFO 2537 --- [-kit-executor-2] kafka.network.ConnectionQuotas           : Updated connection-accept-rate max connection creation rate to 2147483647
2026-05-14T12:51:38.269Z  INFO 2537 --- [-kit-executor-2] kafka.network.DataPlaneAcceptor          : Awaiting socket connections on localhost:32977.
2026-05-14T12:51:38.270Z  INFO 2537 --- [-kit-executor-2] kafka.network.DataPlaneAcceptor          : Opened wildcard endpoint localhost:32977
2026-05-14T12:51:38.282Z  INFO 2537 --- [-kit-executor-2] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Created data-plane acceptor and processors for endpoint : ListenerName(CONTROLLER)
2026-05-14T12:51:38.285Z  INFO 2537 --- [-request-thread] kafka.raft.RaftSendThread                : [kafka-0-raft-outbound-request-thread]: Starting
2026-05-14T12:51:38.286Z  INFO 2537 --- [-raft-io-thread] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Starting
2026-05-14T12:51:38.300Z  INFO 2537 --- [-raft-io-thread] org.apache.kafka.raft.LeaderState        : [RaftManager id=0] High watermark set to LogOffsetMetadata(offset=1, metadata=Optional[(segmentBaseOffset=0,relativePositionInSegment=91)]) for the first time for epoch 1 based on indexOfHw 0 and voters [ReplicaState(nodeId=0, endOffset=Optional[LogOffsetMetadata(offset=1, metadata=Optional[(segmentBaseOffset=0,relativePositionInSegment=91)])], lastFetchTimestamp=-1, lastCaughtUpTimestamp=-1, hasAcknowledgedLeader=true)]
2026-05-14T12:51:38.308Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] initializeNewPublishers: The loader is still catching up because we have loaded up to offset -1, but the high water mark is 1
2026-05-14T12:51:38.309Z  INFO 2537 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for controller quorum voters future
2026-05-14T12:51:38.309Z  INFO 2537 --- [-raft-io-thread] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Registered the listener org.apache.kafka.image.loader.MetadataLoader@2064078608
2026-05-14T12:51:38.309Z  INFO 2537 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for controller quorum voters future
2026-05-14T12:51:38.309Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Starting broker
2026-05-14T12:51:38.320Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] maybePublishMetadata(LOG_DELTA): The loader is still catching up because we have not loaded a controller record as of offset 0 and high water mark is 1
2026-05-14T12:51:38.331Z  INFO 2537 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Produce]: Starting
2026-05-14T12:51:38.331Z  INFO 2537 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Fetch]: Starting
2026-05-14T12:51:38.331Z  INFO 2537 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Request]: Starting
2026-05-14T12:51:38.332Z  INFO 2537 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-ControllerMutation]: Starting
2026-05-14T12:51:38.340Z  INFO 2537 --- [-kit-executor-2] o.a.kafka.controller.QuorumController    : [QuorumController id=0] Creating new QuorumController with clusterId roVELUPNTiKhkf-H3TtTpA.
2026-05-14T12:51:38.340Z  INFO 2537 --- [-raft-io-thread] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Registered the listener org.apache.kafka.controller.QuorumController$QuorumMetaLogListener@104534245
2026-05-14T12:51:38.340Z  INFO 2537 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Fetch]: Starting
2026-05-14T12:51:38.340Z  INFO 2537 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Produce]: Starting
2026-05-14T12:51:38.341Z  INFO 2537 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Request]: Starting
2026-05-14T12:51:38.341Z  INFO 2537 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-ControllerMutation]: Starting
2026-05-14T12:51:38.343Z  INFO 2537 --- [0-event-handler] o.a.kafka.controller.QuorumController    : [QuorumController id=0] Becoming the active controller at epoch 1, next write offset 1.
2026-05-14T12:51:38.343Z  INFO 2537 --- [-kit-executor-3] kafka.log.LogManager                     : Log directory /tmp/kafka-13682998343891688674/broker_0_data0 not found, creating it.
2026-05-14T12:51:38.350Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for controller quorum voters future
2026-05-14T12:51:38.351Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for controller quorum voters future
2026-05-14T12:51:38.354Z  WARN 2537 --- [0-event-handler] o.a.kafka.controller.QuorumController    : [QuorumController id=0] Performing controller activation. The metadata log appears to be empty. Appending 1 bootstrap record(s) in metadata transaction at metadata.version 3.6-IV2 from bootstrap source 'testkit'. Setting the ZK migration state to NONE since this is a de-novo KRaft cluster.
2026-05-14T12:51:38.356Z  INFO 2537 --- [0-event-handler] o.a.k.controller.OffsetControlManager    : [QuorumController id=0] Replayed BeginTransactionRecord(name='Bootstrap records') at offset 1.
2026-05-14T12:51:38.357Z  INFO 2537 --- [0-event-handler] o.a.k.controller.FeatureControlManager   : [QuorumController id=0] Replayed a FeatureLevelRecord setting metadata version to 3.6-IV2
2026-05-14T12:51:38.357Z  INFO 2537 --- [0-event-handler] o.a.k.controller.OffsetControlManager    : [QuorumController id=0] Replayed EndTransactionRecord() at offset 4.
2026-05-14T12:51:38.362Z  INFO 2537 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Starting
2026-05-14T12:51:38.368Z  INFO 2537 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Starting
2026-05-14T12:51:38.370Z  INFO 2537 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Recorded new controller, from now on will use node localhost:32977 (id: 0 rack: null)
2026-05-14T12:51:38.379Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] initializeNewPublishers: The loader finished catching up to the current high water mark of 1
2026-05-14T12:51:38.379Z  INFO 2537 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for the controller metadata publishers to be installed
2026-05-14T12:51:38.380Z  INFO 2537 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for the controller metadata publishers to be installed
2026-05-14T12:51:38.380Z  INFO 2537 --- [-kit-executor-2] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Enabling request processing.
2026-05-14T12:51:38.390Z  INFO 2537 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for all of the authorizer futures to be completed
2026-05-14T12:51:38.390Z  INFO 2537 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for all of the authorizer futures to be completed
2026-05-14T12:51:38.390Z  INFO 2537 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for all of the SocketServer Acceptors to be started
2026-05-14T12:51:38.390Z  INFO 2537 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for all of the SocketServer Acceptors to be started
2026-05-14T12:51:38.390Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing SnapshotGenerator with a snapshot at offset 0
2026-05-14T12:51:38.391Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing FeaturesPublisher with a snapshot at offset 0
2026-05-14T12:51:38.392Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing DynamicConfigPublisher controller id=0 with a snapshot at offset 0
2026-05-14T12:51:38.393Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing DynamicClientQuotaPublisher controller id=0 with a snapshot at offset 0
2026-05-14T12:51:38.393Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing ScramPublisher controller id=0 with a snapshot at offset 0
2026-05-14T12:51:38.394Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing DelegationTokenPublisher controller id=0 with a snapshot at offset 0
2026-05-14T12:51:38.395Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing ControllerMetadataMetricsPublisher with a snapshot at offset 0
2026-05-14T12:51:38.396Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing AclPublisher controller id=0 with a snapshot at offset 0
2026-05-14T12:51:38.406Z  INFO 2537 --- [-kit-executor-3] kafka.network.ConnectionQuotas           : Updated connection-accept-rate max connection creation rate to 2147483647
2026-05-14T12:51:38.406Z  INFO 2537 --- [-kit-executor-3] kafka.network.DataPlaneAcceptor          : Awaiting socket connections on localhost:32807.
2026-05-14T12:51:38.407Z  INFO 2537 --- [-kit-executor-3] kafka.network.DataPlaneAcceptor          : Opened wildcard endpoint localhost:32807
2026-05-14T12:51:38.411Z  INFO 2537 --- [-kit-executor-3] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Created data-plane acceptor and processors for endpoint : ListenerName(EXTERNAL)
2026-05-14T12:51:38.415Z  INFO 2537 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Starting
2026-05-14T12:51:38.415Z  INFO 2537 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Recorded new controller, from now on will use node localhost:32977 (id: 0 rack: null)
2026-05-14T12:51:38.430Z  INFO 2537 --- [eaper-0-Produce] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Produce]: Starting
2026-05-14T12:51:38.431Z  INFO 2537 --- [nReaper-0-Fetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Fetch]: Starting
2026-05-14T12:51:38.431Z  INFO 2537 --- [0-DeleteRecords] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-DeleteRecords]: Starting
2026-05-14T12:51:38.432Z  INFO 2537 --- [r-0-ElectLeader] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-ElectLeader]: Starting
2026-05-14T12:51:38.433Z  INFO 2537 --- [r-0-RemoteFetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-RemoteFetch]: Starting
2026-05-14T12:51:38.445Z  INFO 2537 --- [per-0-Heartbeat] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Heartbeat]: Starting
2026-05-14T12:51:38.446Z  INFO 2537 --- [per-0-Rebalance] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Rebalance]: Starting
2026-05-14T12:51:38.478Z  INFO 2537 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Starting
2026-05-14T12:51:38.478Z  INFO 2537 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Recorded new controller, from now on will use node localhost:32977 (id: 0 rack: null)
2026-05-14T12:51:38.481Z  INFO 2537 --- [r-event-handler] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Incarnation ofUcK0wtReOsubhZsjhd-g of broker 0 in cluster roVELUPNTiKhkf-H3TtTpA is now STARTING.
2026-05-14T12:51:38.499Z  INFO 2537 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Starting
2026-05-14T12:51:38.522Z  INFO 2537 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing BrokerMetadataPublisher with a snapshot at offset 4
2026-05-14T12:51:38.522Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the broker metadata publishers to be installed
2026-05-14T12:51:38.523Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the broker metadata publishers to be installed
2026-05-14T12:51:38.523Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the controller to acknowledge that we are caught up
2026-05-14T12:51:38.524Z  INFO 2537 --- [r-event-handler] k.s.metadata.BrokerMetadataPublisher     : [BrokerMetadataPublisher id=0] Publishing initial metadata at offset OffsetAndEpoch(offset=4, epoch=1) with metadata.version 3.6-IV2.
2026-05-14T12:51:38.525Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Loading logs from log dirs ArraySeq(/tmp/kafka-13682998343891688674/broker_0_data0)
2026-05-14T12:51:38.530Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : No logs found to be loaded in /tmp/kafka-13682998343891688674/broker_0_data0
2026-05-14T12:51:38.536Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Loaded 0 logs in 11ms
2026-05-14T12:51:38.538Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Starting log cleanup with a period of 300000 ms.
2026-05-14T12:51:38.539Z  INFO 2537 --- [0-event-handler] o.a.k.controller.ClusterControlManager   : [QuorumController id=0] Replayed initial RegisterBrokerRecord for broker 0: RegisterBrokerRecord(brokerId=0, isMigratingZkBroker=false, incarnationId=ofUcK0wtReOsubhZsjhd-g, brokerEpoch=5, endPoints=[BrokerEndpoint(name='EXTERNAL', host='localhost', port=32807, securityProtocol=0)], features=[BrokerFeature(name='metadata.version', minSupportedVersion=1, maxSupportedVersion=14)], rack=null, fenced=true, inControlledShutdown=false)
2026-05-14T12:51:38.539Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Starting log flusher with a default period of 9223372036854775807 ms.
2026-05-14T12:51:38.549Z  INFO 2537 --- [r-event-handler] kafka.log.LogCleaner                     : Starting the log cleaner
2026-05-14T12:51:38.553Z  INFO 2537 --- [leaner-thread-0] kafka.log.LogCleaner$CleanerThread       : [kafka-log-cleaner-thread-0]: Starting
2026-05-14T12:51:38.555Z  INFO 2537 --- [rFailureHandler] k.s.ReplicaManager$LogDirFailureHandler  : [LogDirFailureHandler]: Starting
2026-05-14T12:51:38.555Z  INFO 2537 --- [nSenderThread-0] kafka.server.AddPartitionsToTxnManager   : [AddPartitionsToTxnSenderThread-0]: Starting
2026-05-14T12:51:38.556Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Starting up.
2026-05-14T12:51:38.560Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Startup complete.
2026-05-14T12:51:38.561Z  INFO 2537 --- [r-event-handler] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Starting up.
2026-05-14T12:51:38.564Z  INFO 2537 --- [rSenderThread-0] k.c.t.TransactionMarkerChannelManager    : [TxnMarkerSenderThread-0]: Starting
2026-05-14T12:51:38.564Z  INFO 2537 --- [r-event-handler] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Startup complete.
2026-05-14T12:51:38.564Z  INFO 2537 --- [r-event-handler] k.s.metadata.BrokerMetadataPublisher     : [BrokerMetadataPublisher id=0] Updating metadata.version to 14 at offset OffsetAndEpoch(offset=4, epoch=1).
2026-05-14T12:51:38.569Z  INFO 2537 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Successfully registered broker 0 with broker epoch 5
2026-05-14T12:51:38.576Z  INFO 2537 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] The broker has caught up. Transitioning from STARTING to RECOVERY.
2026-05-14T12:51:38.576Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the controller to acknowledge that we are caught up
2026-05-14T12:51:38.576Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the initial broker metadata update to be published
2026-05-14T12:51:38.576Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the initial broker metadata update to be published
2026-05-14T12:51:38.578Z  INFO 2537 --- [-kit-executor-3] kafka.server.KafkaConfig                 : KafkaConfig values: 
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
	log.dirs = /tmp/kafka-13682998343891688674/broker_0_data0
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
	metadata.log.dir = /tmp/kafka-13682998343891688674/controller_0
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

2026-05-14T12:51:38.583Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the broker to be unfenced
2026-05-14T12:51:38.584Z  INFO 2537 --- [0-event-handler] o.a.k.controller.BrokerHeartbeatManager  : [QuorumController id=0] The request from broker 0 to unfence has been granted because it has caught up with the offset of its register broker record 5.
2026-05-14T12:51:38.588Z  INFO 2537 --- [0-event-handler] o.a.k.controller.ClusterControlManager   : [QuorumController id=0] Replayed BrokerRegistrationChangeRecord modifying the registration for broker 0: BrokerRegistrationChangeRecord(brokerId=0, brokerEpoch=5, fenced=-1, inControlledShutdown=0)
2026-05-14T12:51:38.614Z  INFO 2537 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] The broker has been unfenced. Transitioning from RECOVERY to RUNNING.
2026-05-14T12:51:38.615Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the broker to be unfenced
2026-05-14T12:51:38.615Z  INFO 2537 --- [-kit-executor-3] o.a.k.s.network.EndpointReadyFutures     : authorizerStart completed for endpoint EXTERNAL. Endpoint is now READY.
2026-05-14T12:51:38.615Z  INFO 2537 --- [-kit-executor-3] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Enabling request processing.
2026-05-14T12:51:38.616Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for all of the authorizer futures to be completed
2026-05-14T12:51:38.616Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for all of the authorizer futures to be completed
2026-05-14T12:51:38.616Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for all of the SocketServer Acceptors to be started
2026-05-14T12:51:38.616Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for all of the SocketServer Acceptors to be started
2026-05-14T12:51:38.616Z  INFO 2537 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Transition from STARTING to STARTED
2026-05-14T12:51:38.624Z  INFO 2537 --- [           main] o.a.k.clients.admin.AdminClientConfig    : AdminClientConfig values: 
	auto.include.jmx.reporter = true
	bootstrap.servers = [localhost:32807]
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

2026-05-14T12:51:38.639Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.6.2
2026-05-14T12:51:38.639Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: c4deed513057c94e
2026-05-14T12:51:38.639Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1778763098639
2026-05-14T12:51:38.643Z  INFO 2537 --- [| adminclient-1] o.a.kafka.common.utils.AppInfoParser     : App info kafka.admin.client for adminclient-1 unregistered
2026-05-14T12:51:38.643Z  INFO 2537 --- [| adminclient-1] o.a.k.c.a.i.AdminMetadataManager         : [AdminClient clientId=adminclient-1] Metadata update failed

org.apache.kafka.common.errors.TimeoutException: Timed out waiting to send the call. Call: fetchMetadata

2026-05-14T12:51:38.645Z  INFO 2537 --- [| adminclient-1] o.a.k.clients.admin.KafkaAdminClient     : [AdminClient clientId=adminclient-1] Timed out 1 remaining operation(s) during close.
2026-05-14T12:51:38.649Z  INFO 2537 --- [| adminclient-1] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2026-05-14T12:51:38.649Z  INFO 2537 --- [| adminclient-1] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2026-05-14T12:51:38.649Z  INFO 2537 --- [| adminclient-1] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2026-05-14T12:51:38.658Z  INFO 2537 --- [           main] com.jpmc.midascore.TaskFiveTests         : Starting TaskFiveTests using Java 17.0.18 with PID 2537 (started by runner in /home/runner/work/forage-midas/forage-midas)
2026-05-14T12:51:38.659Z  INFO 2537 --- [           main] com.jpmc.midascore.TaskFiveTests         : No active profile set, falling back to 1 default profile: "default"
2026-05-14T12:51:39.155Z  INFO 2537 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-05-14T12:51:39.210Z  INFO 2537 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 48 ms. Found 2 JPA repository interfaces.
2026-05-14T12:51:39.768Z  INFO 2537 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 33400 (http)
2026-05-14T12:51:39.779Z  INFO 2537 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-05-14T12:51:39.779Z  INFO 2537 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.20]
2026-05-14T12:51:39.831Z  INFO 2537 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2026-05-14T12:51:39.833Z  INFO 2537 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1157 ms
2026-05-14T12:51:39.876Z  INFO 2537 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-05-14T12:51:40.049Z  INFO 2537 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:midasdb user=SA
2026-05-14T12:51:40.051Z  INFO 2537 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-05-14T12:51:40.065Z  INFO 2537 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:midasdb'
2026-05-14T12:51:40.187Z  INFO 2537 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-05-14T12:51:40.234Z  INFO 2537 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.4.4.Final
2026-05-14T12:51:40.263Z  INFO 2537 --- [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-05-14T12:51:40.473Z  INFO 2537 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-05-14T12:51:40.509Z  WARN 2537 --- [           main] org.hibernate.orm.deprecation            : HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-05-14T12:51:41.366Z  INFO 2537 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-05-14T12:51:41.405Z  INFO 2537 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-05-14T12:51:41.818Z  WARN 2537 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-05-14T12:51:42.132Z  INFO 2537 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 33400 (http) with context path ''
2026-05-14T12:51:42.156Z  INFO 2537 --- [           main] o.a.k.clients.consumer.ConsumerConfig    : ConsumerConfig values: 
	allow.auto.create.topics = true
	auto.commit.interval.ms = 5000
	auto.include.jmx.reporter = true
	auto.offset.reset = earliest
	bootstrap.servers = [localhost:32807]
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

2026-05-14T12:51:42.190Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.6.2
2026-05-14T12:51:42.190Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: c4deed513057c94e
2026-05-14T12:51:42.190Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1778763102190
2026-05-14T12:51:42.191Z  INFO 2537 --- [           main] fkaConsumerFactory$ExtendedKafkaConsumer : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Subscribed to topic(s): trader-updates
2026-05-14T12:51:42.211Z  INFO 2537 --- [           main] com.jpmc.midascore.TaskFiveTests         : Started TaskFiveTests in 5.12 seconds (process running for 5.973)
2026-05-14T12:51:42.242Z  INFO 2537 --- [quest-handler-4] k.s.DefaultAutoTopicCreationManager      : Sent auto-creation request for Set(trader-updates) to the active controller.
2026-05-14T12:51:42.259Z  INFO 2537 --- [quest-handler-7] k.s.DefaultAutoTopicCreationManager      : Sent auto-creation request for Set(__consumer_offsets) to the active controller.
2026-05-14T12:51:42.263Z  WARN 2537 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Error while fetching metadata with correlation id 2 : {trader-updates=UNKNOWN_TOPIC_OR_PARTITION}
2026-05-14T12:51:42.264Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] CreateTopics result(s): CreatableTopic(name='trader-updates', numPartitions=1, replicationFactor=1, assignments=[], configs=[]): SUCCESS
2026-05-14T12:51:42.265Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed TopicRecord for topic trader-updates with topic ID xwOSmueMQ26UEYGZcRxw-w.
2026-05-14T12:51:42.265Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition trader-updates-0 with topic ID xwOSmueMQ26UEYGZcRxw-w and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.265Z  INFO 2537 --- [ntainer#0-0-C-1] org.apache.kafka.clients.Metadata        : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Cluster ID: roVELUPNTiKhkf-H3TtTpA
2026-05-14T12:51:42.298Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Transitioning 1 partition(s) to local leaders.
2026-05-14T12:51:42.299Z  INFO 2537 --- [r-event-handler] kafka.server.ReplicaFetcherManager       : [ReplicaFetcherManager on broker 0] Removed fetcher for partitions Set(trader-updates-0)
2026-05-14T12:51:42.307Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition trader-updates-0 with topic id xwOSmueMQ26UEYGZcRxw-w.
2026-05-14T12:51:42.310Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] CreateTopics result(s): CreatableTopic(name='__consumer_offsets', numPartitions=50, replicationFactor=1, assignments=[], configs=[CreateableTopicConfig(name='compression.type', value='producer'), CreateableTopicConfig(name='cleanup.policy', value='compact'), CreateableTopicConfig(name='segment.bytes', value='104857600')]): SUCCESS
2026-05-14T12:51:42.311Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed TopicRecord for topic __consumer_offsets with topic ID tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.311Z  INFO 2537 --- [0-event-handler] o.a.k.c.ConfigurationControlManager      : [QuorumController id=0] Replayed ConfigRecord for ConfigResource(type=TOPIC, name='__consumer_offsets') which set configuration compression.type to producer
2026-05-14T12:51:42.311Z  INFO 2537 --- [0-event-handler] o.a.k.c.ConfigurationControlManager      : [QuorumController id=0] Replayed ConfigRecord for ConfigResource(type=TOPIC, name='__consumer_offsets') which set configuration cleanup.policy to compact
2026-05-14T12:51:42.311Z  INFO 2537 --- [0-event-handler] o.a.k.c.ConfigurationControlManager      : [QuorumController id=0] Replayed ConfigRecord for ConfigResource(type=TOPIC, name='__consumer_offsets') which set configuration segment.bytes to 104857600
2026-05-14T12:51:42.311Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-0 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.311Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-1 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.311Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-2 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.312Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-3 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.312Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-4 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.312Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-5 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.312Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-6 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.312Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-7 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.312Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-8 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.312Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-9 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.312Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-10 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.312Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-11 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.313Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-12 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.313Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-13 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.313Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-14 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.316Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-15 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.317Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-16 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.319Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-17 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.319Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-18 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.319Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-19 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.320Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-20 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.320Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-21 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.320Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-22 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.320Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-23 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.320Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-24 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.320Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-25 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.320Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-26 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.320Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-27 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.321Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-28 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.321Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-29 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.321Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-30 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.322Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-31 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.322Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-32 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.322Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-33 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.322Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-34 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.322Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-35 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.323Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-36 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.323Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-37 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.323Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-38 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.323Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-39 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.323Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-40 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.323Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-41 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.323Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-42 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.323Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-43 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.324Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-44 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.324Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-45 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.324Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-46 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.324Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-47 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.324Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-48 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.324Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] Replayed PartitionRecord for new partition __consumer_offsets-49 with topic ID tENI8wS_SK63sLRELx3kbQ and PartitionRegistration(replicas=[0], isr=[0], removingReplicas=[], addingReplicas=[], leader=0, leaderRecoveryState=RECOVERED, leaderEpoch=0, partitionEpoch=0).
2026-05-14T12:51:42.335Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=trader-updates-0, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.337Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition trader-updates-0 in /tmp/kafka-13682998343891688674/broker_0_data0/trader-updates-0 with properties {}
2026-05-14T12:51:42.339Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition trader-updates-0 broker=0] No checkpointed highwatermark is found for partition trader-updates-0
2026-05-14T12:51:42.342Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition trader-updates-0 broker=0] Log loaded for partition trader-updates-0 with initial high watermark 0
2026-05-14T12:51:42.346Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader trader-updates-0 with topic id Some(xwOSmueMQ26UEYGZcRxw-w) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.356Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Transitioning 50 partition(s) to local leaders.
2026-05-14T12:51:42.357Z  INFO 2537 --- [r-event-handler] kafka.server.ReplicaFetcherManager       : [ReplicaFetcherManager on broker 0] Removed fetcher for partitions Set(__consumer_offsets-13, __consumer_offsets-46, __consumer_offsets-9, __consumer_offsets-42, __consumer_offsets-21, __consumer_offsets-17, __consumer_offsets-30, __consumer_offsets-26, __consumer_offsets-5, __consumer_offsets-38, __consumer_offsets-1, __consumer_offsets-34, __consumer_offsets-16, __consumer_offsets-45, __consumer_offsets-12, __consumer_offsets-41, __consumer_offsets-24, __consumer_offsets-20, __consumer_offsets-49, __consumer_offsets-0, __consumer_offsets-29, __consumer_offsets-25, __consumer_offsets-8, __consumer_offsets-37, __consumer_offsets-4, __consumer_offsets-33, __consumer_offsets-15, __consumer_offsets-48, __consumer_offsets-11, __consumer_offsets-44, __consumer_offsets-23, __consumer_offsets-19, __consumer_offsets-32, __consumer_offsets-28, __consumer_offsets-7, __consumer_offsets-40, __consumer_offsets-3, __consumer_offsets-36, __consumer_offsets-47, __consumer_offsets-14, __consumer_offsets-43, __consumer_offsets-10, __consumer_offsets-22, __consumer_offsets-18, __consumer_offsets-31, __consumer_offsets-27, __consumer_offsets-39, __consumer_offsets-6, __consumer_offsets-35, __consumer_offsets-2)
2026-05-14T12:51:42.357Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-13 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.361Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-13, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.361Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-13 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-13 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.361Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-13 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-13
2026-05-14T12:51:42.361Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-13 broker=0] Log loaded for partition __consumer_offsets-13 with initial high watermark 0
2026-05-14T12:51:42.362Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-13 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.363Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-46 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.365Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-46, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.366Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-46 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-46 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.366Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-46 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-46
2026-05-14T12:51:42.366Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-46 broker=0] Log loaded for partition __consumer_offsets-46 with initial high watermark 0
2026-05-14T12:51:42.366Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-46 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.369Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-9 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.372Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-9, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.373Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-9 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-9 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.373Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-9 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-9
2026-05-14T12:51:42.373Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-9 broker=0] Log loaded for partition __consumer_offsets-9 with initial high watermark 0
2026-05-14T12:51:42.374Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-9 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.376Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Discovered group coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.376Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-42 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.378Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] (Re-)joining group
2026-05-14T12:51:42.381Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-42, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.381Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-42 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-42 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.382Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-42 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-42
2026-05-14T12:51:42.382Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-42 broker=0] Log loaded for partition __consumer_offsets-42 with initial high watermark 0
2026-05-14T12:51:42.382Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-42 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.384Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-21 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.387Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-21, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.388Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-21 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-21 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.388Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-21 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-21
2026-05-14T12:51:42.388Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-21 broker=0] Log loaded for partition __consumer_offsets-21 with initial high watermark 0
2026-05-14T12:51:42.388Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-21 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.389Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-17 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.395Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-17, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.396Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Group coordinator localhost:32807 (id: 2147483647 rack: null) is unavailable or invalid due to cause: error response NOT_COORDINATOR. isDisconnected: false. Rediscovery will be attempted.
2026-05-14T12:51:42.396Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Requesting disconnect from last known coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.396Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] JoinGroup failed: This is not the correct coordinator. Marking coordinator unknown. Sent generation was Generation{generationId=-1, memberId='', protocol='null'}
2026-05-14T12:51:42.396Z  INFO 2537 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Client requested disconnect from node 2147483647
2026-05-14T12:51:42.398Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-17 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-17 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.398Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-17 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-17
2026-05-14T12:51:42.398Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-17 broker=0] Log loaded for partition __consumer_offsets-17 with initial high watermark 0
2026-05-14T12:51:42.398Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-17 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.399Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Discovered group coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.399Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Group coordinator localhost:32807 (id: 2147483647 rack: null) is unavailable or invalid due to cause: coordinator unavailable. isDisconnected: false. Rediscovery will be attempted.
2026-05-14T12:51:42.399Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Requesting disconnect from last known coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.400Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-30 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.402Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-30, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.403Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-30 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-30 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.403Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-30 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-30
2026-05-14T12:51:42.403Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-30 broker=0] Log loaded for partition __consumer_offsets-30 with initial high watermark 0
2026-05-14T12:51:42.403Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-30 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.405Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-26 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.407Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-26, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.408Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-26 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-26 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.408Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-26 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-26
2026-05-14T12:51:42.408Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-26 broker=0] Log loaded for partition __consumer_offsets-26 with initial high watermark 0
2026-05-14T12:51:42.408Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-26 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.409Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-5 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.411Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-5, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.412Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-5 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-5 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.412Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-5 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-5
2026-05-14T12:51:42.412Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-5 broker=0] Log loaded for partition __consumer_offsets-5 with initial high watermark 0
2026-05-14T12:51:42.412Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-5 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.414Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-38 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.416Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-38, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.417Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-38 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-38 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.417Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-38 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-38
2026-05-14T12:51:42.417Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-38 broker=0] Log loaded for partition __consumer_offsets-38 with initial high watermark 0
2026-05-14T12:51:42.417Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-38 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.419Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-1 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.421Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-1, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.423Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-1 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-1 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.423Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-1 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-1
2026-05-14T12:51:42.424Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-1 broker=0] Log loaded for partition __consumer_offsets-1 with initial high watermark 0
2026-05-14T12:51:42.424Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-1 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.426Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-34 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.428Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-34, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.429Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-34 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-34 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.429Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-34 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-34
2026-05-14T12:51:42.429Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-34 broker=0] Log loaded for partition __consumer_offsets-34 with initial high watermark 0
2026-05-14T12:51:42.430Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-34 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.431Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-16 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.436Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-16, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.437Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-16 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-16 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.437Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-16 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-16
2026-05-14T12:51:42.437Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-16 broker=0] Log loaded for partition __consumer_offsets-16 with initial high watermark 0
2026-05-14T12:51:42.437Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-16 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.439Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-45 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.442Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-45, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.443Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-45 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-45 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.443Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-45 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-45
2026-05-14T12:51:42.443Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-45 broker=0] Log loaded for partition __consumer_offsets-45 with initial high watermark 0
2026-05-14T12:51:42.444Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-45 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.445Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-12 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.447Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-12, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.449Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-12 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-12 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.449Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-12 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-12
2026-05-14T12:51:42.450Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-12 broker=0] Log loaded for partition __consumer_offsets-12 with initial high watermark 0
2026-05-14T12:51:42.450Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-12 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.451Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-41 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.454Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-41, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.456Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-41 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-41 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.456Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-41 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-41
2026-05-14T12:51:42.456Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-41 broker=0] Log loaded for partition __consumer_offsets-41 with initial high watermark 0
2026-05-14T12:51:42.456Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-41 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.458Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-24 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.462Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-24, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.463Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-24 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-24 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.463Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-24 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-24
2026-05-14T12:51:42.463Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-24 broker=0] Log loaded for partition __consumer_offsets-24 with initial high watermark 0
2026-05-14T12:51:42.463Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-24 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.468Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-20 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.471Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-20, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.472Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-20 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-20 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.472Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-20 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-20
2026-05-14T12:51:42.472Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-20 broker=0] Log loaded for partition __consumer_offsets-20 with initial high watermark 0
2026-05-14T12:51:42.472Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-20 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.477Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-49 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.482Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-49, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.483Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-49 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-49 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.483Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-49 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-49
2026-05-14T12:51:42.483Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-49 broker=0] Log loaded for partition __consumer_offsets-49 with initial high watermark 0
2026-05-14T12:51:42.483Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-49 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.485Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-0 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.488Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-0, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.489Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-0 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-0 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.489Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-0 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-0
2026-05-14T12:51:42.489Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-0 broker=0] Log loaded for partition __consumer_offsets-0 with initial high watermark 0
2026-05-14T12:51:42.489Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-0 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.494Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-29 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.497Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-29, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.498Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-29 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-29 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.498Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-29 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-29
2026-05-14T12:51:42.498Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-29 broker=0] Log loaded for partition __consumer_offsets-29 with initial high watermark 0
2026-05-14T12:51:42.498Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-29 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.499Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-25 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.503Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-25, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.504Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-25 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-25 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.504Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-25 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-25
2026-05-14T12:51:42.504Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-25 broker=0] Log loaded for partition __consumer_offsets-25 with initial high watermark 0
2026-05-14T12:51:42.505Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-25 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.507Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Discovered group coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.507Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-8 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.508Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Request joining group due to: rebalance failed due to 'This is not the correct coordinator.' (NotCoordinatorException)
2026-05-14T12:51:42.508Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] (Re-)joining group
2026-05-14T12:51:42.509Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-8, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.510Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-8 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-8 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.512Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-8 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-8
2026-05-14T12:51:42.512Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-8 broker=0] Log loaded for partition __consumer_offsets-8 with initial high watermark 0
2026-05-14T12:51:42.512Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-8 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.515Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-37 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.517Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-37, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.518Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-37 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-37 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.518Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-37 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-37
2026-05-14T12:51:42.518Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-37 broker=0] Log loaded for partition __consumer_offsets-37 with initial high watermark 0
2026-05-14T12:51:42.518Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-37 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.520Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Group coordinator localhost:32807 (id: 2147483647 rack: null) is unavailable or invalid due to cause: error response NOT_COORDINATOR. isDisconnected: false. Rediscovery will be attempted.
2026-05-14T12:51:42.520Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Requesting disconnect from last known coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.520Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] JoinGroup failed: This is not the correct coordinator. Marking coordinator unknown. Sent generation was Generation{generationId=-1, memberId='', protocol='null'}
2026-05-14T12:51:42.520Z  INFO 2537 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Client requested disconnect from node 2147483647
2026-05-14T12:51:42.521Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-4 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.523Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-4, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.525Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Discovered group coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.525Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Group coordinator localhost:32807 (id: 2147483647 rack: null) is unavailable or invalid due to cause: coordinator unavailable. isDisconnected: false. Rediscovery will be attempted.
2026-05-14T12:51:42.525Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Requesting disconnect from last known coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.526Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-4 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-4 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.526Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-4 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-4
2026-05-14T12:51:42.526Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-4 broker=0] Log loaded for partition __consumer_offsets-4 with initial high watermark 0
2026-05-14T12:51:42.526Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-4 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.527Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-33 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.529Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-33, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.530Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-33 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-33 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.530Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-33 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-33
2026-05-14T12:51:42.530Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-33 broker=0] Log loaded for partition __consumer_offsets-33 with initial high watermark 0
2026-05-14T12:51:42.530Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-33 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.534Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-15 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.537Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-15, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.539Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-15 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-15 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.539Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-15 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-15
2026-05-14T12:51:42.540Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-15 broker=0] Log loaded for partition __consumer_offsets-15 with initial high watermark 0
2026-05-14T12:51:42.540Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-15 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.541Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-48 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.546Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-48, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.549Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-48 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-48 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.549Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-48 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-48
2026-05-14T12:51:42.549Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-48 broker=0] Log loaded for partition __consumer_offsets-48 with initial high watermark 0
2026-05-14T12:51:42.549Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-48 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.550Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-11 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.554Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-11, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.555Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-11 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-11 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.555Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-11 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-11
2026-05-14T12:51:42.555Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-11 broker=0] Log loaded for partition __consumer_offsets-11 with initial high watermark 0
2026-05-14T12:51:42.556Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-11 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.559Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-44 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.566Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-44, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.567Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-44 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-44 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.567Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-44 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-44
2026-05-14T12:51:42.567Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-44 broker=0] Log loaded for partition __consumer_offsets-44 with initial high watermark 0
2026-05-14T12:51:42.567Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-44 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.573Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-23 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.578Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-23, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.579Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-23 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-23 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.579Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-23 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-23
2026-05-14T12:51:42.582Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-23 broker=0] Log loaded for partition __consumer_offsets-23 with initial high watermark 0
2026-05-14T12:51:42.582Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-23 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.583Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-19 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.585Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-19, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.586Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-19 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-19 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.586Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-19 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-19
2026-05-14T12:51:42.586Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-19 broker=0] Log loaded for partition __consumer_offsets-19 with initial high watermark 0
2026-05-14T12:51:42.589Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-19 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.593Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-32 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.596Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-32, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.601Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-32 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-32 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.601Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-32 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-32
2026-05-14T12:51:42.601Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-32 broker=0] Log loaded for partition __consumer_offsets-32 with initial high watermark 0
2026-05-14T12:51:42.601Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-32 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.604Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-28 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.606Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-28, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.607Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-28 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-28 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.608Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-28 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-28
2026-05-14T12:51:42.608Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-28 broker=0] Log loaded for partition __consumer_offsets-28 with initial high watermark 0
2026-05-14T12:51:42.608Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-28 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.610Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-7 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.612Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-7, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.613Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-7 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-7 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.613Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-7 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-7
2026-05-14T12:51:42.614Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-7 broker=0] Log loaded for partition __consumer_offsets-7 with initial high watermark 0
2026-05-14T12:51:42.614Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-7 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.615Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-40 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.617Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-40, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.618Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-40 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-40 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.618Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-40 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-40
2026-05-14T12:51:42.618Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-40 broker=0] Log loaded for partition __consumer_offsets-40 with initial high watermark 0
2026-05-14T12:51:42.619Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-40 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.620Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-3 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.622Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-3, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.623Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-3 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-3 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.623Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-3 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-3
2026-05-14T12:51:42.623Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-3 broker=0] Log loaded for partition __consumer_offsets-3 with initial high watermark 0
2026-05-14T12:51:42.623Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-3 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.625Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-36 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.627Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-36, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.627Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-36 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-36 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.628Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-36 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-36
2026-05-14T12:51:42.628Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-36 broker=0] Log loaded for partition __consumer_offsets-36 with initial high watermark 0
2026-05-14T12:51:42.628Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-36 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.629Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-47 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.629Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Discovered group coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.631Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-47, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.632Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-47 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-47 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.632Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-47 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-47
2026-05-14T12:51:42.632Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-47 broker=0] Log loaded for partition __consumer_offsets-47 with initial high watermark 0
2026-05-14T12:51:42.632Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-47 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.632Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Request joining group due to: rebalance failed due to 'This is not the correct coordinator.' (NotCoordinatorException)
2026-05-14T12:51:42.633Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] (Re-)joining group
2026-05-14T12:51:42.633Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-14 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.635Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-14, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.635Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-14 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-14 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.635Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-14 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-14
2026-05-14T12:51:42.635Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-14 broker=0] Log loaded for partition __consumer_offsets-14 with initial high watermark 0
2026-05-14T12:51:42.636Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-14 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.637Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Group coordinator localhost:32807 (id: 2147483647 rack: null) is unavailable or invalid due to cause: error response NOT_COORDINATOR. isDisconnected: false. Rediscovery will be attempted.
2026-05-14T12:51:42.637Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Requesting disconnect from last known coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.637Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] JoinGroup failed: This is not the correct coordinator. Marking coordinator unknown. Sent generation was Generation{generationId=-1, memberId='', protocol='null'}
2026-05-14T12:51:42.637Z  INFO 2537 --- [ntainer#0-0-C-1] org.apache.kafka.clients.NetworkClient   : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Client requested disconnect from node 2147483647
2026-05-14T12:51:42.637Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-43 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.639Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-43, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.639Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-43 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-43 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.639Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-43 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-43
2026-05-14T12:51:42.639Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-43 broker=0] Log loaded for partition __consumer_offsets-43 with initial high watermark 0
2026-05-14T12:51:42.640Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-43 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.641Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Discovered group coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.641Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Group coordinator localhost:32807 (id: 2147483647 rack: null) is unavailable or invalid due to cause: coordinator unavailable. isDisconnected: false. Rediscovery will be attempted.
2026-05-14T12:51:42.641Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Requesting disconnect from last known coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.641Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-10 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.643Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-10, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.643Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-10 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-10 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.643Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-10 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-10
2026-05-14T12:51:42.643Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-10 broker=0] Log loaded for partition __consumer_offsets-10 with initial high watermark 0
2026-05-14T12:51:42.643Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-10 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.645Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-22 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.647Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-22, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.647Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-22 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-22 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.648Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-22 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-22
2026-05-14T12:51:42.648Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-22 broker=0] Log loaded for partition __consumer_offsets-22 with initial high watermark 0
2026-05-14T12:51:42.648Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-22 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.649Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-18 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.651Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-18, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.651Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-18 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-18 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.651Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-18 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-18
2026-05-14T12:51:42.651Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-18 broker=0] Log loaded for partition __consumer_offsets-18 with initial high watermark 0
2026-05-14T12:51:42.652Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-18 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.653Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-31 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.655Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-31, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.655Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-31 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-31 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.655Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-31 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-31
2026-05-14T12:51:42.655Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-31 broker=0] Log loaded for partition __consumer_offsets-31 with initial high watermark 0
2026-05-14T12:51:42.655Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-31 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.657Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-27 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.658Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-27, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.659Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-27 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-27 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.659Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-27 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-27
2026-05-14T12:51:42.659Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-27 broker=0] Log loaded for partition __consumer_offsets-27 with initial high watermark 0
2026-05-14T12:51:42.659Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-27 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.660Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-39 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.662Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-39, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.663Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-39 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-39 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.663Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-39 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-39
2026-05-14T12:51:42.663Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-39 broker=0] Log loaded for partition __consumer_offsets-39 with initial high watermark 0
2026-05-14T12:51:42.663Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-39 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.665Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-6 with topic id tENI8wS_SK63sLRELx3kbQ.
OpenJDK 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
2026-05-14T12:51:42.667Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-6, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.667Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-6 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-6 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.667Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-6 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-6
2026-05-14T12:51:42.667Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-6 broker=0] Log loaded for partition __consumer_offsets-6 with initial high watermark 0
2026-05-14T12:51:42.667Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-6 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.670Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-35 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.671Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-35, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.672Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-35 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-35 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.672Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-35 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-35
2026-05-14T12:51:42.673Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-35 broker=0] Log loaded for partition __consumer_offsets-35 with initial high watermark 0
2026-05-14T12:51:42.673Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-35 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.674Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Creating new partition __consumer_offsets-2 with topic id tENI8wS_SK63sLRELx3kbQ.
2026-05-14T12:51:42.676Z  INFO 2537 --- [r-event-handler] kafka.log.UnifiedLog$                    : [LogLoader partition=__consumer_offsets-2, dir=/tmp/kafka-13682998343891688674/broker_0_data0] Loading producer state till offset 0 with message format version 2
2026-05-14T12:51:42.676Z  INFO 2537 --- [r-event-handler] kafka.log.LogManager                     : Created log for partition __consumer_offsets-2 in /tmp/kafka-13682998343891688674/broker_0_data0/__consumer_offsets-2 with properties {cleanup.policy=compact, compression.type="producer", segment.bytes=104857600}
2026-05-14T12:51:42.676Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-2 broker=0] No checkpointed highwatermark is found for partition __consumer_offsets-2
2026-05-14T12:51:42.676Z  INFO 2537 --- [r-event-handler] kafka.cluster.Partition                  : [Partition __consumer_offsets-2 broker=0] Log loaded for partition __consumer_offsets-2 with initial high watermark 0
2026-05-14T12:51:42.677Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Leader __consumer_offsets-2 with topic id Some(tENI8wS_SK63sLRELx3kbQ) starts at leader epoch 0 from offset 0 with partition epoch 0, high watermark 0, ISR [0], adding replicas [] and removing replicas [] . Previous leader None and previous leader epoch was -1.
2026-05-14T12:51:42.680Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 13 in epoch 0
2026-05-14T12:51:42.682Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-13 for epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 46 in epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-46 for epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 9 in epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-9 for epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 42 in epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-42 for epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 21 in epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-21 for epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 17 in epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-17 for epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 30 in epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-30 for epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 26 in epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-26 for epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 5 in epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-5 for epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 38 in epoch 0
2026-05-14T12:51:42.685Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-38 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 1 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-1 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 34 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-34 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 16 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-16 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 45 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-45 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 12 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-12 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 41 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-41 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 24 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-24 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 20 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-20 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 49 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-49 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 0 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-0 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 29 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-29 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 25 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-25 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 8 in epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-8 for epoch 0
2026-05-14T12:51:42.686Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 37 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-37 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 4 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-4 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 33 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-33 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 15 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-15 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 48 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-48 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 11 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-11 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 44 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-44 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 23 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-23 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 19 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-19 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 32 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-32 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 28 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-28 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 7 in epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-7 for epoch 0
2026-05-14T12:51:42.687Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 40 in epoch 0
2026-05-14T12:51:42.688Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-40 for epoch 0
2026-05-14T12:51:42.688Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 3 in epoch 0
2026-05-14T12:51:42.688Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-3 for epoch 0
2026-05-14T12:51:42.688Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 36 in epoch 0
2026-05-14T12:51:42.688Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-36 for epoch 0
2026-05-14T12:51:42.688Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 47 in epoch 0
2026-05-14T12:51:42.691Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-13 in 8 milliseconds for epoch 0, of which 3 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.691Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-46 in 6 milliseconds for epoch 0, of which 6 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.691Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-9 in 6 milliseconds for epoch 0, of which 6 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.691Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-42 in 6 milliseconds for epoch 0, of which 6 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.691Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-21 in 6 milliseconds for epoch 0, of which 6 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.691Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-17 in 6 milliseconds for epoch 0, of which 6 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.692Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-30 in 7 milliseconds for epoch 0, of which 6 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.693Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-26 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.693Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-5 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.693Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-38 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.688Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-47 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 14 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-1 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-14 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 43 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-43 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 10 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-10 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-34 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 22 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-22 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 18 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-18 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 31 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-16 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-31 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 27 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-27 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 39 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-39 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-45 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 6 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-6 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 35 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-35 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Elected as the group coordinator for partition 2 in epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-12 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.694Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling loading of offsets and group metadata from __consumer_offsets-2 for epoch 0
2026-05-14T12:51:42.694Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-41 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.695Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-24 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.695Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-20 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.695Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-49 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.695Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-0 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.695Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-29 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.695Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-25 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.695Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-8 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.695Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-37 in 8 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.696Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-4 in 9 milliseconds for epoch 0, of which 8 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.696Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-33 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.696Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-15 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.696Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-48 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.696Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-11 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.696Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-44 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.696Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-23 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.696Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-19 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.697Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-32 in 10 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.697Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-28 in 10 milliseconds for epoch 0, of which 10 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.697Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-7 in 10 milliseconds for epoch 0, of which 10 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.697Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-40 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.697Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-3 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.697Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-36 in 9 milliseconds for epoch 0, of which 9 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.697Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-47 in 3 milliseconds for epoch 0, of which 3 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.698Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-14 in 4 milliseconds for epoch 0, of which 3 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.698Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-43 in 4 milliseconds for epoch 0, of which 4 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.698Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-10 in 4 milliseconds for epoch 0, of which 4 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.698Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-22 in 4 milliseconds for epoch 0, of which 4 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.698Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-18 in 4 milliseconds for epoch 0, of which 4 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.698Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-31 in 4 milliseconds for epoch 0, of which 4 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.698Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-27 in 4 milliseconds for epoch 0, of which 4 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.699Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-39 in 5 milliseconds for epoch 0, of which 4 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.699Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-6 in 5 milliseconds for epoch 0, of which 5 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.699Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-35 in 5 milliseconds for epoch 0, of which 5 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.699Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished loading offsets and group metadata from __consumer_offsets-2 in 5 milliseconds for epoch 0, of which 5 milliseconds was spent in the scheduler.
2026-05-14T12:51:42.700Z  INFO 2537 --- [r-event-handler] k.s.metadata.DynamicConfigPublisher      : [DynamicConfigPublisher broker id=0] Updating topic __consumer_offsets with new configuration : compression.type -> producer,cleanup.policy -> compact,segment.bytes -> 104857600
2026-05-14T12:51:42.744Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Discovered group coordinator localhost:32807 (id: 2147483647 rack: null)
2026-05-14T12:51:42.745Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Request joining group due to: rebalance failed due to 'This is not the correct coordinator.' (NotCoordinatorException)
2026-05-14T12:51:42.746Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] (Re-)joining group
2026-05-14T12:51:42.761Z  INFO 2537 --- [quest-handler-0] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Dynamic member with unknown member id joins group midas-consumer-group in Empty state. Created a new member id consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d and request the member to rejoin with this id.
2026-05-14T12:51:42.767Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Request joining group due to: need to re-join with the given member-id: consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d
2026-05-14T12:51:42.767Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Request joining group due to: rebalance failed due to 'The group member needs to have a valid member id before actually entering a consumer group.' (MemberIdRequiredException)
2026-05-14T12:51:42.767Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] (Re-)joining group
2026-05-14T12:51:42.778Z  INFO 2537 --- [quest-handler-5] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Preparing to rebalance group midas-consumer-group in state PreparingRebalance with old generation 0 (__consumer_offsets-3) (reason: Adding new member consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d with group instance id None; client reason: rebalance failed due to MemberIdRequiredException)
2026-05-14T12:51:42.797Z  INFO 2537 --- [cutor-Rebalance] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Stabilized group midas-consumer-group generation 1 (__consumer_offsets-3) with 1 members
2026-05-14T12:51:42.802Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Successfully joined group with generation Generation{generationId=1, memberId='consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d', protocol='range'}
2026-05-14T12:51:42.809Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Finished assignment for group at generation 1: {consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d=Assignment(partitions=[trader-updates-0])}
2026-05-14T12:51:42.822Z  INFO 2537 --- [quest-handler-3] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Assignment received from leader consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d for group midas-consumer-group for generation 1. The group has 1 members, 0 of which are static.
2026-05-14T12:51:42.855Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Successfully synced group in generation Generation{generationId=1, memberId='consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d', protocol='range'}
2026-05-14T12:51:42.856Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Notifying assignor about the new Assignment(partitions=[trader-updates-0])
2026-05-14T12:51:42.858Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Adding newly assigned partitions: trader-updates-0
2026-05-14T12:51:42.873Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Found no committed offset for partition trader-updates-0
2026-05-14T12:51:42.895Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.SubscriptionState    : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Resetting offset for partition trader-updates-0 to position FetchPosition{offset=0, offsetEpoch=Optional.empty, currentLeader=LeaderAndEpoch{leader=Optional[localhost:32807 (id: 0 rack: null)], epoch=0}}.
2026-05-14T12:51:42.898Z  INFO 2537 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : midas-consumer-group: partitions assigned: [trader-updates-0]
2026-05-14T12:51:42.978Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=1 name=bernie balance=1200.23
2026-05-14T12:51:43.013Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=2 name=grommit balance=2215.37
2026-05-14T12:51:43.014Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=3 name=maria balance=2774.14
2026-05-14T12:51:43.015Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=4 name=mario balance=12.34
2026-05-14T12:51:43.016Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=5 name=waldorf balance=444.55
2026-05-14T12:51:43.017Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=6 name=whosit balance=888.9
2026-05-14T12:51:43.018Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=7 name=whatsit balance=777.6
2026-05-14T12:51:43.019Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=8 name=howsit balance=68.7
2026-05-14T12:51:43.020Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=9 name=wilbur balance=3476.21
2026-05-14T12:51:43.021Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=10 name=antonio balance=2121.54
2026-05-14T12:51:43.022Z  INFO 2537 --- [           main] c.j.midascore.component.DatabaseConduit  : User saved: id=11 name=calypso balance=779421.3
2026-05-14T12:51:43.030Z  INFO 2537 --- [           main] o.a.k.clients.producer.ProducerConfig    : ProducerConfig values: 
	acks = -1
	auto.include.jmx.reporter = true
	batch.size = 16384
	bootstrap.servers = [localhost:32807]
	buffer.memory = 33554432
	client.dns.lookup = use_all_dns_ips
	client.id = producer-1
	compression.type = none
	connections.max.idle.ms = 540000
	delivery.timeout.ms = 120000
	enable.idempotence = true
	interceptor.classes = []
	key.serializer = class org.apache.kafka.common.serialization.StringSerializer
	linger.ms = 0
	max.block.ms = 60000
	max.in.flight.requests.per.connection = 5
	max.request.size = 1048576
	metadata.max.age.ms = 300000
	metadata.max.idle.ms = 300000
	metric.reporters = []
	metrics.num.samples = 2
	metrics.recording.level = INFO
	metrics.sample.window.ms = 30000
	partitioner.adaptive.partitioning.enable = true
	partitioner.availability.timeout.ms = 0
	partitioner.class = null
	partitioner.ignore.keys = false
	receive.buffer.bytes = 32768
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
	transaction.timeout.ms = 60000
	transactional.id = null
	value.serializer = class org.springframework.kafka.support.serializer.JsonSerializer

2026-05-14T12:51:43.037Z  INFO 2537 --- [           main] o.a.k.clients.producer.KafkaProducer     : [Producer clientId=producer-1] Instantiated an idempotent producer.
2026-05-14T12:51:43.047Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version: 3.6.2
2026-05-14T12:51:43.047Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId: c4deed513057c94e
2026-05-14T12:51:43.048Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : Kafka startTimeMs: 1778763103047
2026-05-14T12:51:43.054Z  INFO 2537 --- [ad | producer-1] org.apache.kafka.clients.Metadata        : [Producer clientId=producer-1] Cluster ID: roVELUPNTiKhkf-H3TtTpA
2026-05-14T12:51:43.060Z  INFO 2537 --- [0-event-handler] o.a.k.c.ProducerIdControlManager         : [QuorumController id=0] Replaying ProducerIdsRecord ProducerIdsRecord(brokerId=0, brokerEpoch=5, nextProducerId=1000)
2026-05-14T12:51:43.164Z  INFO 2537 --- [ad | producer-1] o.a.k.c.p.internals.TransactionManager   : [Producer clientId=producer-1] ProducerId set to 0 with epoch 0
2026-05-14T12:51:43.215Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 123.78
2026-05-14T12:51:43.369Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=maria newBal=2650.3599 | recipient=grommit newBal=2339.1501 | incentive=0.0
2026-05-14T12:51:43.391Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 144.73
2026-05-14T12:51:43.403Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=bernie newBal=1055.5 | recipient=mario newBal=157.06999 | incentive=0.0
2026-05-14T12:51:43.405Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 183.2
2026-05-14T12:51:43.415Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=waldorf newBal=261.34998 | recipient=grommit newBal=2522.35 | incentive=0.0
2026-05-14T12:51:43.417Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 123.74
2026-05-14T12:51:43.426Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=antonio newBal=1997.8 | recipient=bernie newBal=1179.24 | incentive=0.0
2026-05-14T12:51:43.428Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 164.17
2026-05-14T12:51:43.439Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=maria newBal=2486.19 | recipient=grommit newBal=2686.52 | incentive=0.0
2026-05-14T12:51:43.440Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 20.3
2026-05-14T12:51:43.447Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=grommit newBal=2666.22 | recipient=wilbur newBal=3496.51 | incentive=0.0
2026-05-14T12:51:43.449Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 182.62
2026-05-14T12:51:43.455Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=wilbur newBal=3313.8901 | recipient=maria newBal=2668.81 | incentive=0.0
2026-05-14T12:51:43.457Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 21.59
2026-05-14T12:51:43.467Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=mario newBal=135.48 | recipient=howsit newBal=90.28999 | incentive=0.0
2026-05-14T12:51:43.468Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 90.29
2026-05-14T12:51:43.476Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=waldorf newBal=171.05997 | recipient=antonio newBal=2088.09 | incentive=0.0
2026-05-14T12:51:43.477Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 47.96
2026-05-14T12:51:43.484Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=waldorf newBal=123.09997 | recipient=bernie newBal=1227.2 | incentive=0.0
2026-05-14T12:51:43.485Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 71.52
2026-05-14T12:51:43.491Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=waldorf newBal=51.57997 | recipient=maria newBal=2740.33 | incentive=0.0
2026-05-14T12:51:43.492Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 157.84
2026-05-14T12:51:43.494Z  WARN 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Discarding — sender howsit insufficient balance
2026-05-14T12:51:43.495Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 46.81
2026-05-14T12:51:43.504Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=whosit newBal=842.09 | recipient=bernie newBal=1274.01 | incentive=0.0
2026-05-14T12:51:43.505Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 69.1
2026-05-14T12:51:43.512Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=bernie newBal=1204.91 | recipient=antonio newBal=2157.1902 | incentive=0.0
2026-05-14T12:51:43.514Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 130.97
2026-05-14T12:51:43.521Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=grommit newBal=2535.25 | recipient=bernie newBal=1335.88 | incentive=0.0
2026-05-14T12:51:43.523Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 32.27
2026-05-14T12:51:43.537Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=mario newBal=103.20999 | recipient=grommit newBal=2567.52 | incentive=0.0
2026-05-14T12:51:43.539Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 92.38
2026-05-14T12:51:43.542Z  WARN 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Discarding — sender howsit insufficient balance
2026-05-14T12:51:43.543Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 120.11
2026-05-14T12:51:43.555Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=whatsit newBal=657.49 | recipient=wilbur newBal=3434.0002 | incentive=0.0
2026-05-14T12:51:43.559Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 64.47
2026-05-14T12:51:43.563Z  WARN 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Discarding — sender waldorf insufficient balance
2026-05-14T12:51:43.564Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 37.76
2026-05-14T12:51:43.574Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=waldorf newBal=13.819973 | recipient=mario newBal=140.96999 | incentive=0.0
2026-05-14T12:51:43.577Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 3.4
2026-05-14T12:51:43.590Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=waldorf newBal=10.419973 | recipient=whosit newBal=845.49005 | incentive=0.0
2026-05-14T12:51:43.593Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.m.c.TransactionKafkaListener         : MIDAS_AMOUNT: 8.9
2026-05-14T12:51:43.606Z  INFO 2537 --- [ntainer#0-0-C-1] c.j.midascore.component.DatabaseConduit  : Processed: sender=bernie newBal=1326.98 | recipient=howsit newBal=99.189995 | incentive=0.0
2026-05-14T12:51:45.076Z  INFO 2537 --- [           main] com.jpmc.midascore.TaskFiveTests         : ----------------------------------------------------------
2026-05-14T12:51:45.076Z  INFO 2537 --- [           main] com.jpmc.midascore.TaskFiveTests         : ----------------------------------------------------------
2026-05-14T12:51:45.076Z  INFO 2537 --- [           main] com.jpmc.midascore.TaskFiveTests         : ----------------------------------------------------------
2026-05-14T12:51:45.076Z  INFO 2537 --- [           main] com.jpmc.midascore.TaskFiveTests         : submit the following output to complete the task (include begin and end output denotations)
2026-05-14T12:51:45.127Z  INFO 2537 --- [io-33400-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-05-14T12:51:45.127Z  INFO 2537 --- [io-33400-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-05-14T12:51:45.128Z  INFO 2537 --- [io-33400-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms
2026-05-14T12:51:45.215Z  INFO 2537 --- [           main] com.jpmc.midascore.TaskFiveTests         : 
---begin output ---
Balance {amount=0.0}
Balance {amount=1326.98}
Balance {amount=2567.52}
Balance {amount=2740.33}
Balance {amount=140.96999}
Balance {amount=10.419973}
Balance {amount=845.49005}
Balance {amount=657.49}
Balance {amount=99.189995}
Balance {amount=3434.0002}
Balance {amount=2157.1902}
Balance {amount=779421.3}
Balance {amount=0.0}
---end output ---
2026-05-14T12:51:45.232Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Revoke previously assigned partitions trader-updates-0
2026-05-14T12:51:45.233Z  INFO 2537 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : midas-consumer-group: partitions revoked: [trader-updates-0]
2026-05-14T12:51:45.233Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Member consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d sending LeaveGroup request to coordinator localhost:32807 (id: 2147483647 rack: null) due to the consumer unsubscribed from all topics
2026-05-14T12:51:45.233Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Resetting generation and member id due to: consumer pro-actively leaving the group
2026-05-14T12:51:45.233Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Request joining group due to: consumer pro-actively leaving the group
2026-05-14T12:51:45.233Z  INFO 2537 --- [ntainer#0-0-C-1] fkaConsumerFactory$ExtendedKafkaConsumer : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Unsubscribed all topics or patterns and assigned partitions
2026-05-14T12:51:45.236Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Resetting generation and member id due to: consumer pro-actively leaving the group
2026-05-14T12:51:45.236Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-midas-consumer-group-1, groupId=midas-consumer-group] Request joining group due to: consumer pro-actively leaving the group
2026-05-14T12:51:45.237Z  INFO 2537 --- [quest-handler-4] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Preparing to rebalance group midas-consumer-group in state PreparingRebalance with old generation 1 (__consumer_offsets-3) (reason: Removing member consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d on LeaveGroup; client reason: the consumer unsubscribed from all topics)
2026-05-14T12:51:45.238Z  INFO 2537 --- [quest-handler-4] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Group midas-consumer-group with generation 2 is now empty (__consumer_offsets-3)
2026-05-14T12:51:45.240Z  INFO 2537 --- [quest-handler-4] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Member MemberMetadata(memberId=consumer-midas-consumer-group-1-1aab817e-5237-4711-a284-74cc17fc408d, groupInstanceId=None, clientId=consumer-midas-consumer-group-1, clientHost=/127.0.0.1, sessionTimeoutMs=45000, rebalanceTimeoutMs=300000, supportedProtocols=List(range, cooperative-sticky)) has left group midas-consumer-group through explicit `LeaveGroup`; client reason: the consumer unsubscribed from all topics
2026-05-14T12:51:45.731Z  INFO 2537 --- [ntainer#0-0-C-1] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2026-05-14T12:51:45.731Z  INFO 2537 --- [ntainer#0-0-C-1] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2026-05-14T12:51:45.732Z  INFO 2537 --- [ntainer#0-0-C-1] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2026-05-14T12:51:45.733Z  INFO 2537 --- [ntainer#0-0-C-1] o.a.kafka.common.utils.AppInfoParser     : App info kafka.consumer for consumer-midas-consumer-group-1 unregistered
2026-05-14T12:51:45.734Z  INFO 2537 --- [ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : midas-consumer-group: Consumer stopped
2026-05-14T12:51:45.739Z  INFO 2537 --- [           main] o.a.k.clients.producer.KafkaProducer     : [Producer clientId=producer-1] Closing the Kafka producer with timeoutMillis = 30000 ms.
2026-05-14T12:51:45.742Z  INFO 2537 --- [           main] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2026-05-14T12:51:45.742Z  INFO 2537 --- [           main] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2026-05-14T12:51:45.742Z  INFO 2537 --- [           main] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2026-05-14T12:51:45.743Z  INFO 2537 --- [           main] o.a.kafka.common.utils.AppInfoParser     : App info kafka.producer for producer-1 unregistered
2026-05-14T12:51:45.745Z  INFO 2537 --- [-kit-executor-4] kafka.server.BrokerServer                : [BrokerServer id=0] Transition from STARTED to SHUTTING_DOWN
2026-05-14T12:51:45.746Z  INFO 2537 --- [-kit-executor-4] kafka.server.BrokerServer                : [BrokerServer id=0] shutting down
2026-05-14T12:51:45.747Z  INFO 2537 --- [r-event-handler] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Beginning controlled shutdown.
2026-05-14T12:51:45.748Z  INFO 2537 --- [0-event-handler] o.a.k.controller.BrokerHeartbeatManager  : [QuorumController id=0] Unfenced broker 0 has requested and been granted a controlled shutdown.
2026-05-14T12:51:45.751Z  INFO 2537 --- [0-event-handler] o.a.k.c.ReplicationControlManager        : [QuorumController id=0] enterControlledShutdown[0]: changing 51 partition(s)
2026-05-14T12:51:45.752Z  INFO 2537 --- [0-event-handler] o.a.k.controller.ClusterControlManager   : [QuorumController id=0] Replayed BrokerRegistrationChangeRecord modifying the registration for broker 0: BrokerRegistrationChangeRecord(brokerId=0, brokerEpoch=5, fenced=0, inControlledShutdown=1)
2026-05-14T12:51:45.782Z  INFO 2537 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] The broker is in PENDING_CONTROLLED_SHUTDOWN state, still waiting for the active controller.
2026-05-14T12:51:45.782Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Transitioning 51 partition(s) to local followers.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-13 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-46 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-9 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-42 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-21 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-17 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-30 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-26 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-5 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.786Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-38 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-1 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-34 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-16 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-45 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-12 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-41 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-24 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-20 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-49 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-0 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-29 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.787Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-25 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-8 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-37 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-4 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-33 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower trader-updates-0 starts at leader epoch 1 from offset 22 with partition epoch 1 and high watermark 22. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-15 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-48 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-11 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-44 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-23 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-19 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-32 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-28 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.788Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-7 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-40 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-3 starts at leader epoch 1 from offset 3 with partition epoch 1 and high watermark 3. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-36 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-47 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-14 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-43 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-10 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-22 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-18 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-31 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-27 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-39 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-6 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.789Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-35 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.790Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Follower __consumer_offsets-2 starts at leader epoch 1 from offset 0 with partition epoch 1 and high watermark 0. Current leader is -1. Previous leader Some(-1) and previous leader epoch was 1.
2026-05-14T12:51:45.792Z  INFO 2537 --- [r-event-handler] kafka.server.ReplicaFetcherManager       : [ReplicaFetcherManager on broker 0] Removed fetcher for partitions HashSet(__consumer_offsets-22, __consumer_offsets-30, __consumer_offsets-25, __consumer_offsets-35, __consumer_offsets-37, __consumer_offsets-13, __consumer_offsets-8, __consumer_offsets-21, __consumer_offsets-4, __consumer_offsets-27, __consumer_offsets-7, __consumer_offsets-9, __consumer_offsets-46, __consumer_offsets-41, __consumer_offsets-33, __consumer_offsets-23, __consumer_offsets-49, __consumer_offsets-47, __consumer_offsets-16, __consumer_offsets-28, __consumer_offsets-31, __consumer_offsets-36, __consumer_offsets-42, __consumer_offsets-3, __consumer_offsets-18, __consumer_offsets-15, __consumer_offsets-24, trader-updates-0, __consumer_offsets-38, __consumer_offsets-17, __consumer_offsets-48, __consumer_offsets-19, __consumer_offsets-11, __consumer_offsets-2, __consumer_offsets-43, __consumer_offsets-6, __consumer_offsets-14, __consumer_offsets-20, __consumer_offsets-0, __consumer_offsets-44, __consumer_offsets-39, __consumer_offsets-12, __consumer_offsets-45, __consumer_offsets-1, __consumer_offsets-5, __consumer_offsets-26, __consumer_offsets-29, __consumer_offsets-34, __consumer_offsets-10, __consumer_offsets-32, __consumer_offsets-40)
2026-05-14T12:51:45.792Z  INFO 2537 --- [r-event-handler] k.server.ReplicaAlterLogDirsManager      : [ReplicaAlterLogDirsManager on broker 0] Removed fetcher for partitions HashSet(__consumer_offsets-22, __consumer_offsets-30, __consumer_offsets-25, __consumer_offsets-35, __consumer_offsets-37, __consumer_offsets-13, __consumer_offsets-8, __consumer_offsets-21, __consumer_offsets-4, __consumer_offsets-27, __consumer_offsets-7, __consumer_offsets-9, __consumer_offsets-46, __consumer_offsets-41, __consumer_offsets-33, __consumer_offsets-23, __consumer_offsets-49, __consumer_offsets-47, __consumer_offsets-16, __consumer_offsets-28, __consumer_offsets-31, __consumer_offsets-36, __consumer_offsets-42, __consumer_offsets-3, __consumer_offsets-18, __consumer_offsets-15, __consumer_offsets-24, trader-updates-0, __consumer_offsets-38, __consumer_offsets-17, __consumer_offsets-48, __consumer_offsets-19, __consumer_offsets-11, __consumer_offsets-2, __consumer_offsets-43, __consumer_offsets-6, __consumer_offsets-14, __consumer_offsets-20, __consumer_offsets-0, __consumer_offsets-44, __consumer_offsets-39, __consumer_offsets-12, __consumer_offsets-45, __consumer_offsets-1, __consumer_offsets-5, __consumer_offsets-26, __consumer_offsets-29, __consumer_offsets-34, __consumer_offsets-10, __consumer_offsets-32, __consumer_offsets-40)
2026-05-14T12:51:45.794Z  INFO 2537 --- [r-event-handler] state.change.logger                      : [Broker id=0] Stopped fetchers as part of controlled shutdown for 51 partitions
2026-05-14T12:51:45.795Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 13 in epoch OptionalInt[1]
2026-05-14T12:51:45.795Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-13
2026-05-14T12:51:45.795Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 46 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-46
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 9 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-9
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 42 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-42
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 21 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-21
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 17 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-17
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 30 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-30
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 26 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-26
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 5 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-5
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 38 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-38
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 1 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-1
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 34 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-34
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 16 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-16
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 45 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-45
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 12 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-12
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 41 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-41
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 24 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-24
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 20 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-20
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 49 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-49
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 0 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-0
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 29 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-29
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 25 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-25
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 8 in epoch OptionalInt[1]
2026-05-14T12:51:45.796Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-8
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 37 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-37
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 4 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-4
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 33 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-33
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 15 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-15
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 48 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-48
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 11 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-11
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 44 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-44
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 23 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-23
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-13 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 19 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-19
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 32 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-32
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-46 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 28 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-28
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 7 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-9 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-7
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 40 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-40
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 3 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-42 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-3
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 36 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-36
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-21 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 47 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-47
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 14 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-14
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-17 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 43 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-43
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 10 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-10
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-30 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 22 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-22
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 18 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-18
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-26 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 31 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-31
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 27 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-5 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-27
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 39 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-39
2026-05-14T12:51:45.797Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-38 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 6 in epoch OptionalInt[1]
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-6
2026-05-14T12:51:45.797Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 35 in epoch OptionalInt[1]
2026-05-14T12:51:45.798Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-35
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-1 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Resigned as the group coordinator for partition 2 in epoch OptionalInt[1]
2026-05-14T12:51:45.798Z  INFO 2537 --- [r-event-handler] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Scheduling unloading of offsets and group metadata from __consumer_offsets-2
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-34 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-16 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-45 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-12 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-41 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-24 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-20 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-49 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-0 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-29 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-25 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-8 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-37 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-4 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-33 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-15 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.798Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-48 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.799Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-11 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.799Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-44 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.799Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-23 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.799Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-19 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.799Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-32 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.799Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-28 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.799Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-7 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.799Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-40 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.799Z  INFO 2537 --- [adata-manager-0] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Unloading group metadata for midas-consumer-group with generation 2
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-3 for coordinator epoch OptionalInt[1]. Removed 1 cached offsets and 1 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-36 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-47 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-14 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-43 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-10 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-22 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-18 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-31 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-27 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-39 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.800Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-6 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.801Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-35 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.801Z  INFO 2537 --- [adata-manager-0] k.c.group.GroupMetadataManager           : [GroupMetadataManager brokerId=0] Finished unloading __consumer_offsets-2 for coordinator epoch OptionalInt[1]. Removed 0 cached offsets and 0 cached groups.
2026-05-14T12:51:45.834Z  INFO 2537 --- [0-event-handler] o.a.k.controller.BrokerHeartbeatManager  : [QuorumController id=0] The request from broker 0 to shut down has been granted since the lowest active offset 9223372036854775807 is now greater than the broker's controlled shutdown offset 129.
2026-05-14T12:51:45.836Z  INFO 2537 --- [0-event-handler] o.a.k.controller.ClusterControlManager   : [QuorumController id=0] Replayed BrokerRegistrationChangeRecord modifying the registration for broker 0: BrokerRegistrationChangeRecord(brokerId=0, brokerEpoch=5, fenced=1, inControlledShutdown=0)
2026-05-14T12:51:45.864Z  INFO 2537 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] The controller has asked us to exit controlled shutdown.
2026-05-14T12:51:45.864Z  INFO 2537 --- [channel-manager] org.apache.kafka.queue.KafkaEventQueue   : [BrokerLifecycleManager id=0] beginShutdown: shutting down event queue.
2026-05-14T12:51:45.865Z  INFO 2537 --- [r-event-handler] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Transitioning from PENDING_CONTROLLED_SHUTDOWN to SHUTTING_DOWN.
2026-05-14T12:51:45.865Z  INFO 2537 --- [r-event-handler] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Shutting down
2026-05-14T12:51:45.865Z  INFO 2537 --- [r-event-handler] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Shutdown completed
2026-05-14T12:51:45.866Z  INFO 2537 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Stopped
2026-05-14T12:51:45.866Z  INFO 2537 --- [-kit-executor-4] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Stopping socket server request processors
2026-05-14T12:51:45.869Z  INFO 2537 --- [r-event-handler] k.s.BrokerToControllerChannelManagerImpl : Broker to controller channel manager for heartbeat shutdown
2026-05-14T12:51:45.875Z  INFO 2537 --- [-kit-executor-4] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Stopped socket server request processors
2026-05-14T12:51:45.875Z  INFO 2537 --- [-kit-executor-4] kafka.server.KafkaRequestHandlerPool     : [data-plane Kafka Request Handler on Broker 0], shutting down
2026-05-14T12:51:45.877Z  INFO 2537 --- [-kit-executor-4] kafka.server.KafkaRequestHandlerPool     : [data-plane Kafka Request Handler on Broker 0], shut down completely
2026-05-14T12:51:45.878Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Shutting down
2026-05-14T12:51:45.878Z  INFO 2537 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Stopped
2026-05-14T12:51:45.878Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Shutdown completed
2026-05-14T12:51:45.879Z  INFO 2537 --- [-kit-executor-4] kafka.server.KafkaApis                   : [KafkaApi-0] Shutdown complete.
2026-05-14T12:51:45.881Z  INFO 2537 --- [-kit-executor-4] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Shutting down.
2026-05-14T12:51:45.882Z  INFO 2537 --- [-kit-executor-4] k.c.transaction.TransactionStateManager  : [Transaction State Manager 0]: Shutdown complete
2026-05-14T12:51:45.882Z  INFO 2537 --- [-kit-executor-4] k.c.t.TransactionMarkerChannelManager    : [TxnMarkerSenderThread-0]: Shutting down
2026-05-14T12:51:45.883Z  INFO 2537 --- [rSenderThread-0] k.c.t.TransactionMarkerChannelManager    : [TxnMarkerSenderThread-0]: Stopped
2026-05-14T12:51:45.883Z  INFO 2537 --- [-kit-executor-4] k.c.t.TransactionMarkerChannelManager    : [TxnMarkerSenderThread-0]: Shutdown completed
2026-05-14T12:51:45.885Z  INFO 2537 --- [-kit-executor-4] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Shutdown complete.
2026-05-14T12:51:45.885Z  INFO 2537 --- [-kit-executor-4] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Shutting down.
2026-05-14T12:51:45.885Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Heartbeat]: Shutting down
2026-05-14T12:51:45.886Z  INFO 2537 --- [per-0-Heartbeat] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Heartbeat]: Stopped
2026-05-14T12:51:45.886Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Heartbeat]: Shutdown completed
2026-05-14T12:51:45.886Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Rebalance]: Shutting down
2026-05-14T12:51:45.886Z  INFO 2537 --- [per-0-Rebalance] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Rebalance]: Stopped
2026-05-14T12:51:45.886Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Rebalance]: Shutdown completed
2026-05-14T12:51:45.886Z  INFO 2537 --- [-kit-executor-4] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Shutdown complete.
2026-05-14T12:51:45.887Z  INFO 2537 --- [-kit-executor-4] kafka.server.ReplicaManager              : [ReplicaManager broker=0] Shutting down
2026-05-14T12:51:45.887Z  INFO 2537 --- [-kit-executor-4] k.s.ReplicaManager$LogDirFailureHandler  : [LogDirFailureHandler]: Shutting down
2026-05-14T12:51:45.887Z  INFO 2537 --- [rFailureHandler] k.s.ReplicaManager$LogDirFailureHandler  : [LogDirFailureHandler]: Stopped
2026-05-14T12:51:45.887Z  INFO 2537 --- [-kit-executor-4] k.s.ReplicaManager$LogDirFailureHandler  : [LogDirFailureHandler]: Shutdown completed
2026-05-14T12:51:45.887Z  INFO 2537 --- [-kit-executor-4] kafka.server.ReplicaFetcherManager       : [ReplicaFetcherManager on broker 0] shutting down
2026-05-14T12:51:45.888Z  INFO 2537 --- [-kit-executor-4] kafka.server.ReplicaFetcherManager       : [ReplicaFetcherManager on broker 0] shutdown completed
2026-05-14T12:51:45.889Z  INFO 2537 --- [-kit-executor-4] k.server.ReplicaAlterLogDirsManager      : [ReplicaAlterLogDirsManager on broker 0] shutting down
2026-05-14T12:51:45.889Z  INFO 2537 --- [-kit-executor-4] k.server.ReplicaAlterLogDirsManager      : [ReplicaAlterLogDirsManager on broker 0] shutdown completed
2026-05-14T12:51:45.889Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Fetch]: Shutting down
2026-05-14T12:51:45.889Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Fetch]: Shutdown completed
2026-05-14T12:51:45.889Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-RemoteFetch]: Shutting down
2026-05-14T12:51:45.889Z  INFO 2537 --- [nReaper-0-Fetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Fetch]: Stopped
2026-05-14T12:51:45.890Z  INFO 2537 --- [r-0-RemoteFetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-RemoteFetch]: Stopped
2026-05-14T12:51:45.890Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-RemoteFetch]: Shutdown completed
2026-05-14T12:51:45.890Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Produce]: Shutting down
2026-05-14T12:51:45.890Z  INFO 2537 --- [eaper-0-Produce] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Produce]: Stopped
2026-05-14T12:51:45.890Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Produce]: Shutdown completed
2026-05-14T12:51:45.891Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-DeleteRecords]: Shutting down
2026-05-14T12:51:45.891Z  INFO 2537 --- [0-DeleteRecords] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-DeleteRecords]: Stopped
2026-05-14T12:51:45.891Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-DeleteRecords]: Shutdown completed
2026-05-14T12:51:45.891Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-ElectLeader]: Shutting down
2026-05-14T12:51:45.892Z  INFO 2537 --- [r-0-ElectLeader] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-ElectLeader]: Stopped
2026-05-14T12:51:45.892Z  INFO 2537 --- [-kit-executor-4] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-ElectLeader]: Shutdown completed
2026-05-14T12:51:45.895Z  INFO 2537 --- [-kit-executor-4] kafka.server.AddPartitionsToTxnManager   : [AddPartitionsToTxnSenderThread-0]: Shutting down
2026-05-14T12:51:45.896Z  INFO 2537 --- [nSenderThread-0] kafka.server.AddPartitionsToTxnManager   : [AddPartitionsToTxnSenderThread-0]: Stopped
2026-05-14T12:51:45.896Z  INFO 2537 --- [-kit-executor-4] kafka.server.AddPartitionsToTxnManager   : [AddPartitionsToTxnSenderThread-0]: Shutdown completed
2026-05-14T12:51:45.896Z  INFO 2537 --- [-kit-executor-4] kafka.server.ReplicaManager              : [ReplicaManager broker=0] Shut down completely
2026-05-14T12:51:45.896Z  INFO 2537 --- [-kit-executor-4] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Shutting down
2026-05-14T12:51:45.896Z  INFO 2537 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Stopped
2026-05-14T12:51:45.896Z  INFO 2537 --- [-kit-executor-4] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Shutdown completed
2026-05-14T12:51:45.897Z  INFO 2537 --- [-kit-executor-4] k.s.BrokerToControllerChannelManagerImpl : Broker to controller channel manager for alter-partition shutdown
2026-05-14T12:51:45.897Z  INFO 2537 --- [-kit-executor-4] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Shutting down
2026-05-14T12:51:45.897Z  INFO 2537 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Stopped
2026-05-14T12:51:45.897Z  INFO 2537 --- [-kit-executor-4] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Shutdown completed
2026-05-14T12:51:45.897Z  INFO 2537 --- [-kit-executor-4] k.s.BrokerToControllerChannelManagerImpl : Broker to controller channel manager for forwarding shutdown
2026-05-14T12:51:45.898Z  INFO 2537 --- [-kit-executor-4] kafka.log.LogManager                     : Shutting down.
2026-05-14T12:51:45.898Z  INFO 2537 --- [-kit-executor-4] kafka.log.LogCleaner                     : Shutting down the log cleaner.
2026-05-14T12:51:45.899Z  INFO 2537 --- [-kit-executor-4] kafka.log.LogCleaner$CleanerThread       : [kafka-log-cleaner-thread-0]: Shutting down
2026-05-14T12:51:45.899Z  INFO 2537 --- [leaner-thread-0] kafka.log.LogCleaner$CleanerThread       : [kafka-log-cleaner-thread-0]: Stopped
2026-05-14T12:51:45.899Z  INFO 2537 --- [-kit-executor-4] kafka.log.LogCleaner$CleanerThread       : [kafka-log-cleaner-thread-0]: Shutdown completed
2026-05-14T12:51:45.920Z  INFO 2537 --- [/broker_0_data0] o.a.k.s.i.log.ProducerStateManager       : [ProducerStateManager partition=__consumer_offsets-3]Wrote producer snapshot at offset 3 with 0 producer ids in 1 ms.
2026-05-14T12:51:45.932Z  INFO 2537 --- [/broker_0_data0] o.a.k.s.i.log.ProducerStateManager       : [ProducerStateManager partition=trader-updates-0]Wrote producer snapshot at offset 22 with 1 producer ids in 1 ms.
2026-05-14T12:51:45.948Z  INFO 2537 --- [-kit-executor-4] kafka.log.LogManager                     : Shutdown complete.
2026-05-14T12:51:45.949Z  INFO 2537 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Fetch]: Shutting down
2026-05-14T12:51:45.950Z  INFO 2537 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Fetch]: Stopped
2026-05-14T12:51:45.950Z  INFO 2537 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Fetch]: Shutdown completed
2026-05-14T12:51:45.950Z  INFO 2537 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Produce]: Shutting down
2026-05-14T12:51:45.950Z  INFO 2537 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Produce]: Stopped
2026-05-14T12:51:45.950Z  INFO 2537 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Produce]: Shutdown completed
2026-05-14T12:51:45.950Z  INFO 2537 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Request]: Shutting down
2026-05-14T12:51:45.951Z  INFO 2537 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Request]: Shutdown completed
2026-05-14T12:51:45.951Z  INFO 2537 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-ControllerMutation]: Shutting down
2026-05-14T12:51:45.951Z  INFO 2537 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Request]: Stopped
2026-05-14T12:51:45.951Z  INFO 2537 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-ControllerMutation]: Stopped
2026-05-14T12:51:45.951Z  INFO 2537 --- [-kit-executor-4] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-ControllerMutation]: Shutdown completed
2026-05-14T12:51:45.951Z  INFO 2537 --- [-kit-executor-4] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Shutting down socket server
2026-05-14T12:51:45.967Z  INFO 2537 --- [-kit-executor-4] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Shutdown completed
2026-05-14T12:51:45.968Z  INFO 2537 --- [-kit-executor-4] kafka.server.BrokerTopicStats            : Broker and topic stats closed
2026-05-14T12:51:45.968Z  INFO 2537 --- [-kit-executor-4] org.apache.kafka.queue.KafkaEventQueue   : [BrokerLifecycleManager id=0] closed event queue.
2026-05-14T12:51:45.968Z  INFO 2537 --- [-kit-executor-4] kafka.server.BrokerServer                : [BrokerServer id=0] shut down completed
2026-05-14T12:51:45.968Z  INFO 2537 --- [-kit-executor-4] kafka.server.BrokerServer                : [BrokerServer id=0] Transition from SHUTTING_DOWN to SHUTDOWN
2026-05-14T12:51:45.969Z  INFO 2537 --- [-kit-executor-1] kafka.server.ControllerServer            : [ControllerServer id=0] shutting down
2026-05-14T12:51:45.970Z  INFO 2537 --- [-kit-executor-1] ExpirationService$ExpiredOperationReaper : [raft-expiration-reaper]: Shutting down
2026-05-14T12:51:46.075Z  INFO 2537 --- [piration-reaper] ExpirationService$ExpiredOperationReaper : [raft-expiration-reaper]: Stopped
2026-05-14T12:51:46.075Z  INFO 2537 --- [-kit-executor-1] ExpirationService$ExpiredOperationReaper : [raft-expiration-reaper]: Shutdown completed
2026-05-14T12:51:46.076Z  INFO 2537 --- [-kit-executor-1] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Shutting down
2026-05-14T12:51:46.076Z  INFO 2537 --- [-kit-executor-1] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Beginning graceful shutdown
2026-05-14T12:51:46.077Z  INFO 2537 --- [-raft-io-thread] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Graceful shutdown completed
2026-05-14T12:51:46.077Z  INFO 2537 --- [-raft-io-thread] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Stopped
2026-05-14T12:51:46.077Z  INFO 2537 --- [-kit-executor-1] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Completed graceful shutdown of RaftClient
2026-05-14T12:51:46.077Z  INFO 2537 --- [-kit-executor-1] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Shutdown completed
2026-05-14T12:51:46.079Z  INFO 2537 --- [-kit-executor-1] kafka.raft.RaftSendThread                : [kafka-0-raft-outbound-request-thread]: Shutting down
2026-05-14T12:51:46.079Z  INFO 2537 --- [-request-thread] kafka.raft.RaftSendThread                : [kafka-0-raft-outbound-request-thread]: Stopped
2026-05-14T12:51:46.079Z  INFO 2537 --- [-kit-executor-1] kafka.raft.RaftSendThread                : [kafka-0-raft-outbound-request-thread]: Shutdown completed
2026-05-14T12:51:46.080Z  INFO 2537 --- [-kit-executor-1] o.a.k.s.i.log.ProducerStateManager       : [ProducerStateManager partition=__cluster_metadata-0]Wrote producer snapshot at offset 132 with 0 producer ids in 1 ms.
2026-05-14T12:51:46.083Z  INFO 2537 --- [-kit-executor-1] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Stopping socket server request processors
2026-05-14T12:51:46.086Z  INFO 2537 --- [-kit-executor-1] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Stopped socket server request processors
2026-05-14T12:51:46.087Z  INFO 2537 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [QuorumController id=0] QuorumController#beginShutdown: shutting down event queue.
2026-05-14T12:51:46.088Z  INFO 2537 --- [0-event-handler] o.a.kafka.controller.QuorumController    : [QuorumController id=0] writeNoOpRecord: event unable to start processing because of RejectedExecutionException (treated as TimeoutException).
2026-05-14T12:51:46.088Z  INFO 2537 --- [-kit-executor-1] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Shutting down socket server
2026-05-14T12:51:46.090Z  INFO 2537 --- [0-event-handler] o.a.kafka.controller.QuorumController    : [QuorumController id=0] maybeBalancePartitionLeaders: event unable to start processing because of RejectedExecutionException (treated as TimeoutException).
2026-05-14T12:51:46.094Z  INFO 2537 --- [-kit-executor-1] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Shutdown completed
2026-05-14T12:51:46.095Z  INFO 2537 --- [-kit-executor-1] kafka.server.KafkaRequestHandlerPool     : [data-plane Kafka Request Handler on Broker 0], shutting down
2026-05-14T12:51:46.095Z  INFO 2537 --- [-kit-executor-1] kafka.server.KafkaRequestHandlerPool     : [data-plane Kafka Request Handler on Broker 0], shut down completely
2026-05-14T12:51:46.095Z  INFO 2537 --- [-kit-executor-1] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Shutting down
2026-05-14T12:51:46.096Z  INFO 2537 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Stopped
2026-05-14T12:51:46.096Z  INFO 2537 --- [-kit-executor-1] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Shutdown completed
2026-05-14T12:51:46.097Z  INFO 2537 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Fetch]: Shutting down
2026-05-14T12:51:46.098Z  INFO 2537 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Fetch]: Stopped
2026-05-14T12:51:46.098Z  INFO 2537 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Fetch]: Shutdown completed
2026-05-14T12:51:46.098Z  INFO 2537 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Produce]: Shutting down
2026-05-14T12:51:46.098Z  INFO 2537 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Produce]: Stopped
2026-05-14T12:51:46.098Z  INFO 2537 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Produce]: Shutdown completed
2026-05-14T12:51:46.098Z  INFO 2537 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Request]: Shutting down
2026-05-14T12:51:46.098Z  INFO 2537 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Request]: Shutdown completed
2026-05-14T12:51:46.098Z  INFO 2537 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-ControllerMutation]: Shutting down
2026-05-14T12:51:46.098Z  INFO 2537 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Request]: Stopped
2026-05-14T12:51:46.098Z  INFO 2537 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-ControllerMutation]: Stopped
2026-05-14T12:51:46.098Z  INFO 2537 --- [-kit-executor-1] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-ControllerMutation]: Shutdown completed
2026-05-14T12:51:46.098Z  INFO 2537 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [QuorumController id=0] closed event queue.
2026-05-14T12:51:46.100Z  INFO 2537 --- [-kit-executor-1] kafka.server.SharedServer                : [SharedServer id=0] Stopping SharedServer
2026-05-14T12:51:46.101Z  INFO 2537 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [MetadataLoader id=0] beginShutdown: shutting down event queue.
2026-05-14T12:51:46.101Z  INFO 2537 --- [r-event-handler] org.apache.kafka.queue.KafkaEventQueue   : [SnapshotGenerator id=0] close: shutting down event queue.
2026-05-14T12:51:46.101Z  INFO 2537 --- [r-event-handler] org.apache.kafka.queue.KafkaEventQueue   : [SnapshotGenerator id=0] closed event queue.
2026-05-14T12:51:46.101Z  INFO 2537 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [MetadataLoader id=0] closed event queue.
2026-05-14T12:51:46.102Z  INFO 2537 --- [-kit-executor-1] org.apache.kafka.queue.KafkaEventQueue   : [SnapshotGenerator id=0] closed event queue.
2026-05-14T12:51:46.103Z  INFO 2537 --- [-kit-executor-1] o.apache.kafka.common.metrics.Metrics    : Metrics scheduler closed
2026-05-14T12:51:46.103Z  INFO 2537 --- [-kit-executor-1] o.apache.kafka.common.metrics.Metrics    : Closing reporter org.apache.kafka.common.metrics.JmxReporter
2026-05-14T12:51:46.103Z  INFO 2537 --- [-kit-executor-1] o.apache.kafka.common.metrics.Metrics    : Metrics reporters closed
2026-05-14T12:51:46.103Z  INFO 2537 --- [-kit-executor-1] o.a.kafka.common.utils.AppInfoParser     : App info kafka.server for 0 unregistered
2026-05-14T12:51:46.119Z  INFO 2537 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2026-05-14T12:51:46.124Z  INFO 2537 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2026-05-14T12:51:46.125Z  INFO 2537 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 9.310 s -- in com.jpmc.midascore.TaskFiveTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.267 s
[INFO] Finished at: 2026-05-14T12:51:46Z
[INFO] ------------------------------------------------------------------------

```

</details>
