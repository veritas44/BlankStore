/*
 * Copyright (c) 2014 μg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Query.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Label.REPEATED;

public final class QuerySuggestionResponseProto extends Message {

  public static final List<SuggestionProto> DEFAULT_SUGGESTION = Collections.emptyList();
  public static final Integer DEFAULT_ESTIMATEDNUMAPPSUGGESTIONS = 0;
  public static final Integer DEFAULT_ESTIMATEDNUMQUERYSUGGESTIONS = 0;

  @ProtoField(tag = 1, label = REPEATED)
  public final List<SuggestionProto> suggestion;

  @ProtoField(tag = 4, type = INT32)
  public final Integer estimatedNumAppSuggestions;

  @ProtoField(tag = 5, type = INT32)
  public final Integer estimatedNumQuerySuggestions;

  public QuerySuggestionResponseProto(List<SuggestionProto> suggestion, Integer estimatedNumAppSuggestions, Integer estimatedNumQuerySuggestions) {
    this.suggestion = immutableCopyOf(suggestion);
    this.estimatedNumAppSuggestions = estimatedNumAppSuggestions;
    this.estimatedNumQuerySuggestions = estimatedNumQuerySuggestions;
  }

  private QuerySuggestionResponseProto(Builder builder) {
    this(builder.suggestion, builder.estimatedNumAppSuggestions, builder.estimatedNumQuerySuggestions);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof QuerySuggestionResponseProto)) return false;
    QuerySuggestionResponseProto o = (QuerySuggestionResponseProto) other;
    return equals(suggestion, o.suggestion)
        && equals(estimatedNumAppSuggestions, o.estimatedNumAppSuggestions)
        && equals(estimatedNumQuerySuggestions, o.estimatedNumQuerySuggestions);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = suggestion != null ? suggestion.hashCode() : 1;
      result = result * 37 + (estimatedNumAppSuggestions != null ? estimatedNumAppSuggestions.hashCode() : 0);
      result = result * 37 + (estimatedNumQuerySuggestions != null ? estimatedNumQuerySuggestions.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<QuerySuggestionResponseProto> {

    public List<SuggestionProto> suggestion;
    public Integer estimatedNumAppSuggestions;
    public Integer estimatedNumQuerySuggestions;

    public Builder() {
    }

    public Builder(QuerySuggestionResponseProto message) {
      super(message);
      if (message == null) return;
      this.suggestion = copyOf(message.suggestion);
      this.estimatedNumAppSuggestions = message.estimatedNumAppSuggestions;
      this.estimatedNumQuerySuggestions = message.estimatedNumQuerySuggestions;
    }

    public Builder suggestion(List<SuggestionProto> suggestion) {
      this.suggestion = checkForNulls(suggestion);
      return this;
    }

    public Builder estimatedNumAppSuggestions(Integer estimatedNumAppSuggestions) {
      this.estimatedNumAppSuggestions = estimatedNumAppSuggestions;
      return this;
    }

    public Builder estimatedNumQuerySuggestions(Integer estimatedNumQuerySuggestions) {
      this.estimatedNumQuerySuggestions = estimatedNumQuerySuggestions;
      return this;
    }

    @Override
    public QuerySuggestionResponseProto build() {
      return new QuerySuggestionResponseProto(this);
    }
  }
}