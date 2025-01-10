// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core.proto

package org.archi.common.core;

/**
 * Protobuf type {@code GetAllPiecePlayersResponse}
 */
public final class GetAllPiecePlayersResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetAllPiecePlayersResponse)
    GetAllPiecePlayersResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAllPiecePlayersResponse.newBuilder() to construct.
  private GetAllPiecePlayersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAllPiecePlayersResponse() {
    message_ = "";
    piece_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAllPiecePlayersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_GetAllPiecePlayersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_GetAllPiecePlayersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.GetAllPiecePlayersResponse.class, org.archi.common.core.GetAllPiecePlayersResponse.Builder.class);
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

  public static final int PIECE_FIELD_NUMBER = 3;
  private java.util.List<org.archi.common.core.Piece> piece_;
  /**
   * <code>repeated .Piece piece = 3;</code>
   */
  @java.lang.Override
  public java.util.List<org.archi.common.core.Piece> getPieceList() {
    return piece_;
  }
  /**
   * <code>repeated .Piece piece = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.archi.common.core.PieceOrBuilder> 
      getPieceOrBuilderList() {
    return piece_;
  }
  /**
   * <code>repeated .Piece piece = 3;</code>
   */
  @java.lang.Override
  public int getPieceCount() {
    return piece_.size();
  }
  /**
   * <code>repeated .Piece piece = 3;</code>
   */
  @java.lang.Override
  public org.archi.common.core.Piece getPiece(int index) {
    return piece_.get(index);
  }
  /**
   * <code>repeated .Piece piece = 3;</code>
   */
  @java.lang.Override
  public org.archi.common.core.PieceOrBuilder getPieceOrBuilder(
      int index) {
    return piece_.get(index);
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
    for (int i = 0; i < piece_.size(); i++) {
      output.writeMessage(3, piece_.get(i));
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
    for (int i = 0; i < piece_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, piece_.get(i));
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
    if (!(obj instanceof org.archi.common.core.GetAllPiecePlayersResponse)) {
      return super.equals(obj);
    }
    org.archi.common.core.GetAllPiecePlayersResponse other = (org.archi.common.core.GetAllPiecePlayersResponse) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getPieceList()
        .equals(other.getPieceList())) return false;
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
    if (getPieceCount() > 0) {
      hash = (37 * hash) + PIECE_FIELD_NUMBER;
      hash = (53 * hash) + getPieceList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetAllPiecePlayersResponse parseFrom(
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
  public static Builder newBuilder(org.archi.common.core.GetAllPiecePlayersResponse prototype) {
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
   * Protobuf type {@code GetAllPiecePlayersResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetAllPiecePlayersResponse)
      org.archi.common.core.GetAllPiecePlayersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_GetAllPiecePlayersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_GetAllPiecePlayersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.GetAllPiecePlayersResponse.class, org.archi.common.core.GetAllPiecePlayersResponse.Builder.class);
    }

    // Construct using org.archi.common.core.GetAllPiecePlayersResponse.newBuilder()
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

      if (pieceBuilder_ == null) {
        piece_ = java.util.Collections.emptyList();
      } else {
        piece_ = null;
        pieceBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_GetAllPiecePlayersResponse_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.GetAllPiecePlayersResponse getDefaultInstanceForType() {
      return org.archi.common.core.GetAllPiecePlayersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.GetAllPiecePlayersResponse build() {
      org.archi.common.core.GetAllPiecePlayersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.GetAllPiecePlayersResponse buildPartial() {
      org.archi.common.core.GetAllPiecePlayersResponse result = new org.archi.common.core.GetAllPiecePlayersResponse(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      result.message_ = message_;
      if (pieceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          piece_ = java.util.Collections.unmodifiableList(piece_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.piece_ = piece_;
      } else {
        result.piece_ = pieceBuilder_.build();
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
      if (other instanceof org.archi.common.core.GetAllPiecePlayersResponse) {
        return mergeFrom((org.archi.common.core.GetAllPiecePlayersResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.GetAllPiecePlayersResponse other) {
      if (other == org.archi.common.core.GetAllPiecePlayersResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0L) {
        setStatus(other.getStatus());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (pieceBuilder_ == null) {
        if (!other.piece_.isEmpty()) {
          if (piece_.isEmpty()) {
            piece_ = other.piece_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePieceIsMutable();
            piece_.addAll(other.piece_);
          }
          onChanged();
        }
      } else {
        if (!other.piece_.isEmpty()) {
          if (pieceBuilder_.isEmpty()) {
            pieceBuilder_.dispose();
            pieceBuilder_ = null;
            piece_ = other.piece_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pieceBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPieceFieldBuilder() : null;
          } else {
            pieceBuilder_.addAllMessages(other.piece_);
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
            case 26: {
              org.archi.common.core.Piece m =
                  input.readMessage(
                      org.archi.common.core.Piece.parser(),
                      extensionRegistry);
              if (pieceBuilder_ == null) {
                ensurePieceIsMutable();
                piece_.add(m);
              } else {
                pieceBuilder_.addMessage(m);
              }
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

    private java.util.List<org.archi.common.core.Piece> piece_ =
      java.util.Collections.emptyList();
    private void ensurePieceIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        piece_ = new java.util.ArrayList<org.archi.common.core.Piece>(piece_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.archi.common.core.Piece, org.archi.common.core.Piece.Builder, org.archi.common.core.PieceOrBuilder> pieceBuilder_;

    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public java.util.List<org.archi.common.core.Piece> getPieceList() {
      if (pieceBuilder_ == null) {
        return java.util.Collections.unmodifiableList(piece_);
      } else {
        return pieceBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public int getPieceCount() {
      if (pieceBuilder_ == null) {
        return piece_.size();
      } else {
        return pieceBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public org.archi.common.core.Piece getPiece(int index) {
      if (pieceBuilder_ == null) {
        return piece_.get(index);
      } else {
        return pieceBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public Builder setPiece(
        int index, org.archi.common.core.Piece value) {
      if (pieceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePieceIsMutable();
        piece_.set(index, value);
        onChanged();
      } else {
        pieceBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public Builder setPiece(
        int index, org.archi.common.core.Piece.Builder builderForValue) {
      if (pieceBuilder_ == null) {
        ensurePieceIsMutable();
        piece_.set(index, builderForValue.build());
        onChanged();
      } else {
        pieceBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public Builder addPiece(org.archi.common.core.Piece value) {
      if (pieceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePieceIsMutable();
        piece_.add(value);
        onChanged();
      } else {
        pieceBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public Builder addPiece(
        int index, org.archi.common.core.Piece value) {
      if (pieceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePieceIsMutable();
        piece_.add(index, value);
        onChanged();
      } else {
        pieceBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public Builder addPiece(
        org.archi.common.core.Piece.Builder builderForValue) {
      if (pieceBuilder_ == null) {
        ensurePieceIsMutable();
        piece_.add(builderForValue.build());
        onChanged();
      } else {
        pieceBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public Builder addPiece(
        int index, org.archi.common.core.Piece.Builder builderForValue) {
      if (pieceBuilder_ == null) {
        ensurePieceIsMutable();
        piece_.add(index, builderForValue.build());
        onChanged();
      } else {
        pieceBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public Builder addAllPiece(
        java.lang.Iterable<? extends org.archi.common.core.Piece> values) {
      if (pieceBuilder_ == null) {
        ensurePieceIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, piece_);
        onChanged();
      } else {
        pieceBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public Builder clearPiece() {
      if (pieceBuilder_ == null) {
        piece_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pieceBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public Builder removePiece(int index) {
      if (pieceBuilder_ == null) {
        ensurePieceIsMutable();
        piece_.remove(index);
        onChanged();
      } else {
        pieceBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public org.archi.common.core.Piece.Builder getPieceBuilder(
        int index) {
      return getPieceFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public org.archi.common.core.PieceOrBuilder getPieceOrBuilder(
        int index) {
      if (pieceBuilder_ == null) {
        return piece_.get(index);  } else {
        return pieceBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public java.util.List<? extends org.archi.common.core.PieceOrBuilder> 
         getPieceOrBuilderList() {
      if (pieceBuilder_ != null) {
        return pieceBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(piece_);
      }
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public org.archi.common.core.Piece.Builder addPieceBuilder() {
      return getPieceFieldBuilder().addBuilder(
          org.archi.common.core.Piece.getDefaultInstance());
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public org.archi.common.core.Piece.Builder addPieceBuilder(
        int index) {
      return getPieceFieldBuilder().addBuilder(
          index, org.archi.common.core.Piece.getDefaultInstance());
    }
    /**
     * <code>repeated .Piece piece = 3;</code>
     */
    public java.util.List<org.archi.common.core.Piece.Builder> 
         getPieceBuilderList() {
      return getPieceFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.archi.common.core.Piece, org.archi.common.core.Piece.Builder, org.archi.common.core.PieceOrBuilder> 
        getPieceFieldBuilder() {
      if (pieceBuilder_ == null) {
        pieceBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.archi.common.core.Piece, org.archi.common.core.Piece.Builder, org.archi.common.core.PieceOrBuilder>(
                piece_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        piece_ = null;
      }
      return pieceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:GetAllPiecePlayersResponse)
  }

  // @@protoc_insertion_point(class_scope:GetAllPiecePlayersResponse)
  private static final org.archi.common.core.GetAllPiecePlayersResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.GetAllPiecePlayersResponse();
  }

  public static org.archi.common.core.GetAllPiecePlayersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAllPiecePlayersResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAllPiecePlayersResponse>() {
    @java.lang.Override
    public GetAllPiecePlayersResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAllPiecePlayersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAllPiecePlayersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.GetAllPiecePlayersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

