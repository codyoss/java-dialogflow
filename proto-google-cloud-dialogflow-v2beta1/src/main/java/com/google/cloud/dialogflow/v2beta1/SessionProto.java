/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/session.proto

package com.google.cloud.dialogflow.v2beta1;

public final class SessionProto {
  private SessionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_WebhookHeadersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_WebhookHeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_QueryInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_QueryResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_QueryResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_TextInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TextInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_EventInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_EventInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Sentiment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Sentiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/dialogflow/v2beta1/sessio"
          + "n.proto\022\037google.cloud.dialogflow.v2beta1"
          + "\032\034google/api/annotations.proto\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\032+google/cloud/dialogflow/v2be"
          + "ta1/agent.proto\0322google/cloud/dialogflow"
          + "/v2beta1/audio_config.proto\032-google/clou"
          + "d/dialogflow/v2beta1/context.proto\032,goog"
          + "le/cloud/dialogflow/v2beta1/intent.proto"
          + "\0329google/cloud/dialogflow/v2beta1/sessio"
          + "n_entity_type.proto\032\036google/protobuf/dur"
          + "ation.proto\032\034google/protobuf/struct.prot"
          + "o\032\027google/rpc/status.proto\032\030google/type/"
          + "latlng.proto\032\027google/api/client.proto\"\276\002"
          + "\n\023DetectIntentRequest\0227\n\007session\030\001 \001(\tB&"
          + "\372A#\n!dialogflow.googleapis.com/Session\022F"
          + "\n\014query_params\030\002 \001(\01320.google.cloud.dial"
          + "ogflow.v2beta1.QueryParameters\022@\n\013query_"
          + "input\030\003 \001(\0132+.google.cloud.dialogflow.v2"
          + "beta1.QueryInput\022O\n\023output_audio_config\030"
          + "\004 \001(\01322.google.cloud.dialogflow.v2beta1."
          + "OutputAudioConfig\022\023\n\013input_audio\030\005 \001(\014\"\323"
          + "\002\n\024DetectIntentResponse\022\023\n\013response_id\030\001"
          + " \001(\t\022B\n\014query_result\030\002 \001(\0132,.google.clou"
          + "d.dialogflow.v2beta1.QueryResult\022O\n\031alte"
          + "rnative_query_results\030\005 \003(\0132,.google.clo"
          + "ud.dialogflow.v2beta1.QueryResult\022*\n\016web"
          + "hook_status\030\003 \001(\0132\022.google.rpc.Status\022\024\n"
          + "\014output_audio\030\004 \001(\014\022O\n\023output_audio_conf"
          + "ig\030\006 \001(\01322.google.cloud.dialogflow.v2bet"
          + "a1.OutputAudioConfig\"\277\004\n\017QueryParameters"
          + "\022\021\n\ttime_zone\030\001 \001(\t\022)\n\014geo_location\030\002 \001("
          + "\0132\023.google.type.LatLng\022:\n\010contexts\030\003 \003(\013"
          + "2(.google.cloud.dialogflow.v2beta1.Conte"
          + "xt\022\026\n\016reset_contexts\030\004 \001(\010\022P\n\024session_en"
          + "tity_types\030\005 \003(\01322.google.cloud.dialogfl"
          + "ow.v2beta1.SessionEntityType\022(\n\007payload\030"
          + "\006 \001(\0132\027.google.protobuf.Struct\022\034\n\024knowle"
          + "dge_base_names\030\014 \003(\t\022j\n!sentiment_analys"
          + "is_request_config\030\n \001(\0132?.google.cloud.d"
          + "ialogflow.v2beta1.SentimentAnalysisReque"
          + "stConfig\022]\n\017webhook_headers\030\016 \003(\0132D.goog"
          + "le.cloud.dialogflow.v2beta1.QueryParamet"
          + "ers.WebhookHeadersEntry\0325\n\023WebhookHeader"
          + "sEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\332"
          + "\001\n\nQueryInput\022I\n\014audio_config\030\001 \001(\01321.go"
          + "ogle.cloud.dialogflow.v2beta1.InputAudio"
          + "ConfigH\000\022:\n\004text\030\002 \001(\0132*.google.cloud.di"
          + "alogflow.v2beta1.TextInputH\000\022<\n\005event\030\003 "
          + "\001(\0132+.google.cloud.dialogflow.v2beta1.Ev"
          + "entInputH\000B\007\n\005input\"\362\005\n\013QueryResult\022\022\n\nq"
          + "uery_text\030\001 \001(\t\022\025\n\rlanguage_code\030\017 \001(\t\022%"
          + "\n\035speech_recognition_confidence\030\002 \001(\002\022\016\n"
          + "\006action\030\003 \001(\t\022+\n\nparameters\030\004 \001(\0132\027.goog"
          + "le.protobuf.Struct\022#\n\033all_required_param"
          + "s_present\030\005 \001(\010\022\030\n\020fulfillment_text\030\006 \001("
          + "\t\022M\n\024fulfillment_messages\030\007 \003(\0132/.google"
          + ".cloud.dialogflow.v2beta1.Intent.Message"
          + "\022\026\n\016webhook_source\030\010 \001(\t\0220\n\017webhook_payl"
          + "oad\030\t \001(\0132\027.google.protobuf.Struct\022A\n\017ou"
          + "tput_contexts\030\n \003(\0132(.google.cloud.dialo"
          + "gflow.v2beta1.Context\0227\n\006intent\030\013 \001(\0132\'."
          + "google.cloud.dialogflow.v2beta1.Intent\022#"
          + "\n\033intent_detection_confidence\030\014 \001(\002\0220\n\017d"
          + "iagnostic_info\030\016 \001(\0132\027.google.protobuf.S"
          + "truct\022[\n\031sentiment_analysis_result\030\021 \001(\013"
          + "28.google.cloud.dialogflow.v2beta1.Senti"
          + "mentAnalysisResult\022L\n\021knowledge_answers\030"
          + "\022 \001(\01321.google.cloud.dialogflow.v2beta1."
          + "KnowledgeAnswers\"\257\003\n\020KnowledgeAnswers\022I\n"
          + "\007answers\030\001 \003(\01328.google.cloud.dialogflow"
          + ".v2beta1.KnowledgeAnswers.Answer\032\317\002\n\006Ans"
          + "wer\0227\n\006source\030\001 \001(\tB\'\372A$\n\"dialogflow.goo"
          + "gleapis.com/Document\022\024\n\014faq_question\030\002 \001"
          + "(\t\022\016\n\006answer\030\003 \001(\t\022m\n\026match_confidence_l"
          + "evel\030\004 \001(\0162M.google.cloud.dialogflow.v2b"
          + "eta1.KnowledgeAnswers.Answer.MatchConfid"
          + "enceLevel\022\030\n\020match_confidence\030\005 \001(\002\"]\n\024M"
          + "atchConfidenceLevel\022&\n\"MATCH_CONFIDENCE_"
          + "LEVEL_UNSPECIFIED\020\000\022\007\n\003LOW\020\001\022\n\n\006MEDIUM\020\002"
          + "\022\010\n\004HIGH\020\003\"\271\002\n\034StreamingDetectIntentRequ"
          + "est\022\017\n\007session\030\001 \001(\t\022F\n\014query_params\030\002 \001"
          + "(\01320.google.cloud.dialogflow.v2beta1.Que"
          + "ryParameters\022@\n\013query_input\030\003 \001(\0132+.goog"
          + "le.cloud.dialogflow.v2beta1.QueryInput\022\030"
          + "\n\020single_utterance\030\004 \001(\010\022O\n\023output_audio"
          + "_config\030\005 \001(\01322.google.cloud.dialogflow."
          + "v2beta1.OutputAudioConfig\022\023\n\013input_audio"
          + "\030\006 \001(\014\"\265\003\n\035StreamingDetectIntentResponse"
          + "\022\023\n\013response_id\030\001 \001(\t\022W\n\022recognition_res"
          + "ult\030\002 \001(\0132;.google.cloud.dialogflow.v2be"
          + "ta1.StreamingRecognitionResult\022B\n\014query_"
          + "result\030\003 \001(\0132,.google.cloud.dialogflow.v"
          + "2beta1.QueryResult\022O\n\031alternative_query_"
          + "results\030\007 \003(\0132,.google.cloud.dialogflow."
          + "v2beta1.QueryResult\022*\n\016webhook_status\030\004 "
          + "\001(\0132\022.google.rpc.Status\022\024\n\014output_audio\030"
          + "\005 \001(\014\022O\n\023output_audio_config\030\006 \001(\01322.goo"
          + "gle.cloud.dialogflow.v2beta1.OutputAudio"
          + "Config\"\243\003\n\032StreamingRecognitionResult\022]\n"
          + "\014message_type\030\001 \001(\0162G.google.cloud.dialo"
          + "gflow.v2beta1.StreamingRecognitionResult"
          + ".MessageType\022\022\n\ntranscript\030\002 \001(\t\022\020\n\010is_f"
          + "inal\030\003 \001(\010\022\022\n\nconfidence\030\004 \001(\002\022\021\n\tstabil"
          + "ity\030\006 \001(\002\022I\n\020speech_word_info\030\007 \003(\0132/.go"
          + "ogle.cloud.dialogflow.v2beta1.SpeechWord"
          + "Info\0224\n\021speech_end_offset\030\010 \001(\0132\031.google"
          + ".protobuf.Duration\"X\n\013MessageType\022\034\n\030MES"
          + "SAGE_TYPE_UNSPECIFIED\020\000\022\016\n\nTRANSCRIPT\020\001\022"
          + "\033\n\027END_OF_SINGLE_UTTERANCE\020\002\"0\n\tTextInpu"
          + "t\022\014\n\004text\030\001 \001(\t\022\025\n\rlanguage_code\030\002 \001(\t\"^"
          + "\n\nEventInput\022\014\n\004name\030\001 \001(\t\022+\n\nparameters"
          + "\030\002 \001(\0132\027.google.protobuf.Struct\022\025\n\rlangu"
          + "age_code\030\003 \001(\t\"F\n\036SentimentAnalysisReque"
          + "stConfig\022$\n\034analyze_query_text_sentiment"
          + "\030\001 \001(\010\"c\n\027SentimentAnalysisResult\022H\n\024que"
          + "ry_text_sentiment\030\001 \001(\0132*.google.cloud.d"
          + "ialogflow.v2beta1.Sentiment\"-\n\tSentiment"
          + "\022\r\n\005score\030\001 \001(\002\022\021\n\tmagnitude\030\002 \001(\0022\367\005\n\010S"
          + "essions\022\321\003\n\014DetectIntent\0224.google.cloud."
          + "dialogflow.v2beta1.DetectIntentRequest\0325"
          + ".google.cloud.dialogflow.v2beta1.DetectI"
          + "ntentResponse\"\323\002\202\323\344\223\002\314\002\";/v2beta1/{sessi"
          + "on=projects/*/agent/sessions/*}:detectIn"
          + "tent:\001*ZW\"R/v2beta1/{session=projects/*/"
          + "agent/environments/*/users/*/sessions/*}"
          + ":detectIntent:\001*ZL\"G/v2beta1/{session=pr"
          + "ojects/*/locations/*/agent/sessions/*}:d"
          + "etectIntent:\001*Zc\"^/v2beta1/{session=proj"
          + "ects/*/locations/*/agent/environments/*/"
          + "users/*/sessions/*}:detectIntent:\001*\022\234\001\n\025"
          + "StreamingDetectIntent\022=.google.cloud.dia"
          + "logflow.v2beta1.StreamingDetectIntentReq"
          + "uest\032>.google.cloud.dialogflow.v2beta1.S"
          + "treamingDetectIntentResponse\"\000(\0010\001\032x\312A\031d"
          + "ialogflow.googleapis.com\322AYhttps://www.g"
          + "oogleapis.com/auth/cloud-platform,https:"
          + "//www.googleapis.com/auth/dialogflowB\252\001\n"
          + "#com.google.cloud.dialogflow.v2beta1B\014Se"
          + "ssionProtoP\001ZIgoogle.golang.org/genproto"
          + "/googleapis/cloud/dialogflow/v2beta1;dia"
          + "logflow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflo"
          + "w.V2beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.AgentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.AudioConfigProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DetectIntentRequest_descriptor,
            new java.lang.String[] {
              "Session", "QueryParams", "QueryInput", "OutputAudioConfig", "InputAudio",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DetectIntentResponse_descriptor,
            new java.lang.String[] {
              "ResponseId",
              "QueryResult",
              "AlternativeQueryResults",
              "WebhookStatus",
              "OutputAudio",
              "OutputAudioConfig",
            });
    internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor,
            new java.lang.String[] {
              "TimeZone",
              "GeoLocation",
              "Contexts",
              "ResetContexts",
              "SessionEntityTypes",
              "Payload",
              "KnowledgeBaseNames",
              "SentimentAnalysisRequestConfig",
              "WebhookHeaders",
            });
    internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_WebhookHeadersEntry_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_WebhookHeadersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_QueryParameters_WebhookHeadersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_dialogflow_v2beta1_QueryInput_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_QueryInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_QueryInput_descriptor,
            new java.lang.String[] {
              "AudioConfig", "Text", "Event", "Input",
            });
    internal_static_google_cloud_dialogflow_v2beta1_QueryResult_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_QueryResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_QueryResult_descriptor,
            new java.lang.String[] {
              "QueryText",
              "LanguageCode",
              "SpeechRecognitionConfidence",
              "Action",
              "Parameters",
              "AllRequiredParamsPresent",
              "FulfillmentText",
              "FulfillmentMessages",
              "WebhookSource",
              "WebhookPayload",
              "OutputContexts",
              "Intent",
              "IntentDetectionConfidence",
              "DiagnosticInfo",
              "SentimentAnalysisResult",
              "KnowledgeAnswers",
            });
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_descriptor,
            new java.lang.String[] {
              "Answers",
            });
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_descriptor =
        internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_KnowledgeAnswers_Answer_descriptor,
            new java.lang.String[] {
              "Source", "FaqQuestion", "Answer", "MatchConfidenceLevel", "MatchConfidence",
            });
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentRequest_descriptor,
            new java.lang.String[] {
              "Session",
              "QueryParams",
              "QueryInput",
              "SingleUtterance",
              "OutputAudioConfig",
              "InputAudio",
            });
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_StreamingDetectIntentResponse_descriptor,
            new java.lang.String[] {
              "ResponseId",
              "RecognitionResult",
              "QueryResult",
              "AlternativeQueryResults",
              "WebhookStatus",
              "OutputAudio",
              "OutputAudioConfig",
            });
    internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_StreamingRecognitionResult_descriptor,
            new java.lang.String[] {
              "MessageType",
              "Transcript",
              "IsFinal",
              "Confidence",
              "Stability",
              "SpeechWordInfo",
              "SpeechEndOffset",
            });
    internal_static_google_cloud_dialogflow_v2beta1_TextInput_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_v2beta1_TextInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_TextInput_descriptor,
            new java.lang.String[] {
              "Text", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_EventInput_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_v2beta1_EventInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_EventInput_descriptor,
            new java.lang.String[] {
              "Name", "Parameters", "LanguageCode",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisRequestConfig_descriptor,
            new java.lang.String[] {
              "AnalyzeQueryTextSentiment",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SentimentAnalysisResult_descriptor,
            new java.lang.String[] {
              "QueryTextSentiment",
            });
    internal_static_google_cloud_dialogflow_v2beta1_Sentiment_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_dialogflow_v2beta1_Sentiment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Sentiment_descriptor,
            new java.lang.String[] {
              "Score", "Magnitude",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.AgentProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.AudioConfigProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.ContextProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.IntentProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.SessionEntityTypeProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
