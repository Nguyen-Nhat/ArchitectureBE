// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

public interface GetRandomPieceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetRandomPieceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 status = 1;</code>
   * @return The status.
   */
  long getStatus();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>.Piece piece = 3;</code>
   * @return Whether the piece field is set.
   */
  boolean hasPiece();
  /**
   * <code>.Piece piece = 3;</code>
   * @return The piece.
   */
  org.archi.common.core.Piece getPiece();
  /**
   * <code>.Piece piece = 3;</code>
   */
  org.archi.common.core.PieceOrBuilder getPieceOrBuilder();
}
