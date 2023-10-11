/*
Copyright 2022 Google LLC

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.example.makeitso.model.service

import com.example.makeitso.model.Profile
import com.example.makeitso.model.Task
import kotlinx.coroutines.flow.Flow

interface StorageService {
  val tasks: Flow<List<Task>>
  val profile: Flow<List<Profile>>
  suspend fun getTask(taskId: String): Task?
  suspend fun save(task: Task): String
  suspend fun update(task: Task)
  suspend fun delete(taskId: String)
  suspend fun addProfile(profile: Profile)
  //suspend fun getProfile(profileId: String): Profile?
}