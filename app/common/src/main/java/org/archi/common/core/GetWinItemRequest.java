// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code GetWinItemRequest}
 */
public final class GetWinItemRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetWinItemRequest)
    GetWinItemRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetWinItemRequest.newBuilder() to construct.
  private GetWinItemRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetWinItemRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetWinItemRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_GetWinItemRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_GetWinItemRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.GetWinItemRequest.class, org.archi.common.core.GetWinItemRequest.Builder.class);
  }

  public static final int PLAYERID_FIELD_NUMBER = 1;
  private long playerId_;
  /**
   * <code>int64 playerId = 1;</code>
   * @return The playerId.
   */
  @java.lang.Override
  public long getPlayerId() {
    return playerId_;
  }

  public static final int GAMEID_FIELD_NUMBER = 2;
  private long gameId_;
  /**
   * <code>int64 gameId = 2;</code>
   * @return The gameId.
   */
  @java.lang.Override
  public long getGameId() {
    return gameId_;
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
    if (playerId_ != 0L) {
      output.writeInt64(1, playerId_);
    }
    if (gameId_ != 0L) {
      output.writeInt64(2, gameId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (playerId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, playerId_);
    }
    if (gameId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, gameId_);
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
    if (!(obj instanceof org.archi.common.core.GetWinItemRequest)) {
      return super.equals(obj);
    }
    org.archi.common.core.GetWinItemRequest other = (org.archi.common.core.GetWinItemRequest) obj;

    if (getPlayerId()
        != other.getPlayerId()) return false;
    if (getGameId()
        != other.getGameId()) return false;
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
    hash = (37 * hash) + PLAYERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPlayerId());
    hash = (37 * hash) + GAMEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGameId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.GetWinItemRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetWinItemRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetWinItemRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetWinItemRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetWinItemRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetWinItemRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.GetWinItemRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetWinItemRequest parseFrom(
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
  public static Builder newBuilder(org.archi.common.core.GetWinItemRequest prototype) {
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
   * Protobuf type {@code GetWinItemRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetWinItemRequest)
      org.archi.common.core.GetWinItemRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_GetWinItemRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_GetWinItemRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.GetWinItemRequest.class, org.archi.common.core.GetWinItemRequest.Builder.class);
    }

    // Construct using org.archi.common.core.GetWinItemRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      playerId_ = 0L;

      gameId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_GetWinItemRequest_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.GetWinItemRequest getDefaultInstanceForType() {
      return org.archi.common.core.GetWinItemRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.GetWinItemRequest build() {
      org.archi.common.core.GetWinItemRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.GetWinItemRequest buildPartial() {
      org.archi.common.core.GetWinItemRequest result = new org.archi.common.core.GetWinItemRequest(this);
      result.playerId_ = playerId_;
      result.gameId_ = gameId_;
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
      if (other instanceof org.archi.common.core.GetWinItemRequest) {
        return mergeFrom((org.archi.common.core.GetWinItemRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.GetWinItemRequest other) {
      if (other == org.archi.common.core.GetWinItemRequest.getDefaultInstance()) return this;
      if (other.getPlayerId() != 0L) {
        setPlayerId(other.getPlayerId());
      }
      if (other.getGameId() != 0L) {
        setGameId(other.getGameId());
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
              playerId_ = input.readInt64();

              break;
            } // case 8
            case 16: {
              gameId_ = input.readInt64();

              break;
            } // case 16
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

    private long playerId_ ;
    /**
     * <code>int64 playerId = 1;</code>
     * @return The playerId.
     */
    @java.lang.Override
    public long getPlayerId() {
      return playerId_;
    }
    /**
     * <code>int64 playerId = 1;</code>
     * @param value The playerId to set.
     * @return This builder for chaining.
     */
    public Builder setPlayerId(long value) {
      
      playerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 playerId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayerId() {
      
      playerId_ = 0L;
      onChanged();
      return this;
    }

    private long gameId_ ;
    /**
     * <code>int64 gameId = 2;</code>
     * @return The gameId.
     */
    @java.lang.Override
    public long getGameId() {
      return gameId_;
    }
    /**
     * <code>int64 gameId = 2;</code>
     * @param value The gameId to set.
     * @return This builder for chaining.
     */
    public Builder setGameId(long value) {
      
      gameId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gameId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGameId() {
      
      gameId_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:GetWinItemRequest)
  }

  // @@protoc_insertion_point(class_scope:GetWinItemRequest)
  private static final org.archi.common.core.GetWinItemRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.GetWinItemRequest();
  }

  public static org.archi.common.core.GetWinItemRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetWinItemRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetWinItemRequest>() {
    @java.lang.Override
    public GetWinItemRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetWinItemRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetWinItemRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.GetWinItemRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

