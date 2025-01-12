// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

public interface VoucherOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Voucher)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string issuedAt = 2;</code>
   * @return The issuedAt.
   */
  java.lang.String getIssuedAt();
  /**
   * <code>string issuedAt = 2;</code>
   * @return The bytes for issuedAt.
   */
  com.google.protobuf.ByteString
      getIssuedAtBytes();

  /**
   * <code>string expiredDate = 3;</code>
   * @return The expiredDate.
   */
  java.lang.String getExpiredDate();
  /**
   * <code>string expiredDate = 3;</code>
   * @return The bytes for expiredDate.
   */
  com.google.protobuf.ByteString
      getExpiredDateBytes();

  /**
   * <code>string status = 4;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 4;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string QRCode = 5;</code>
   * @return The qRCode.
   */
  java.lang.String getQRCode();
  /**
   * <code>string QRCode = 5;</code>
   * @return The bytes for qRCode.
   */
  com.google.protobuf.ByteString
      getQRCodeBytes();

  /**
   * <code>.VoucherType voucherType = 6;</code>
   * @return Whether the voucherType field is set.
   */
  boolean hasVoucherType();
  /**
   * <code>.VoucherType voucherType = 6;</code>
   * @return The voucherType.
   */
  org.archi.common.core.VoucherType getVoucherType();
  /**
   * <code>.VoucherType voucherType = 6;</code>
   */
  org.archi.common.core.VoucherTypeOrBuilder getVoucherTypeOrBuilder();
}
