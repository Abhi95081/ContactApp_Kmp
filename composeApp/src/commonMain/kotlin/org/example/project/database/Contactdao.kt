package org.example.project.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

@Dao
interface Contactdao {

//    @Update
//    suspend fun Update(contact : Contact)
//
//    @Insert
//    suspend fun insert(contact: Contact)

//    merge them both

    @Upsert
    suspend fun upsert(contact: Contact)

    @Delete
    suspend fun delete(contact: Contact)

    @Query("SELECT * FROM contact_table")
    fun getAllContact(): Flow<List<Contact>>

}