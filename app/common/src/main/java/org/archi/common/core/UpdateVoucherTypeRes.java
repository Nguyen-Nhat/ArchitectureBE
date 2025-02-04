// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code UpdateVoucherTypeRes}
 */
public final class UpdateVoucherTypeRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpdateVoucherTypeRes)
    UpdateVoucherTypeResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateVoucherTypeRes.newBuilder() to construct.
  private UpdateVoucherTypeRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateVoucherTypeRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateVoucherTypeRes();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_UpdateVoucherTypeRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_UpdateVoucherTypeRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.UpdateVoucherTypeRes.class, org.archi.common.core.UpdateVoucherTypeRes.Builder.class);
  }

  public static final int UPDATEDVOUCHERTYPE_FIELD_NUMBER = 1;
  private org.archi.common.core.VoucherType updatedVoucherType_;
  /**
   * <code>.VoucherType updatedVoucherType = 1;</code>
   * @return Whether the updatedVoucherType field is set.
   */
  @java.lang.Override
  public boolean hasUpdatedVoucherType() {
    return updatedVoucherType_ != null;
  }
  /**
   * <code>.VoucherType updatedVoucherType = 1;</code>
   * @return The updatedVoucherType.
   */
  @java.lang.Override
  public org.archi.common.core.VoucherType getUpdatedVoucherType() {
    return updatedVoucherType_ == null ? org.archi.common.core.VoucherType.getDefaultInstance() : updatedVoucherType_;
  }
  /**
   * <code>.VoucherType updatedVoucherType = 1;</code>
   */
  @java.lang.Override
  public org.archi.common.core.VoucherTypeOrBuilder getUpdatedVoucherTypeOrBuilder() {
    return getUpdatedVoucherType();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (updatedVoucherType_ != null) {
      output.writeMessage(1, getUpdatedVoucherType());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updatedVoucherType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUpdatedVoucherType());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.archi.common.core.UpdateVoucherTypeRes)) {
      return super.equals(obj);
    }
    org.archi.common.core.UpdateVoucherTypeRes other = (org.archi.common.core.UpdateVoucherTypeRes) obj;

    if (hasUpdatedVoucherType() != other.hasUpdatedVoucherType()) return false;
    if (hasUpdatedVoucherType()) {
      if (!getUpdatedVoucherType()
          .equals(other.getUpdatedVoucherType())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUpdatedVoucherType()) {
      hash = (37 * hash) + UPDATEDVOUCHERTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getUpdatedVoucherType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateVoucherTypeRes parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.archi.common.core.UpdateVoucherTypeRes prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code UpdateVoucherTypeRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdateVoucherTypeRes)
      org.archi.common.core.UpdateVoucherTypeResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_UpdateVoucherTypeRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_UpdateVoucherTypeRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.UpdateVoucherTypeRes.class, org.archi.common.core.UpdateVoucherTypeRes.Builder.class);
    }

    // Construct using org.archi.common.core.UpdateVoucherTypeRes.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updatedVoucherTypeBuilder_ == null) {
        updatedVoucherType_ = null;
      } else {
        updatedVoucherType_ = null;
        updatedVoucherTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_UpdateVoucherTypeRes_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.UpdateVoucherTypeRes getDefaultInstanceForType() {
      return org.archi.common.core.UpdateVoucherTypeRes.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.UpdateVoucherTypeRes build() {
      org.archi.common.core.UpdateVoucherTypeRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.UpdateVoucherTypeRes buildPartial() {
      org.archi.common.core.UpdateVoucherTypeRes result = new org.archi.common.core.UpdateVoucherTypeRes(this);
      if (updatedVoucherTypeBuilder_ == null) {
        result.updatedVoucherType_ = updatedVoucherType_;
      } else {
        result.updatedVoucherType_ = updatedVoucherTypeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.archi.common.core.UpdateVoucherTypeRes) {
        return mergeFrom((org.archi.common.core.UpdateVoucherTypeRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.UpdateVoucherTypeRes other) {
      if (other == org.archi.common.core.UpdateVoucherTypeRes.getDefaultInstance()) return this;
      if (other.hasUpdatedVoucherType()) {
        mergeUpdatedVoucherType(other.getUpdatedVoucherType());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getUpdatedVoucherTypeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private org.archi.common.core.VoucherType updatedVoucherType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.archi.common.core.VoucherType, org.archi.common.core.VoucherType.Builder, org.archi.common.core.VoucherTypeOrBuilder> updatedVoucherTypeBuilder_;
    /**
     * <code>.VoucherType updatedVoucherType = 1;</code>
     * @return Whether the updatedVoucherType field is set.
     */
    public boolean hasUpdatedVoucherType() {
      return updatedVoucherTypeBuilder_ != null || updatedVoucherType_ != null;
    }
    /**
     * <code>.VoucherType updatedVoucherType = 1;</code>
     * @return The updatedVoucherType.
     */
    public org.archi.common.core.VoucherType getUpdatedVoucherType() {
      if (updatedVoucherTypeBuilder_ == null) {
        return updatedVoucherType_ == null ? org.archi.common.core.VoucherType.getDefaultInstance() : updatedVoucherType_;
      } else {
        return updatedVoucherTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.VoucherType updatedVoucherType = 1;</code>
     */
    public Builder setUpdatedVoucherType(org.archi.common.core.VoucherType value) {
      if (updatedVoucherTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updatedVoucherType_ = value;
        onChanged();
      } else {
        updatedVoucherTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.VoucherType updatedVoucherType = 1;</code>
     */
    public Builder setUpdatedVoucherType(
        org.archi.common.core.VoucherType.Builder builderForValue) {
      if (updatedVoucherTypeBuilder_ == null) {
        updatedVoucherType_ = builderForValue.build();
        onChanged();
      } else {
        updatedVoucherTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.VoucherType updatedVoucherType = 1;</code>
     */
    public Builder mergeUpdatedVoucherType(org.archi.common.core.VoucherType value) {
      if (updatedVoucherTypeBuilder_ == null) {
        if (updatedVoucherType_ != null) {
          updatedVoucherType_ =
            org.archi.common.core.VoucherType.newBuilder(updatedVoucherType_).mergeFrom(value).buildPartial();
        } else {
          updatedVoucherType_ = value;
        }
        onChanged();
      } else {
        updatedVoucherTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.VoucherType updatedVoucherType = 1;</code>
     */
    public Builder clearUpdatedVoucherType() {
      if (updatedVoucherTypeBuilder_ == null) {
        updatedVoucherType_ = null;
        onChanged();
      } else {
        updatedVoucherType_ = null;
        updatedVoucherTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.VoucherType updatedVoucherType = 1;</code>
     */
    public org.archi.common.core.VoucherType.Builder getUpdatedVoucherTypeBuilder() {
      
      onChanged();
      return getUpdatedVoucherTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.VoucherType updatedVoucherType = 1;</code>
     */
    public org.archi.common.core.VoucherTypeOrBuilder getUpdatedVoucherTypeOrBuilder() {
      if (updatedVoucherTypeBuilder_ != null) {
        return updatedVoucherTypeBuilder_.getMessageOrBuilder();
      } else {
        return updatedVoucherType_ == null ?
            org.archi.common.core.VoucherType.getDefaultInstance() : updatedVoucherType_;
      }
    }
    /**
     * <code>.VoucherType updatedVoucherType = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.archi.common.core.VoucherType, org.archi.common.core.VoucherType.Builder, org.archi.common.core.VoucherTypeOrBuilder> 
        getUpdatedVoucherTypeFieldBuilder() {
      if (updatedVoucherTypeBuilder_ == null) {
        updatedVoucherTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.archi.common.core.VoucherType, org.archi.common.core.VoucherType.Builder, org.archi.common.core.VoucherTypeOrBuilder>(
                getUpdatedVoucherType(),
                getParentForChildren(),
                isClean());
        updatedVoucherType_ = null;
      }
      return updatedVoucherTypeBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:UpdateVoucherTypeRes)
  }

  // @@protoc_insertion_point(class_scope:UpdateVoucherTypeRes)
  private static final org.archi.common.core.UpdateVoucherTypeRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.UpdateVoucherTypeRes();
  }

  public static org.archi.common.core.UpdateVoucherTypeRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateVoucherTypeRes>
      PARSER = new com.google.protobuf.AbstractParser<UpdateVoucherTypeRes>() {
    @java.lang.Override
    public UpdateVoucherTypeRes parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateVoucherTypeRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateVoucherTypeRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.UpdateVoucherTypeRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

