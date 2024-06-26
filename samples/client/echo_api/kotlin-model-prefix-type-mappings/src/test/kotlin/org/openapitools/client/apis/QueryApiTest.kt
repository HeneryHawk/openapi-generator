/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.apis

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.apis.QueryApi
import org.openapitools.client.models.ApiPet
import org.openapitools.client.models.ApiStringEnumRef
import org.openapitools.client.models.ApiTestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter

class QueryApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of QueryApi
        //val apiInstance = QueryApi()

        // to test testEnumRefString
        should("test testEnumRefString") {
            // uncomment below to test testEnumRefString
            //val enumNonrefStringQuery : kotlin.String = enumNonrefStringQuery_example // kotlin.String | 
            //val enumRefStringQuery : ApiStringEnumRef =  // ApiStringEnumRef | 
            //val result : kotlin.String = apiInstance.testEnumRefString(enumNonrefStringQuery, enumRefStringQuery)
            //result shouldBe ("TODO")
        }

        // to test testQueryDatetimeDateString
        should("test testQueryDatetimeDateString") {
            // uncomment below to test testQueryDatetimeDateString
            //val datetimeQuery : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
            //val dateQuery : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
            //val stringQuery : kotlin.String = stringQuery_example // kotlin.String | 
            //val result : kotlin.String = apiInstance.testQueryDatetimeDateString(datetimeQuery, dateQuery, stringQuery)
            //result shouldBe ("TODO")
        }

        // to test testQueryIntegerBooleanString
        should("test testQueryIntegerBooleanString") {
            // uncomment below to test testQueryIntegerBooleanString
            //val integerQuery : kotlin.Int = 56 // kotlin.Int | 
            //val booleanQuery : kotlin.Boolean = true // kotlin.Boolean | 
            //val stringQuery : kotlin.String = stringQuery_example // kotlin.String | 
            //val result : kotlin.String = apiInstance.testQueryIntegerBooleanString(integerQuery, booleanQuery, stringQuery)
            //result shouldBe ("TODO")
        }

        // to test testQueryStyleDeepObjectExplodeTrueObject
        should("test testQueryStyleDeepObjectExplodeTrueObject") {
            // uncomment below to test testQueryStyleDeepObjectExplodeTrueObject
            //val queryObject : ApiPet =  // ApiPet | 
            //val result : kotlin.String = apiInstance.testQueryStyleDeepObjectExplodeTrueObject(queryObject)
            //result shouldBe ("TODO")
        }

        // to test testQueryStyleFormExplodeTrueArrayString
        should("test testQueryStyleFormExplodeTrueArrayString") {
            // uncomment below to test testQueryStyleFormExplodeTrueArrayString
            //val queryObject : ApiTestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter =  // ApiTestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter | 
            //val result : kotlin.String = apiInstance.testQueryStyleFormExplodeTrueArrayString(queryObject)
            //result shouldBe ("TODO")
        }

        // to test testQueryStyleFormExplodeTrueObject
        should("test testQueryStyleFormExplodeTrueObject") {
            // uncomment below to test testQueryStyleFormExplodeTrueObject
            //val queryObject : ApiPet =  // ApiPet | 
            //val result : kotlin.String = apiInstance.testQueryStyleFormExplodeTrueObject(queryObject)
            //result shouldBe ("TODO")
        }

    }
}
