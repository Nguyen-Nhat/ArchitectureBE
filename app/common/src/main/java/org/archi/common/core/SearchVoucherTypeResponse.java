// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code SearchVoucherTypeResponse}
 */
public final class SearchVoucherTypeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SearchVoucherTypeResponse)
    SearchVoucherTypeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchVoucherTypeResponse.newBuilder() to construct.
  private SearchVoucherTypeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchVoucherTypeResponse() {
    voucherTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchVoucherTypeResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_SearchVoucherTypeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_SearchVoucherTypeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.SearchVoucherTypeResponse.class, org.archi.common.core.SearchVoucherTypeResponse.Builder.class);
  }

  public static final int VOUCHERTYPES_FIELD_NUMBER = 1;
  private java.util.List<org.archi.common.core.VoucherType> voucherTypes_;
  /**
   * <code>repeated .VoucherType voucherTypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.archi.common.core.VoucherType> getVoucherTypesList() {
    return voucherTypes_;
  }
  /**
   * <code>repeated .VoucherType voucherTypes = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.archi.common.core.VoucherTypeOrBuilder> 
      getVoucherTypesOrBuilderList() {
    return voucherTypes_;
  }
  /**
   * <code>repeated .VoucherType voucherTypes = 1;</code>
   */
  @java.lang.Override
  public int getVoucherTypesCount() {
    return voucherTypes_.size();
  }
  /**
   * <code>repeated .VoucherType voucherTypes = 1;</code>
   */
  @java.lang.Override
  public org.archi.common.core.VoucherType getVoucherTypes(int index) {
    return voucherTypes_.get(index);
  }
  /**
   * <code>repeated .VoucherType voucherTypes = 1;</code>
   */
  @java.lang.Override
  public org.archi.common.core.VoucherTypeOrBuilder getVoucherTypesOrBuilder(
      int index) {
    return voucherTypes_.get(index);
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
    for (int i = 0; i < voucherTypes_.size(); i++) {
      output.writeMessage(1, voucherTypes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < voucherTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, voucherTypes_.get(i));
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
    if (!(obj instanceof org.archi.common.core.SearchVoucherTypeResponse)) {
      return super.equals(obj);
    }
    org.archi.common.core.SearchVoucherTypeResponse other = (org.archi.common.core.SearchVoucherTypeResponse) obj;

    if (!getVoucherTypesList()
        .equals(other.getVoucherTypesList())) return false;
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
    if (getVoucherTypesCount() > 0) {
      hash = (37 * hash) + VOUCHERTYPES_FIELD_NUMBER;
      hash = (53 * hash) + getVoucherTypesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.SearchVoucherTypeResponse parseFrom(
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
  public static Builder newBuilder(org.archi.common.core.SearchVoucherTypeResponse prototype) {
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
   * Protobuf type {@code SearchVoucherTypeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SearchVoucherTypeResponse)
      org.archi.common.core.SearchVoucherTypeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_SearchVoucherTypeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_SearchVoucherTypeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.SearchVoucherTypeResponse.class, org.archi.common.core.SearchVoucherTypeResponse.Builder.class);
    }

    // Construct using org.archi.common.core.SearchVoucherTypeResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (voucherTypesBuilder_ == null) {
        voucherTypes_ = java.util.Collections.emptyList();
      } else {
        voucherTypes_ = null;
        voucherTypesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_SearchVoucherTypeResponse_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.SearchVoucherTypeResponse getDefaultInstanceForType() {
      return org.archi.common.core.SearchVoucherTypeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.SearchVoucherTypeResponse build() {
      org.archi.common.core.SearchVoucherTypeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.SearchVoucherTypeResponse buildPartial() {
      org.archi.common.core.SearchVoucherTypeResponse result = new org.archi.common.core.SearchVoucherTypeResponse(this);
      int from_bitField0_ = bitField0_;
      if (voucherTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          voucherTypes_ = java.util.Collections.unmodifiableList(voucherTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.voucherTypes_ = voucherTypes_;
      } else {
        result.voucherTypes_ = voucherTypesBuilder_.build();
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
      if (other instanceof org.archi.common.core.SearchVoucherTypeResponse) {
        return mergeFrom((org.archi.common.core.SearchVoucherTypeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.SearchVoucherTypeResponse other) {
      if (other == org.archi.common.core.SearchVoucherTypeResponse.getDefaultInstance()) return this;
      if (voucherTypesBuilder_ == null) {
        if (!other.voucherTypes_.isEmpty()) {
          if (voucherTypes_.isEmpty()) {
            voucherTypes_ = other.voucherTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVoucherTypesIsMutable();
            voucherTypes_.addAll(other.voucherTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.voucherTypes_.isEmpty()) {
          if (voucherTypesBuilder_.isEmpty()) {
            voucherTypesBuilder_.dispose();
            voucherTypesBuilder_ = null;
            voucherTypes_ = other.voucherTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            voucherTypesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getVoucherTypesFieldBuilder() : null;
          } else {
            voucherTypesBuilder_.addAllMessages(other.voucherTypes_);
          }
        }
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
              org.archi.common.core.VoucherType m =
                  input.readMessage(
                      org.archi.common.core.VoucherType.parser(),
                      extensionRegistry);
              if (voucherTypesBuilder_ == null) {
                ensureVoucherTypesIsMutable();
                voucherTypes_.add(m);
              } else {
                voucherTypesBuilder_.addMessage(m);
              }
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
    private int bitField0_;

    private java.util.List<org.archi.common.core.VoucherType> voucherTypes_ =
      java.util.Collections.emptyList();
    private void ensureVoucherTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        voucherTypes_ = new java.util.ArrayList<org.archi.common.core.VoucherType>(voucherTypes_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.archi.common.core.VoucherType, org.archi.common.core.VoucherType.Builder, org.archi.common.core.VoucherTypeOrBuilder> voucherTypesBuilder_;

    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public java.util.List<org.archi.common.core.VoucherType> getVoucherTypesList() {
      if (voucherTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(voucherTypes_);
      } else {
        return voucherTypesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public int getVoucherTypesCount() {
      if (voucherTypesBuilder_ == null) {
        return voucherTypes_.size();
      } else {
        return voucherTypesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public org.archi.common.core.VoucherType getVoucherTypes(int index) {
      if (voucherTypesBuilder_ == null) {
        return voucherTypes_.get(index);
      } else {
        return voucherTypesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public Builder setVoucherTypes(
        int index, org.archi.common.core.VoucherType value) {
      if (voucherTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVoucherTypesIsMutable();
        voucherTypes_.set(index, value);
        onChanged();
      } else {
        voucherTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public Builder setVoucherTypes(
        int index, org.archi.common.core.VoucherType.Builder builderForValue) {
      if (voucherTypesBuilder_ == null) {
        ensureVoucherTypesIsMutable();
        voucherTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        voucherTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public Builder addVoucherTypes(org.archi.common.core.VoucherType value) {
      if (voucherTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVoucherTypesIsMutable();
        voucherTypes_.add(value);
        onChanged();
      } else {
        voucherTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public Builder addVoucherTypes(
        int index, org.archi.common.core.VoucherType value) {
      if (voucherTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVoucherTypesIsMutable();
        voucherTypes_.add(index, value);
        onChanged();
      } else {
        voucherTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public Builder addVoucherTypes(
        org.archi.common.core.VoucherType.Builder builderForValue) {
      if (voucherTypesBuilder_ == null) {
        ensureVoucherTypesIsMutable();
        voucherTypes_.add(builderForValue.build());
        onChanged();
      } else {
        voucherTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public Builder addVoucherTypes(
        int index, org.archi.common.core.VoucherType.Builder builderForValue) {
      if (voucherTypesBuilder_ == null) {
        ensureVoucherTypesIsMutable();
        voucherTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        voucherTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public Builder addAllVoucherTypes(
        java.lang.Iterable<? extends org.archi.common.core.VoucherType> values) {
      if (voucherTypesBuilder_ == null) {
        ensureVoucherTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, voucherTypes_);
        onChanged();
      } else {
        voucherTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public Builder clearVoucherTypes() {
      if (voucherTypesBuilder_ == null) {
        voucherTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        voucherTypesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public Builder removeVoucherTypes(int index) {
      if (voucherTypesBuilder_ == null) {
        ensureVoucherTypesIsMutable();
        voucherTypes_.remove(index);
        onChanged();
      } else {
        voucherTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public org.archi.common.core.VoucherType.Builder getVoucherTypesBuilder(
        int index) {
      return getVoucherTypesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public org.archi.common.core.VoucherTypeOrBuilder getVoucherTypesOrBuilder(
        int index) {
      if (voucherTypesBuilder_ == null) {
        return voucherTypes_.get(index);  } else {
        return voucherTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public java.util.List<? extends org.archi.common.core.VoucherTypeOrBuilder> 
         getVoucherTypesOrBuilderList() {
      if (voucherTypesBuilder_ != null) {
        return voucherTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(voucherTypes_);
      }
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public org.archi.common.core.VoucherType.Builder addVoucherTypesBuilder() {
      return getVoucherTypesFieldBuilder().addBuilder(
          org.archi.common.core.VoucherType.getDefaultInstance());
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public org.archi.common.core.VoucherType.Builder addVoucherTypesBuilder(
        int index) {
      return getVoucherTypesFieldBuilder().addBuilder(
          index, org.archi.common.core.VoucherType.getDefaultInstance());
    }
    /**
     * <code>repeated .VoucherType voucherTypes = 1;</code>
     */
    public java.util.List<org.archi.common.core.VoucherType.Builder> 
         getVoucherTypesBuilderList() {
      return getVoucherTypesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.archi.common.core.VoucherType, org.archi.common.core.VoucherType.Builder, org.archi.common.core.VoucherTypeOrBuilder> 
        getVoucherTypesFieldBuilder() {
      if (voucherTypesBuilder_ == null) {
        voucherTypesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.archi.common.core.VoucherType, org.archi.common.core.VoucherType.Builder, org.archi.common.core.VoucherTypeOrBuilder>(
                voucherTypes_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        voucherTypes_ = null;
      }
      return voucherTypesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:SearchVoucherTypeResponse)
  }

  // @@protoc_insertion_point(class_scope:SearchVoucherTypeResponse)
  private static final org.archi.common.core.SearchVoucherTypeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.SearchVoucherTypeResponse();
  }

  public static org.archi.common.core.SearchVoucherTypeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchVoucherTypeResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchVoucherTypeResponse>() {
    @java.lang.Override
    public SearchVoucherTypeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchVoucherTypeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchVoucherTypeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.SearchVoucherTypeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

