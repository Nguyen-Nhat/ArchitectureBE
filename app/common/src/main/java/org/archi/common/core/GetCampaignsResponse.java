// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: core.proto
// Protobuf Java Version: 4.29.1

package org.archi.common.core;

/**
 * Protobuf type {@code GetCampaignsResponse}
 */
public final class GetCampaignsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:GetCampaignsResponse)
    GetCampaignsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 1,
      /* suffix= */ "",
      GetCampaignsResponse.class.getName());
  }
  // Use GetCampaignsResponse.newBuilder() to construct.
  private GetCampaignsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetCampaignsResponse() {
    campaigns_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.archi.common.core.CoreProto.internal_static_GetCampaignsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.archi.common.core.CoreProto.internal_static_GetCampaignsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.archi.common.core.GetCampaignsResponse.class, org.archi.common.core.GetCampaignsResponse.Builder.class);
  }

  public static final int CAMPAIGNS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.archi.common.core.Campaign> campaigns_;
  /**
   * <code>repeated .Campaign campaigns = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.archi.common.core.Campaign> getCampaignsList() {
    return campaigns_;
  }
  /**
   * <code>repeated .Campaign campaigns = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.archi.common.core.CampaignOrBuilder> 
      getCampaignsOrBuilderList() {
    return campaigns_;
  }
  /**
   * <code>repeated .Campaign campaigns = 1;</code>
   */
  @java.lang.Override
  public int getCampaignsCount() {
    return campaigns_.size();
  }
  /**
   * <code>repeated .Campaign campaigns = 1;</code>
   */
  @java.lang.Override
  public org.archi.common.core.Campaign getCampaigns(int index) {
    return campaigns_.get(index);
  }
  /**
   * <code>repeated .Campaign campaigns = 1;</code>
   */
  @java.lang.Override
  public org.archi.common.core.CampaignOrBuilder getCampaignsOrBuilder(
      int index) {
    return campaigns_.get(index);
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
    for (int i = 0; i < campaigns_.size(); i++) {
      output.writeMessage(1, campaigns_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < campaigns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, campaigns_.get(i));
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
    if (!(obj instanceof org.archi.common.core.GetCampaignsResponse)) {
      return super.equals(obj);
    }
    org.archi.common.core.GetCampaignsResponse other = (org.archi.common.core.GetCampaignsResponse) obj;

    if (!getCampaignsList()
        .equals(other.getCampaignsList())) return false;
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
    if (getCampaignsCount() > 0) {
      hash = (37 * hash) + CAMPAIGNS_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.archi.common.core.GetCampaignsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetCampaignsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetCampaignsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetCampaignsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetCampaignsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.archi.common.core.GetCampaignsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.archi.common.core.GetCampaignsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetCampaignsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.archi.common.core.GetCampaignsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.archi.common.core.GetCampaignsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.archi.common.core.GetCampaignsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.archi.common.core.GetCampaignsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.archi.common.core.GetCampaignsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code GetCampaignsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetCampaignsResponse)
      org.archi.common.core.GetCampaignsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.archi.common.core.CoreProto.internal_static_GetCampaignsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.archi.common.core.CoreProto.internal_static_GetCampaignsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.archi.common.core.GetCampaignsResponse.class, org.archi.common.core.GetCampaignsResponse.Builder.class);
    }

    // Construct using org.archi.common.core.GetCampaignsResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (campaignsBuilder_ == null) {
        campaigns_ = java.util.Collections.emptyList();
      } else {
        campaigns_ = null;
        campaignsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.archi.common.core.CoreProto.internal_static_GetCampaignsResponse_descriptor;
    }

    @java.lang.Override
    public org.archi.common.core.GetCampaignsResponse getDefaultInstanceForType() {
      return org.archi.common.core.GetCampaignsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.archi.common.core.GetCampaignsResponse build() {
      org.archi.common.core.GetCampaignsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.archi.common.core.GetCampaignsResponse buildPartial() {
      org.archi.common.core.GetCampaignsResponse result = new org.archi.common.core.GetCampaignsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.archi.common.core.GetCampaignsResponse result) {
      if (campaignsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          campaigns_ = java.util.Collections.unmodifiableList(campaigns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.campaigns_ = campaigns_;
      } else {
        result.campaigns_ = campaignsBuilder_.build();
      }
    }

    private void buildPartial0(org.archi.common.core.GetCampaignsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.archi.common.core.GetCampaignsResponse) {
        return mergeFrom((org.archi.common.core.GetCampaignsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.archi.common.core.GetCampaignsResponse other) {
      if (other == org.archi.common.core.GetCampaignsResponse.getDefaultInstance()) return this;
      if (campaignsBuilder_ == null) {
        if (!other.campaigns_.isEmpty()) {
          if (campaigns_.isEmpty()) {
            campaigns_ = other.campaigns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCampaignsIsMutable();
            campaigns_.addAll(other.campaigns_);
          }
          onChanged();
        }
      } else {
        if (!other.campaigns_.isEmpty()) {
          if (campaignsBuilder_.isEmpty()) {
            campaignsBuilder_.dispose();
            campaignsBuilder_ = null;
            campaigns_ = other.campaigns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            campaignsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCampaignsFieldBuilder() : null;
          } else {
            campaignsBuilder_.addAllMessages(other.campaigns_);
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
              org.archi.common.core.Campaign m =
                  input.readMessage(
                      org.archi.common.core.Campaign.parser(),
                      extensionRegistry);
              if (campaignsBuilder_ == null) {
                ensureCampaignsIsMutable();
                campaigns_.add(m);
              } else {
                campaignsBuilder_.addMessage(m);
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

    private java.util.List<org.archi.common.core.Campaign> campaigns_ =
      java.util.Collections.emptyList();
    private void ensureCampaignsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        campaigns_ = new java.util.ArrayList<org.archi.common.core.Campaign>(campaigns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        org.archi.common.core.Campaign, org.archi.common.core.Campaign.Builder, org.archi.common.core.CampaignOrBuilder> campaignsBuilder_;

    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public java.util.List<org.archi.common.core.Campaign> getCampaignsList() {
      if (campaignsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(campaigns_);
      } else {
        return campaignsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public int getCampaignsCount() {
      if (campaignsBuilder_ == null) {
        return campaigns_.size();
      } else {
        return campaignsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public org.archi.common.core.Campaign getCampaigns(int index) {
      if (campaignsBuilder_ == null) {
        return campaigns_.get(index);
      } else {
        return campaignsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public Builder setCampaigns(
        int index, org.archi.common.core.Campaign value) {
      if (campaignsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampaignsIsMutable();
        campaigns_.set(index, value);
        onChanged();
      } else {
        campaignsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public Builder setCampaigns(
        int index, org.archi.common.core.Campaign.Builder builderForValue) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        campaigns_.set(index, builderForValue.build());
        onChanged();
      } else {
        campaignsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public Builder addCampaigns(org.archi.common.core.Campaign value) {
      if (campaignsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampaignsIsMutable();
        campaigns_.add(value);
        onChanged();
      } else {
        campaignsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public Builder addCampaigns(
        int index, org.archi.common.core.Campaign value) {
      if (campaignsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampaignsIsMutable();
        campaigns_.add(index, value);
        onChanged();
      } else {
        campaignsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public Builder addCampaigns(
        org.archi.common.core.Campaign.Builder builderForValue) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        campaigns_.add(builderForValue.build());
        onChanged();
      } else {
        campaignsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public Builder addCampaigns(
        int index, org.archi.common.core.Campaign.Builder builderForValue) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        campaigns_.add(index, builderForValue.build());
        onChanged();
      } else {
        campaignsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public Builder addAllCampaigns(
        java.lang.Iterable<? extends org.archi.common.core.Campaign> values) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, campaigns_);
        onChanged();
      } else {
        campaignsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public Builder clearCampaigns() {
      if (campaignsBuilder_ == null) {
        campaigns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        campaignsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public Builder removeCampaigns(int index) {
      if (campaignsBuilder_ == null) {
        ensureCampaignsIsMutable();
        campaigns_.remove(index);
        onChanged();
      } else {
        campaignsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public org.archi.common.core.Campaign.Builder getCampaignsBuilder(
        int index) {
      return getCampaignsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public org.archi.common.core.CampaignOrBuilder getCampaignsOrBuilder(
        int index) {
      if (campaignsBuilder_ == null) {
        return campaigns_.get(index);  } else {
        return campaignsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public java.util.List<? extends org.archi.common.core.CampaignOrBuilder> 
         getCampaignsOrBuilderList() {
      if (campaignsBuilder_ != null) {
        return campaignsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(campaigns_);
      }
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public org.archi.common.core.Campaign.Builder addCampaignsBuilder() {
      return getCampaignsFieldBuilder().addBuilder(
          org.archi.common.core.Campaign.getDefaultInstance());
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public org.archi.common.core.Campaign.Builder addCampaignsBuilder(
        int index) {
      return getCampaignsFieldBuilder().addBuilder(
          index, org.archi.common.core.Campaign.getDefaultInstance());
    }
    /**
     * <code>repeated .Campaign campaigns = 1;</code>
     */
    public java.util.List<org.archi.common.core.Campaign.Builder> 
         getCampaignsBuilderList() {
      return getCampaignsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        org.archi.common.core.Campaign, org.archi.common.core.Campaign.Builder, org.archi.common.core.CampaignOrBuilder> 
        getCampaignsFieldBuilder() {
      if (campaignsBuilder_ == null) {
        campaignsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            org.archi.common.core.Campaign, org.archi.common.core.Campaign.Builder, org.archi.common.core.CampaignOrBuilder>(
                campaigns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        campaigns_ = null;
      }
      return campaignsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:GetCampaignsResponse)
  }

  // @@protoc_insertion_point(class_scope:GetCampaignsResponse)
  private static final org.archi.common.core.GetCampaignsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.archi.common.core.GetCampaignsResponse();
  }

  public static org.archi.common.core.GetCampaignsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCampaignsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCampaignsResponse>() {
    @java.lang.Override
    public GetCampaignsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetCampaignsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCampaignsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.archi.common.core.GetCampaignsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

