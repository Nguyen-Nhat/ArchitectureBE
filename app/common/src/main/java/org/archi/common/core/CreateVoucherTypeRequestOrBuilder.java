// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

public interface CreateVoucherTypeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateVoucherTypeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double value = 2;</code>
   * @return The value.
   */
  double getValue();

  /**
   * <code>string imageUrl = 3;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <code>string imageUrl = 3;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>int64 brandId = 5;</code>
   * @return The brandId.
   */
  long getBrandId();
}
