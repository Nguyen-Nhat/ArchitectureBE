// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

public interface CreatePieceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreatePieceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string image = 1;</code>
   * @return The image.
   */
  java.lang.String getImage();
  /**
   * <code>string image = 1;</code>
   * @return The bytes for image.
   */
  com.google.protobuf.ByteString
      getImageBytes();

  /**
   * <code>int64 puzzleId = 2;</code>
   * @return The puzzleId.
   */
  long getPuzzleId();

  /**
   * <code>int32 ordinal = 3;</code>
   * @return The ordinal.
   */
  int getOrdinal();

  /**
   * <code>int32 quantity = 4;</code>
   * @return The quantity.
   */
  int getQuantity();
}
