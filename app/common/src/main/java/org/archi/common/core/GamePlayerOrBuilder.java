// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

public interface GamePlayerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GamePlayer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>int64 gameId = 2;</code>
   * @return The gameId.
   */
  long getGameId();

  /**
   * <code>int64 playerId = 3;</code>
   * @return The playerId.
   */
  long getPlayerId();

  /**
   * <pre>
   *  google.protobuf.Timestamp playedAt = 4;
   * </pre>
   *
   * <code>string playedAt = 4;</code>
   * @return The playedAt.
   */
  java.lang.String getPlayedAt();
  /**
   * <pre>
   *  google.protobuf.Timestamp playedAt = 4;
   * </pre>
   *
   * <code>string playedAt = 4;</code>
   * @return The bytes for playedAt.
   */
  com.google.protobuf.ByteString
      getPlayedAtBytes();
}
