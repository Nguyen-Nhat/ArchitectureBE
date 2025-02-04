// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.archi.common.auth;

public interface BrandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Brand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * brand id.
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string field = 3;</code>
   * @return The field.
   */
  java.lang.String getField();
  /**
   * <code>string field = 3;</code>
   * @return The bytes for field.
   */
  com.google.protobuf.ByteString
      getFieldBytes();

  /**
   * <code>string address = 4;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 4;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>string gps = 5;</code>
   * @return The gps.
   */
  java.lang.String getGps();
  /**
   * <code>string gps = 5;</code>
   * @return The bytes for gps.
   */
  com.google.protobuf.ByteString
      getGpsBytes();

  /**
   * <code>bool isEnable = 6;</code>
   * @return The isEnable.
   */
  boolean getIsEnable();
}
