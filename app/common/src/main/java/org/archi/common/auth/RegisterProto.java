// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: register.proto

package org.archi.common.auth;

public final class RegisterProto {
  private RegisterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostRegisterRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostRegisterRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostRegisterResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostRegisterResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016register.proto\"k\n\023PostRegisterRequest\022" +
      "\020\n\010username\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\022\r\n\005e" +
      "mail\030\004 \001(\t\022\023\n\013phoneNumber\030\005 \001(\t\022\014\n\004role\030" +
      "\006 \001(\t\"7\n\024PostRegisterResponse\022\016\n\006status\030" +
      "\001 \001(\003\022\017\n\007message\030\002 \001(\t2N\n\017RegisterServic" +
      "e\022;\n\014PostRegister\022\024.PostRegisterRequest\032" +
      "\025.PostRegisterResponseB(\n\025org.archi.comm" +
      "on.authB\rRegisterProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PostRegisterRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PostRegisterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRegisterRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "Email", "PhoneNumber", "Role", });
    internal_static_PostRegisterResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PostRegisterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRegisterResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
