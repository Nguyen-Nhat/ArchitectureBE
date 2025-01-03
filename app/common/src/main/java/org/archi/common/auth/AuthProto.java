// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package org.archi.common.auth;

public final class AuthProto {
  private AuthProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostCreateAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostCreateAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostCreateAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostCreateAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PutUpdateAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PutUpdateAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PutUpdateAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PutUpdateAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteAccountRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteAccountRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DeleteAccountResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DeleteAccountResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAccountInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAccountInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetAccountInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetAccountInfoResponse_fieldAccessorTable;
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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostLoginRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostLoginRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostLoginResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostLoginResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostLogoutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostLogoutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostLogoutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostLogoutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostRefreshTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostRefreshTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostRefreshTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostRefreshTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetVerifyEmailRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetVerifyEmailRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetVerifyEmailResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetVerifyEmailResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostVerifyTokenRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostVerifyTokenRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PostVerifyTokenResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PostVerifyTokenResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBrandInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBrandInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetBrandInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetBrandInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetPlayerInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetPlayerInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nauth.proto\"p\n\030PostCreateAccountRequest" +
      "\022\020\n\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\022\r\n\005" +
      "email\030\003 \001(\t\022\023\n\013phoneNumber\030\004 \001(\t\022\014\n\004role" +
      "\030\005 \001(\t\"<\n\031PostCreateAccountResponse\022\016\n\006s" +
      "tatus\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\"o\n\027PutUpdat" +
      "eAccountRequest\022\020\n\010username\030\001 \001(\t\022\r\n\005ema" +
      "il\030\002 \001(\t\022\023\n\013phoneNumber\030\003 \001(\t\022\014\n\004role\030\004 " +
      "\001(\t\022\020\n\010isActive\030\005 \001(\010\";\n\030PutUpdateAccoun" +
      "tResponse\022\016\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001" +
      "(\t\"\"\n\024DeleteAccountRequest\022\n\n\002id\030\001 \001(\003\"8" +
      "\n\025DeleteAccountResponse\022\016\n\006status\030\001 \001(\003\022" +
      "\017\n\007message\030\002 \001(\t\"#\n\025GetAccountInfoReques" +
      "t\022\n\n\002id\030\001 \001(\003\"\233\001\n\026GetAccountInfoResponse" +
      "\022\016\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\022\n\n\002id\030" +
      "\003 \001(\003\022\020\n\010username\030\004 \001(\t\022\r\n\005email\030\005 \001(\t\022\023" +
      "\n\013phoneNumber\030\006 \001(\t\022\014\n\004role\030\007 \001(\t\022\020\n\010isA" +
      "ctive\030\010 \001(\010\"k\n\023PostRegisterRequest\022\020\n\010us" +
      "ername\030\002 \001(\t\022\020\n\010password\030\003 \001(\t\022\r\n\005email\030" +
      "\004 \001(\t\022\023\n\013phoneNumber\030\005 \001(\t\022\014\n\004role\030\006 \001(\t" +
      "\"7\n\024PostRegisterResponse\022\016\n\006status\030\001 \001(\003" +
      "\022\017\n\007message\030\002 \001(\t\"6\n\020PostLoginRequest\022\020\n" +
      "\010username\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"\205\001\n\021Po" +
      "stLoginResponse\022\016\n\006status\030\001 \001(\003\022\017\n\007messa" +
      "ge\030\002 \001(\t\022\023\n\013accessToken\030\003 \001(\t\022\024\n\014refresh" +
      "Token\030\004 \001(\t\022\021\n\ttokenType\030\005 \001(\t\022\021\n\texpire" +
      "sIn\030\006 \001(\003\"(\n\021PostLogoutRequest\022\023\n\013access" +
      "Token\030\001 \001(\t\"5\n\022PostLogoutResponse\022\016\n\006sta" +
      "tus\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\"/\n\027PostRefres" +
      "hTokenRequest\022\024\n\014refreshToken\030\001 \001(\t\"v\n\030P" +
      "ostRefreshTokenResponse\022\016\n\006status\030\001 \001(\003\022" +
      "\017\n\007message\030\002 \001(\t\022\023\n\013accessToken\030\003 \001(\t\022\021\n" +
      "\texpiresIn\030\004 \001(\003\022\021\n\ttokenType\030\005 \001(\t\"&\n\025G" +
      "etVerifyEmailRequest\022\r\n\005token\030\001 \001(\t\"9\n\026G" +
      "etVerifyEmailResponse\022\016\n\006status\030\001 \001(\003\022\017\n" +
      "\007message\030\002 \001(\t\"\'\n\026PostVerifyTokenRequest" +
      "\022\r\n\005token\030\001 \001(\t\"T\n\027PostVerifyTokenRespon" +
      "se\022\016\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\022\n\n\002i" +
      "d\030\003 \001(\003\022\014\n\004role\030\004 \001(\t\"!\n\023GetBrandInfoReq" +
      "uest\022\n\n\002id\030\001 \001(\003\"\220\001\n\024GetBrandInfoRespons" +
      "e\022\016\n\006status\030\001 \001(\003\022\017\n\007message\030\002 \001(\t\022\n\n\002id" +
      "\030\003 \001(\003\022\014\n\004name\030\004 \001(\t\022\r\n\005field\030\005 \001(\t\022\017\n\007a" +
      "ddress\030\006 \001(\t\022\013\n\003gps\030\007 \001(\t\022\020\n\010isEnable\030\010 " +
      "\001(\010\"\"\n\024GetPlayerInfoRequest\022\n\n\002id\030\001 \001(\003\"" +
      "\227\001\n\025GetPlayerInfoResponse\022\016\n\006status\030\001 \001(" +
      "\003\022\017\n\007message\030\002 \001(\t\022\n\n\002id\030\003 \001(\003\022\014\n\004name\030\004" +
      " \001(\t\022\016\n\006avatar\030\005 \001(\t\022\021\n\tbirthDate\030\006 \001(\003\022" +
      "\016\n\006gender\030\007 \001(\t\022\020\n\010facebook\030\010 \001(\t2\323\005\n\013Au" +
      "thService\022;\n\014PostRegister\022\024.PostRegister" +
      "Request\032\025.PostRegisterResponse\0222\n\tPostLo" +
      "gin\022\021.PostLoginRequest\032\022.PostLoginRespon" +
      "se\0225\n\nPostLogout\022\022.PostLogoutRequest\032\023.P" +
      "ostLogoutResponse\022G\n\020PostRefreshToken\022\030." +
      "PostRefreshTokenRequest\032\031.PostRefreshTok" +
      "enResponse\022A\n\016GetVerifyEmail\022\026.GetVerify" +
      "EmailRequest\032\027.GetVerifyEmailResponse\022D\n" +
      "\017PostVerifyToken\022\027.PostVerifyTokenReques" +
      "t\032\030.PostVerifyTokenResponse\022;\n\014GetBrandI" +
      "nfo\022\024.GetBrandInfoRequest\032\025.GetBrandInfo" +
      "Response\022>\n\rGetPlayerInfo\022\025.GetPlayerInf" +
      "oRequest\032\026.GetPlayerInfoResponse\022A\n\016GetA" +
      "ccountInfo\022\026.GetAccountInfoRequest\032\027.Get" +
      "AccountInfoResponse\022J\n\021PostCreateAccount" +
      "\022\031.PostCreateAccountRequest\032\032.PostCreate" +
      "AccountResponse\022>\n\rDeleteAccount\022\025.Delet" +
      "eAccountRequest\032\026.DeleteAccountResponse2" +
      "\017\n\rLogoutServiceB$\n\025org.archi.common.aut" +
      "hB\tAuthProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PostCreateAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PostCreateAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostCreateAccountRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "Email", "PhoneNumber", "Role", });
    internal_static_PostCreateAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PostCreateAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostCreateAccountResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_PutUpdateAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_PutUpdateAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PutUpdateAccountRequest_descriptor,
        new java.lang.String[] { "Username", "Email", "PhoneNumber", "Role", "IsActive", });
    internal_static_PutUpdateAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_PutUpdateAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PutUpdateAccountResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_DeleteAccountRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_DeleteAccountRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteAccountRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_DeleteAccountResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_DeleteAccountResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DeleteAccountResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_GetAccountInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_GetAccountInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAccountInfoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_GetAccountInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GetAccountInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetAccountInfoResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Id", "Username", "Email", "PhoneNumber", "Role", "IsActive", });
    internal_static_PostRegisterRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_PostRegisterRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRegisterRequest_descriptor,
        new java.lang.String[] { "Username", "Password", "Email", "PhoneNumber", "Role", });
    internal_static_PostRegisterResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_PostRegisterResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRegisterResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_PostLoginRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_PostLoginRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLoginRequest_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_PostLoginResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_PostLoginResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLoginResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "AccessToken", "RefreshToken", "TokenType", "ExpiresIn", });
    internal_static_PostLogoutRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_PostLogoutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLogoutRequest_descriptor,
        new java.lang.String[] { "AccessToken", });
    internal_static_PostLogoutResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_PostLogoutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostLogoutResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_PostRefreshTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_PostRefreshTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRefreshTokenRequest_descriptor,
        new java.lang.String[] { "RefreshToken", });
    internal_static_PostRefreshTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_PostRefreshTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostRefreshTokenResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "AccessToken", "ExpiresIn", "TokenType", });
    internal_static_GetVerifyEmailRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_GetVerifyEmailRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetVerifyEmailRequest_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_GetVerifyEmailResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_GetVerifyEmailResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetVerifyEmailResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_PostVerifyTokenRequest_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_PostVerifyTokenRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostVerifyTokenRequest_descriptor,
        new java.lang.String[] { "Token", });
    internal_static_PostVerifyTokenResponse_descriptor =
      getDescriptor().getMessageTypes().get(19);
    internal_static_PostVerifyTokenResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PostVerifyTokenResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Id", "Role", });
    internal_static_GetBrandInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(20);
    internal_static_GetBrandInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBrandInfoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_GetBrandInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(21);
    internal_static_GetBrandInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetBrandInfoResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Id", "Name", "Field", "Address", "Gps", "IsEnable", });
    internal_static_GetPlayerInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(22);
    internal_static_GetPlayerInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerInfoRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_GetPlayerInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(23);
    internal_static_GetPlayerInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetPlayerInfoResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Id", "Name", "Avatar", "BirthDate", "Gender", "Facebook", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
