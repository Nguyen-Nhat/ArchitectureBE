// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.archi.common.auth;

/**
 * Protobuf type {@code UpdateBrandRequest}
 */
public final class UpdateBrandRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpdateBrandRequest)
    UpdateBrandRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateBrandRequest.newBuilder() to construct.
  private UpdateBrandRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBrandRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateBrandRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.auth.AuthProto.internal_static_UpdateBrandRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.auth.AuthProto.internal_static_UpdateBrandRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.auth.UpdateBrandRequest.class, org.archi.common.auth.UpdateBrandRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <pre>
   * brand id.
   * </pre>
   *
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue name_;
  /**
   * <code>.google.protobuf.StringValue name = 2;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getName() {
    return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
  }
  /**
   * <code>.google.protobuf.StringValue name = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
    return getName();
  }

  public static final int FIELD_FIELD_NUMBER = 3;
  private com.google.protobuf.StringValue field_;
  /**
   * <code>.google.protobuf.StringValue field = 3;</code>
   * @return Whether the field field is set.
   */
  @java.lang.Override
  public boolean hasField() {
    return field_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue field = 3;</code>
   * @return The field.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getField() {
    return field_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : field_;
  }
  /**
   * <code>.google.protobuf.StringValue field = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getFieldOrBuilder() {
    return getField();
  }

  public static final int ADDRESS_FIELD_NUMBER = 4;
  private com.google.protobuf.StringValue address_;
  /**
   * <code>.google.protobuf.StringValue address = 4;</code>
   * @return Whether the address field is set.
   */
  @java.lang.Override
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue address = 4;</code>
   * @return The address.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getAddress() {
    return address_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : address_;
  }
  /**
   * <code>.google.protobuf.StringValue address = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getAddressOrBuilder() {
    return getAddress();
  }

  public static final int GPS_FIELD_NUMBER = 5;
  private com.google.protobuf.StringValue gps_;
  /**
   * <code>.google.protobuf.StringValue gps = 5;</code>
   * @return Whether the gps field is set.
   */
  @java.lang.Override
  public boolean hasGps() {
    return gps_ != null;
  }
  /**
   * <code>.google.protobuf.StringValue gps = 5;</code>
   * @return The gps.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getGps() {
    return gps_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : gps_;
  }
  /**
   * <code>.google.protobuf.StringValue gps = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getGpsOrBuilder() {
    return getGps();
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
    if (name_ != null) {
      output.writeMessage(2, getName());
    }
    if (field_ != null) {
      output.writeMessage(3, getField());
    }
    if (address_ != null) {
      output.writeMessage(4, getAddress());
    }
    if (gps_ != null) {
      output.writeMessage(5, getGps());
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
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getName());
    }
    if (field_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getField());
    }
    if (address_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAddress());
    }
    if (gps_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getGps());
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
    if (!(obj instanceof org.archi.common.auth.UpdateBrandRequest)) {
      return super.equals(obj);
    }
    org.archi.common.auth.UpdateBrandRequest other = (org.archi.common.auth.UpdateBrandRequest) obj;

    if (getId()
        != other.getId()) return false;
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
    }
    if (hasField() != other.hasField()) return false;
    if (hasField()) {
      if (!getField()
          .equals(other.getField())) return false;
    }
    if (hasAddress() != other.hasAddress()) return false;
    if (hasAddress()) {
      if (!getAddress()
          .equals(other.getAddress())) return false;
    }
    if (hasGps() != other.hasGps()) return false;
    if (hasGps()) {
      if (!getGps()
          .equals(other.getGps())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasField()) {
      hash = (37 * hash) + FIELD_FIELD_NUMBER;
      hash = (53 * hash) + getField().hashCode();
    }
    if (hasAddress()) {
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
    }
    if (hasGps()) {
      hash = (37 * hash) + GPS_FIELD_NUMBER;
      hash = (53 * hash) + getGps().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.auth.UpdateBrandRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.auth.UpdateBrandRequest parseFrom(
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
  public static Builder newBuilder(org.archi.common.auth.UpdateBrandRequest prototype) {
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
   * Protobuf type {@code UpdateBrandRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdateBrandRequest)
      org.archi.common.auth.UpdateBrandRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.auth.AuthProto.internal_static_UpdateBrandRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.auth.AuthProto.internal_static_UpdateBrandRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.auth.UpdateBrandRequest.class, org.archi.common.auth.UpdateBrandRequest.Builder.class);
    }

    // Construct using org.archi.common.auth.UpdateBrandRequest.newBuilder()
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

      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      if (fieldBuilder_ == null) {
        field_ = null;
      } else {
        field_ = null;
        fieldBuilder_ = null;
      }
      if (addressBuilder_ == null) {
        address_ = null;
      } else {
        address_ = null;
        addressBuilder_ = null;
      }
      if (gpsBuilder_ == null) {
        gps_ = null;
      } else {
        gps_ = null;
        gpsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.auth.AuthProto.internal_static_UpdateBrandRequest_descriptor;
    }

    @java.lang.Override
    public org.archi.common.auth.UpdateBrandRequest getDefaultInstanceForType() {
      return org.archi.common.auth.UpdateBrandRequest.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.auth.UpdateBrandRequest build() {
      org.archi.common.auth.UpdateBrandRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.auth.UpdateBrandRequest buildPartial() {
      org.archi.common.auth.UpdateBrandRequest result = new org.archi.common.auth.UpdateBrandRequest(this);
      result.id_ = id_;
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
      if (fieldBuilder_ == null) {
        result.field_ = field_;
      } else {
        result.field_ = fieldBuilder_.build();
      }
      if (addressBuilder_ == null) {
        result.address_ = address_;
      } else {
        result.address_ = addressBuilder_.build();
      }
      if (gpsBuilder_ == null) {
        result.gps_ = gps_;
      } else {
        result.gps_ = gpsBuilder_.build();
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
      if (other instanceof org.archi.common.auth.UpdateBrandRequest) {
        return mergeFrom((org.archi.common.auth.UpdateBrandRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.auth.UpdateBrandRequest other) {
      if (other == org.archi.common.auth.UpdateBrandRequest.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.hasField()) {
        mergeField(other.getField());
      }
      if (other.hasAddress()) {
        mergeAddress(other.getAddress());
      }
      if (other.hasGps()) {
        mergeGps(other.getGps());
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
            case 18: {
              input.readMessage(
                  getNameFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getFieldFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getAddressFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getGpsFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 42
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
     * brand id.
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
     * brand id.
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
     * brand id.
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

    private com.google.protobuf.StringValue name_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> nameBuilder_;
    /**
     * <code>.google.protobuf.StringValue name = 2;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue name = 2;</code>
     * @return The name.
     */
    public com.google.protobuf.StringValue getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public Builder setName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public Builder setName(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public Builder mergeName(com.google.protobuf.StringValue value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            com.google.protobuf.StringValue.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : name_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue name = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private com.google.protobuf.StringValue field_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> fieldBuilder_;
    /**
     * <code>.google.protobuf.StringValue field = 3;</code>
     * @return Whether the field field is set.
     */
    public boolean hasField() {
      return fieldBuilder_ != null || field_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue field = 3;</code>
     * @return The field.
     */
    public com.google.protobuf.StringValue getField() {
      if (fieldBuilder_ == null) {
        return field_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : field_;
      } else {
        return fieldBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue field = 3;</code>
     */
    public Builder setField(com.google.protobuf.StringValue value) {
      if (fieldBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        field_ = value;
        onChanged();
      } else {
        fieldBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue field = 3;</code>
     */
    public Builder setField(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (fieldBuilder_ == null) {
        field_ = builderForValue.build();
        onChanged();
      } else {
        fieldBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue field = 3;</code>
     */
    public Builder mergeField(com.google.protobuf.StringValue value) {
      if (fieldBuilder_ == null) {
        if (field_ != null) {
          field_ =
            com.google.protobuf.StringValue.newBuilder(field_).mergeFrom(value).buildPartial();
        } else {
          field_ = value;
        }
        onChanged();
      } else {
        fieldBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue field = 3;</code>
     */
    public Builder clearField() {
      if (fieldBuilder_ == null) {
        field_ = null;
        onChanged();
      } else {
        field_ = null;
        fieldBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue field = 3;</code>
     */
    public com.google.protobuf.StringValue.Builder getFieldBuilder() {
      
      onChanged();
      return getFieldFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue field = 3;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getFieldOrBuilder() {
      if (fieldBuilder_ != null) {
        return fieldBuilder_.getMessageOrBuilder();
      } else {
        return field_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : field_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue field = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getFieldFieldBuilder() {
      if (fieldBuilder_ == null) {
        fieldBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getField(),
                getParentForChildren(),
                isClean());
        field_ = null;
      }
      return fieldBuilder_;
    }

    private com.google.protobuf.StringValue address_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> addressBuilder_;
    /**
     * <code>.google.protobuf.StringValue address = 4;</code>
     * @return Whether the address field is set.
     */
    public boolean hasAddress() {
      return addressBuilder_ != null || address_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue address = 4;</code>
     * @return The address.
     */
    public com.google.protobuf.StringValue getAddress() {
      if (addressBuilder_ == null) {
        return address_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : address_;
      } else {
        return addressBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue address = 4;</code>
     */
    public Builder setAddress(com.google.protobuf.StringValue value) {
      if (addressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        address_ = value;
        onChanged();
      } else {
        addressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue address = 4;</code>
     */
    public Builder setAddress(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (addressBuilder_ == null) {
        address_ = builderForValue.build();
        onChanged();
      } else {
        addressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue address = 4;</code>
     */
    public Builder mergeAddress(com.google.protobuf.StringValue value) {
      if (addressBuilder_ == null) {
        if (address_ != null) {
          address_ =
            com.google.protobuf.StringValue.newBuilder(address_).mergeFrom(value).buildPartial();
        } else {
          address_ = value;
        }
        onChanged();
      } else {
        addressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue address = 4;</code>
     */
    public Builder clearAddress() {
      if (addressBuilder_ == null) {
        address_ = null;
        onChanged();
      } else {
        address_ = null;
        addressBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue address = 4;</code>
     */
    public com.google.protobuf.StringValue.Builder getAddressBuilder() {
      
      onChanged();
      return getAddressFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue address = 4;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getAddressOrBuilder() {
      if (addressBuilder_ != null) {
        return addressBuilder_.getMessageOrBuilder();
      } else {
        return address_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : address_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue address = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getAddressFieldBuilder() {
      if (addressBuilder_ == null) {
        addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getAddress(),
                getParentForChildren(),
                isClean());
        address_ = null;
      }
      return addressBuilder_;
    }

    private com.google.protobuf.StringValue gps_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> gpsBuilder_;
    /**
     * <code>.google.protobuf.StringValue gps = 5;</code>
     * @return Whether the gps field is set.
     */
    public boolean hasGps() {
      return gpsBuilder_ != null || gps_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue gps = 5;</code>
     * @return The gps.
     */
    public com.google.protobuf.StringValue getGps() {
      if (gpsBuilder_ == null) {
        return gps_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : gps_;
      } else {
        return gpsBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.StringValue gps = 5;</code>
     */
    public Builder setGps(com.google.protobuf.StringValue value) {
      if (gpsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gps_ = value;
        onChanged();
      } else {
        gpsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue gps = 5;</code>
     */
    public Builder setGps(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (gpsBuilder_ == null) {
        gps_ = builderForValue.build();
        onChanged();
      } else {
        gpsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue gps = 5;</code>
     */
    public Builder mergeGps(com.google.protobuf.StringValue value) {
      if (gpsBuilder_ == null) {
        if (gps_ != null) {
          gps_ =
            com.google.protobuf.StringValue.newBuilder(gps_).mergeFrom(value).buildPartial();
        } else {
          gps_ = value;
        }
        onChanged();
      } else {
        gpsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue gps = 5;</code>
     */
    public Builder clearGps() {
      if (gpsBuilder_ == null) {
        gps_ = null;
        onChanged();
      } else {
        gps_ = null;
        gpsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.StringValue gps = 5;</code>
     */
    public com.google.protobuf.StringValue.Builder getGpsBuilder() {
      
      onChanged();
      return getGpsFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.StringValue gps = 5;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getGpsOrBuilder() {
      if (gpsBuilder_ != null) {
        return gpsBuilder_.getMessageOrBuilder();
      } else {
        return gps_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : gps_;
      }
    }
    /**
     * <code>.google.protobuf.StringValue gps = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getGpsFieldBuilder() {
      if (gpsBuilder_ == null) {
        gpsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getGps(),
                getParentForChildren(),
                isClean());
        gps_ = null;
      }
      return gpsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:UpdateBrandRequest)
  }

  // @@protoc_insertion_point(class_scope:UpdateBrandRequest)
  private static final org.archi.common.auth.UpdateBrandRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.auth.UpdateBrandRequest();
  }

  public static org.archi.common.auth.UpdateBrandRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBrandRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBrandRequest>() {
    @java.lang.Override
    public UpdateBrandRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateBrandRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBrandRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.auth.UpdateBrandRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

