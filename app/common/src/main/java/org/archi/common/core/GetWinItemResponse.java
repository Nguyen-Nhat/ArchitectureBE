// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code GetWinItemResponse}
 */
public final class GetWinItemResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetWinItemResponse)
    GetWinItemResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetWinItemResponse.newBuilder() to construct.
  private GetWinItemResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetWinItemResponse() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetWinItemResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_GetWinItemResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_GetWinItemResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.GetWinItemResponse.class, org.archi.common.core.GetWinItemResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>int32 status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ITEM_FIELD_NUMBER = 3;
  private org.archi.common.core.Item item_;
  /**
   * <code>.Item item = 3;</code>
   * @return Whether the item field is set.
   */
  @java.lang.Override
  public boolean hasItem() {
    return item_ != null;
  }
  /**
   * <code>.Item item = 3;</code>
   * @return The item.
   */
  @java.lang.Override
  public org.archi.common.core.Item getItem() {
    return item_ == null ? org.archi.common.core.Item.getDefaultInstance() : item_;
  }
  /**
   * <code>.Item item = 3;</code>
   */
  @java.lang.Override
  public org.archi.common.core.ItemOrBuilder getItemOrBuilder() {
    return getItem();
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
    if (status_ != 0) {
      output.writeInt32(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (item_ != null) {
      output.writeMessage(3, getItem());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (item_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getItem());
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
    if (!(obj instanceof org.archi.common.core.GetWinItemResponse)) {
      return super.equals(obj);
    }
    org.archi.common.core.GetWinItemResponse other = (org.archi.common.core.GetWinItemResponse) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasItem() != other.hasItem()) return false;
    if (hasItem()) {
      if (!getItem()
          .equals(other.getItem())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.GetWinItemResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetWinItemResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetWinItemResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetWinItemResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetWinItemResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetWinItemResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetWinItemResponse parseFrom(
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
  public static Builder newBuilder(org.archi.common.core.GetWinItemResponse prototype) {
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
   * Protobuf type {@code GetWinItemResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetWinItemResponse)
      org.archi.common.core.GetWinItemResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_GetWinItemResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_GetWinItemResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.GetWinItemResponse.class, org.archi.common.core.GetWinItemResponse.Builder.class);
    }

    // Construct using org.archi.common.core.GetWinItemResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      message_ = "";

      if (itemBuilder_ == null) {
        item_ = null;
      } else {
        item_ = null;
        itemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_GetWinItemResponse_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.GetWinItemResponse getDefaultInstanceForType() {
      return org.archi.common.core.GetWinItemResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.GetWinItemResponse build() {
      org.archi.common.core.GetWinItemResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.GetWinItemResponse buildPartial() {
      org.archi.common.core.GetWinItemResponse result = new org.archi.common.core.GetWinItemResponse(this);
      result.status_ = status_;
      result.message_ = message_;
      if (itemBuilder_ == null) {
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
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
      if (other instanceof org.archi.common.core.GetWinItemResponse) {
        return mergeFrom((org.archi.common.core.GetWinItemResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.GetWinItemResponse other) {
      if (other == org.archi.common.core.GetWinItemResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasItem()) {
        mergeItem(other.getItem());
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
            case 8: {
              status_ = input.readInt32();

              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getItemFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private int status_ ;
    /**
     * <code>int32 status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private org.archi.common.core.Item item_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.archi.common.core.Item, org.archi.common.core.Item.Builder, org.archi.common.core.ItemOrBuilder> itemBuilder_;
    /**
     * <code>.Item item = 3;</code>
     * @return Whether the item field is set.
     */
    public boolean hasItem() {
      return itemBuilder_ != null || item_ != null;
    }
    /**
     * <code>.Item item = 3;</code>
     * @return The item.
     */
    public org.archi.common.core.Item getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? org.archi.common.core.Item.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     * <code>.Item item = 3;</code>
     */
    public Builder setItem(org.archi.common.core.Item value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        itemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Item item = 3;</code>
     */
    public Builder setItem(
        org.archi.common.core.Item.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Item item = 3;</code>
     */
    public Builder mergeItem(org.archi.common.core.Item value) {
      if (itemBuilder_ == null) {
        if (item_ != null) {
          item_ =
            org.archi.common.core.Item.newBuilder(item_).mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        itemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Item item = 3;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = null;
        onChanged();
      } else {
        item_ = null;
        itemBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Item item = 3;</code>
     */
    public org.archi.common.core.Item.Builder getItemBuilder() {
      
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <code>.Item item = 3;</code>
     */
    public org.archi.common.core.ItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ?
            org.archi.common.core.Item.getDefaultInstance() : item_;
      }
    }
    /**
     * <code>.Item item = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.archi.common.core.Item, org.archi.common.core.Item.Builder, org.archi.common.core.ItemOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.archi.common.core.Item, org.archi.common.core.Item.Builder, org.archi.common.core.ItemOrBuilder>(
                getItem(),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetWinItemResponse)
  }

  // @@protoc_insertion_point(class_scope:GetWinItemResponse)
  private static final org.archi.common.core.GetWinItemResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.GetWinItemResponse();
  }

  public static org.archi.common.core.GetWinItemResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetWinItemResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetWinItemResponse>() {
    @java.lang.Override
    public GetWinItemResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetWinItemResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetWinItemResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.GetWinItemResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

