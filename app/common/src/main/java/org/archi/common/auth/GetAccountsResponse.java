// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.archi.common.auth;

/**
 * Protobuf type {@code GetAccountsResponse}
 */
public final class GetAccountsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetAccountsResponse)
    GetAccountsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAccountsResponse.newBuilder() to construct.
  private GetAccountsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAccountsResponse() {
    message_ = "";
    accounts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAccountsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.auth.AuthProto.internal_static_GetAccountsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.auth.AuthProto.internal_static_GetAccountsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.auth.GetAccountsResponse.class, org.archi.common.auth.GetAccountsResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private long status_;
  /**
   * <code>int64 status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public long getStatus() {
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

  public static final int TOTALPAGE_FIELD_NUMBER = 3;
  private long totalPage_;
  /**
   * <code>int64 totalPage = 3;</code>
   * @return The totalPage.
   */
  @java.lang.Override
  public long getTotalPage() {
    return totalPage_;
  }

  public static final int TOTALELEMENT_FIELD_NUMBER = 4;
  private long totalElement_;
  /**
   * <code>int64 totalElement = 4;</code>
   * @return The totalElement.
   */
  @java.lang.Override
  public long getTotalElement() {
    return totalElement_;
  }

  public static final int PAGE_FIELD_NUMBER = 5;
  private long page_;
  /**
   * <code>int64 page = 5;</code>
   * @return The page.
   */
  @java.lang.Override
  public long getPage() {
    return page_;
  }

  public static final int SIZE_FIELD_NUMBER = 6;
  private long size_;
  /**
   * <code>int64 size = 6;</code>
   * @return The size.
   */
  @java.lang.Override
  public long getSize() {
    return size_;
  }

  public static final int ACCOUNTS_FIELD_NUMBER = 7;
  private java.util.List<org.archi.common.auth.Account> accounts_;
  /**
   * <code>repeated .Account accounts = 7;</code>
   */
  @java.lang.Override
  public java.util.List<org.archi.common.auth.Account> getAccountsList() {
    return accounts_;
  }
  /**
   * <code>repeated .Account accounts = 7;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.archi.common.auth.AccountOrBuilder> 
      getAccountsOrBuilderList() {
    return accounts_;
  }
  /**
   * <code>repeated .Account accounts = 7;</code>
   */
  @java.lang.Override
  public int getAccountsCount() {
    return accounts_.size();
  }
  /**
   * <code>repeated .Account accounts = 7;</code>
   */
  @java.lang.Override
  public org.archi.common.auth.Account getAccounts(int index) {
    return accounts_.get(index);
  }
  /**
   * <code>repeated .Account accounts = 7;</code>
   */
  @java.lang.Override
  public org.archi.common.auth.AccountOrBuilder getAccountsOrBuilder(
      int index) {
    return accounts_.get(index);
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
    if (status_ != 0L) {
      output.writeInt64(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (totalPage_ != 0L) {
      output.writeInt64(3, totalPage_);
    }
    if (totalElement_ != 0L) {
      output.writeInt64(4, totalElement_);
    }
    if (page_ != 0L) {
      output.writeInt64(5, page_);
    }
    if (size_ != 0L) {
      output.writeInt64(6, size_);
    }
    for (int i = 0; i < accounts_.size(); i++) {
      output.writeMessage(7, accounts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (totalPage_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalPage_);
    }
    if (totalElement_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalElement_);
    }
    if (page_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, page_);
    }
    if (size_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, size_);
    }
    for (int i = 0; i < accounts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, accounts_.get(i));
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
    if (!(obj instanceof org.archi.common.auth.GetAccountsResponse)) {
      return super.equals(obj);
    }
    org.archi.common.auth.GetAccountsResponse other = (org.archi.common.auth.GetAccountsResponse) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (getTotalPage()
        != other.getTotalPage()) return false;
    if (getTotalElement()
        != other.getTotalElement()) return false;
    if (getPage()
        != other.getPage()) return false;
    if (getSize()
        != other.getSize()) return false;
    if (!getAccountsList()
        .equals(other.getAccountsList())) return false;
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
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStatus());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + TOTALPAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalPage());
    hash = (37 * hash) + TOTALELEMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalElement());
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPage());
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSize());
    if (getAccountsCount() > 0) {
      hash = (37 * hash) + ACCOUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getAccountsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.auth.GetAccountsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.auth.GetAccountsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.auth.GetAccountsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.auth.GetAccountsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.auth.GetAccountsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.auth.GetAccountsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.auth.GetAccountsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.auth.GetAccountsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.auth.GetAccountsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.auth.GetAccountsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.auth.GetAccountsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.auth.GetAccountsResponse parseFrom(
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
  public static Builder newBuilder(org.archi.common.auth.GetAccountsResponse prototype) {
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
   * Protobuf type {@code GetAccountsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetAccountsResponse)
      org.archi.common.auth.GetAccountsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.auth.AuthProto.internal_static_GetAccountsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.auth.AuthProto.internal_static_GetAccountsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.auth.GetAccountsResponse.class, org.archi.common.auth.GetAccountsResponse.Builder.class);
    }

    // Construct using org.archi.common.auth.GetAccountsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0L;

      message_ = "";

      totalPage_ = 0L;

      totalElement_ = 0L;

      page_ = 0L;

      size_ = 0L;

      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
      } else {
        accounts_ = null;
        accountsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.auth.AuthProto.internal_static_GetAccountsResponse_descriptor;
    }

    @java.lang.Override
    public org.archi.common.auth.GetAccountsResponse getDefaultInstanceForType() {
      return org.archi.common.auth.GetAccountsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.auth.GetAccountsResponse build() {
      org.archi.common.auth.GetAccountsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.auth.GetAccountsResponse buildPartial() {
      org.archi.common.auth.GetAccountsResponse result = new org.archi.common.auth.GetAccountsResponse(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      result.message_ = message_;
      result.totalPage_ = totalPage_;
      result.totalElement_ = totalElement_;
      result.page_ = page_;
      result.size_ = size_;
      if (accountsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          accounts_ = java.util.Collections.unmodifiableList(accounts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.accounts_ = accounts_;
      } else {
        result.accounts_ = accountsBuilder_.build();
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
      if (other instanceof org.archi.common.auth.GetAccountsResponse) {
        return mergeFrom((org.archi.common.auth.GetAccountsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.auth.GetAccountsResponse other) {
      if (other == org.archi.common.auth.GetAccountsResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0L) {
        setStatus(other.getStatus());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.getTotalPage() != 0L) {
        setTotalPage(other.getTotalPage());
      }
      if (other.getTotalElement() != 0L) {
        setTotalElement(other.getTotalElement());
      }
      if (other.getPage() != 0L) {
        setPage(other.getPage());
      }
      if (other.getSize() != 0L) {
        setSize(other.getSize());
      }
      if (accountsBuilder_ == null) {
        if (!other.accounts_.isEmpty()) {
          if (accounts_.isEmpty()) {
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAccountsIsMutable();
            accounts_.addAll(other.accounts_);
          }
          onChanged();
        }
      } else {
        if (!other.accounts_.isEmpty()) {
          if (accountsBuilder_.isEmpty()) {
            accountsBuilder_.dispose();
            accountsBuilder_ = null;
            accounts_ = other.accounts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            accountsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccountsFieldBuilder() : null;
          } else {
            accountsBuilder_.addAllMessages(other.accounts_);
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
            case 8: {
              status_ = input.readInt64();

              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 24: {
              totalPage_ = input.readInt64();

              break;
            } // case 24
            case 32: {
              totalElement_ = input.readInt64();

              break;
            } // case 32
            case 40: {
              page_ = input.readInt64();

              break;
            } // case 40
            case 48: {
              size_ = input.readInt64();

              break;
            } // case 48
            case 58: {
              org.archi.common.auth.Account m =
                  input.readMessage(
                      org.archi.common.auth.Account.parser(),
                      extensionRegistry);
              if (accountsBuilder_ == null) {
                ensureAccountsIsMutable();
                accounts_.add(m);
              } else {
                accountsBuilder_.addMessage(m);
              }
              break;
            } // case 58
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

    private long status_ ;
    /**
     * <code>int64 status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public long getStatus() {
      return status_;
    }
    /**
     * <code>int64 status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(long value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0L;
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

    private long totalPage_ ;
    /**
     * <code>int64 totalPage = 3;</code>
     * @return The totalPage.
     */
    @java.lang.Override
    public long getTotalPage() {
      return totalPage_;
    }
    /**
     * <code>int64 totalPage = 3;</code>
     * @param value The totalPage to set.
     * @return This builder for chaining.
     */
    public Builder setTotalPage(long value) {
      
      totalPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 totalPage = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalPage() {
      
      totalPage_ = 0L;
      onChanged();
      return this;
    }

    private long totalElement_ ;
    /**
     * <code>int64 totalElement = 4;</code>
     * @return The totalElement.
     */
    @java.lang.Override
    public long getTotalElement() {
      return totalElement_;
    }
    /**
     * <code>int64 totalElement = 4;</code>
     * @param value The totalElement to set.
     * @return This builder for chaining.
     */
    public Builder setTotalElement(long value) {
      
      totalElement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 totalElement = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalElement() {
      
      totalElement_ = 0L;
      onChanged();
      return this;
    }

    private long page_ ;
    /**
     * <code>int64 page = 5;</code>
     * @return The page.
     */
    @java.lang.Override
    public long getPage() {
      return page_;
    }
    /**
     * <code>int64 page = 5;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(long value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 page = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      
      page_ = 0L;
      onChanged();
      return this;
    }

    private long size_ ;
    /**
     * <code>int64 size = 6;</code>
     * @return The size.
     */
    @java.lang.Override
    public long getSize() {
      return size_;
    }
    /**
     * <code>int64 size = 6;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(long value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 size = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<org.archi.common.auth.Account> accounts_ =
      java.util.Collections.emptyList();
    private void ensureAccountsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        accounts_ = new java.util.ArrayList<org.archi.common.auth.Account>(accounts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.archi.common.auth.Account, org.archi.common.auth.Account.Builder, org.archi.common.auth.AccountOrBuilder> accountsBuilder_;

    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public java.util.List<org.archi.common.auth.Account> getAccountsList() {
      if (accountsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accounts_);
      } else {
        return accountsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public int getAccountsCount() {
      if (accountsBuilder_ == null) {
        return accounts_.size();
      } else {
        return accountsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public org.archi.common.auth.Account getAccounts(int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);
      } else {
        return accountsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public Builder setAccounts(
        int index, org.archi.common.auth.Account value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.set(index, value);
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public Builder setAccounts(
        int index, org.archi.common.auth.Account.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.set(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public Builder addAccounts(org.archi.common.auth.Account value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public Builder addAccounts(
        int index, org.archi.common.auth.Account value) {
      if (accountsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountsIsMutable();
        accounts_.add(index, value);
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public Builder addAccounts(
        org.archi.common.auth.Account.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public Builder addAccounts(
        int index, org.archi.common.auth.Account.Builder builderForValue) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.add(index, builderForValue.build());
        onChanged();
      } else {
        accountsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public Builder addAllAccounts(
        java.lang.Iterable<? extends org.archi.common.auth.Account> values) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accounts_);
        onChanged();
      } else {
        accountsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public Builder clearAccounts() {
      if (accountsBuilder_ == null) {
        accounts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        accountsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public Builder removeAccounts(int index) {
      if (accountsBuilder_ == null) {
        ensureAccountsIsMutable();
        accounts_.remove(index);
        onChanged();
      } else {
        accountsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public org.archi.common.auth.Account.Builder getAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public org.archi.common.auth.AccountOrBuilder getAccountsOrBuilder(
        int index) {
      if (accountsBuilder_ == null) {
        return accounts_.get(index);  } else {
        return accountsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public java.util.List<? extends org.archi.common.auth.AccountOrBuilder> 
         getAccountsOrBuilderList() {
      if (accountsBuilder_ != null) {
        return accountsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accounts_);
      }
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public org.archi.common.auth.Account.Builder addAccountsBuilder() {
      return getAccountsFieldBuilder().addBuilder(
          org.archi.common.auth.Account.getDefaultInstance());
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public org.archi.common.auth.Account.Builder addAccountsBuilder(
        int index) {
      return getAccountsFieldBuilder().addBuilder(
          index, org.archi.common.auth.Account.getDefaultInstance());
    }
    /**
     * <code>repeated .Account accounts = 7;</code>
     */
    public java.util.List<org.archi.common.auth.Account.Builder> 
         getAccountsBuilderList() {
      return getAccountsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.archi.common.auth.Account, org.archi.common.auth.Account.Builder, org.archi.common.auth.AccountOrBuilder> 
        getAccountsFieldBuilder() {
      if (accountsBuilder_ == null) {
        accountsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.archi.common.auth.Account, org.archi.common.auth.Account.Builder, org.archi.common.auth.AccountOrBuilder>(
                accounts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        accounts_ = null;
      }
      return accountsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetAccountsResponse)
  }

  // @@protoc_insertion_point(class_scope:GetAccountsResponse)
  private static final org.archi.common.auth.GetAccountsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.auth.GetAccountsResponse();
  }

  public static org.archi.common.auth.GetAccountsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAccountsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAccountsResponse>() {
    @java.lang.Override
    public GetAccountsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAccountsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAccountsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.auth.GetAccountsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

