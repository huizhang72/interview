package(default_visibility = ["//visibility:public"])

java_proto_library(
    name = "candidate_java_proto",
    deps = [":candidate_proto"],
)

java_proto_library(
    name = "round_java_proto",
    deps = [":round_proto"],
)

cc_proto_library(
    name = "candidate_cc_proto",
    deps = [":candidate_proto"],
)

cc_proto_library(
    name = "round_cc_proto",
    deps = [":round_proto"],
)

proto_library(
    name = "round_proto",
    srcs = ["round.proto"],
)

proto_library(
    name = "candidate_proto",
    srcs = ["candidate.proto"],
)
