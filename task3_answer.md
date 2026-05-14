# Midas Task 3 — Answer

## waldorf's balance after all transactions


⚠️  Could not automatically parse waldorf's balance.






**Manual steps:**
1. Download `test_output_task3.txt` from Actions → Artefacts
2. Search for `waldorf`
3. Take the last balance value and apply `math.floor()`



---

## Files created / modified

| File | Path | Action |
|------|------|--------|
| `TransactionRecord.java`      | `entity/`      | Created — JPA entity |
| `TransactionRepository.java`  | `repository/`  | Created — Spring Data repo |
| `DatabaseConduit.java`        | `component/`   | Written — `save()` + `process()` |
| `TransactionKafkaListener.java` | `component/` | Rewritten — wires DatabaseConduit |
| `application.yml`             | `src/main/resources/` | Updated — H2 + JPA |
| `TransactionListener.java`    | `component/`   | **Deleted** — wrong filename |

---

## Full output

<details>
<summary>Click to expand</summary>

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
10:48:22.241 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.jpmc.midascore.TaskThreeTests]: TaskThreeTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
10:48:22.331 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.jpmc.midascore.MidasCoreApplication for test class com.jpmc.midascore.TaskThreeTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.5)

2026-05-14T10:48:23.261Z  INFO 2505 --- [           main] k.utils.Log4jControllerRegistration$     : Registered kafka:type=kafka.Log4jController MBean
2026-05-14T10:48:23.279Z  INFO 2505 --- [           main] org.apache.zookeeper.common.X509Util     : Setting -D jdk.tls.rejectClientInitiatedRenegotiation=true to disable client-initiated TLS renegotiation
2026-05-14T10:48:23.389Z  INFO 2505 --- [-kit-executor-1] kafka.server.ControllerServer            : Formatting /tmp/kafka-1754042818292730829/controller_0 with metadata.version 3.3-IV0.
2026-05-14T10:48:23.391Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Transition from SHUTDOWN to STARTING
2026-05-14T10:48:23.391Z  INFO 2505 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Starting controller
2026-05-14T10:48:23.392Z  INFO 2505 --- [-kit-executor-3] kafka.server.SharedServer                : [SharedServer id=0] Starting SharedServer
2026-05-14T10:48:23.417Z  INFO 2505 --- [-kit-executor-2] o.a.k.s.network.EndpointReadyFutures     : authorizerStart completed for endpoint CONTROLLER. Endpoint is now READY.
2026-05-14T10:48:23.480Z  INFO 2505 --- [-kit-executor-3] kafka.log.UnifiedLog$                    : [LogLoader partition=__cluster_metadata-0, dir=/tmp/kafka-1754042818292730829/controller_0] Loading producer state till offset 0 with message format version 2
2026-05-14T10:48:23.481Z  INFO 2505 --- [-kit-executor-3] kafka.log.UnifiedLog$                    : [LogLoader partition=__cluster_metadata-0, dir=/tmp/kafka-1754042818292730829/controller_0] Reloading from producer snapshot and rebuilding producer state from offset 0
2026-05-14T10:48:23.481Z  INFO 2505 --- [-kit-executor-3] kafka.log.UnifiedLog$                    : [LogLoader partition=__cluster_metadata-0, dir=/tmp/kafka-1754042818292730829/controller_0] Producer state recovery took 0ms for snapshot load and 0ms for segment recovery from offset 0
2026-05-14T10:48:23.518Z  INFO 2505 --- [-kit-executor-3] kafka.raft.KafkaMetadataLog$             : Initialized snapshots with IDs SortedSet() from /tmp/kafka-1754042818292730829/controller_0/__cluster_metadata-0
2026-05-14T10:48:23.540Z  INFO 2505 --- [piration-reaper] ExpirationService$ExpiredOperationReaper : [raft-expiration-reaper]: Starting
2026-05-14T10:48:23.587Z  INFO 2505 --- [-kit-executor-3] org.apache.kafka.raft.QuorumState        : [RaftManager id=0] Completed transition to Unattached(epoch=0, voters=[0], electionTimeoutMs=1050) from null
2026-05-14T10:48:23.590Z  INFO 2505 --- [-kit-executor-3] org.apache.kafka.raft.QuorumState        : [RaftManager id=0] Completed transition to CandidateState(localId=0, epoch=1, retries=1, voteStates={0=GRANTED}, highWatermark=Optional.empty, electionTimeoutMs=1584) from Unattached(epoch=0, voters=[0], electionTimeoutMs=1050)
2026-05-14T10:48:23.593Z  INFO 2505 --- [-kit-executor-3] org.apache.kafka.raft.QuorumState        : [RaftManager id=0] Completed transition to Leader(localId=0, epoch=1, epochStartOffset=0, highWatermark=Optional.empty, voterStates={0=ReplicaState(nodeId=0, endOffset=Optional.empty, lastFetchTimestamp=-1, lastCaughtUpTimestamp=-1, hasAcknowledgedLeader=true)}) from CandidateState(localId=0, epoch=1, retries=1, voteStates={0=GRANTED}, highWatermark=Optional.empty, electionTimeoutMs=1584)
2026-05-14T10:48:23.717Z  INFO 2505 --- [-kit-executor-2] kafka.network.ConnectionQuotas           : Updated connection-accept-rate max connection creation rate to 2147483647
2026-05-14T10:48:23.726Z  INFO 2505 --- [-kit-executor-2] kafka.network.DataPlaneAcceptor          : Awaiting socket connections on localhost:44287.
2026-05-14T10:48:23.727Z  INFO 2505 --- [-kit-executor-2] kafka.network.DataPlaneAcceptor          : Opened wildcard endpoint localhost:44287
2026-05-14T10:48:23.741Z  INFO 2505 --- [-kit-executor-2] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Created data-plane acceptor and processors for endpoint : ListenerName(CONTROLLER)
2026-05-14T10:48:23.745Z  INFO 2505 --- [-request-thread] kafka.raft.RaftSendThread                : [kafka-0-raft-outbound-request-thread]: Starting
2026-05-14T10:48:23.746Z  INFO 2505 --- [-raft-io-thread] k.raft.KafkaRaftManager$RaftIoThread     : [kafka-0-raft-io-thread]: Starting
2026-05-14T10:48:23.763Z  INFO 2505 --- [-raft-io-thread] org.apache.kafka.raft.LeaderState        : [RaftManager id=0] High watermark set to LogOffsetMetadata(offset=1, metadata=Optional[(segmentBaseOffset=0,relativePositionInSegment=91)]) for the first time for epoch 1 based on indexOfHw 0 and voters [ReplicaState(nodeId=0, endOffset=Optional[LogOffsetMetadata(offset=1, metadata=Optional[(segmentBaseOffset=0,relativePositionInSegment=91)])], lastFetchTimestamp=-1, lastCaughtUpTimestamp=-1, hasAcknowledgedLeader=true)]
2026-05-14T10:48:23.769Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] initializeNewPublishers: The loader is still catching up because we have loaded up to offset -1, but the high water mark is 1
2026-05-14T10:48:23.769Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Starting broker
2026-05-14T10:48:23.770Z  INFO 2505 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for controller quorum voters future
2026-05-14T10:48:23.770Z  INFO 2505 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for controller quorum voters future
2026-05-14T10:48:23.775Z  INFO 2505 --- [-raft-io-thread] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Registered the listener org.apache.kafka.image.loader.MetadataLoader@1828991944
2026-05-14T10:48:23.788Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] maybePublishMetadata(LOG_DELTA): The loader is still catching up because we have not loaded a controller record as of offset 0 and high water mark is 1
2026-05-14T10:48:23.794Z  INFO 2505 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Fetch]: Starting
2026-05-14T10:48:23.797Z  INFO 2505 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Produce]: Starting
2026-05-14T10:48:23.799Z  INFO 2505 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-Request]: Starting
2026-05-14T10:48:23.800Z  INFO 2505 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [broker-0-ThrottledChannelReaper-ControllerMutation]: Starting
2026-05-14T10:48:23.807Z  INFO 2505 --- [-kit-executor-2] o.a.kafka.controller.QuorumController    : [QuorumController id=0] Creating new QuorumController with clusterId Tp0Gj3b5S6CelwNdmpPTfA.
2026-05-14T10:48:23.808Z  INFO 2505 --- [-raft-io-thread] org.apache.kafka.raft.KafkaRaftClient    : [RaftManager id=0] Registered the listener org.apache.kafka.controller.QuorumController$QuorumMetaLogListener@1979016232
2026-05-14T10:48:23.811Z  INFO 2505 --- [0-event-handler] o.a.kafka.controller.QuorumController    : [QuorumController id=0] Becoming the active controller at epoch 1, next write offset 1.
2026-05-14T10:48:23.812Z  INFO 2505 --- [nelReaper-Fetch] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Fetch]: Starting
2026-05-14T10:48:23.815Z  INFO 2505 --- [lReaper-Produce] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Produce]: Starting
2026-05-14T10:48:23.815Z  INFO 2505 --- [lReaper-Request] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-Request]: Starting
2026-05-14T10:48:23.816Z  INFO 2505 --- [-kit-executor-3] kafka.log.LogManager                     : Log directory /tmp/kafka-1754042818292730829/broker_0_data0 not found, creating it.
2026-05-14T10:48:23.818Z  INFO 2505 --- [trollerMutation] lientQuotaManager$ThrottledChannelReaper : [controller-0-ThrottledChannelReaper-ControllerMutation]: Starting
2026-05-14T10:48:23.818Z  WARN 2505 --- [0-event-handler] o.a.kafka.controller.QuorumController    : [QuorumController id=0] Performing controller activation. The metadata log appears to be empty. Appending 1 bootstrap record(s) in metadata transaction at metadata.version 3.6-IV2 from bootstrap source 'testkit'. Setting the ZK migration state to NONE since this is a de-novo KRaft cluster.
2026-05-14T10:48:23.822Z  INFO 2505 --- [0-event-handler] o.a.k.controller.OffsetControlManager    : [QuorumController id=0] Replayed BeginTransactionRecord(name='Bootstrap records') at offset 1.
2026-05-14T10:48:23.824Z  INFO 2505 --- [0-event-handler] o.a.k.controller.FeatureControlManager   : [QuorumController id=0] Replayed a FeatureLevelRecord setting metadata version to 3.6-IV2
2026-05-14T10:48:23.825Z  INFO 2505 --- [0-event-handler] o.a.k.controller.OffsetControlManager    : [QuorumController id=0] Replayed EndTransactionRecord() at offset 4.
2026-05-14T10:48:23.829Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for controller quorum voters future
2026-05-14T10:48:23.829Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for controller quorum voters future
2026-05-14T10:48:23.836Z  INFO 2505 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Starting
2026-05-14T10:48:23.837Z  INFO 2505 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-forwarding-channel-manager]: Recorded new controller, from now on will use node localhost:44287 (id: 0 rack: null)
2026-05-14T10:48:23.839Z  INFO 2505 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Starting
2026-05-14T10:48:23.860Z  INFO 2505 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for the controller metadata publishers to be installed
2026-05-14T10:48:23.867Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] maybePublishMetadata(LOG_DELTA): The loader finished catching up to the current high water mark of 5
2026-05-14T10:48:23.871Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing SnapshotGenerator with a snapshot at offset 4
2026-05-14T10:48:23.872Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing FeaturesPublisher with a snapshot at offset 4
2026-05-14T10:48:23.876Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing DynamicConfigPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:48:23.877Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing DynamicClientQuotaPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:48:23.877Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing ScramPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:48:23.878Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing DelegationTokenPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:48:23.873Z  INFO 2505 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for the controller metadata publishers to be installed
2026-05-14T10:48:23.875Z  INFO 2505 --- [-kit-executor-3] kafka.network.ConnectionQuotas           : Updated connection-accept-rate max connection creation rate to 2147483647
2026-05-14T10:48:23.879Z  INFO 2505 --- [-kit-executor-2] kafka.network.SocketServer               : [SocketServer listenerType=CONTROLLER, nodeId=0] Enabling request processing.
2026-05-14T10:48:23.879Z  INFO 2505 --- [-kit-executor-3] kafka.network.DataPlaneAcceptor          : Awaiting socket connections on localhost:38043.
2026-05-14T10:48:23.880Z  INFO 2505 --- [-kit-executor-3] kafka.network.DataPlaneAcceptor          : Opened wildcard endpoint localhost:38043
2026-05-14T10:48:23.883Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing ControllerMetadataMetricsPublisher with a snapshot at offset 4
2026-05-14T10:48:23.884Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing AclPublisher controller id=0 with a snapshot at offset 4
2026-05-14T10:48:23.884Z  INFO 2505 --- [-kit-executor-3] kafka.network.SocketServer               : [SocketServer listenerType=BROKER, nodeId=0] Created data-plane acceptor and processors for endpoint : ListenerName(EXTERNAL)
2026-05-14T10:48:23.886Z  INFO 2505 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for all of the authorizer futures to be completed
2026-05-14T10:48:23.886Z  INFO 2505 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for all of the authorizer futures to be completed
2026-05-14T10:48:23.886Z  INFO 2505 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Waiting for all of the SocketServer Acceptors to be started
2026-05-14T10:48:23.886Z  INFO 2505 --- [-kit-executor-2] kafka.server.ControllerServer            : [ControllerServer id=0] Finished waiting for all of the SocketServer Acceptors to be started
2026-05-14T10:48:23.890Z  INFO 2505 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Starting
2026-05-14T10:48:23.890Z  INFO 2505 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-alter-partition-channel-manager]: Recorded new controller, from now on will use node localhost:44287 (id: 0 rack: null)
2026-05-14T10:48:23.906Z  INFO 2505 --- [eaper-0-Produce] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Produce]: Starting
2026-05-14T10:48:23.907Z  INFO 2505 --- [nReaper-0-Fetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Fetch]: Starting
2026-05-14T10:48:23.908Z  INFO 2505 --- [0-DeleteRecords] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-DeleteRecords]: Starting
2026-05-14T10:48:23.909Z  INFO 2505 --- [r-0-ElectLeader] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-ElectLeader]: Starting
2026-05-14T10:48:23.909Z  INFO 2505 --- [r-0-RemoteFetch] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-RemoteFetch]: Starting
2026-05-14T10:48:23.922Z  INFO 2505 --- [per-0-Heartbeat] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Heartbeat]: Starting
2026-05-14T10:48:23.926Z  INFO 2505 --- [per-0-Rebalance] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-Rebalance]: Starting
2026-05-14T10:48:23.951Z  INFO 2505 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Starting
2026-05-14T10:48:23.952Z  INFO 2505 --- [channel-manager] k.s.BrokerToControllerRequestThread      : [broker-0-to-controller-heartbeat-channel-manager]: Recorded new controller, from now on will use node localhost:44287 (id: 0 rack: null)
2026-05-14T10:48:23.955Z  INFO 2505 --- [r-event-handler] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Incarnation JOqxeLTDSICuZZE_ZffLxQ of broker 0 in cluster Tp0Gj3b5S6CelwNdmpPTfA is now STARTING.
2026-05-14T10:48:23.979Z  INFO 2505 --- [per-0-AlterAcls] perationPurgatory$ExpiredOperationReaper : [ExpirationReaper-0-AlterAcls]: Starting
2026-05-14T10:48:24.008Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the broker metadata publishers to be installed
2026-05-14T10:48:24.009Z  INFO 2505 --- [r-event-handler] o.a.kafka.image.loader.MetadataLoader    : [MetadataLoader id=0] InitializeNewPublishers: initializing BrokerMetadataPublisher with a snapshot at offset 4
2026-05-14T10:48:24.010Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the broker metadata publishers to be installed
2026-05-14T10:48:24.010Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the controller to acknowledge that we are caught up
2026-05-14T10:48:24.010Z  INFO 2505 --- [r-event-handler] k.s.metadata.BrokerMetadataPublisher     : [BrokerMetadataPublisher id=0] Publishing initial metadata at offset OffsetAndEpoch(offset=4, epoch=1) with metadata.version 3.6-IV2.
2026-05-14T10:48:24.011Z  INFO 2505 --- [r-event-handler] kafka.log.LogManager                     : Loading logs from log dirs ArraySeq(/tmp/kafka-1754042818292730829/broker_0_data0)
2026-05-14T10:48:24.015Z  INFO 2505 --- [r-event-handler] kafka.log.LogManager                     : No logs found to be loaded in /tmp/kafka-1754042818292730829/broker_0_data0
2026-05-14T10:48:24.020Z  INFO 2505 --- [r-event-handler] kafka.log.LogManager                     : Loaded 0 logs in 9ms
2026-05-14T10:48:24.021Z  INFO 2505 --- [r-event-handler] kafka.log.LogManager                     : Starting log cleanup with a period of 300000 ms.
2026-05-14T10:48:24.021Z  INFO 2505 --- [r-event-handler] kafka.log.LogManager                     : Starting log flusher with a default period of 9223372036854775807 ms.
2026-05-14T10:48:24.040Z  INFO 2505 --- [r-event-handler] kafka.log.LogCleaner                     : Starting the log cleaner
2026-05-14T10:48:24.044Z  INFO 2505 --- [leaner-thread-0] kafka.log.LogCleaner$CleanerThread       : [kafka-log-cleaner-thread-0]: Starting
2026-05-14T10:48:24.045Z  INFO 2505 --- [0-event-handler] o.a.k.controller.ClusterControlManager   : [QuorumController id=0] Replayed initial RegisterBrokerRecord for broker 0: RegisterBrokerRecord(brokerId=0, isMigratingZkBroker=false, incarnationId=JOqxeLTDSICuZZE_ZffLxQ, brokerEpoch=5, endPoints=[BrokerEndpoint(name='EXTERNAL', host='localhost', port=38043, securityProtocol=0)], features=[BrokerFeature(name='metadata.version', minSupportedVersion=1, maxSupportedVersion=14)], rack=null, fenced=true, inControlledShutdown=false)
2026-05-14T10:48:24.049Z  INFO 2505 --- [rFailureHandler] k.s.ReplicaManager$LogDirFailureHandler  : [LogDirFailureHandler]: Starting
2026-05-14T10:48:24.051Z  INFO 2505 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Starting up.
2026-05-14T10:48:24.052Z  INFO 2505 --- [nSenderThread-0] kafka.server.AddPartitionsToTxnManager   : [AddPartitionsToTxnSenderThread-0]: Starting
2026-05-14T10:48:24.055Z  INFO 2505 --- [r-event-handler] k.coordinator.group.GroupCoordinator     : [GroupCoordinator 0]: Startup complete.
2026-05-14T10:48:24.056Z  INFO 2505 --- [r-event-handler] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Starting up.
2026-05-14T10:48:24.057Z  INFO 2505 --- [r-event-handler] k.c.transaction.TransactionCoordinator   : [TransactionCoordinator id=0] Startup complete.
2026-05-14T10:48:24.058Z  INFO 2505 --- [rSenderThread-0] k.c.t.TransactionMarkerChannelManager    : [TxnMarkerSenderThread-0]: Starting
2026-05-14T10:48:24.059Z  INFO 2505 --- [r-event-handler] k.s.metadata.BrokerMetadataPublisher     : [BrokerMetadataPublisher id=0] Updating metadata.version to 14 at offset OffsetAndEpoch(offset=4, epoch=1).
2026-05-14T10:48:24.075Z  INFO 2505 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] Successfully registered broker 0 with broker epoch 5
2026-05-14T10:48:24.083Z  INFO 2505 --- [channel-manager] kafka.server.BrokerLifecycleManager      : [BrokerLifecycleManager id=0] The broker has caught up. Transitioning from STARTING to RECOVERY.
2026-05-14T10:48:24.083Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the controller to acknowledge that we are caught up
2026-05-14T10:48:24.083Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Waiting for the initial broker metadata update to be published
2026-05-14T10:48:24.083Z  INFO 2505 --- [-kit-executor-3] kafka.server.BrokerServer                : [BrokerServer id=0] Finished waiting for the initial broker metadata update to be published
2026-05-14T10:48:24.085Z  INFO 2505 --- [-kit-executor-3] kafka.server.KafkaConfig                 : KafkaConfig values: 
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
	log.dirs = /tmp/kafka-1754042818292730829/broker_0_data0
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
	metadata.log.dir = /tmp/kafka-1754042818292730829/controller_0
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
	remo
```

</details>
