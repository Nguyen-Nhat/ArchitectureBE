// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.archi.common.auth;

/**
 * Protobuf type {@code GetBrandsRequest}
 */
public final class GetBrandsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetBrandsRequest)
    GetBrandsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBrandsRequest.newBuilder() to construct.
  private GetBrandsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBrandsRequest() {
    sort_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBrandsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.auth.AuthProto.internal_static_GetBrandsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.auth.AuthProto.internal_static_GetBrandsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.auth.GetBrandsRequest.class, org.archi.common.auth.GetBrandsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PAGE_FIELD_NUMBER = 1;
  private int page_;
  /**
   * <code>int32 page = 1;</code>
   * @return The page.
   */
  @java.lang.Override
  public int getPage() {
    return page_;
  }

  public static final int SIZE_FIELD_NUMBER = 2;
  private int size_;
  /**
   * <code>int32 size = 2;</code>
   * @return The size.
   */
  @java.lang.Override
  public int getSize() {
    return size_;
  }

  public static final int SORT_FIELD_NUMBER = 3;
  private volatile java.lang.Object sort_;
  /**
   * <code>optional string sort = 3;</code>
   * @return Whether the sort field is set.
   */
  @java.lang.Override
  public boolean hasSort() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional string sort = 3;</code>
   * @return The sort.
   */
  @java.lang.Override
  public java.lang.String getSort() {
    java.lang.Object ref = sort_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sort_ = s;
      return s;
    }
  }
  /**
   * <code>optional string sort = 3;</code>
   * @return The bytes for sort.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSortBytes() {
    java.lang.Object ref = sort_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sort_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object name_;
  /**
   * <code>optional string name = 4;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional string name = 4;</code>
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
   * <code>optional string name = 4;</code>
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
    if (page_ != 0) {
      output.writeInt32(1, page_);
    }
    if (size_ != 0) {
      output.writeInt32(2, size_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sort_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, page_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, size_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sort_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
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
    if (!(obj instanceof org.archi.common.auth.GetBrandsRequest)) {
      return super.equals(obj);
    }
    org.archi.common.auth.GetBrandsRequest other = (org.archi.common.auth.GetBrandsRequest) obj;

    if (getPage()
        != other.getPage()) return false;
    if (getSize()
        != other.getSize()) return false;
    if (hasSort() != other.hasSort()) return false;
    if (hasSort()) {
      if (!getSort()
          .equals(other.getSort())) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
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
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    if (hasSort()) {
      hash = (37 * hash) + SORT_FIELD_NUMBER;
      hash = (53 * hash) + getSort().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.auth.GetBrandsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.auth.GetBrandsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.auth.GetBrandsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.auth.GetBrandsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.auth.GetBrandsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.auth.GetBrandsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.auth.GetBrandsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.auth.GetBrandsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.auth.GetBrandsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.auth.GetBrandsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.auth.GetBrandsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.auth.GetBrandsRequest parseFrom(
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
  public static Builder newBuilder(org.archi.common.auth.GetBrandsRequest prototype) {
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
   * Protobuf type {@code GetBrandsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetBrandsRequest)
      org.archi.common.auth.GetBrandsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.auth.AuthProto.internal_static_GetBrandsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.auth.AuthProto.internal_static_GetBrandsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.auth.GetBrandsRequest.class, org.archi.common.auth.GetBrandsRequest.Builder.class);
    }

    // Construct using org.archi.common.auth.GetBrandsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      page_ = 0;

      size_ = 0;

      sort_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      name_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.auth.AuthProto.internal_static_GetBrandsRequest_descriptor;
    }

    @java.lang.Override
    public org.archi.common.auth.GetBrandsRequest getDefaultInstanceForType() {
      return org.archi.common.auth.GetBrandsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.auth.GetBrandsRequest build() {
      org.archi.common.auth.GetBrandsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.auth.GetBrandsRequest buildPartial() {
      org.archi.common.auth.GetBrandsRequest result = new org.archi.common.auth.GetBrandsRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.page_ = page_;
      result.size_ = size_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.sort_ = sort_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.name_ = name_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.archi.common.auth.GetBrandsRequest) {
        return mergeFrom((org.archi.common.auth.GetBrandsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.auth.GetBrandsRequest other) {
      if (other == org.archi.common.auth.GetBrandsRequest.getDefaultInstance()) return this;
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (other.hasSort()) {
        bitField0_ |= 0x00000001;
        sort_ = other.sort_;
        onChanged();
      }
      if (other.hasName()) {
        bitField0_ |= 0x00000002;
        name_ = other.name_;
        onChanged();
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
              page_ = input.readInt32();

              break;
            } // case 8
            case 16: {
              size_ = input.readInt32();

              break;
            } // case 16
            case 26: {
              sort_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
            case 34: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 34
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
    private int bitField0_;

    private int page_ ;
    /**
     * <code>int32 page = 1;</code>
     * @return The page.
     */
    @java.lang.Override
    public int getPage() {
      return page_;
    }
    /**
     * <code>int32 page = 1;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>int32 size = 2;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }
    /**
     * <code>int32 size = 2;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 size = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sort_ = "";
    /**
     * <code>optional string sort = 3;</code>
     * @return Whether the sort field is set.
     */
    public boolean hasSort() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional string sort = 3;</code>
     * @return The sort.
     */
    public java.lang.String getSort() {
      java.lang.Object ref = sort_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sort_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string sort = 3;</code>
     * @return The bytes for sort.
     */
    public com.google.protobuf.ByteString
        getSortBytes() {
      java.lang.Object ref = sort_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sort_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string sort = 3;</code>
     * @param value The sort to set.
     * @return This builder for chaining.
     */
    public Builder setSort(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      sort_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string sort = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSort() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sort_ = getDefaultInstance().getSort();
      onChanged();
      return this;
    }
    /**
     * <code>optional string sort = 3;</code>
     * @param value The bytes for sort to set.
     * @return This builder for chaining.
     */
    public Builder setSortBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      sort_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>optional string name = 4;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string name = 4;</code>
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
     * <code>optional string name = 4;</code>
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
     * <code>optional string name = 4;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      bitField0_ = (bitField0_ & ~0x00000002);
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string name = 4;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      name_ = value;
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


    // @@protoc_insertion_point(builder_scope:GetBrandsRequest)
  }

  // @@protoc_insertion_point(class_scope:GetBrandsRequest)
  private static final org.archi.common.auth.GetBrandsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.auth.GetBrandsRequest();
  }

  public static org.archi.common.auth.GetBrandsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBrandsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetBrandsRequest>() {
    @java.lang.Override
    public GetBrandsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetBrandsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBrandsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.auth.GetBrandsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

