// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code AddGameTypeResponse}
 */
public final class AddGameTypeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AddGameTypeResponse)
    AddGameTypeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddGameTypeResponse.newBuilder() to construct.
  private AddGameTypeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddGameTypeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddGameTypeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddGameTypeResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            org.archi.common.core.GameType.Builder subBuilder = null;
            if (gameType_ != null) {
              subBuilder = gameType_.toBuilder();
            }
            gameType_ = input.readMessage(org.archi.common.core.GameType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gameType_);
              gameType_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_AddGameTypeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_AddGameTypeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.AddGameTypeResponse.class, org.archi.common.core.AddGameTypeResponse.Builder.class);
  }

  public static final int GAMETYPE_FIELD_NUMBER = 1;
  private org.archi.common.core.GameType gameType_;
  /**
   * <code>.GameType gameType = 1;</code>
   * @return Whether the gameType field is set.
   */
  @java.lang.Override
  public boolean hasGameType() {
    return gameType_ != null;
  }
  /**
   * <code>.GameType gameType = 1;</code>
   * @return The gameType.
   */
  @java.lang.Override
  public org.archi.common.core.GameType getGameType() {
    return gameType_ == null ? org.archi.common.core.GameType.getDefaultInstance() : gameType_;
  }
  /**
   * <code>.GameType gameType = 1;</code>
   */
  @java.lang.Override
  public org.archi.common.core.GameTypeOrBuilder getGameTypeOrBuilder() {
    return getGameType();
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
    if (gameType_ != null) {
      output.writeMessage(1, getGameType());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gameType_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getGameType());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.archi.common.core.AddGameTypeResponse)) {
      return super.equals(obj);
    }
    org.archi.common.core.AddGameTypeResponse other = (org.archi.common.core.AddGameTypeResponse) obj;

    if (hasGameType() != other.hasGameType()) return false;
    if (hasGameType()) {
      if (!getGameType()
          .equals(other.getGameType())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasGameType()) {
      hash = (37 * hash) + GAMETYPE_FIELD_NUMBER;
      hash = (53 * hash) + getGameType().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.AddGameTypeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.AddGameTypeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.AddGameTypeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.AddGameTypeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.AddGameTypeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.AddGameTypeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.AddGameTypeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.AddGameTypeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.AddGameTypeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.AddGameTypeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.AddGameTypeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.AddGameTypeResponse parseFrom(
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
  public static Builder newBuilder(org.archi.common.core.AddGameTypeResponse prototype) {
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
   * Protobuf type {@code AddGameTypeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AddGameTypeResponse)
      org.archi.common.core.AddGameTypeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_AddGameTypeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_AddGameTypeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.AddGameTypeResponse.class, org.archi.common.core.AddGameTypeResponse.Builder.class);
    }

    // Construct using org.archi.common.core.AddGameTypeResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gameTypeBuilder_ == null) {
        gameType_ = null;
      } else {
        gameType_ = null;
        gameTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_AddGameTypeResponse_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.AddGameTypeResponse getDefaultInstanceForType() {
      return org.archi.common.core.AddGameTypeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.AddGameTypeResponse build() {
      org.archi.common.core.AddGameTypeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.AddGameTypeResponse buildPartial() {
      org.archi.common.core.AddGameTypeResponse result = new org.archi.common.core.AddGameTypeResponse(this);
      if (gameTypeBuilder_ == null) {
        result.gameType_ = gameType_;
      } else {
        result.gameType_ = gameTypeBuilder_.build();
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
      if (other instanceof org.archi.common.core.AddGameTypeResponse) {
        return mergeFrom((org.archi.common.core.AddGameTypeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.AddGameTypeResponse other) {
      if (other == org.archi.common.core.AddGameTypeResponse.getDefaultInstance()) return this;
      if (other.hasGameType()) {
        mergeGameType(other.getGameType());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      org.archi.common.core.AddGameTypeResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.archi.common.core.AddGameTypeResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.archi.common.core.GameType gameType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.archi.common.core.GameType, org.archi.common.core.GameType.Builder, org.archi.common.core.GameTypeOrBuilder> gameTypeBuilder_;
    /**
     * <code>.GameType gameType = 1;</code>
     * @return Whether the gameType field is set.
     */
    public boolean hasGameType() {
      return gameTypeBuilder_ != null || gameType_ != null;
    }
    /**
     * <code>.GameType gameType = 1;</code>
     * @return The gameType.
     */
    public org.archi.common.core.GameType getGameType() {
      if (gameTypeBuilder_ == null) {
        return gameType_ == null ? org.archi.common.core.GameType.getDefaultInstance() : gameType_;
      } else {
        return gameTypeBuilder_.getMessage();
      }
    }
    /**
     * <code>.GameType gameType = 1;</code>
     */
    public Builder setGameType(org.archi.common.core.GameType value) {
      if (gameTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gameType_ = value;
        onChanged();
      } else {
        gameTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.GameType gameType = 1;</code>
     */
    public Builder setGameType(
        org.archi.common.core.GameType.Builder builderForValue) {
      if (gameTypeBuilder_ == null) {
        gameType_ = builderForValue.build();
        onChanged();
      } else {
        gameTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.GameType gameType = 1;</code>
     */
    public Builder mergeGameType(org.archi.common.core.GameType value) {
      if (gameTypeBuilder_ == null) {
        if (gameType_ != null) {
          gameType_ =
            org.archi.common.core.GameType.newBuilder(gameType_).mergeFrom(value).buildPartial();
        } else {
          gameType_ = value;
        }
        onChanged();
      } else {
        gameTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.GameType gameType = 1;</code>
     */
    public Builder clearGameType() {
      if (gameTypeBuilder_ == null) {
        gameType_ = null;
        onChanged();
      } else {
        gameType_ = null;
        gameTypeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.GameType gameType = 1;</code>
     */
    public org.archi.common.core.GameType.Builder getGameTypeBuilder() {
      
      onChanged();
      return getGameTypeFieldBuilder().getBuilder();
    }
    /**
     * <code>.GameType gameType = 1;</code>
     */
    public org.archi.common.core.GameTypeOrBuilder getGameTypeOrBuilder() {
      if (gameTypeBuilder_ != null) {
        return gameTypeBuilder_.getMessageOrBuilder();
      } else {
        return gameType_ == null ?
            org.archi.common.core.GameType.getDefaultInstance() : gameType_;
      }
    }
    /**
     * <code>.GameType gameType = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.archi.common.core.GameType, org.archi.common.core.GameType.Builder, org.archi.common.core.GameTypeOrBuilder> 
        getGameTypeFieldBuilder() {
      if (gameTypeBuilder_ == null) {
        gameTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.archi.common.core.GameType, org.archi.common.core.GameType.Builder, org.archi.common.core.GameTypeOrBuilder>(
                getGameType(),
                getParentForChildren(),
                isClean());
        gameType_ = null;
      }
      return gameTypeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:AddGameTypeResponse)
  }

  // @@protoc_insertion_point(class_scope:AddGameTypeResponse)
  private static final org.archi.common.core.AddGameTypeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.AddGameTypeResponse();
  }

  public static org.archi.common.core.AddGameTypeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddGameTypeResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddGameTypeResponse>() {
    @java.lang.Override
    public AddGameTypeResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddGameTypeResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddGameTypeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddGameTypeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.AddGameTypeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

