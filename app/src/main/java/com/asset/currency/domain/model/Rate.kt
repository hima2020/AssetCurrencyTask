package com.asset.currency.domain.model

import android.os.Parcel
import android.os.Parcelable

data class RateDataModel(
    val AED: Double?,
    val AFN: Double?,
    val ALL: Double?,
    val AMD: Double?,
    val ANG: Double?,
    val AOA: Double?,
    val ARS: Double?,
    val AUD: Double?,
    val AWG: Double?,
    val AZN: Double?,
    val BAM: Double?,
    val BBD: Double?,
    val BDT: Double?,
    val BGN: Double?,
    val BHD: Double?,
    val BIF: Double?,
    val BMD: Double?,
    val BND: Double?,
    val BOB: Double?,
    val BRL: Double?,
    val BSD: Double?,
    val BTC: Double?,
    val BTN: Double?,
    val BWP: Double?,
    val BYN: Double?,
    val BYR: Double?,
    val BZD: Double?,
    val CAD: Double?,
    val CDF: Double?,
    val CHF: Double?,
    val CLF: Double?,
    val CLP: Double?,
    val CNY: Double?,
    val COP: Double?,
    val CRC: Double?,
    val CUC: Double?,
    val CUP: Double?,
    val CVE: Double?,
    val CZK: Double?,
    val DJF: Double?,
    val DKK: Double?,
    val DOP: Double?,
    val DZD: Double?,
    val EGP: Double?,
    val ERN: Double?,
    val ETB: Double?,
    val EUR: Int?,
    val FJD: Double?,
    val FKP: Double?,
    val GBP: Double?,
    val GEL: Double?,
    val GGP: Double?,
    val GHS: Double?,
    val GIP: Double?,
    val GMD: Double?,
    val GNF: Double?,
    val GTQ: Double?,
    val GYD: Double?,
    val HKD: Double?,
    val HNL: Double?,
    val HRK: Double?,
    val HTG: Double?,
    val HUF: Double?,
    val IDR: Double?,
    val ILS: Double?,
    val IMP: Double?,
    val INR: Double?,
    val IQD: Double?,
    val IRR: Double?,
    val ISK: Double?,
    val JEP: Double?,
    val JMD: Double?,
    val JOD: Double?,
    val JPY: Double?,
    val KES: Double?,
    val KGS: Double?,
    val KHR: Double?,
    val KMF: Double?,
    val KPW: Double?,
    val KRW: Double?,
    val KWD: Double?,
    val KYD: Double?,
    val KZT: Double?,
    val LAK: Double?,
    val LBP: Double?,
    val LKR: Double?,
    val LRD: Double?,
    val LSL: Double?,
    val LTL: Double?,
    val LVL: Double?,
    val LYD: Double?,
    val MAD: Double?,
    val MDL: Double?,
    val MGA: Double?,
    val MKD: Double?,
    val MMK: Double?,
    val MNT: Double?,
    val MOP: Double?,
    val MRO: Double?,
    val MUR: Double?,
    val MVR: Double?,
    val MWK: Double?,
    val MXN: Double?,
    val MYR: Double?,
    val MZN: Double?,
    val NAD: Double?,
    val NGN: Double?,
    val NIO: Double?,
    val NOK: Double?,
    val NPR: Double?,
    val NZD: Double?,
    val OMR: Double?,
    val PAB: Double?,
    val PEN: Double?,
    val PGK: Double?,
    val PHP: Double?,
    val PKR: Double?,
    val PLN: Double?,
    val PYG: Double?,
    val QAR: Double?,
    val RON: Double?,
    val RSD: Double?,
    val RUB: Double?,
    val RWF: Double?,
    val SAR: Double?,
    val SBD: Double?,
    val SCR: Double?,
    val SDG: Double?,
    val SEK: Double?,
    val SGD: Double?,
    val SHP: Double?,
    val SLL: Double?,
    val SOS: Double?,
    val SRD: Double?,
    val STD: Double?,
    val SVC: Double?,
    val SYP: Double?,
    val SZL: Double?,
    val THB: Double?,
    val TJS: Double?,
    val TMT: Double?,
    val TND: Double?,
    val TOP: Double?,
    val TRY: Double?,
    val TTD: Double?,
    val TWD: Double?,
    val TZS: Double?,
    val UAH: Double?,
    val UGX: Double?,
    val USD: Double?,
    val UYU: Double?,
    val UZS: Double?,
    val VEF: Double?,
    val VND: Double?,
    val VUV: Double?,
    val WST: Double?,
    val XAF: Double?,
    val XAG: Double?,
    val XAU: Double?,
    val XCD: Double?,
    val XDR: Double?,
    val XOF: Double?,
    val XPF: Double?,
    val YER: Double?,
    val ZAR: Double?,
    val ZMK: Double?,
    val ZMW: Double?,
    val ZWL: Double?
):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double,
        parcel.readValue(Double::class.java.classLoader) as? Double
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(AED)
        parcel.writeValue(AFN)
        parcel.writeValue(ALL)
        parcel.writeValue(AMD)
        parcel.writeValue(ANG)
        parcel.writeValue(AOA)
        parcel.writeValue(ARS)
        parcel.writeValue(AUD)
        parcel.writeValue(AWG)
        parcel.writeValue(AZN)
        parcel.writeValue(BAM)
        parcel.writeValue(BBD)
        parcel.writeValue(BDT)
        parcel.writeValue(BGN)
        parcel.writeValue(BHD)
        parcel.writeValue(BIF)
        parcel.writeValue(BMD)
        parcel.writeValue(BND)
        parcel.writeValue(BOB)
        parcel.writeValue(BRL)
        parcel.writeValue(BSD)
        parcel.writeValue(BTC)
        parcel.writeValue(BTN)
        parcel.writeValue(BWP)
        parcel.writeValue(BYN)
        parcel.writeValue(BYR)
        parcel.writeValue(BZD)
        parcel.writeValue(CAD)
        parcel.writeValue(CDF)
        parcel.writeValue(CHF)
        parcel.writeValue(CLF)
        parcel.writeValue(CLP)
        parcel.writeValue(CNY)
        parcel.writeValue(COP)
        parcel.writeValue(CRC)
        parcel.writeValue(CUC)
        parcel.writeValue(CUP)
        parcel.writeValue(CVE)
        parcel.writeValue(CZK)
        parcel.writeValue(DJF)
        parcel.writeValue(DKK)
        parcel.writeValue(DOP)
        parcel.writeValue(DZD)
        parcel.writeValue(EGP)
        parcel.writeValue(ERN)
        parcel.writeValue(ETB)
        parcel.writeValue(EUR)
        parcel.writeValue(FJD)
        parcel.writeValue(FKP)
        parcel.writeValue(GBP)
        parcel.writeValue(GEL)
        parcel.writeValue(GGP)
        parcel.writeValue(GHS)
        parcel.writeValue(GIP)
        parcel.writeValue(GMD)
        parcel.writeValue(GNF)
        parcel.writeValue(GTQ)
        parcel.writeValue(GYD)
        parcel.writeValue(HKD)
        parcel.writeValue(HNL)
        parcel.writeValue(HRK)
        parcel.writeValue(HTG)
        parcel.writeValue(HUF)
        parcel.writeValue(IDR)
        parcel.writeValue(ILS)
        parcel.writeValue(IMP)
        parcel.writeValue(INR)
        parcel.writeValue(IQD)
        parcel.writeValue(IRR)
        parcel.writeValue(ISK)
        parcel.writeValue(JEP)
        parcel.writeValue(JMD)
        parcel.writeValue(JOD)
        parcel.writeValue(JPY)
        parcel.writeValue(KES)
        parcel.writeValue(KGS)
        parcel.writeValue(KHR)
        parcel.writeValue(KMF)
        parcel.writeValue(KPW)
        parcel.writeValue(KRW)
        parcel.writeValue(KWD)
        parcel.writeValue(KYD)
        parcel.writeValue(KZT)
        parcel.writeValue(LAK)
        parcel.writeValue(LBP)
        parcel.writeValue(LKR)
        parcel.writeValue(LRD)
        parcel.writeValue(LSL)
        parcel.writeValue(LTL)
        parcel.writeValue(LVL)
        parcel.writeValue(LYD)
        parcel.writeValue(MAD)
        parcel.writeValue(MDL)
        parcel.writeValue(MGA)
        parcel.writeValue(MKD)
        parcel.writeValue(MMK)
        parcel.writeValue(MNT)
        parcel.writeValue(MOP)
        parcel.writeValue(MRO)
        parcel.writeValue(MUR)
        parcel.writeValue(MVR)
        parcel.writeValue(MWK)
        parcel.writeValue(MXN)
        parcel.writeValue(MYR)
        parcel.writeValue(MZN)
        parcel.writeValue(NAD)
        parcel.writeValue(NGN)
        parcel.writeValue(NIO)
        parcel.writeValue(NOK)
        parcel.writeValue(NPR)
        parcel.writeValue(NZD)
        parcel.writeValue(OMR)
        parcel.writeValue(PAB)
        parcel.writeValue(PEN)
        parcel.writeValue(PGK)
        parcel.writeValue(PHP)
        parcel.writeValue(PKR)
        parcel.writeValue(PLN)
        parcel.writeValue(PYG)
        parcel.writeValue(QAR)
        parcel.writeValue(RON)
        parcel.writeValue(RSD)
        parcel.writeValue(RUB)
        parcel.writeValue(RWF)
        parcel.writeValue(SAR)
        parcel.writeValue(SBD)
        parcel.writeValue(SCR)
        parcel.writeValue(SDG)
        parcel.writeValue(SEK)
        parcel.writeValue(SGD)
        parcel.writeValue(SHP)
        parcel.writeValue(SLL)
        parcel.writeValue(SOS)
        parcel.writeValue(SRD)
        parcel.writeValue(STD)
        parcel.writeValue(SVC)
        parcel.writeValue(SYP)
        parcel.writeValue(SZL)
        parcel.writeValue(THB)
        parcel.writeValue(TJS)
        parcel.writeValue(TMT)
        parcel.writeValue(TND)
        parcel.writeValue(TOP)
        parcel.writeValue(TRY)
        parcel.writeValue(TTD)
        parcel.writeValue(TWD)
        parcel.writeValue(TZS)
        parcel.writeValue(UAH)
        parcel.writeValue(UGX)
        parcel.writeValue(USD)
        parcel.writeValue(UYU)
        parcel.writeValue(UZS)
        parcel.writeValue(VEF)
        parcel.writeValue(VND)
        parcel.writeValue(VUV)
        parcel.writeValue(WST)
        parcel.writeValue(XAF)
        parcel.writeValue(XAG)
        parcel.writeValue(XAU)
        parcel.writeValue(XCD)
        parcel.writeValue(XDR)
        parcel.writeValue(XOF)
        parcel.writeValue(XPF)
        parcel.writeValue(YER)
        parcel.writeValue(ZAR)
        parcel.writeValue(ZMK)
        parcel.writeValue(ZMW)
        parcel.writeValue(ZWL)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<RateDataModel> {
        override fun createFromParcel(parcel: Parcel): RateDataModel {
            return RateDataModel(parcel)
        }

        override fun newArray(size: Int): Array<RateDataModel?> {
            return arrayOfNulls(size)
        }
    }
}