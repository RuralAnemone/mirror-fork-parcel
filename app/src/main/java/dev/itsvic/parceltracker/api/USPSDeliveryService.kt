package dev.itsvic.parceltracker.api

import android.os.LocaleList
import android.text.Html
import android.util.Log
import com.squareup.moshi.JsonClass
import dev.itsvic.parceltracker.R
import dev.itsvic.parceltracker.misc.defaultRegionsForLanguageCode
import kotlinx.coroutines.ExperimentalCoroutinesApi
import okhttp3.Request
import okhttp3.coroutines.executeAsync
import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

object USPSDeliveryService : DeliveryService {
    override val nameResource: Int = R.string.service_usps
    override val acceptsPostCode: Boolean = false
    override val requiresPostCode: Boolean = false

    override suspend fun getParcel(trackingId: String, postCode: String?): Parcel {
        /*return Parcel(
            trackingId,
            history,
            status,
            metadata
        )*/
    }
}
