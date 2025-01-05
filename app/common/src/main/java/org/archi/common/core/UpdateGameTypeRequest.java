// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code UpdateGameTypeRequest}
 */
public final class UpdateGameTypeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpdateGameTypeRequest)
    UpdateGameTypeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateGameTypeRequest.newBuilder() to construct.
  private UpdateGameTypeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateGameTypeRequest() {
    name_ = "";
    imageUrl_ = "";
    instruction_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateGameTypeRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateGameTypeRequest(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {

            isRealtime_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            imageUrl_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            instruction_ = s;
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
    return org.archi.common.core.CoreProto.internal_static_UpdateGameTypeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_UpdateGameTypeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.UpdateGameTypeRequest.class, org.archi.common.core.UpdateGameTypeRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <pre>
   *  int32 id = 1;
   *  GameType updatedGameType = 2;
   * </pre>
   *
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISREALTIME_FIELD_NUMBER = 3;
  private boolean isRealtime_;
  /**
   * <code>bool isRealtime = 3;</code>
   * @return The isRealtime.
   */
  @java.lang.Override
  public boolean getIsRealtime() {
    return isRealtime_;
  }

  public static final int IMAGEURL_FIELD_NUMBER = 4;
  private volatile java.lang.Object imageUrl_;
  /**
   * <code>string imageUrl = 4;</code>
   * @return The imageUrl.
   */
  @java.lang.Override
  public java.lang.String getImageUrl() {
    java.lang.Object ref = imageUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string imageUrl = 4;</code>
   * @return The bytes for imageUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageUrlBytes() {
    java.lang.Object ref = imageUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTRUCTION_FIELD_NUMBER = 5;
  private volatile java.lang.Object instruction_;
  /**
   * <code>string instruction = 5;</code>
   * @return The instruction.
   */
  @java.lang.Override
  public java.lang.String getInstruction() {
    java.lang.Object ref = instruction_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      instruction_ = s;
      return s;
    }
  }
  /**
   * <code>string instruction = 5;</code>
   * @return The bytes for instruction.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInstructionBytes() {
    java.lang.Object ref = instruction_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      instruction_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (isRealtime_ != false) {
      output.writeBool(3, isRealtime_);
    }
    if (!getImageUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, imageUrl_);
    }
    if (!getInstructionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, instruction_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (isRealtime_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isRealtime_);
    }
    if (!getImageUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, imageUrl_);
    }
    if (!getInstructionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, instruction_);
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
    if (!(obj instanceof org.archi.common.core.UpdateGameTypeRequest)) {
      return super.equals(obj);
    }
    org.archi.common.core.UpdateGameTypeRequest other = (org.archi.common.core.UpdateGameTypeRequest) obj;

    if (getId()
        != other.getId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (getIsRealtime()
        != other.getIsRealtime()) return false;
    if (!getImageUrl()
        .equals(other.getImageUrl())) return false;
    if (!getInstruction()
        .equals(other.getInstruction())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + ISREALTIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsRealtime());
    hash = (37 * hash) + IMAGEURL_FIELD_NUMBER;
    hash = (53 * hash) + getImageUrl().hashCode();
    hash = (37 * hash) + INSTRUCTION_FIELD_NUMBER;
    hash = (53 * hash) + getInstruction().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.UpdateGameTypeRequest parseFrom(
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
  public static Builder newBuilder(org.archi.common.core.UpdateGameTypeRequest prototype) {
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
   * Protobuf type {@code UpdateGameTypeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdateGameTypeRequest)
      org.archi.common.core.UpdateGameTypeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_UpdateGameTypeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_UpdateGameTypeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.UpdateGameTypeRequest.class, org.archi.common.core.UpdateGameTypeRequest.Builder.class);
    }

    // Construct using org.archi.common.core.UpdateGameTypeRequest.newBuilder()
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
      id_ = 0;

      name_ = "";

      isRealtime_ = false;

      imageUrl_ = "";

      instruction_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_UpdateGameTypeRequest_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.UpdateGameTypeRequest getDefaultInstanceForType() {
      return org.archi.common.core.UpdateGameTypeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.UpdateGameTypeRequest build() {
      org.archi.common.core.UpdateGameTypeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.UpdateGameTypeRequest buildPartial() {
      org.archi.common.core.UpdateGameTypeRequest result = new org.archi.common.core.UpdateGameTypeRequest(this);
      result.id_ = id_;
      result.name_ = name_;
      result.isRealtime_ = isRealtime_;
      result.imageUrl_ = imageUrl_;
      result.instruction_ = instruction_;
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
      if (other instanceof org.archi.common.core.UpdateGameTypeRequest) {
        return mergeFrom((org.archi.common.core.UpdateGameTypeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.UpdateGameTypeRequest other) {
      if (other == org.archi.common.core.UpdateGameTypeRequest.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getIsRealtime() != false) {
        setIsRealtime(other.getIsRealtime());
      }
      if (!other.getImageUrl().isEmpty()) {
        imageUrl_ = other.imageUrl_;
        onChanged();
      }
      if (!other.getInstruction().isEmpty()) {
        instruction_ = other.instruction_;
        onChanged();
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
      org.archi.common.core.UpdateGameTypeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.archi.common.core.UpdateGameTypeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <pre>
     *  int32 id = 1;
     *  GameType updatedGameType = 2;
     * </pre>
     *
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <pre>
     *  int32 id = 1;
     *  GameType updatedGameType = 2;
     * </pre>
     *
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *  int32 id = 1;
     *  GameType updatedGameType = 2;
     * </pre>
     *
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private boolean isRealtime_ ;
    /**
     * <code>bool isRealtime = 3;</code>
     * @return The isRealtime.
     */
    @java.lang.Override
    public boolean getIsRealtime() {
      return isRealtime_;
    }
    /**
     * <code>bool isRealtime = 3;</code>
     * @param value The isRealtime to set.
     * @return This builder for chaining.
     */
    public Builder setIsRealtime(boolean value) {
      
      isRealtime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isRealtime = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsRealtime() {
      
      isRealtime_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object imageUrl_ = "";
    /**
     * <code>string imageUrl = 4;</code>
     * @return The imageUrl.
     */
    public java.lang.String getImageUrl() {
      java.lang.Object ref = imageUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string imageUrl = 4;</code>
     * @return The bytes for imageUrl.
     */
    public com.google.protobuf.ByteString
        getImageUrlBytes() {
      java.lang.Object ref = imageUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string imageUrl = 4;</code>
     * @param value The imageUrl to set.
     * @return This builder for chaining.
     */
    public Builder setImageUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string imageUrl = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageUrl() {
      
      imageUrl_ = getDefaultInstance().getImageUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string imageUrl = 4;</code>
     * @param value The bytes for imageUrl to set.
     * @return This builder for chaining.
     */
    public Builder setImageUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object instruction_ = "";
    /**
     * <code>string instruction = 5;</code>
     * @return The instruction.
     */
    public java.lang.String getInstruction() {
      java.lang.Object ref = instruction_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instruction_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string instruction = 5;</code>
     * @return The bytes for instruction.
     */
    public com.google.protobuf.ByteString
        getInstructionBytes() {
      java.lang.Object ref = instruction_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instruction_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string instruction = 5;</code>
     * @param value The instruction to set.
     * @return This builder for chaining.
     */
    public Builder setInstruction(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      instruction_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string instruction = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearInstruction() {
      
      instruction_ = getDefaultInstance().getInstruction();
      onChanged();
      return this;
    }
    /**
     * <code>string instruction = 5;</code>
     * @param value The bytes for instruction to set.
     * @return This builder for chaining.
     */
    public Builder setInstructionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      instruction_ = value;
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


    // @@protoc_insertion_point(builder_scope:UpdateGameTypeRequest)
  }

  // @@protoc_insertion_point(class_scope:UpdateGameTypeRequest)
  private static final org.archi.common.core.UpdateGameTypeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.UpdateGameTypeRequest();
  }

  public static org.archi.common.core.UpdateGameTypeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateGameTypeRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateGameTypeRequest>() {
    @java.lang.Override
    public UpdateGameTypeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateGameTypeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateGameTypeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateGameTypeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.UpdateGameTypeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

