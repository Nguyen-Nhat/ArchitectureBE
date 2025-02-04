// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code UpdateGameRequest}
 */
public final class UpdateGameRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpdateGameRequest)
    UpdateGameRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateGameRequest.newBuilder() to construct.
  private UpdateGameRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateGameRequest() {
    startAt_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateGameRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_UpdateGameRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_UpdateGameRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.UpdateGameRequest.class, org.archi.common.core.UpdateGameRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <pre>
   *  int64 id = 1;
   *  Game updatedGame = 2;
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int ALLOWPIECESEXCHANGE_FIELD_NUMBER = 2;
  private boolean allowPiecesExchange_;
  /**
   * <code>bool allowPiecesExchange = 2;</code>
   * @return The allowPiecesExchange.
   */
  @java.lang.Override
  public boolean getAllowPiecesExchange() {
    return allowPiecesExchange_;
  }

  public static final int STARTAT_FIELD_NUMBER = 3;
  private volatile java.lang.Object startAt_;
  /**
   * <code>string startAt = 3;</code>
   * @return The startAt.
   */
  @java.lang.Override
  public java.lang.String getStartAt() {
    java.lang.Object ref = startAt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startAt_ = s;
      return s;
    }
  }
  /**
   * <code>string startAt = 3;</code>
   * @return The bytes for startAt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartAtBytes() {
    java.lang.Object ref = startAt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startAt_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GAMETYPEID_FIELD_NUMBER = 4;
  private int gameTypeId_;
  /**
   * <code>int32 gameTypeId = 4;</code>
   * @return The gameTypeId.
   */
  @java.lang.Override
  public int getGameTypeId() {
    return gameTypeId_;
  }

  public static final int CAMPAIGNID_FIELD_NUMBER = 5;
  private long campaignId_;
  /**
   * <code>int64 campaignId = 5;</code>
   * @return The campaignId.
   */
  @java.lang.Override
  public long getCampaignId() {
    return campaignId_;
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (allowPiecesExchange_ != false) {
      output.writeBool(2, allowPiecesExchange_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startAt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, startAt_);
    }
    if (gameTypeId_ != 0) {
      output.writeInt32(4, gameTypeId_);
    }
    if (campaignId_ != 0L) {
      output.writeInt64(5, campaignId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (allowPiecesExchange_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, allowPiecesExchange_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startAt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, startAt_);
    }
    if (gameTypeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, gameTypeId_);
    }
    if (campaignId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, campaignId_);
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
    if (!(obj instanceof org.archi.common.core.UpdateGameRequest)) {
      return super.equals(obj);
    }
    org.archi.common.core.UpdateGameRequest other = (org.archi.common.core.UpdateGameRequest) obj;

    if (getId()
        != other.getId()) return false;
    if (getAllowPiecesExchange()
        != other.getAllowPiecesExchange()) return false;
    if (!getStartAt()
        .equals(other.getStartAt())) return false;
    if (getGameTypeId()
        != other.getGameTypeId()) return false;
    if (getCampaignId()
        != other.getCampaignId()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + ALLOWPIECESEXCHANGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowPiecesExchange());
    hash = (37 * hash) + STARTAT_FIELD_NUMBER;
    hash = (53 * hash) + getStartAt().hashCode();
    hash = (37 * hash) + GAMETYPEID_FIELD_NUMBER;
    hash = (53 * hash) + getGameTypeId();
    hash = (37 * hash) + CAMPAIGNID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCampaignId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.UpdateGameRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateGameRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateGameRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateGameRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateGameRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateGameRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateGameRequest parseFrom(
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
  public static Builder newBuilder(org.archi.common.core.UpdateGameRequest prototype) {
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
   * Protobuf type {@code UpdateGameRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdateGameRequest)
      org.archi.common.core.UpdateGameRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_UpdateGameRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_UpdateGameRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.UpdateGameRequest.class, org.archi.common.core.UpdateGameRequest.Builder.class);
    }

    // Construct using org.archi.common.core.UpdateGameRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0L;

      allowPiecesExchange_ = false;

      startAt_ = "";

      gameTypeId_ = 0;

      campaignId_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_UpdateGameRequest_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.UpdateGameRequest getDefaultInstanceForType() {
      return org.archi.common.core.UpdateGameRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.UpdateGameRequest build() {
      org.archi.common.core.UpdateGameRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.UpdateGameRequest buildPartial() {
      org.archi.common.core.UpdateGameRequest result = new org.archi.common.core.UpdateGameRequest(this);
      result.id_ = id_;
      result.allowPiecesExchange_ = allowPiecesExchange_;
      result.startAt_ = startAt_;
      result.gameTypeId_ = gameTypeId_;
      result.campaignId_ = campaignId_;
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
      if (other instanceof org.archi.common.core.UpdateGameRequest) {
        return mergeFrom((org.archi.common.core.UpdateGameRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.UpdateGameRequest other) {
      if (other == org.archi.common.core.UpdateGameRequest.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getAllowPiecesExchange() != false) {
        setAllowPiecesExchange(other.getAllowPiecesExchange());
      }
      if (!other.getStartAt().isEmpty()) {
        startAt_ = other.startAt_;
        onChanged();
      }
      if (other.getGameTypeId() != 0) {
        setGameTypeId(other.getGameTypeId());
      }
      if (other.getCampaignId() != 0L) {
        setCampaignId(other.getCampaignId());
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
              id_ = input.readInt64();

              break;
            } // case 8
            case 16: {
              allowPiecesExchange_ = input.readBool();

              break;
            } // case 16
            case 26: {
              startAt_ = input.readStringRequireUtf8();

              break;
            } // case 26
            case 32: {
              gameTypeId_ = input.readInt32();

              break;
            } // case 32
            case 40: {
              campaignId_ = input.readInt64();

              break;
            } // case 40
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

    private long id_ ;
    /**
     * <pre>
     *  int64 id = 1;
     *  Game updatedGame = 2;
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <pre>
     *  int64 id = 1;
     *  Game updatedGame = 2;
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *  int64 id = 1;
     *  Game updatedGame = 2;
     * </pre>
     *
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private boolean allowPiecesExchange_ ;
    /**
     * <code>bool allowPiecesExchange = 2;</code>
     * @return The allowPiecesExchange.
     */
    @java.lang.Override
    public boolean getAllowPiecesExchange() {
      return allowPiecesExchange_;
    }
    /**
     * <code>bool allowPiecesExchange = 2;</code>
     * @param value The allowPiecesExchange to set.
     * @return This builder for chaining.
     */
    public Builder setAllowPiecesExchange(boolean value) {
      
      allowPiecesExchange_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool allowPiecesExchange = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllowPiecesExchange() {
      
      allowPiecesExchange_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object startAt_ = "";
    /**
     * <code>string startAt = 3;</code>
     * @return The startAt.
     */
    public java.lang.String getStartAt() {
      java.lang.Object ref = startAt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startAt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string startAt = 3;</code>
     * @return The bytes for startAt.
     */
    public com.google.protobuf.ByteString
        getStartAtBytes() {
      java.lang.Object ref = startAt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startAt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string startAt = 3;</code>
     * @param value The startAt to set.
     * @return This builder for chaining.
     */
    public Builder setStartAt(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startAt_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string startAt = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartAt() {
      
      startAt_ = getDefaultInstance().getStartAt();
      onChanged();
      return this;
    }
    /**
     * <code>string startAt = 3;</code>
     * @param value The bytes for startAt to set.
     * @return This builder for chaining.
     */
    public Builder setStartAtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      startAt_ = value;
      onChanged();
      return this;
    }

    private int gameTypeId_ ;
    /**
     * <code>int32 gameTypeId = 4;</code>
     * @return The gameTypeId.
     */
    @java.lang.Override
    public int getGameTypeId() {
      return gameTypeId_;
    }
    /**
     * <code>int32 gameTypeId = 4;</code>
     * @param value The gameTypeId to set.
     * @return This builder for chaining.
     */
    public Builder setGameTypeId(int value) {
      
      gameTypeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 gameTypeId = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGameTypeId() {
      
      gameTypeId_ = 0;
      onChanged();
      return this;
    }

    private long campaignId_ ;
    /**
     * <code>int64 campaignId = 5;</code>
     * @return The campaignId.
     */
    @java.lang.Override
    public long getCampaignId() {
      return campaignId_;
    }
    /**
     * <code>int64 campaignId = 5;</code>
     * @param value The campaignId to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignId(long value) {
      
      campaignId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 campaignId = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaignId() {
      
      campaignId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:UpdateGameRequest)
  }

  // @@protoc_insertion_point(class_scope:UpdateGameRequest)
  private static final org.archi.common.core.UpdateGameRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.UpdateGameRequest();
  }

  public static org.archi.common.core.UpdateGameRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGameRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateGameRequest>() {
    @java.lang.Override
    public UpdateGameRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateGameRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGameRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.UpdateGameRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

