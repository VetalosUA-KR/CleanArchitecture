package com.vitalii.cleanarchitecturedagger.data.repository

import com.vitalii.cleanarchitecturedagger.data.datasource.ExampleLocalDataSource
import com.vitalii.cleanarchitecturedagger.data.datasource.ExampleRemoteDataSource
import com.vitalii.cleanarchitecturedagger.data.mapper.ExampleMapper
import com.vitalii.cleanarchitecturedagger.di.ProdQualifier
import com.vitalii.cleanarchitecturedagger.di.TestQualifier
import com.vitalii.cleanarchitecturedagger.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ProdQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
): ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}