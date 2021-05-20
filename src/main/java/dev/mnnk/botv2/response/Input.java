
package dev.mnnk.botv2.response;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "btcinr",
    "xrpinr",
    "ethinr",
    "trxinr",
    "eosinr",
    "zilinr",
    "batinr",
    "zrxinr",
    "omginr",
    "iostinr",
    "dentinr",
    "hotinr",
    "usdtinr",
    "wrxinr",
    "maticinr",
    "bchinr",
    "bnbinr",
    "bttinr",
    "chzinr",
    "oneinr",
    "yfiinr",
    "uniinr",
    "linkinr",
    "sxpinr",
    "adainr",
    "nanoinr",
    "atominr",
    "xlminr",
    "fetinr",
    "xeminr",
    "zecinr",
    "busdinr",
    "yfiiinr",
    "dogeinr",
    "dotinr",
    "vetinr",
    "crvinr",
    "reninr",
    "enjinr",
    "manainr",
    "hbarinr",
    "umainr",
    "chrinr",
    "paxginr",
    "1inchinr",
    "etcinr",
    "uftinr",
    "dockinr",
    "filinr",
    "wininr",
    "tkoinr",
    "pushinr",
    "avaxinr",
    "lunainr",
    "xvginr",
    "scinr",
    "fttinr",
    "dgbinr",
    "cvcinr",
    "cakeinr",
    "ezinr",
    "bzrxinr",
    "ftminr",
    "hntinr",
    "arkinr",
    "ctsiinr",
    "kmdinr",
    "solinr",
    "cotiinr",
    "iotxinr",
    "shibinr",
    "ltcinr",
    "dashinr",
    "xrpbtc",
    "trxbtc",
    "ethbtc",
    "zilbtc",
    "batbtc",
    "ltcbtc",
    "qkcbtc",
    "dashbtc",
    "funbtc",
    "iostbtc",
    "nulsbtc",
    "omgbtc",
    "reqbtc",
    "sntbtc",
    "thetabtc",
    "zrxbtc",
    "eosbtc",
    "icxbtc",
    "polybtc",
    "paxbtc",
    "usdcbtc",
    "xlmbtc",
    "fetbtc",
    "celrbtc",
    "maticbtc",
    "adabtc",
    "rvnbtc",
    "xmrbtc",
    "atombtc",
    "bnbbtc",
    "wrxbtc",
    "fttbtc",
    "stmxbtc",
    "glmbtc",
    "btcusdt",
    "trxusdt",
    "xrpusdt",
    "eosusdt",
    "ethusdt",
    "icxusdt",
    "ltcusdt",
    "tusdusdt",
    "hotusdt",
    "batusdt",
    "dashusdt",
    "ncashusdt",
    "qkcusdt",
    "zilusdt",
    "zrxusdt",
    "bchusdt",
    "bchsvusdt",
    "paxusdt",
    "usdcusdt",
    "omgusdt",
    "polyusdt",
    "dentusdt",
    "iostusdt",
    "funusdt",
    "sntusdt",
    "thetausdt",
    "requsdt",
    "xlmusdt",
    "xtzusdt",
    "bttusdt",
    "fetusdt",
    "tfuelusdt",
    "celrusdt",
    "maticusdt",
    "adausdt",
    "rvnusdt",
    "xmrusdt",
    "atomusdt",
    "algousdt",
    "linkusdt",
    "qtumusdt",
    "etcusdt",
    "iotausdt",
    "zecusdt",
    "wavesusdt",
    "ftmusdt",
    "enjusdt",
    "lskusdt",
    "steemusdt",
    "xvgusdt",
    "loomusdt",
    "manausdt",
    "repusdt",
    "blzusdt",
    "nanousdt",
    "scusdt",
    "btgusdt",
    "xemusdt",
    "btsusdt",
    "ardrusdt",
    "nasusdt",
    "winusdt",
    "bnbusdt",
    "chzusdt",
    "wrxusdt",
    "kavausdt",
    "ankrusdt",
    "busdusdt",
    "oneusdt",
    "ognusdt",
    "hiveusdt",
    "fttusdt",
    "bandusdt",
    "jstusdt",
    "ctsiusdt",
    "chrusdt",
    "tomousdt",
    "stxusdt",
    "stmxusdt",
    "gxsusdt",
    "mdtusdt",
    "ltousdt",
    "lrcusdt",
    "dogeusdt",
    "neousdt",
    "hbarusdt",
    "storjusdt",
    "compusdt",
    "cotiusdt",
    "dgbusdt",
    "grsusdt",
    "snxusdt",
    "renusdt",
    "sxpusdt",
    "mkrusdt",
    "daiusdt",
    "avausdt",
    "balusdt",
    "srmusdt",
    "egldusdt",
    "cosusdt",
    "nbsusdt",
    "aionusdt",
    "dotusdt",
    "yfiusdt",
    "iotxusdt",
    "sandusdt",
    "uniusdt",
    "datausdt",
    "paxgusdt",
    "creamusdt",
    "swrvusdt",
    "umausdt",
    "diausdt",
    "ksmusdt",
    "yfiiusdt",
    "bzrxusdt",
    "trbusdt",
    "adxusdt",
    "aaveusdt",
    "filusdt",
    "crvusdt",
    "nearusdt",
    "hntusdt",
    "avaxusdt",
    "oxtusdt",
    "dockusdt",
    "duskusdt",
    "wtcusdt",
    "perlusdt",
    "straxusdt",
    "injusdt",
    "vetusdt",
    "mtlusdt",
    "frontusdt",
    "glmusdt",
    "sushiusdt",
    "firousdt",
    "dexeusdt",
    "grtusdt",
    "bchausdt",
    "bntusdt",
    "rsrusdt",
    "1inchusdt",
    "lunausdt",
    "uftusdt",
    "pundixusdt",
    "ckbusdt",
    "vibusdt",
    "gtousdt",
    "tkousdt",
    "pushusdt",
    "cvcusdt",
    "cakeusdt",
    "ezusdt",
    "arkusdt",
    "kmdusdt",
    "solusdt",
    "shibusdt",
    "ethwrx",
    "xrpwrx",
    "yfiwrx",
    "bnbwrx",
    "trxwrx",
    "eoswrx",
    "ltcwrx",
    "linkwrx",
    "enjwrx",
    "dogewrx",
    "maticwrx",
    "adawrx",
    "batwrx"
})
@Generated("jsonschema2pojo")
public class Input {

    @JsonProperty("btcinr")
    private Btcinr btcinr;
    @JsonProperty("xrpinr")
    private Xrpinr xrpinr;
    @JsonProperty("ethinr")
    private Ethinr ethinr;
    @JsonProperty("trxinr")
    private Trxinr trxinr;
    @JsonProperty("eosinr")
    private Eosinr eosinr;
    @JsonProperty("zilinr")
    private Zilinr zilinr;
    @JsonProperty("batinr")
    private Batinr batinr;
    @JsonProperty("zrxinr")
    private Zrxinr zrxinr;
    @JsonProperty("omginr")
    private Omginr omginr;
    @JsonProperty("iostinr")
    private Iostinr iostinr;
    @JsonProperty("dentinr")
    private Dentinr dentinr;
    @JsonProperty("hotinr")
    private Hotinr hotinr;
    @JsonProperty("usdtinr")
    private Usdtinr usdtinr;
    @JsonProperty("wrxinr")
    private Wrxinr wrxinr;
    @JsonProperty("maticinr")
    private Maticinr maticinr;
    @JsonProperty("bchinr")
    private Bchinr bchinr;
    @JsonProperty("bnbinr")
    private Bnbinr bnbinr;
    @JsonProperty("bttinr")
    private Bttinr bttinr;
    @JsonProperty("chzinr")
    private Chzinr chzinr;
    @JsonProperty("oneinr")
    private Oneinr oneinr;
    @JsonProperty("yfiinr")
    private Yfiinr yfiinr;
    @JsonProperty("uniinr")
    private Uniinr uniinr;
    @JsonProperty("linkinr")
    private Linkinr linkinr;
    @JsonProperty("sxpinr")
    private Sxpinr sxpinr;
    @JsonProperty("adainr")
    private Adainr adainr;
    @JsonProperty("nanoinr")
    private Nanoinr nanoinr;
    @JsonProperty("atominr")
    private Atominr atominr;
    @JsonProperty("xlminr")
    private Xlminr xlminr;
    @JsonProperty("fetinr")
    private Fetinr fetinr;
    @JsonProperty("xeminr")
    private Xeminr xeminr;
    @JsonProperty("zecinr")
    private Zecinr zecinr;
    @JsonProperty("busdinr")
    private Busdinr busdinr;
    @JsonProperty("yfiiinr")
    private Yfiiinr yfiiinr;
    @JsonProperty("dogeinr")
    private Dogeinr dogeinr;
    @JsonProperty("dotinr")
    private Dotinr dotinr;
    @JsonProperty("vetinr")
    private Vetinr vetinr;
    @JsonProperty("crvinr")
    private Crvinr crvinr;
    @JsonProperty("reninr")
    private Reninr reninr;
    @JsonProperty("enjinr")
    private Enjinr enjinr;
    @JsonProperty("manainr")
    private Manainr manainr;
    @JsonProperty("hbarinr")
    private Hbarinr hbarinr;
    @JsonProperty("umainr")
    private Umainr umainr;
    @JsonProperty("chrinr")
    private Chrinr chrinr;
    @JsonProperty("paxginr")
    private Paxginr paxginr;
    @JsonProperty("1inchinr")
    private dev.mnnk.botv2.response._1inchinr _1inchinr;
    @JsonProperty("etcinr")
    private Etcinr etcinr;
    @JsonProperty("uftinr")
    private Uftinr uftinr;
    @JsonProperty("dockinr")
    private Dockinr dockinr;
    @JsonProperty("filinr")
    private Filinr filinr;
    @JsonProperty("wininr")
    private Wininr wininr;
    @JsonProperty("tkoinr")
    private Tkoinr tkoinr;
    @JsonProperty("pushinr")
    private Pushinr pushinr;
    @JsonProperty("avaxinr")
    private Avaxinr avaxinr;
    @JsonProperty("lunainr")
    private Lunainr lunainr;
    @JsonProperty("xvginr")
    private Xvginr xvginr;
    @JsonProperty("scinr")
    private Scinr scinr;
    @JsonProperty("fttinr")
    private Fttinr fttinr;
    @JsonProperty("dgbinr")
    private Dgbinr dgbinr;
    @JsonProperty("cvcinr")
    private Cvcinr cvcinr;
    @JsonProperty("cakeinr")
    private Cakeinr cakeinr;
    @JsonProperty("ezinr")
    private Ezinr ezinr;
    @JsonProperty("bzrxinr")
    private Bzrxinr bzrxinr;
    @JsonProperty("ftminr")
    private Ftminr ftminr;
    @JsonProperty("hntinr")
    private Hntinr hntinr;
    @JsonProperty("arkinr")
    private Arkinr arkinr;
    @JsonProperty("ctsiinr")
    private Ctsiinr ctsiinr;
    @JsonProperty("kmdinr")
    private Kmdinr kmdinr;
    @JsonProperty("solinr")
    private Solinr solinr;
    @JsonProperty("cotiinr")
    private Cotiinr cotiinr;
    @JsonProperty("iotxinr")
    private Iotxinr iotxinr;
    @JsonProperty("shibinr")
    private Shibinr shibinr;
    @JsonProperty("ltcinr")
    private Ltcinr ltcinr;
    @JsonProperty("dashinr")
    private Dashinr dashinr;
    @JsonProperty("xrpbtc")
    private Xrpbtc xrpbtc;
    @JsonProperty("trxbtc")
    private Trxbtc trxbtc;
    @JsonProperty("ethbtc")
    private Ethbtc ethbtc;
    @JsonProperty("zilbtc")
    private Zilbtc zilbtc;
    @JsonProperty("batbtc")
    private Batbtc batbtc;
    @JsonProperty("ltcbtc")
    private Ltcbtc ltcbtc;
    @JsonProperty("qkcbtc")
    private Qkcbtc qkcbtc;
    @JsonProperty("dashbtc")
    private Dashbtc dashbtc;
    @JsonProperty("funbtc")
    private Funbtc funbtc;
    @JsonProperty("iostbtc")
    private Iostbtc iostbtc;
    @JsonProperty("nulsbtc")
    private Nulsbtc nulsbtc;
    @JsonProperty("omgbtc")
    private Omgbtc omgbtc;
    @JsonProperty("reqbtc")
    private Reqbtc reqbtc;
    @JsonProperty("sntbtc")
    private Sntbtc sntbtc;
    @JsonProperty("thetabtc")
    private Thetabtc thetabtc;
    @JsonProperty("zrxbtc")
    private Zrxbtc zrxbtc;
    @JsonProperty("eosbtc")
    private Eosbtc eosbtc;
    @JsonProperty("icxbtc")
    private Icxbtc icxbtc;
    @JsonProperty("polybtc")
    private Polybtc polybtc;
    @JsonProperty("paxbtc")
    private Paxbtc paxbtc;
    @JsonProperty("usdcbtc")
    private Usdcbtc usdcbtc;
    @JsonProperty("xlmbtc")
    private Xlmbtc xlmbtc;
    @JsonProperty("fetbtc")
    private Fetbtc fetbtc;
    @JsonProperty("celrbtc")
    private Celrbtc celrbtc;
    @JsonProperty("maticbtc")
    private Maticbtc maticbtc;
    @JsonProperty("adabtc")
    private Adabtc adabtc;
    @JsonProperty("rvnbtc")
    private Rvnbtc rvnbtc;
    @JsonProperty("xmrbtc")
    private Xmrbtc xmrbtc;
    @JsonProperty("atombtc")
    private Atombtc atombtc;
    @JsonProperty("bnbbtc")
    private Bnbbtc bnbbtc;
    @JsonProperty("wrxbtc")
    private Wrxbtc wrxbtc;
    @JsonProperty("fttbtc")
    private Fttbtc fttbtc;
    @JsonProperty("stmxbtc")
    private Stmxbtc stmxbtc;
    @JsonProperty("glmbtc")
    private Glmbtc glmbtc;
    @JsonProperty("btcusdt")
    private Btcusdt btcusdt;
    @JsonProperty("trxusdt")
    private Trxusdt trxusdt;
    @JsonProperty("xrpusdt")
    private Xrpusdt xrpusdt;
    @JsonProperty("eosusdt")
    private Eosusdt eosusdt;
    @JsonProperty("ethusdt")
    private Ethusdt ethusdt;
    @JsonProperty("icxusdt")
    private Icxusdt icxusdt;
    @JsonProperty("ltcusdt")
    private Ltcusdt ltcusdt;
    @JsonProperty("tusdusdt")
    private Tusdusdt tusdusdt;
    @JsonProperty("hotusdt")
    private Hotusdt hotusdt;
    @JsonProperty("batusdt")
    private Batusdt batusdt;
    @JsonProperty("dashusdt")
    private Dashusdt dashusdt;
    @JsonProperty("ncashusdt")
    private Ncashusdt ncashusdt;
    @JsonProperty("qkcusdt")
    private Qkcusdt qkcusdt;
    @JsonProperty("zilusdt")
    private Zilusdt zilusdt;
    @JsonProperty("zrxusdt")
    private Zrxusdt zrxusdt;
    @JsonProperty("bchusdt")
    private Bchusdt bchusdt;
    @JsonProperty("bchsvusdt")
    private Bchsvusdt bchsvusdt;
    @JsonProperty("paxusdt")
    private Paxusdt paxusdt;
    @JsonProperty("usdcusdt")
    private Usdcusdt usdcusdt;
    @JsonProperty("omgusdt")
    private Omgusdt omgusdt;
    @JsonProperty("polyusdt")
    private Polyusdt polyusdt;
    @JsonProperty("dentusdt")
    private Dentusdt dentusdt;
    @JsonProperty("iostusdt")
    private Iostusdt iostusdt;
    @JsonProperty("funusdt")
    private Funusdt funusdt;
    @JsonProperty("sntusdt")
    private Sntusdt sntusdt;
    @JsonProperty("thetausdt")
    private Thetausdt thetausdt;
    @JsonProperty("requsdt")
    private Requsdt requsdt;
    @JsonProperty("xlmusdt")
    private Xlmusdt xlmusdt;
    @JsonProperty("xtzusdt")
    private Xtzusdt xtzusdt;
    @JsonProperty("bttusdt")
    private Bttusdt bttusdt;
    @JsonProperty("fetusdt")
    private Fetusdt fetusdt;
    @JsonProperty("tfuelusdt")
    private Tfuelusdt tfuelusdt;
    @JsonProperty("celrusdt")
    private Celrusdt celrusdt;
    @JsonProperty("maticusdt")
    private Maticusdt maticusdt;
    @JsonProperty("adausdt")
    private Adausdt adausdt;
    @JsonProperty("rvnusdt")
    private Rvnusdt rvnusdt;
    @JsonProperty("xmrusdt")
    private Xmrusdt xmrusdt;
    @JsonProperty("atomusdt")
    private Atomusdt atomusdt;
    @JsonProperty("algousdt")
    private Algousdt algousdt;
    @JsonProperty("linkusdt")
    private Linkusdt linkusdt;
    @JsonProperty("qtumusdt")
    private Qtumusdt qtumusdt;
    @JsonProperty("etcusdt")
    private Etcusdt etcusdt;
    @JsonProperty("iotausdt")
    private Iotausdt iotausdt;
    @JsonProperty("zecusdt")
    private Zecusdt zecusdt;
    @JsonProperty("wavesusdt")
    private Wavesusdt wavesusdt;
    @JsonProperty("ftmusdt")
    private Ftmusdt ftmusdt;
    @JsonProperty("enjusdt")
    private Enjusdt enjusdt;
    @JsonProperty("lskusdt")
    private Lskusdt lskusdt;
    @JsonProperty("steemusdt")
    private Steemusdt steemusdt;
    @JsonProperty("xvgusdt")
    private Xvgusdt xvgusdt;
    @JsonProperty("loomusdt")
    private Loomusdt loomusdt;
    @JsonProperty("manausdt")
    private Manausdt manausdt;
    @JsonProperty("repusdt")
    private Repusdt repusdt;
    @JsonProperty("blzusdt")
    private Blzusdt blzusdt;
    @JsonProperty("nanousdt")
    private Nanousdt nanousdt;
    @JsonProperty("scusdt")
    private Scusdt scusdt;
    @JsonProperty("btgusdt")
    private Btgusdt btgusdt;
    @JsonProperty("xemusdt")
    private Xemusdt xemusdt;
    @JsonProperty("btsusdt")
    private Btsusdt btsusdt;
    @JsonProperty("ardrusdt")
    private Ardrusdt ardrusdt;
    @JsonProperty("nasusdt")
    private Nasusdt nasusdt;
    @JsonProperty("winusdt")
    private Winusdt winusdt;
    @JsonProperty("bnbusdt")
    private Bnbusdt bnbusdt;
    @JsonProperty("chzusdt")
    private Chzusdt chzusdt;
    @JsonProperty("wrxusdt")
    private Wrxusdt wrxusdt;
    @JsonProperty("kavausdt")
    private Kavausdt kavausdt;
    @JsonProperty("ankrusdt")
    private Ankrusdt ankrusdt;
    @JsonProperty("busdusdt")
    private Busdusdt busdusdt;
    @JsonProperty("oneusdt")
    private Oneusdt oneusdt;
    @JsonProperty("ognusdt")
    private Ognusdt ognusdt;
    @JsonProperty("hiveusdt")
    private Hiveusdt hiveusdt;
    @JsonProperty("fttusdt")
    private Fttusdt fttusdt;
    @JsonProperty("bandusdt")
    private Bandusdt bandusdt;
    @JsonProperty("jstusdt")
    private Jstusdt jstusdt;
    @JsonProperty("ctsiusdt")
    private Ctsiusdt ctsiusdt;
    @JsonProperty("chrusdt")
    private Chrusdt chrusdt;
    @JsonProperty("tomousdt")
    private Tomousdt tomousdt;
    @JsonProperty("stxusdt")
    private Stxusdt stxusdt;
    @JsonProperty("stmxusdt")
    private Stmxusdt stmxusdt;
    @JsonProperty("gxsusdt")
    private Gxsusdt gxsusdt;
    @JsonProperty("mdtusdt")
    private Mdtusdt mdtusdt;
    @JsonProperty("ltousdt")
    private Ltousdt ltousdt;
    @JsonProperty("lrcusdt")
    private Lrcusdt lrcusdt;
    @JsonProperty("dogeusdt")
    private Dogeusdt dogeusdt;
    @JsonProperty("neousdt")
    private Neousdt neousdt;
    @JsonProperty("hbarusdt")
    private Hbarusdt hbarusdt;
    @JsonProperty("storjusdt")
    private Storjusdt storjusdt;
    @JsonProperty("compusdt")
    private Compusdt compusdt;
    @JsonProperty("cotiusdt")
    private Cotiusdt cotiusdt;
    @JsonProperty("dgbusdt")
    private Dgbusdt dgbusdt;
    @JsonProperty("grsusdt")
    private Grsusdt grsusdt;
    @JsonProperty("snxusdt")
    private Snxusdt snxusdt;
    @JsonProperty("renusdt")
    private Renusdt renusdt;
    @JsonProperty("sxpusdt")
    private Sxpusdt sxpusdt;
    @JsonProperty("mkrusdt")
    private Mkrusdt mkrusdt;
    @JsonProperty("daiusdt")
    private Daiusdt daiusdt;
    @JsonProperty("avausdt")
    private Avausdt avausdt;
    @JsonProperty("balusdt")
    private Balusdt balusdt;
    @JsonProperty("srmusdt")
    private Srmusdt srmusdt;
    @JsonProperty("egldusdt")
    private Egldusdt egldusdt;
    @JsonProperty("cosusdt")
    private Cosusdt cosusdt;
    @JsonProperty("nbsusdt")
    private Nbsusdt nbsusdt;
    @JsonProperty("aionusdt")
    private Aionusdt aionusdt;
    @JsonProperty("dotusdt")
    private Dotusdt dotusdt;
    @JsonProperty("yfiusdt")
    private Yfiusdt yfiusdt;
    @JsonProperty("iotxusdt")
    private Iotxusdt iotxusdt;
    @JsonProperty("sandusdt")
    private Sandusdt sandusdt;
    @JsonProperty("uniusdt")
    private Uniusdt uniusdt;
    @JsonProperty("datausdt")
    private Datausdt datausdt;
    @JsonProperty("paxgusdt")
    private Paxgusdt paxgusdt;
    @JsonProperty("creamusdt")
    private Creamusdt creamusdt;
    @JsonProperty("swrvusdt")
    private Swrvusdt swrvusdt;
    @JsonProperty("umausdt")
    private Umausdt umausdt;
    @JsonProperty("diausdt")
    private Diausdt diausdt;
    @JsonProperty("ksmusdt")
    private Ksmusdt ksmusdt;
    @JsonProperty("yfiiusdt")
    private Yfiiusdt yfiiusdt;
    @JsonProperty("bzrxusdt")
    private Bzrxusdt bzrxusdt;
    @JsonProperty("trbusdt")
    private Trbusdt trbusdt;
    @JsonProperty("adxusdt")
    private Adxusdt adxusdt;
    @JsonProperty("aaveusdt")
    private Aaveusdt aaveusdt;
    @JsonProperty("filusdt")
    private Filusdt filusdt;
    @JsonProperty("crvusdt")
    private Crvusdt crvusdt;
    @JsonProperty("nearusdt")
    private Nearusdt nearusdt;
    @JsonProperty("hntusdt")
    private Hntusdt hntusdt;
    @JsonProperty("avaxusdt")
    private Avaxusdt avaxusdt;
    @JsonProperty("oxtusdt")
    private Oxtusdt oxtusdt;
    @JsonProperty("dockusdt")
    private Dockusdt dockusdt;
    @JsonProperty("duskusdt")
    private Duskusdt duskusdt;
    @JsonProperty("wtcusdt")
    private Wtcusdt wtcusdt;
    @JsonProperty("perlusdt")
    private Perlusdt perlusdt;
    @JsonProperty("straxusdt")
    private Straxusdt straxusdt;
    @JsonProperty("injusdt")
    private Injusdt injusdt;
    @JsonProperty("vetusdt")
    private Vetusdt vetusdt;
    @JsonProperty("mtlusdt")
    private Mtlusdt mtlusdt;
    @JsonProperty("frontusdt")
    private Frontusdt frontusdt;
    @JsonProperty("glmusdt")
    private Glmusdt glmusdt;
    @JsonProperty("sushiusdt")
    private Sushiusdt sushiusdt;
    @JsonProperty("firousdt")
    private Firousdt firousdt;
    @JsonProperty("dexeusdt")
    private Dexeusdt dexeusdt;
    @JsonProperty("grtusdt")
    private Grtusdt grtusdt;
    @JsonProperty("bchausdt")
    private Bchausdt bchausdt;
    @JsonProperty("bntusdt")
    private Bntusdt bntusdt;
    @JsonProperty("rsrusdt")
    private Rsrusdt rsrusdt;
    @JsonProperty("1inchusdt")
    private dev.mnnk.botv2.response._1inchusdt _1inchusdt;
    @JsonProperty("lunausdt")
    private Lunausdt lunausdt;
    @JsonProperty("uftusdt")
    private Uftusdt uftusdt;
    @JsonProperty("pundixusdt")
    private Pundixusdt pundixusdt;
    @JsonProperty("ckbusdt")
    private Ckbusdt ckbusdt;
    @JsonProperty("vibusdt")
    private Vibusdt vibusdt;
    @JsonProperty("gtousdt")
    private Gtousdt gtousdt;
    @JsonProperty("tkousdt")
    private Tkousdt tkousdt;
    @JsonProperty("pushusdt")
    private Pushusdt pushusdt;
    @JsonProperty("cvcusdt")
    private Cvcusdt cvcusdt;
    @JsonProperty("cakeusdt")
    private Cakeusdt cakeusdt;
    @JsonProperty("ezusdt")
    private Ezusdt ezusdt;
    @JsonProperty("arkusdt")
    private Arkusdt arkusdt;
    @JsonProperty("kmdusdt")
    private Kmdusdt kmdusdt;
    @JsonProperty("solusdt")
    private Solusdt solusdt;
    @JsonProperty("shibusdt")
    private Shibusdt shibusdt;
    @JsonProperty("ethwrx")
    private Ethwrx ethwrx;
    @JsonProperty("xrpwrx")
    private Xrpwrx xrpwrx;
    @JsonProperty("yfiwrx")
    private Yfiwrx yfiwrx;
    @JsonProperty("bnbwrx")
    private Bnbwrx bnbwrx;
    @JsonProperty("trxwrx")
    private Trxwrx trxwrx;
    @JsonProperty("eoswrx")
    private Eoswrx eoswrx;
    @JsonProperty("ltcwrx")
    private Ltcwrx ltcwrx;
    @JsonProperty("linkwrx")
    private Linkwrx linkwrx;
    @JsonProperty("enjwrx")
    private Enjwrx enjwrx;
    @JsonProperty("dogewrx")
    private Dogewrx dogewrx;
    @JsonProperty("maticwrx")
    private Maticwrx maticwrx;
    @JsonProperty("adawrx")
    private Adawrx adawrx;
    @JsonProperty("batwrx")
    private Batwrx batwrx;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("btcinr")
    public Btcinr getBtcinr() {
        return btcinr;
    }

    @JsonProperty("btcinr")
    public void setBtcinr(Btcinr btcinr) {
        this.btcinr = btcinr;
    }

    public Input withBtcinr(Btcinr btcinr) {
        this.btcinr = btcinr;
        return this;
    }

    @JsonProperty("xrpinr")
    public Xrpinr getXrpinr() {
        return xrpinr;
    }

    @JsonProperty("xrpinr")
    public void setXrpinr(Xrpinr xrpinr) {
        this.xrpinr = xrpinr;
    }

    public Input withXrpinr(Xrpinr xrpinr) {
        this.xrpinr = xrpinr;
        return this;
    }

    @JsonProperty("ethinr")
    public Ethinr getEthinr() {
        return ethinr;
    }

    @JsonProperty("ethinr")
    public void setEthinr(Ethinr ethinr) {
        this.ethinr = ethinr;
    }

    public Input withEthinr(Ethinr ethinr) {
        this.ethinr = ethinr;
        return this;
    }

    @JsonProperty("trxinr")
    public Trxinr getTrxinr() {
        return trxinr;
    }

    @JsonProperty("trxinr")
    public void setTrxinr(Trxinr trxinr) {
        this.trxinr = trxinr;
    }

    public Input withTrxinr(Trxinr trxinr) {
        this.trxinr = trxinr;
        return this;
    }

    @JsonProperty("eosinr")
    public Eosinr getEosinr() {
        return eosinr;
    }

    @JsonProperty("eosinr")
    public void setEosinr(Eosinr eosinr) {
        this.eosinr = eosinr;
    }

    public Input withEosinr(Eosinr eosinr) {
        this.eosinr = eosinr;
        return this;
    }

    @JsonProperty("zilinr")
    public Zilinr getZilinr() {
        return zilinr;
    }

    @JsonProperty("zilinr")
    public void setZilinr(Zilinr zilinr) {
        this.zilinr = zilinr;
    }

    public Input withZilinr(Zilinr zilinr) {
        this.zilinr = zilinr;
        return this;
    }

    @JsonProperty("batinr")
    public Batinr getBatinr() {
        return batinr;
    }

    @JsonProperty("batinr")
    public void setBatinr(Batinr batinr) {
        this.batinr = batinr;
    }

    public Input withBatinr(Batinr batinr) {
        this.batinr = batinr;
        return this;
    }

    @JsonProperty("zrxinr")
    public Zrxinr getZrxinr() {
        return zrxinr;
    }

    @JsonProperty("zrxinr")
    public void setZrxinr(Zrxinr zrxinr) {
        this.zrxinr = zrxinr;
    }

    public Input withZrxinr(Zrxinr zrxinr) {
        this.zrxinr = zrxinr;
        return this;
    }

    @JsonProperty("omginr")
    public Omginr getOmginr() {
        return omginr;
    }

    @JsonProperty("omginr")
    public void setOmginr(Omginr omginr) {
        this.omginr = omginr;
    }

    public Input withOmginr(Omginr omginr) {
        this.omginr = omginr;
        return this;
    }

    @JsonProperty("iostinr")
    public Iostinr getIostinr() {
        return iostinr;
    }

    @JsonProperty("iostinr")
    public void setIostinr(Iostinr iostinr) {
        this.iostinr = iostinr;
    }

    public Input withIostinr(Iostinr iostinr) {
        this.iostinr = iostinr;
        return this;
    }

    @JsonProperty("dentinr")
    public Dentinr getDentinr() {
        return dentinr;
    }

    @JsonProperty("dentinr")
    public void setDentinr(Dentinr dentinr) {
        this.dentinr = dentinr;
    }

    public Input withDentinr(Dentinr dentinr) {
        this.dentinr = dentinr;
        return this;
    }

    @JsonProperty("hotinr")
    public Hotinr getHotinr() {
        return hotinr;
    }

    @JsonProperty("hotinr")
    public void setHotinr(Hotinr hotinr) {
        this.hotinr = hotinr;
    }

    public Input withHotinr(Hotinr hotinr) {
        this.hotinr = hotinr;
        return this;
    }

    @JsonProperty("usdtinr")
    public Usdtinr getUsdtinr() {
        return usdtinr;
    }

    @JsonProperty("usdtinr")
    public void setUsdtinr(Usdtinr usdtinr) {
        this.usdtinr = usdtinr;
    }

    public Input withUsdtinr(Usdtinr usdtinr) {
        this.usdtinr = usdtinr;
        return this;
    }

    @JsonProperty("wrxinr")
    public Wrxinr getWrxinr() {
        return wrxinr;
    }

    @JsonProperty("wrxinr")
    public void setWrxinr(Wrxinr wrxinr) {
        this.wrxinr = wrxinr;
    }

    public Input withWrxinr(Wrxinr wrxinr) {
        this.wrxinr = wrxinr;
        return this;
    }

    @JsonProperty("maticinr")
    public Maticinr getMaticinr() {
        return maticinr;
    }

    @JsonProperty("maticinr")
    public void setMaticinr(Maticinr maticinr) {
        this.maticinr = maticinr;
    }

    public Input withMaticinr(Maticinr maticinr) {
        this.maticinr = maticinr;
        return this;
    }

    @JsonProperty("bchinr")
    public Bchinr getBchinr() {
        return bchinr;
    }

    @JsonProperty("bchinr")
    public void setBchinr(Bchinr bchinr) {
        this.bchinr = bchinr;
    }

    public Input withBchinr(Bchinr bchinr) {
        this.bchinr = bchinr;
        return this;
    }

    @JsonProperty("bnbinr")
    public Bnbinr getBnbinr() {
        return bnbinr;
    }

    @JsonProperty("bnbinr")
    public void setBnbinr(Bnbinr bnbinr) {
        this.bnbinr = bnbinr;
    }

    public Input withBnbinr(Bnbinr bnbinr) {
        this.bnbinr = bnbinr;
        return this;
    }

    @JsonProperty("bttinr")
    public Bttinr getBttinr() {
        return bttinr;
    }

    @JsonProperty("bttinr")
    public void setBttinr(Bttinr bttinr) {
        this.bttinr = bttinr;
    }

    public Input withBttinr(Bttinr bttinr) {
        this.bttinr = bttinr;
        return this;
    }

    @JsonProperty("chzinr")
    public Chzinr getChzinr() {
        return chzinr;
    }

    @JsonProperty("chzinr")
    public void setChzinr(Chzinr chzinr) {
        this.chzinr = chzinr;
    }

    public Input withChzinr(Chzinr chzinr) {
        this.chzinr = chzinr;
        return this;
    }

    @JsonProperty("oneinr")
    public Oneinr getOneinr() {
        return oneinr;
    }

    @JsonProperty("oneinr")
    public void setOneinr(Oneinr oneinr) {
        this.oneinr = oneinr;
    }

    public Input withOneinr(Oneinr oneinr) {
        this.oneinr = oneinr;
        return this;
    }

    @JsonProperty("yfiinr")
    public Yfiinr getYfiinr() {
        return yfiinr;
    }

    @JsonProperty("yfiinr")
    public void setYfiinr(Yfiinr yfiinr) {
        this.yfiinr = yfiinr;
    }

    public Input withYfiinr(Yfiinr yfiinr) {
        this.yfiinr = yfiinr;
        return this;
    }

    @JsonProperty("uniinr")
    public Uniinr getUniinr() {
        return uniinr;
    }

    @JsonProperty("uniinr")
    public void setUniinr(Uniinr uniinr) {
        this.uniinr = uniinr;
    }

    public Input withUniinr(Uniinr uniinr) {
        this.uniinr = uniinr;
        return this;
    }

    @JsonProperty("linkinr")
    public Linkinr getLinkinr() {
        return linkinr;
    }

    @JsonProperty("linkinr")
    public void setLinkinr(Linkinr linkinr) {
        this.linkinr = linkinr;
    }

    public Input withLinkinr(Linkinr linkinr) {
        this.linkinr = linkinr;
        return this;
    }

    @JsonProperty("sxpinr")
    public Sxpinr getSxpinr() {
        return sxpinr;
    }

    @JsonProperty("sxpinr")
    public void setSxpinr(Sxpinr sxpinr) {
        this.sxpinr = sxpinr;
    }

    public Input withSxpinr(Sxpinr sxpinr) {
        this.sxpinr = sxpinr;
        return this;
    }

    @JsonProperty("adainr")
    public Adainr getAdainr() {
        return adainr;
    }

    @JsonProperty("adainr")
    public void setAdainr(Adainr adainr) {
        this.adainr = adainr;
    }

    public Input withAdainr(Adainr adainr) {
        this.adainr = adainr;
        return this;
    }

    @JsonProperty("nanoinr")
    public Nanoinr getNanoinr() {
        return nanoinr;
    }

    @JsonProperty("nanoinr")
    public void setNanoinr(Nanoinr nanoinr) {
        this.nanoinr = nanoinr;
    }

    public Input withNanoinr(Nanoinr nanoinr) {
        this.nanoinr = nanoinr;
        return this;
    }

    @JsonProperty("atominr")
    public Atominr getAtominr() {
        return atominr;
    }

    @JsonProperty("atominr")
    public void setAtominr(Atominr atominr) {
        this.atominr = atominr;
    }

    public Input withAtominr(Atominr atominr) {
        this.atominr = atominr;
        return this;
    }

    @JsonProperty("xlminr")
    public Xlminr getXlminr() {
        return xlminr;
    }

    @JsonProperty("xlminr")
    public void setXlminr(Xlminr xlminr) {
        this.xlminr = xlminr;
    }

    public Input withXlminr(Xlminr xlminr) {
        this.xlminr = xlminr;
        return this;
    }

    @JsonProperty("fetinr")
    public Fetinr getFetinr() {
        return fetinr;
    }

    @JsonProperty("fetinr")
    public void setFetinr(Fetinr fetinr) {
        this.fetinr = fetinr;
    }

    public Input withFetinr(Fetinr fetinr) {
        this.fetinr = fetinr;
        return this;
    }

    @JsonProperty("xeminr")
    public Xeminr getXeminr() {
        return xeminr;
    }

    @JsonProperty("xeminr")
    public void setXeminr(Xeminr xeminr) {
        this.xeminr = xeminr;
    }

    public Input withXeminr(Xeminr xeminr) {
        this.xeminr = xeminr;
        return this;
    }

    @JsonProperty("zecinr")
    public Zecinr getZecinr() {
        return zecinr;
    }

    @JsonProperty("zecinr")
    public void setZecinr(Zecinr zecinr) {
        this.zecinr = zecinr;
    }

    public Input withZecinr(Zecinr zecinr) {
        this.zecinr = zecinr;
        return this;
    }

    @JsonProperty("busdinr")
    public Busdinr getBusdinr() {
        return busdinr;
    }

    @JsonProperty("busdinr")
    public void setBusdinr(Busdinr busdinr) {
        this.busdinr = busdinr;
    }

    public Input withBusdinr(Busdinr busdinr) {
        this.busdinr = busdinr;
        return this;
    }

    @JsonProperty("yfiiinr")
    public Yfiiinr getYfiiinr() {
        return yfiiinr;
    }

    @JsonProperty("yfiiinr")
    public void setYfiiinr(Yfiiinr yfiiinr) {
        this.yfiiinr = yfiiinr;
    }

    public Input withYfiiinr(Yfiiinr yfiiinr) {
        this.yfiiinr = yfiiinr;
        return this;
    }

    @JsonProperty("dogeinr")
    public Dogeinr getDogeinr() {
        return dogeinr;
    }

    @JsonProperty("dogeinr")
    public void setDogeinr(Dogeinr dogeinr) {
        this.dogeinr = dogeinr;
    }

    public Input withDogeinr(Dogeinr dogeinr) {
        this.dogeinr = dogeinr;
        return this;
    }

    @JsonProperty("dotinr")
    public Dotinr getDotinr() {
        return dotinr;
    }

    @JsonProperty("dotinr")
    public void setDotinr(Dotinr dotinr) {
        this.dotinr = dotinr;
    }

    public Input withDotinr(Dotinr dotinr) {
        this.dotinr = dotinr;
        return this;
    }

    @JsonProperty("vetinr")
    public Vetinr getVetinr() {
        return vetinr;
    }

    @JsonProperty("vetinr")
    public void setVetinr(Vetinr vetinr) {
        this.vetinr = vetinr;
    }

    public Input withVetinr(Vetinr vetinr) {
        this.vetinr = vetinr;
        return this;
    }

    @JsonProperty("crvinr")
    public Crvinr getCrvinr() {
        return crvinr;
    }

    @JsonProperty("crvinr")
    public void setCrvinr(Crvinr crvinr) {
        this.crvinr = crvinr;
    }

    public Input withCrvinr(Crvinr crvinr) {
        this.crvinr = crvinr;
        return this;
    }

    @JsonProperty("reninr")
    public Reninr getReninr() {
        return reninr;
    }

    @JsonProperty("reninr")
    public void setReninr(Reninr reninr) {
        this.reninr = reninr;
    }

    public Input withReninr(Reninr reninr) {
        this.reninr = reninr;
        return this;
    }

    @JsonProperty("enjinr")
    public Enjinr getEnjinr() {
        return enjinr;
    }

    @JsonProperty("enjinr")
    public void setEnjinr(Enjinr enjinr) {
        this.enjinr = enjinr;
    }

    public Input withEnjinr(Enjinr enjinr) {
        this.enjinr = enjinr;
        return this;
    }

    @JsonProperty("manainr")
    public Manainr getManainr() {
        return manainr;
    }

    @JsonProperty("manainr")
    public void setManainr(Manainr manainr) {
        this.manainr = manainr;
    }

    public Input withManainr(Manainr manainr) {
        this.manainr = manainr;
        return this;
    }

    @JsonProperty("hbarinr")
    public Hbarinr getHbarinr() {
        return hbarinr;
    }

    @JsonProperty("hbarinr")
    public void setHbarinr(Hbarinr hbarinr) {
        this.hbarinr = hbarinr;
    }

    public Input withHbarinr(Hbarinr hbarinr) {
        this.hbarinr = hbarinr;
        return this;
    }

    @JsonProperty("umainr")
    public Umainr getUmainr() {
        return umainr;
    }

    @JsonProperty("umainr")
    public void setUmainr(Umainr umainr) {
        this.umainr = umainr;
    }

    public Input withUmainr(Umainr umainr) {
        this.umainr = umainr;
        return this;
    }

    @JsonProperty("chrinr")
    public Chrinr getChrinr() {
        return chrinr;
    }

    @JsonProperty("chrinr")
    public void setChrinr(Chrinr chrinr) {
        this.chrinr = chrinr;
    }

    public Input withChrinr(Chrinr chrinr) {
        this.chrinr = chrinr;
        return this;
    }

    @JsonProperty("paxginr")
    public Paxginr getPaxginr() {
        return paxginr;
    }

    @JsonProperty("paxginr")
    public void setPaxginr(Paxginr paxginr) {
        this.paxginr = paxginr;
    }

    public Input withPaxginr(Paxginr paxginr) {
        this.paxginr = paxginr;
        return this;
    }

    @JsonProperty("1inchinr")
    public dev.mnnk.botv2.response._1inchinr get1inchinr() {
        return _1inchinr;
    }

    @JsonProperty("1inchinr")
    public void set1inchinr(dev.mnnk.botv2.response._1inchinr _1inchinr) {
        this._1inchinr = _1inchinr;
    }

    public Input with1inchinr(dev.mnnk.botv2.response._1inchinr _1inchinr) {
        this._1inchinr = _1inchinr;
        return this;
    }

    @JsonProperty("etcinr")
    public Etcinr getEtcinr() {
        return etcinr;
    }

    @JsonProperty("etcinr")
    public void setEtcinr(Etcinr etcinr) {
        this.etcinr = etcinr;
    }

    public Input withEtcinr(Etcinr etcinr) {
        this.etcinr = etcinr;
        return this;
    }

    @JsonProperty("uftinr")
    public Uftinr getUftinr() {
        return uftinr;
    }

    @JsonProperty("uftinr")
    public void setUftinr(Uftinr uftinr) {
        this.uftinr = uftinr;
    }

    public Input withUftinr(Uftinr uftinr) {
        this.uftinr = uftinr;
        return this;
    }

    @JsonProperty("dockinr")
    public Dockinr getDockinr() {
        return dockinr;
    }

    @JsonProperty("dockinr")
    public void setDockinr(Dockinr dockinr) {
        this.dockinr = dockinr;
    }

    public Input withDockinr(Dockinr dockinr) {
        this.dockinr = dockinr;
        return this;
    }

    @JsonProperty("filinr")
    public Filinr getFilinr() {
        return filinr;
    }

    @JsonProperty("filinr")
    public void setFilinr(Filinr filinr) {
        this.filinr = filinr;
    }

    public Input withFilinr(Filinr filinr) {
        this.filinr = filinr;
        return this;
    }

    @JsonProperty("wininr")
    public Wininr getWininr() {
        return wininr;
    }

    @JsonProperty("wininr")
    public void setWininr(Wininr wininr) {
        this.wininr = wininr;
    }

    public Input withWininr(Wininr wininr) {
        this.wininr = wininr;
        return this;
    }

    @JsonProperty("tkoinr")
    public Tkoinr getTkoinr() {
        return tkoinr;
    }

    @JsonProperty("tkoinr")
    public void setTkoinr(Tkoinr tkoinr) {
        this.tkoinr = tkoinr;
    }

    public Input withTkoinr(Tkoinr tkoinr) {
        this.tkoinr = tkoinr;
        return this;
    }

    @JsonProperty("pushinr")
    public Pushinr getPushinr() {
        return pushinr;
    }

    @JsonProperty("pushinr")
    public void setPushinr(Pushinr pushinr) {
        this.pushinr = pushinr;
    }

    public Input withPushinr(Pushinr pushinr) {
        this.pushinr = pushinr;
        return this;
    }

    @JsonProperty("avaxinr")
    public Avaxinr getAvaxinr() {
        return avaxinr;
    }

    @JsonProperty("avaxinr")
    public void setAvaxinr(Avaxinr avaxinr) {
        this.avaxinr = avaxinr;
    }

    public Input withAvaxinr(Avaxinr avaxinr) {
        this.avaxinr = avaxinr;
        return this;
    }

    @JsonProperty("lunainr")
    public Lunainr getLunainr() {
        return lunainr;
    }

    @JsonProperty("lunainr")
    public void setLunainr(Lunainr lunainr) {
        this.lunainr = lunainr;
    }

    public Input withLunainr(Lunainr lunainr) {
        this.lunainr = lunainr;
        return this;
    }

    @JsonProperty("xvginr")
    public Xvginr getXvginr() {
        return xvginr;
    }

    @JsonProperty("xvginr")
    public void setXvginr(Xvginr xvginr) {
        this.xvginr = xvginr;
    }

    public Input withXvginr(Xvginr xvginr) {
        this.xvginr = xvginr;
        return this;
    }

    @JsonProperty("scinr")
    public Scinr getScinr() {
        return scinr;
    }

    @JsonProperty("scinr")
    public void setScinr(Scinr scinr) {
        this.scinr = scinr;
    }

    public Input withScinr(Scinr scinr) {
        this.scinr = scinr;
        return this;
    }

    @JsonProperty("fttinr")
    public Fttinr getFttinr() {
        return fttinr;
    }

    @JsonProperty("fttinr")
    public void setFttinr(Fttinr fttinr) {
        this.fttinr = fttinr;
    }

    public Input withFttinr(Fttinr fttinr) {
        this.fttinr = fttinr;
        return this;
    }

    @JsonProperty("dgbinr")
    public Dgbinr getDgbinr() {
        return dgbinr;
    }

    @JsonProperty("dgbinr")
    public void setDgbinr(Dgbinr dgbinr) {
        this.dgbinr = dgbinr;
    }

    public Input withDgbinr(Dgbinr dgbinr) {
        this.dgbinr = dgbinr;
        return this;
    }

    @JsonProperty("cvcinr")
    public Cvcinr getCvcinr() {
        return cvcinr;
    }

    @JsonProperty("cvcinr")
    public void setCvcinr(Cvcinr cvcinr) {
        this.cvcinr = cvcinr;
    }

    public Input withCvcinr(Cvcinr cvcinr) {
        this.cvcinr = cvcinr;
        return this;
    }

    @JsonProperty("cakeinr")
    public Cakeinr getCakeinr() {
        return cakeinr;
    }

    @JsonProperty("cakeinr")
    public void setCakeinr(Cakeinr cakeinr) {
        this.cakeinr = cakeinr;
    }

    public Input withCakeinr(Cakeinr cakeinr) {
        this.cakeinr = cakeinr;
        return this;
    }

    @JsonProperty("ezinr")
    public Ezinr getEzinr() {
        return ezinr;
    }

    @JsonProperty("ezinr")
    public void setEzinr(Ezinr ezinr) {
        this.ezinr = ezinr;
    }

    public Input withEzinr(Ezinr ezinr) {
        this.ezinr = ezinr;
        return this;
    }

    @JsonProperty("bzrxinr")
    public Bzrxinr getBzrxinr() {
        return bzrxinr;
    }

    @JsonProperty("bzrxinr")
    public void setBzrxinr(Bzrxinr bzrxinr) {
        this.bzrxinr = bzrxinr;
    }

    public Input withBzrxinr(Bzrxinr bzrxinr) {
        this.bzrxinr = bzrxinr;
        return this;
    }

    @JsonProperty("ftminr")
    public Ftminr getFtminr() {
        return ftminr;
    }

    @JsonProperty("ftminr")
    public void setFtminr(Ftminr ftminr) {
        this.ftminr = ftminr;
    }

    public Input withFtminr(Ftminr ftminr) {
        this.ftminr = ftminr;
        return this;
    }

    @JsonProperty("hntinr")
    public Hntinr getHntinr() {
        return hntinr;
    }

    @JsonProperty("hntinr")
    public void setHntinr(Hntinr hntinr) {
        this.hntinr = hntinr;
    }

    public Input withHntinr(Hntinr hntinr) {
        this.hntinr = hntinr;
        return this;
    }

    @JsonProperty("arkinr")
    public Arkinr getArkinr() {
        return arkinr;
    }

    @JsonProperty("arkinr")
    public void setArkinr(Arkinr arkinr) {
        this.arkinr = arkinr;
    }

    public Input withArkinr(Arkinr arkinr) {
        this.arkinr = arkinr;
        return this;
    }

    @JsonProperty("ctsiinr")
    public Ctsiinr getCtsiinr() {
        return ctsiinr;
    }

    @JsonProperty("ctsiinr")
    public void setCtsiinr(Ctsiinr ctsiinr) {
        this.ctsiinr = ctsiinr;
    }

    public Input withCtsiinr(Ctsiinr ctsiinr) {
        this.ctsiinr = ctsiinr;
        return this;
    }

    @JsonProperty("kmdinr")
    public Kmdinr getKmdinr() {
        return kmdinr;
    }

    @JsonProperty("kmdinr")
    public void setKmdinr(Kmdinr kmdinr) {
        this.kmdinr = kmdinr;
    }

    public Input withKmdinr(Kmdinr kmdinr) {
        this.kmdinr = kmdinr;
        return this;
    }

    @JsonProperty("solinr")
    public Solinr getSolinr() {
        return solinr;
    }

    @JsonProperty("solinr")
    public void setSolinr(Solinr solinr) {
        this.solinr = solinr;
    }

    public Input withSolinr(Solinr solinr) {
        this.solinr = solinr;
        return this;
    }

    @JsonProperty("cotiinr")
    public Cotiinr getCotiinr() {
        return cotiinr;
    }

    @JsonProperty("cotiinr")
    public void setCotiinr(Cotiinr cotiinr) {
        this.cotiinr = cotiinr;
    }

    public Input withCotiinr(Cotiinr cotiinr) {
        this.cotiinr = cotiinr;
        return this;
    }

    @JsonProperty("iotxinr")
    public Iotxinr getIotxinr() {
        return iotxinr;
    }

    @JsonProperty("iotxinr")
    public void setIotxinr(Iotxinr iotxinr) {
        this.iotxinr = iotxinr;
    }

    public Input withIotxinr(Iotxinr iotxinr) {
        this.iotxinr = iotxinr;
        return this;
    }

    @JsonProperty("shibinr")
    public Shibinr getShibinr() {
        return shibinr;
    }

    @JsonProperty("shibinr")
    public void setShibinr(Shibinr shibinr) {
        this.shibinr = shibinr;
    }

    public Input withShibinr(Shibinr shibinr) {
        this.shibinr = shibinr;
        return this;
    }

    @JsonProperty("ltcinr")
    public Ltcinr getLtcinr() {
        return ltcinr;
    }

    @JsonProperty("ltcinr")
    public void setLtcinr(Ltcinr ltcinr) {
        this.ltcinr = ltcinr;
    }

    public Input withLtcinr(Ltcinr ltcinr) {
        this.ltcinr = ltcinr;
        return this;
    }

    @JsonProperty("dashinr")
    public Dashinr getDashinr() {
        return dashinr;
    }

    @JsonProperty("dashinr")
    public void setDashinr(Dashinr dashinr) {
        this.dashinr = dashinr;
    }

    public Input withDashinr(Dashinr dashinr) {
        this.dashinr = dashinr;
        return this;
    }

    @JsonProperty("xrpbtc")
    public Xrpbtc getXrpbtc() {
        return xrpbtc;
    }

    @JsonProperty("xrpbtc")
    public void setXrpbtc(Xrpbtc xrpbtc) {
        this.xrpbtc = xrpbtc;
    }

    public Input withXrpbtc(Xrpbtc xrpbtc) {
        this.xrpbtc = xrpbtc;
        return this;
    }

    @JsonProperty("trxbtc")
    public Trxbtc getTrxbtc() {
        return trxbtc;
    }

    @JsonProperty("trxbtc")
    public void setTrxbtc(Trxbtc trxbtc) {
        this.trxbtc = trxbtc;
    }

    public Input withTrxbtc(Trxbtc trxbtc) {
        this.trxbtc = trxbtc;
        return this;
    }

    @JsonProperty("ethbtc")
    public Ethbtc getEthbtc() {
        return ethbtc;
    }

    @JsonProperty("ethbtc")
    public void setEthbtc(Ethbtc ethbtc) {
        this.ethbtc = ethbtc;
    }

    public Input withEthbtc(Ethbtc ethbtc) {
        this.ethbtc = ethbtc;
        return this;
    }

    @JsonProperty("zilbtc")
    public Zilbtc getZilbtc() {
        return zilbtc;
    }

    @JsonProperty("zilbtc")
    public void setZilbtc(Zilbtc zilbtc) {
        this.zilbtc = zilbtc;
    }

    public Input withZilbtc(Zilbtc zilbtc) {
        this.zilbtc = zilbtc;
        return this;
    }

    @JsonProperty("batbtc")
    public Batbtc getBatbtc() {
        return batbtc;
    }

    @JsonProperty("batbtc")
    public void setBatbtc(Batbtc batbtc) {
        this.batbtc = batbtc;
    }

    public Input withBatbtc(Batbtc batbtc) {
        this.batbtc = batbtc;
        return this;
    }

    @JsonProperty("ltcbtc")
    public Ltcbtc getLtcbtc() {
        return ltcbtc;
    }

    @JsonProperty("ltcbtc")
    public void setLtcbtc(Ltcbtc ltcbtc) {
        this.ltcbtc = ltcbtc;
    }

    public Input withLtcbtc(Ltcbtc ltcbtc) {
        this.ltcbtc = ltcbtc;
        return this;
    }

    @JsonProperty("qkcbtc")
    public Qkcbtc getQkcbtc() {
        return qkcbtc;
    }

    @JsonProperty("qkcbtc")
    public void setQkcbtc(Qkcbtc qkcbtc) {
        this.qkcbtc = qkcbtc;
    }

    public Input withQkcbtc(Qkcbtc qkcbtc) {
        this.qkcbtc = qkcbtc;
        return this;
    }

    @JsonProperty("dashbtc")
    public Dashbtc getDashbtc() {
        return dashbtc;
    }

    @JsonProperty("dashbtc")
    public void setDashbtc(Dashbtc dashbtc) {
        this.dashbtc = dashbtc;
    }

    public Input withDashbtc(Dashbtc dashbtc) {
        this.dashbtc = dashbtc;
        return this;
    }

    @JsonProperty("funbtc")
    public Funbtc getFunbtc() {
        return funbtc;
    }

    @JsonProperty("funbtc")
    public void setFunbtc(Funbtc funbtc) {
        this.funbtc = funbtc;
    }

    public Input withFunbtc(Funbtc funbtc) {
        this.funbtc = funbtc;
        return this;
    }

    @JsonProperty("iostbtc")
    public Iostbtc getIostbtc() {
        return iostbtc;
    }

    @JsonProperty("iostbtc")
    public void setIostbtc(Iostbtc iostbtc) {
        this.iostbtc = iostbtc;
    }

    public Input withIostbtc(Iostbtc iostbtc) {
        this.iostbtc = iostbtc;
        return this;
    }

    @JsonProperty("nulsbtc")
    public Nulsbtc getNulsbtc() {
        return nulsbtc;
    }

    @JsonProperty("nulsbtc")
    public void setNulsbtc(Nulsbtc nulsbtc) {
        this.nulsbtc = nulsbtc;
    }

    public Input withNulsbtc(Nulsbtc nulsbtc) {
        this.nulsbtc = nulsbtc;
        return this;
    }

    @JsonProperty("omgbtc")
    public Omgbtc getOmgbtc() {
        return omgbtc;
    }

    @JsonProperty("omgbtc")
    public void setOmgbtc(Omgbtc omgbtc) {
        this.omgbtc = omgbtc;
    }

    public Input withOmgbtc(Omgbtc omgbtc) {
        this.omgbtc = omgbtc;
        return this;
    }

    @JsonProperty("reqbtc")
    public Reqbtc getReqbtc() {
        return reqbtc;
    }

    @JsonProperty("reqbtc")
    public void setReqbtc(Reqbtc reqbtc) {
        this.reqbtc = reqbtc;
    }

    public Input withReqbtc(Reqbtc reqbtc) {
        this.reqbtc = reqbtc;
        return this;
    }

    @JsonProperty("sntbtc")
    public Sntbtc getSntbtc() {
        return sntbtc;
    }

    @JsonProperty("sntbtc")
    public void setSntbtc(Sntbtc sntbtc) {
        this.sntbtc = sntbtc;
    }

    public Input withSntbtc(Sntbtc sntbtc) {
        this.sntbtc = sntbtc;
        return this;
    }

    @JsonProperty("thetabtc")
    public Thetabtc getThetabtc() {
        return thetabtc;
    }

    @JsonProperty("thetabtc")
    public void setThetabtc(Thetabtc thetabtc) {
        this.thetabtc = thetabtc;
    }

    public Input withThetabtc(Thetabtc thetabtc) {
        this.thetabtc = thetabtc;
        return this;
    }

    @JsonProperty("zrxbtc")
    public Zrxbtc getZrxbtc() {
        return zrxbtc;
    }

    @JsonProperty("zrxbtc")
    public void setZrxbtc(Zrxbtc zrxbtc) {
        this.zrxbtc = zrxbtc;
    }

    public Input withZrxbtc(Zrxbtc zrxbtc) {
        this.zrxbtc = zrxbtc;
        return this;
    }

    @JsonProperty("eosbtc")
    public Eosbtc getEosbtc() {
        return eosbtc;
    }

    @JsonProperty("eosbtc")
    public void setEosbtc(Eosbtc eosbtc) {
        this.eosbtc = eosbtc;
    }

    public Input withEosbtc(Eosbtc eosbtc) {
        this.eosbtc = eosbtc;
        return this;
    }

    @JsonProperty("icxbtc")
    public Icxbtc getIcxbtc() {
        return icxbtc;
    }

    @JsonProperty("icxbtc")
    public void setIcxbtc(Icxbtc icxbtc) {
        this.icxbtc = icxbtc;
    }

    public Input withIcxbtc(Icxbtc icxbtc) {
        this.icxbtc = icxbtc;
        return this;
    }

    @JsonProperty("polybtc")
    public Polybtc getPolybtc() {
        return polybtc;
    }

    @JsonProperty("polybtc")
    public void setPolybtc(Polybtc polybtc) {
        this.polybtc = polybtc;
    }

    public Input withPolybtc(Polybtc polybtc) {
        this.polybtc = polybtc;
        return this;
    }

    @JsonProperty("paxbtc")
    public Paxbtc getPaxbtc() {
        return paxbtc;
    }

    @JsonProperty("paxbtc")
    public void setPaxbtc(Paxbtc paxbtc) {
        this.paxbtc = paxbtc;
    }

    public Input withPaxbtc(Paxbtc paxbtc) {
        this.paxbtc = paxbtc;
        return this;
    }

    @JsonProperty("usdcbtc")
    public Usdcbtc getUsdcbtc() {
        return usdcbtc;
    }

    @JsonProperty("usdcbtc")
    public void setUsdcbtc(Usdcbtc usdcbtc) {
        this.usdcbtc = usdcbtc;
    }

    public Input withUsdcbtc(Usdcbtc usdcbtc) {
        this.usdcbtc = usdcbtc;
        return this;
    }

    @JsonProperty("xlmbtc")
    public Xlmbtc getXlmbtc() {
        return xlmbtc;
    }

    @JsonProperty("xlmbtc")
    public void setXlmbtc(Xlmbtc xlmbtc) {
        this.xlmbtc = xlmbtc;
    }

    public Input withXlmbtc(Xlmbtc xlmbtc) {
        this.xlmbtc = xlmbtc;
        return this;
    }

    @JsonProperty("fetbtc")
    public Fetbtc getFetbtc() {
        return fetbtc;
    }

    @JsonProperty("fetbtc")
    public void setFetbtc(Fetbtc fetbtc) {
        this.fetbtc = fetbtc;
    }

    public Input withFetbtc(Fetbtc fetbtc) {
        this.fetbtc = fetbtc;
        return this;
    }

    @JsonProperty("celrbtc")
    public Celrbtc getCelrbtc() {
        return celrbtc;
    }

    @JsonProperty("celrbtc")
    public void setCelrbtc(Celrbtc celrbtc) {
        this.celrbtc = celrbtc;
    }

    public Input withCelrbtc(Celrbtc celrbtc) {
        this.celrbtc = celrbtc;
        return this;
    }

    @JsonProperty("maticbtc")
    public Maticbtc getMaticbtc() {
        return maticbtc;
    }

    @JsonProperty("maticbtc")
    public void setMaticbtc(Maticbtc maticbtc) {
        this.maticbtc = maticbtc;
    }

    public Input withMaticbtc(Maticbtc maticbtc) {
        this.maticbtc = maticbtc;
        return this;
    }

    @JsonProperty("adabtc")
    public Adabtc getAdabtc() {
        return adabtc;
    }

    @JsonProperty("adabtc")
    public void setAdabtc(Adabtc adabtc) {
        this.adabtc = adabtc;
    }

    public Input withAdabtc(Adabtc adabtc) {
        this.adabtc = adabtc;
        return this;
    }

    @JsonProperty("rvnbtc")
    public Rvnbtc getRvnbtc() {
        return rvnbtc;
    }

    @JsonProperty("rvnbtc")
    public void setRvnbtc(Rvnbtc rvnbtc) {
        this.rvnbtc = rvnbtc;
    }

    public Input withRvnbtc(Rvnbtc rvnbtc) {
        this.rvnbtc = rvnbtc;
        return this;
    }

    @JsonProperty("xmrbtc")
    public Xmrbtc getXmrbtc() {
        return xmrbtc;
    }

    @JsonProperty("xmrbtc")
    public void setXmrbtc(Xmrbtc xmrbtc) {
        this.xmrbtc = xmrbtc;
    }

    public Input withXmrbtc(Xmrbtc xmrbtc) {
        this.xmrbtc = xmrbtc;
        return this;
    }

    @JsonProperty("atombtc")
    public Atombtc getAtombtc() {
        return atombtc;
    }

    @JsonProperty("atombtc")
    public void setAtombtc(Atombtc atombtc) {
        this.atombtc = atombtc;
    }

    public Input withAtombtc(Atombtc atombtc) {
        this.atombtc = atombtc;
        return this;
    }

    @JsonProperty("bnbbtc")
    public Bnbbtc getBnbbtc() {
        return bnbbtc;
    }

    @JsonProperty("bnbbtc")
    public void setBnbbtc(Bnbbtc bnbbtc) {
        this.bnbbtc = bnbbtc;
    }

    public Input withBnbbtc(Bnbbtc bnbbtc) {
        this.bnbbtc = bnbbtc;
        return this;
    }

    @JsonProperty("wrxbtc")
    public Wrxbtc getWrxbtc() {
        return wrxbtc;
    }

    @JsonProperty("wrxbtc")
    public void setWrxbtc(Wrxbtc wrxbtc) {
        this.wrxbtc = wrxbtc;
    }

    public Input withWrxbtc(Wrxbtc wrxbtc) {
        this.wrxbtc = wrxbtc;
        return this;
    }

    @JsonProperty("fttbtc")
    public Fttbtc getFttbtc() {
        return fttbtc;
    }

    @JsonProperty("fttbtc")
    public void setFttbtc(Fttbtc fttbtc) {
        this.fttbtc = fttbtc;
    }

    public Input withFttbtc(Fttbtc fttbtc) {
        this.fttbtc = fttbtc;
        return this;
    }

    @JsonProperty("stmxbtc")
    public Stmxbtc getStmxbtc() {
        return stmxbtc;
    }

    @JsonProperty("stmxbtc")
    public void setStmxbtc(Stmxbtc stmxbtc) {
        this.stmxbtc = stmxbtc;
    }

    public Input withStmxbtc(Stmxbtc stmxbtc) {
        this.stmxbtc = stmxbtc;
        return this;
    }

    @JsonProperty("glmbtc")
    public Glmbtc getGlmbtc() {
        return glmbtc;
    }

    @JsonProperty("glmbtc")
    public void setGlmbtc(Glmbtc glmbtc) {
        this.glmbtc = glmbtc;
    }

    public Input withGlmbtc(Glmbtc glmbtc) {
        this.glmbtc = glmbtc;
        return this;
    }

    @JsonProperty("btcusdt")
    public Btcusdt getBtcusdt() {
        return btcusdt;
    }

    @JsonProperty("btcusdt")
    public void setBtcusdt(Btcusdt btcusdt) {
        this.btcusdt = btcusdt;
    }

    public Input withBtcusdt(Btcusdt btcusdt) {
        this.btcusdt = btcusdt;
        return this;
    }

    @JsonProperty("trxusdt")
    public Trxusdt getTrxusdt() {
        return trxusdt;
    }

    @JsonProperty("trxusdt")
    public void setTrxusdt(Trxusdt trxusdt) {
        this.trxusdt = trxusdt;
    }

    public Input withTrxusdt(Trxusdt trxusdt) {
        this.trxusdt = trxusdt;
        return this;
    }

    @JsonProperty("xrpusdt")
    public Xrpusdt getXrpusdt() {
        return xrpusdt;
    }

    @JsonProperty("xrpusdt")
    public void setXrpusdt(Xrpusdt xrpusdt) {
        this.xrpusdt = xrpusdt;
    }

    public Input withXrpusdt(Xrpusdt xrpusdt) {
        this.xrpusdt = xrpusdt;
        return this;
    }

    @JsonProperty("eosusdt")
    public Eosusdt getEosusdt() {
        return eosusdt;
    }

    @JsonProperty("eosusdt")
    public void setEosusdt(Eosusdt eosusdt) {
        this.eosusdt = eosusdt;
    }

    public Input withEosusdt(Eosusdt eosusdt) {
        this.eosusdt = eosusdt;
        return this;
    }

    @JsonProperty("ethusdt")
    public Ethusdt getEthusdt() {
        return ethusdt;
    }

    @JsonProperty("ethusdt")
    public void setEthusdt(Ethusdt ethusdt) {
        this.ethusdt = ethusdt;
    }

    public Input withEthusdt(Ethusdt ethusdt) {
        this.ethusdt = ethusdt;
        return this;
    }

    @JsonProperty("icxusdt")
    public Icxusdt getIcxusdt() {
        return icxusdt;
    }

    @JsonProperty("icxusdt")
    public void setIcxusdt(Icxusdt icxusdt) {
        this.icxusdt = icxusdt;
    }

    public Input withIcxusdt(Icxusdt icxusdt) {
        this.icxusdt = icxusdt;
        return this;
    }

    @JsonProperty("ltcusdt")
    public Ltcusdt getLtcusdt() {
        return ltcusdt;
    }

    @JsonProperty("ltcusdt")
    public void setLtcusdt(Ltcusdt ltcusdt) {
        this.ltcusdt = ltcusdt;
    }

    public Input withLtcusdt(Ltcusdt ltcusdt) {
        this.ltcusdt = ltcusdt;
        return this;
    }

    @JsonProperty("tusdusdt")
    public Tusdusdt getTusdusdt() {
        return tusdusdt;
    }

    @JsonProperty("tusdusdt")
    public void setTusdusdt(Tusdusdt tusdusdt) {
        this.tusdusdt = tusdusdt;
    }

    public Input withTusdusdt(Tusdusdt tusdusdt) {
        this.tusdusdt = tusdusdt;
        return this;
    }

    @JsonProperty("hotusdt")
    public Hotusdt getHotusdt() {
        return hotusdt;
    }

    @JsonProperty("hotusdt")
    public void setHotusdt(Hotusdt hotusdt) {
        this.hotusdt = hotusdt;
    }

    public Input withHotusdt(Hotusdt hotusdt) {
        this.hotusdt = hotusdt;
        return this;
    }

    @JsonProperty("batusdt")
    public Batusdt getBatusdt() {
        return batusdt;
    }

    @JsonProperty("batusdt")
    public void setBatusdt(Batusdt batusdt) {
        this.batusdt = batusdt;
    }

    public Input withBatusdt(Batusdt batusdt) {
        this.batusdt = batusdt;
        return this;
    }

    @JsonProperty("dashusdt")
    public Dashusdt getDashusdt() {
        return dashusdt;
    }

    @JsonProperty("dashusdt")
    public void setDashusdt(Dashusdt dashusdt) {
        this.dashusdt = dashusdt;
    }

    public Input withDashusdt(Dashusdt dashusdt) {
        this.dashusdt = dashusdt;
        return this;
    }

    @JsonProperty("ncashusdt")
    public Ncashusdt getNcashusdt() {
        return ncashusdt;
    }

    @JsonProperty("ncashusdt")
    public void setNcashusdt(Ncashusdt ncashusdt) {
        this.ncashusdt = ncashusdt;
    }

    public Input withNcashusdt(Ncashusdt ncashusdt) {
        this.ncashusdt = ncashusdt;
        return this;
    }

    @JsonProperty("qkcusdt")
    public Qkcusdt getQkcusdt() {
        return qkcusdt;
    }

    @JsonProperty("qkcusdt")
    public void setQkcusdt(Qkcusdt qkcusdt) {
        this.qkcusdt = qkcusdt;
    }

    public Input withQkcusdt(Qkcusdt qkcusdt) {
        this.qkcusdt = qkcusdt;
        return this;
    }

    @JsonProperty("zilusdt")
    public Zilusdt getZilusdt() {
        return zilusdt;
    }

    @JsonProperty("zilusdt")
    public void setZilusdt(Zilusdt zilusdt) {
        this.zilusdt = zilusdt;
    }

    public Input withZilusdt(Zilusdt zilusdt) {
        this.zilusdt = zilusdt;
        return this;
    }

    @JsonProperty("zrxusdt")
    public Zrxusdt getZrxusdt() {
        return zrxusdt;
    }

    @JsonProperty("zrxusdt")
    public void setZrxusdt(Zrxusdt zrxusdt) {
        this.zrxusdt = zrxusdt;
    }

    public Input withZrxusdt(Zrxusdt zrxusdt) {
        this.zrxusdt = zrxusdt;
        return this;
    }

    @JsonProperty("bchusdt")
    public Bchusdt getBchusdt() {
        return bchusdt;
    }

    @JsonProperty("bchusdt")
    public void setBchusdt(Bchusdt bchusdt) {
        this.bchusdt = bchusdt;
    }

    public Input withBchusdt(Bchusdt bchusdt) {
        this.bchusdt = bchusdt;
        return this;
    }

    @JsonProperty("bchsvusdt")
    public Bchsvusdt getBchsvusdt() {
        return bchsvusdt;
    }

    @JsonProperty("bchsvusdt")
    public void setBchsvusdt(Bchsvusdt bchsvusdt) {
        this.bchsvusdt = bchsvusdt;
    }

    public Input withBchsvusdt(Bchsvusdt bchsvusdt) {
        this.bchsvusdt = bchsvusdt;
        return this;
    }

    @JsonProperty("paxusdt")
    public Paxusdt getPaxusdt() {
        return paxusdt;
    }

    @JsonProperty("paxusdt")
    public void setPaxusdt(Paxusdt paxusdt) {
        this.paxusdt = paxusdt;
    }

    public Input withPaxusdt(Paxusdt paxusdt) {
        this.paxusdt = paxusdt;
        return this;
    }

    @JsonProperty("usdcusdt")
    public Usdcusdt getUsdcusdt() {
        return usdcusdt;
    }

    @JsonProperty("usdcusdt")
    public void setUsdcusdt(Usdcusdt usdcusdt) {
        this.usdcusdt = usdcusdt;
    }

    public Input withUsdcusdt(Usdcusdt usdcusdt) {
        this.usdcusdt = usdcusdt;
        return this;
    }

    @JsonProperty("omgusdt")
    public Omgusdt getOmgusdt() {
        return omgusdt;
    }

    @JsonProperty("omgusdt")
    public void setOmgusdt(Omgusdt omgusdt) {
        this.omgusdt = omgusdt;
    }

    public Input withOmgusdt(Omgusdt omgusdt) {
        this.omgusdt = omgusdt;
        return this;
    }

    @JsonProperty("polyusdt")
    public Polyusdt getPolyusdt() {
        return polyusdt;
    }

    @JsonProperty("polyusdt")
    public void setPolyusdt(Polyusdt polyusdt) {
        this.polyusdt = polyusdt;
    }

    public Input withPolyusdt(Polyusdt polyusdt) {
        this.polyusdt = polyusdt;
        return this;
    }

    @JsonProperty("dentusdt")
    public Dentusdt getDentusdt() {
        return dentusdt;
    }

    @JsonProperty("dentusdt")
    public void setDentusdt(Dentusdt dentusdt) {
        this.dentusdt = dentusdt;
    }

    public Input withDentusdt(Dentusdt dentusdt) {
        this.dentusdt = dentusdt;
        return this;
    }

    @JsonProperty("iostusdt")
    public Iostusdt getIostusdt() {
        return iostusdt;
    }

    @JsonProperty("iostusdt")
    public void setIostusdt(Iostusdt iostusdt) {
        this.iostusdt = iostusdt;
    }

    public Input withIostusdt(Iostusdt iostusdt) {
        this.iostusdt = iostusdt;
        return this;
    }

    @JsonProperty("funusdt")
    public Funusdt getFunusdt() {
        return funusdt;
    }

    @JsonProperty("funusdt")
    public void setFunusdt(Funusdt funusdt) {
        this.funusdt = funusdt;
    }

    public Input withFunusdt(Funusdt funusdt) {
        this.funusdt = funusdt;
        return this;
    }

    @JsonProperty("sntusdt")
    public Sntusdt getSntusdt() {
        return sntusdt;
    }

    @JsonProperty("sntusdt")
    public void setSntusdt(Sntusdt sntusdt) {
        this.sntusdt = sntusdt;
    }

    public Input withSntusdt(Sntusdt sntusdt) {
        this.sntusdt = sntusdt;
        return this;
    }

    @JsonProperty("thetausdt")
    public Thetausdt getThetausdt() {
        return thetausdt;
    }

    @JsonProperty("thetausdt")
    public void setThetausdt(Thetausdt thetausdt) {
        this.thetausdt = thetausdt;
    }

    public Input withThetausdt(Thetausdt thetausdt) {
        this.thetausdt = thetausdt;
        return this;
    }

    @JsonProperty("requsdt")
    public Requsdt getRequsdt() {
        return requsdt;
    }

    @JsonProperty("requsdt")
    public void setRequsdt(Requsdt requsdt) {
        this.requsdt = requsdt;
    }

    public Input withRequsdt(Requsdt requsdt) {
        this.requsdt = requsdt;
        return this;
    }

    @JsonProperty("xlmusdt")
    public Xlmusdt getXlmusdt() {
        return xlmusdt;
    }

    @JsonProperty("xlmusdt")
    public void setXlmusdt(Xlmusdt xlmusdt) {
        this.xlmusdt = xlmusdt;
    }

    public Input withXlmusdt(Xlmusdt xlmusdt) {
        this.xlmusdt = xlmusdt;
        return this;
    }

    @JsonProperty("xtzusdt")
    public Xtzusdt getXtzusdt() {
        return xtzusdt;
    }

    @JsonProperty("xtzusdt")
    public void setXtzusdt(Xtzusdt xtzusdt) {
        this.xtzusdt = xtzusdt;
    }

    public Input withXtzusdt(Xtzusdt xtzusdt) {
        this.xtzusdt = xtzusdt;
        return this;
    }

    @JsonProperty("bttusdt")
    public Bttusdt getBttusdt() {
        return bttusdt;
    }

    @JsonProperty("bttusdt")
    public void setBttusdt(Bttusdt bttusdt) {
        this.bttusdt = bttusdt;
    }

    public Input withBttusdt(Bttusdt bttusdt) {
        this.bttusdt = bttusdt;
        return this;
    }

    @JsonProperty("fetusdt")
    public Fetusdt getFetusdt() {
        return fetusdt;
    }

    @JsonProperty("fetusdt")
    public void setFetusdt(Fetusdt fetusdt) {
        this.fetusdt = fetusdt;
    }

    public Input withFetusdt(Fetusdt fetusdt) {
        this.fetusdt = fetusdt;
        return this;
    }

    @JsonProperty("tfuelusdt")
    public Tfuelusdt getTfuelusdt() {
        return tfuelusdt;
    }

    @JsonProperty("tfuelusdt")
    public void setTfuelusdt(Tfuelusdt tfuelusdt) {
        this.tfuelusdt = tfuelusdt;
    }

    public Input withTfuelusdt(Tfuelusdt tfuelusdt) {
        this.tfuelusdt = tfuelusdt;
        return this;
    }

    @JsonProperty("celrusdt")
    public Celrusdt getCelrusdt() {
        return celrusdt;
    }

    @JsonProperty("celrusdt")
    public void setCelrusdt(Celrusdt celrusdt) {
        this.celrusdt = celrusdt;
    }

    public Input withCelrusdt(Celrusdt celrusdt) {
        this.celrusdt = celrusdt;
        return this;
    }

    @JsonProperty("maticusdt")
    public Maticusdt getMaticusdt() {
        return maticusdt;
    }

    @JsonProperty("maticusdt")
    public void setMaticusdt(Maticusdt maticusdt) {
        this.maticusdt = maticusdt;
    }

    public Input withMaticusdt(Maticusdt maticusdt) {
        this.maticusdt = maticusdt;
        return this;
    }

    @JsonProperty("adausdt")
    public Adausdt getAdausdt() {
        return adausdt;
    }

    @JsonProperty("adausdt")
    public void setAdausdt(Adausdt adausdt) {
        this.adausdt = adausdt;
    }

    public Input withAdausdt(Adausdt adausdt) {
        this.adausdt = adausdt;
        return this;
    }

    @JsonProperty("rvnusdt")
    public Rvnusdt getRvnusdt() {
        return rvnusdt;
    }

    @JsonProperty("rvnusdt")
    public void setRvnusdt(Rvnusdt rvnusdt) {
        this.rvnusdt = rvnusdt;
    }

    public Input withRvnusdt(Rvnusdt rvnusdt) {
        this.rvnusdt = rvnusdt;
        return this;
    }

    @JsonProperty("xmrusdt")
    public Xmrusdt getXmrusdt() {
        return xmrusdt;
    }

    @JsonProperty("xmrusdt")
    public void setXmrusdt(Xmrusdt xmrusdt) {
        this.xmrusdt = xmrusdt;
    }

    public Input withXmrusdt(Xmrusdt xmrusdt) {
        this.xmrusdt = xmrusdt;
        return this;
    }

    @JsonProperty("atomusdt")
    public Atomusdt getAtomusdt() {
        return atomusdt;
    }

    @JsonProperty("atomusdt")
    public void setAtomusdt(Atomusdt atomusdt) {
        this.atomusdt = atomusdt;
    }

    public Input withAtomusdt(Atomusdt atomusdt) {
        this.atomusdt = atomusdt;
        return this;
    }

    @JsonProperty("algousdt")
    public Algousdt getAlgousdt() {
        return algousdt;
    }

    @JsonProperty("algousdt")
    public void setAlgousdt(Algousdt algousdt) {
        this.algousdt = algousdt;
    }

    public Input withAlgousdt(Algousdt algousdt) {
        this.algousdt = algousdt;
        return this;
    }

    @JsonProperty("linkusdt")
    public Linkusdt getLinkusdt() {
        return linkusdt;
    }

    @JsonProperty("linkusdt")
    public void setLinkusdt(Linkusdt linkusdt) {
        this.linkusdt = linkusdt;
    }

    public Input withLinkusdt(Linkusdt linkusdt) {
        this.linkusdt = linkusdt;
        return this;
    }

    @JsonProperty("qtumusdt")
    public Qtumusdt getQtumusdt() {
        return qtumusdt;
    }

    @JsonProperty("qtumusdt")
    public void setQtumusdt(Qtumusdt qtumusdt) {
        this.qtumusdt = qtumusdt;
    }

    public Input withQtumusdt(Qtumusdt qtumusdt) {
        this.qtumusdt = qtumusdt;
        return this;
    }

    @JsonProperty("etcusdt")
    public Etcusdt getEtcusdt() {
        return etcusdt;
    }

    @JsonProperty("etcusdt")
    public void setEtcusdt(Etcusdt etcusdt) {
        this.etcusdt = etcusdt;
    }

    public Input withEtcusdt(Etcusdt etcusdt) {
        this.etcusdt = etcusdt;
        return this;
    }

    @JsonProperty("iotausdt")
    public Iotausdt getIotausdt() {
        return iotausdt;
    }

    @JsonProperty("iotausdt")
    public void setIotausdt(Iotausdt iotausdt) {
        this.iotausdt = iotausdt;
    }

    public Input withIotausdt(Iotausdt iotausdt) {
        this.iotausdt = iotausdt;
        return this;
    }

    @JsonProperty("zecusdt")
    public Zecusdt getZecusdt() {
        return zecusdt;
    }

    @JsonProperty("zecusdt")
    public void setZecusdt(Zecusdt zecusdt) {
        this.zecusdt = zecusdt;
    }

    public Input withZecusdt(Zecusdt zecusdt) {
        this.zecusdt = zecusdt;
        return this;
    }

    @JsonProperty("wavesusdt")
    public Wavesusdt getWavesusdt() {
        return wavesusdt;
    }

    @JsonProperty("wavesusdt")
    public void setWavesusdt(Wavesusdt wavesusdt) {
        this.wavesusdt = wavesusdt;
    }

    public Input withWavesusdt(Wavesusdt wavesusdt) {
        this.wavesusdt = wavesusdt;
        return this;
    }

    @JsonProperty("ftmusdt")
    public Ftmusdt getFtmusdt() {
        return ftmusdt;
    }

    @JsonProperty("ftmusdt")
    public void setFtmusdt(Ftmusdt ftmusdt) {
        this.ftmusdt = ftmusdt;
    }

    public Input withFtmusdt(Ftmusdt ftmusdt) {
        this.ftmusdt = ftmusdt;
        return this;
    }

    @JsonProperty("enjusdt")
    public Enjusdt getEnjusdt() {
        return enjusdt;
    }

    @JsonProperty("enjusdt")
    public void setEnjusdt(Enjusdt enjusdt) {
        this.enjusdt = enjusdt;
    }

    public Input withEnjusdt(Enjusdt enjusdt) {
        this.enjusdt = enjusdt;
        return this;
    }

    @JsonProperty("lskusdt")
    public Lskusdt getLskusdt() {
        return lskusdt;
    }

    @JsonProperty("lskusdt")
    public void setLskusdt(Lskusdt lskusdt) {
        this.lskusdt = lskusdt;
    }

    public Input withLskusdt(Lskusdt lskusdt) {
        this.lskusdt = lskusdt;
        return this;
    }

    @JsonProperty("steemusdt")
    public Steemusdt getSteemusdt() {
        return steemusdt;
    }

    @JsonProperty("steemusdt")
    public void setSteemusdt(Steemusdt steemusdt) {
        this.steemusdt = steemusdt;
    }

    public Input withSteemusdt(Steemusdt steemusdt) {
        this.steemusdt = steemusdt;
        return this;
    }

    @JsonProperty("xvgusdt")
    public Xvgusdt getXvgusdt() {
        return xvgusdt;
    }

    @JsonProperty("xvgusdt")
    public void setXvgusdt(Xvgusdt xvgusdt) {
        this.xvgusdt = xvgusdt;
    }

    public Input withXvgusdt(Xvgusdt xvgusdt) {
        this.xvgusdt = xvgusdt;
        return this;
    }

    @JsonProperty("loomusdt")
    public Loomusdt getLoomusdt() {
        return loomusdt;
    }

    @JsonProperty("loomusdt")
    public void setLoomusdt(Loomusdt loomusdt) {
        this.loomusdt = loomusdt;
    }

    public Input withLoomusdt(Loomusdt loomusdt) {
        this.loomusdt = loomusdt;
        return this;
    }

    @JsonProperty("manausdt")
    public Manausdt getManausdt() {
        return manausdt;
    }

    @JsonProperty("manausdt")
    public void setManausdt(Manausdt manausdt) {
        this.manausdt = manausdt;
    }

    public Input withManausdt(Manausdt manausdt) {
        this.manausdt = manausdt;
        return this;
    }

    @JsonProperty("repusdt")
    public Repusdt getRepusdt() {
        return repusdt;
    }

    @JsonProperty("repusdt")
    public void setRepusdt(Repusdt repusdt) {
        this.repusdt = repusdt;
    }

    public Input withRepusdt(Repusdt repusdt) {
        this.repusdt = repusdt;
        return this;
    }

    @JsonProperty("blzusdt")
    public Blzusdt getBlzusdt() {
        return blzusdt;
    }

    @JsonProperty("blzusdt")
    public void setBlzusdt(Blzusdt blzusdt) {
        this.blzusdt = blzusdt;
    }

    public Input withBlzusdt(Blzusdt blzusdt) {
        this.blzusdt = blzusdt;
        return this;
    }

    @JsonProperty("nanousdt")
    public Nanousdt getNanousdt() {
        return nanousdt;
    }

    @JsonProperty("nanousdt")
    public void setNanousdt(Nanousdt nanousdt) {
        this.nanousdt = nanousdt;
    }

    public Input withNanousdt(Nanousdt nanousdt) {
        this.nanousdt = nanousdt;
        return this;
    }

    @JsonProperty("scusdt")
    public Scusdt getScusdt() {
        return scusdt;
    }

    @JsonProperty("scusdt")
    public void setScusdt(Scusdt scusdt) {
        this.scusdt = scusdt;
    }

    public Input withScusdt(Scusdt scusdt) {
        this.scusdt = scusdt;
        return this;
    }

    @JsonProperty("btgusdt")
    public Btgusdt getBtgusdt() {
        return btgusdt;
    }

    @JsonProperty("btgusdt")
    public void setBtgusdt(Btgusdt btgusdt) {
        this.btgusdt = btgusdt;
    }

    public Input withBtgusdt(Btgusdt btgusdt) {
        this.btgusdt = btgusdt;
        return this;
    }

    @JsonProperty("xemusdt")
    public Xemusdt getXemusdt() {
        return xemusdt;
    }

    @JsonProperty("xemusdt")
    public void setXemusdt(Xemusdt xemusdt) {
        this.xemusdt = xemusdt;
    }

    public Input withXemusdt(Xemusdt xemusdt) {
        this.xemusdt = xemusdt;
        return this;
    }

    @JsonProperty("btsusdt")
    public Btsusdt getBtsusdt() {
        return btsusdt;
    }

    @JsonProperty("btsusdt")
    public void setBtsusdt(Btsusdt btsusdt) {
        this.btsusdt = btsusdt;
    }

    public Input withBtsusdt(Btsusdt btsusdt) {
        this.btsusdt = btsusdt;
        return this;
    }

    @JsonProperty("ardrusdt")
    public Ardrusdt getArdrusdt() {
        return ardrusdt;
    }

    @JsonProperty("ardrusdt")
    public void setArdrusdt(Ardrusdt ardrusdt) {
        this.ardrusdt = ardrusdt;
    }

    public Input withArdrusdt(Ardrusdt ardrusdt) {
        this.ardrusdt = ardrusdt;
        return this;
    }

    @JsonProperty("nasusdt")
    public Nasusdt getNasusdt() {
        return nasusdt;
    }

    @JsonProperty("nasusdt")
    public void setNasusdt(Nasusdt nasusdt) {
        this.nasusdt = nasusdt;
    }

    public Input withNasusdt(Nasusdt nasusdt) {
        this.nasusdt = nasusdt;
        return this;
    }

    @JsonProperty("winusdt")
    public Winusdt getWinusdt() {
        return winusdt;
    }

    @JsonProperty("winusdt")
    public void setWinusdt(Winusdt winusdt) {
        this.winusdt = winusdt;
    }

    public Input withWinusdt(Winusdt winusdt) {
        this.winusdt = winusdt;
        return this;
    }

    @JsonProperty("bnbusdt")
    public Bnbusdt getBnbusdt() {
        return bnbusdt;
    }

    @JsonProperty("bnbusdt")
    public void setBnbusdt(Bnbusdt bnbusdt) {
        this.bnbusdt = bnbusdt;
    }

    public Input withBnbusdt(Bnbusdt bnbusdt) {
        this.bnbusdt = bnbusdt;
        return this;
    }

    @JsonProperty("chzusdt")
    public Chzusdt getChzusdt() {
        return chzusdt;
    }

    @JsonProperty("chzusdt")
    public void setChzusdt(Chzusdt chzusdt) {
        this.chzusdt = chzusdt;
    }

    public Input withChzusdt(Chzusdt chzusdt) {
        this.chzusdt = chzusdt;
        return this;
    }

    @JsonProperty("wrxusdt")
    public Wrxusdt getWrxusdt() {
        return wrxusdt;
    }

    @JsonProperty("wrxusdt")
    public void setWrxusdt(Wrxusdt wrxusdt) {
        this.wrxusdt = wrxusdt;
    }

    public Input withWrxusdt(Wrxusdt wrxusdt) {
        this.wrxusdt = wrxusdt;
        return this;
    }

    @JsonProperty("kavausdt")
    public Kavausdt getKavausdt() {
        return kavausdt;
    }

    @JsonProperty("kavausdt")
    public void setKavausdt(Kavausdt kavausdt) {
        this.kavausdt = kavausdt;
    }

    public Input withKavausdt(Kavausdt kavausdt) {
        this.kavausdt = kavausdt;
        return this;
    }

    @JsonProperty("ankrusdt")
    public Ankrusdt getAnkrusdt() {
        return ankrusdt;
    }

    @JsonProperty("ankrusdt")
    public void setAnkrusdt(Ankrusdt ankrusdt) {
        this.ankrusdt = ankrusdt;
    }

    public Input withAnkrusdt(Ankrusdt ankrusdt) {
        this.ankrusdt = ankrusdt;
        return this;
    }

    @JsonProperty("busdusdt")
    public Busdusdt getBusdusdt() {
        return busdusdt;
    }

    @JsonProperty("busdusdt")
    public void setBusdusdt(Busdusdt busdusdt) {
        this.busdusdt = busdusdt;
    }

    public Input withBusdusdt(Busdusdt busdusdt) {
        this.busdusdt = busdusdt;
        return this;
    }

    @JsonProperty("oneusdt")
    public Oneusdt getOneusdt() {
        return oneusdt;
    }

    @JsonProperty("oneusdt")
    public void setOneusdt(Oneusdt oneusdt) {
        this.oneusdt = oneusdt;
    }

    public Input withOneusdt(Oneusdt oneusdt) {
        this.oneusdt = oneusdt;
        return this;
    }

    @JsonProperty("ognusdt")
    public Ognusdt getOgnusdt() {
        return ognusdt;
    }

    @JsonProperty("ognusdt")
    public void setOgnusdt(Ognusdt ognusdt) {
        this.ognusdt = ognusdt;
    }

    public Input withOgnusdt(Ognusdt ognusdt) {
        this.ognusdt = ognusdt;
        return this;
    }

    @JsonProperty("hiveusdt")
    public Hiveusdt getHiveusdt() {
        return hiveusdt;
    }

    @JsonProperty("hiveusdt")
    public void setHiveusdt(Hiveusdt hiveusdt) {
        this.hiveusdt = hiveusdt;
    }

    public Input withHiveusdt(Hiveusdt hiveusdt) {
        this.hiveusdt = hiveusdt;
        return this;
    }

    @JsonProperty("fttusdt")
    public Fttusdt getFttusdt() {
        return fttusdt;
    }

    @JsonProperty("fttusdt")
    public void setFttusdt(Fttusdt fttusdt) {
        this.fttusdt = fttusdt;
    }

    public Input withFttusdt(Fttusdt fttusdt) {
        this.fttusdt = fttusdt;
        return this;
    }

    @JsonProperty("bandusdt")
    public Bandusdt getBandusdt() {
        return bandusdt;
    }

    @JsonProperty("bandusdt")
    public void setBandusdt(Bandusdt bandusdt) {
        this.bandusdt = bandusdt;
    }

    public Input withBandusdt(Bandusdt bandusdt) {
        this.bandusdt = bandusdt;
        return this;
    }

    @JsonProperty("jstusdt")
    public Jstusdt getJstusdt() {
        return jstusdt;
    }

    @JsonProperty("jstusdt")
    public void setJstusdt(Jstusdt jstusdt) {
        this.jstusdt = jstusdt;
    }

    public Input withJstusdt(Jstusdt jstusdt) {
        this.jstusdt = jstusdt;
        return this;
    }

    @JsonProperty("ctsiusdt")
    public Ctsiusdt getCtsiusdt() {
        return ctsiusdt;
    }

    @JsonProperty("ctsiusdt")
    public void setCtsiusdt(Ctsiusdt ctsiusdt) {
        this.ctsiusdt = ctsiusdt;
    }

    public Input withCtsiusdt(Ctsiusdt ctsiusdt) {
        this.ctsiusdt = ctsiusdt;
        return this;
    }

    @JsonProperty("chrusdt")
    public Chrusdt getChrusdt() {
        return chrusdt;
    }

    @JsonProperty("chrusdt")
    public void setChrusdt(Chrusdt chrusdt) {
        this.chrusdt = chrusdt;
    }

    public Input withChrusdt(Chrusdt chrusdt) {
        this.chrusdt = chrusdt;
        return this;
    }

    @JsonProperty("tomousdt")
    public Tomousdt getTomousdt() {
        return tomousdt;
    }

    @JsonProperty("tomousdt")
    public void setTomousdt(Tomousdt tomousdt) {
        this.tomousdt = tomousdt;
    }

    public Input withTomousdt(Tomousdt tomousdt) {
        this.tomousdt = tomousdt;
        return this;
    }

    @JsonProperty("stxusdt")
    public Stxusdt getStxusdt() {
        return stxusdt;
    }

    @JsonProperty("stxusdt")
    public void setStxusdt(Stxusdt stxusdt) {
        this.stxusdt = stxusdt;
    }

    public Input withStxusdt(Stxusdt stxusdt) {
        this.stxusdt = stxusdt;
        return this;
    }

    @JsonProperty("stmxusdt")
    public Stmxusdt getStmxusdt() {
        return stmxusdt;
    }

    @JsonProperty("stmxusdt")
    public void setStmxusdt(Stmxusdt stmxusdt) {
        this.stmxusdt = stmxusdt;
    }

    public Input withStmxusdt(Stmxusdt stmxusdt) {
        this.stmxusdt = stmxusdt;
        return this;
    }

    @JsonProperty("gxsusdt")
    public Gxsusdt getGxsusdt() {
        return gxsusdt;
    }

    @JsonProperty("gxsusdt")
    public void setGxsusdt(Gxsusdt gxsusdt) {
        this.gxsusdt = gxsusdt;
    }

    public Input withGxsusdt(Gxsusdt gxsusdt) {
        this.gxsusdt = gxsusdt;
        return this;
    }

    @JsonProperty("mdtusdt")
    public Mdtusdt getMdtusdt() {
        return mdtusdt;
    }

    @JsonProperty("mdtusdt")
    public void setMdtusdt(Mdtusdt mdtusdt) {
        this.mdtusdt = mdtusdt;
    }

    public Input withMdtusdt(Mdtusdt mdtusdt) {
        this.mdtusdt = mdtusdt;
        return this;
    }

    @JsonProperty("ltousdt")
    public Ltousdt getLtousdt() {
        return ltousdt;
    }

    @JsonProperty("ltousdt")
    public void setLtousdt(Ltousdt ltousdt) {
        this.ltousdt = ltousdt;
    }

    public Input withLtousdt(Ltousdt ltousdt) {
        this.ltousdt = ltousdt;
        return this;
    }

    @JsonProperty("lrcusdt")
    public Lrcusdt getLrcusdt() {
        return lrcusdt;
    }

    @JsonProperty("lrcusdt")
    public void setLrcusdt(Lrcusdt lrcusdt) {
        this.lrcusdt = lrcusdt;
    }

    public Input withLrcusdt(Lrcusdt lrcusdt) {
        this.lrcusdt = lrcusdt;
        return this;
    }

    @JsonProperty("dogeusdt")
    public Dogeusdt getDogeusdt() {
        return dogeusdt;
    }

    @JsonProperty("dogeusdt")
    public void setDogeusdt(Dogeusdt dogeusdt) {
        this.dogeusdt = dogeusdt;
    }

    public Input withDogeusdt(Dogeusdt dogeusdt) {
        this.dogeusdt = dogeusdt;
        return this;
    }

    @JsonProperty("neousdt")
    public Neousdt getNeousdt() {
        return neousdt;
    }

    @JsonProperty("neousdt")
    public void setNeousdt(Neousdt neousdt) {
        this.neousdt = neousdt;
    }

    public Input withNeousdt(Neousdt neousdt) {
        this.neousdt = neousdt;
        return this;
    }

    @JsonProperty("hbarusdt")
    public Hbarusdt getHbarusdt() {
        return hbarusdt;
    }

    @JsonProperty("hbarusdt")
    public void setHbarusdt(Hbarusdt hbarusdt) {
        this.hbarusdt = hbarusdt;
    }

    public Input withHbarusdt(Hbarusdt hbarusdt) {
        this.hbarusdt = hbarusdt;
        return this;
    }

    @JsonProperty("storjusdt")
    public Storjusdt getStorjusdt() {
        return storjusdt;
    }

    @JsonProperty("storjusdt")
    public void setStorjusdt(Storjusdt storjusdt) {
        this.storjusdt = storjusdt;
    }

    public Input withStorjusdt(Storjusdt storjusdt) {
        this.storjusdt = storjusdt;
        return this;
    }

    @JsonProperty("compusdt")
    public Compusdt getCompusdt() {
        return compusdt;
    }

    @JsonProperty("compusdt")
    public void setCompusdt(Compusdt compusdt) {
        this.compusdt = compusdt;
    }

    public Input withCompusdt(Compusdt compusdt) {
        this.compusdt = compusdt;
        return this;
    }

    @JsonProperty("cotiusdt")
    public Cotiusdt getCotiusdt() {
        return cotiusdt;
    }

    @JsonProperty("cotiusdt")
    public void setCotiusdt(Cotiusdt cotiusdt) {
        this.cotiusdt = cotiusdt;
    }

    public Input withCotiusdt(Cotiusdt cotiusdt) {
        this.cotiusdt = cotiusdt;
        return this;
    }

    @JsonProperty("dgbusdt")
    public Dgbusdt getDgbusdt() {
        return dgbusdt;
    }

    @JsonProperty("dgbusdt")
    public void setDgbusdt(Dgbusdt dgbusdt) {
        this.dgbusdt = dgbusdt;
    }

    public Input withDgbusdt(Dgbusdt dgbusdt) {
        this.dgbusdt = dgbusdt;
        return this;
    }

    @JsonProperty("grsusdt")
    public Grsusdt getGrsusdt() {
        return grsusdt;
    }

    @JsonProperty("grsusdt")
    public void setGrsusdt(Grsusdt grsusdt) {
        this.grsusdt = grsusdt;
    }

    public Input withGrsusdt(Grsusdt grsusdt) {
        this.grsusdt = grsusdt;
        return this;
    }

    @JsonProperty("snxusdt")
    public Snxusdt getSnxusdt() {
        return snxusdt;
    }

    @JsonProperty("snxusdt")
    public void setSnxusdt(Snxusdt snxusdt) {
        this.snxusdt = snxusdt;
    }

    public Input withSnxusdt(Snxusdt snxusdt) {
        this.snxusdt = snxusdt;
        return this;
    }

    @JsonProperty("renusdt")
    public Renusdt getRenusdt() {
        return renusdt;
    }

    @JsonProperty("renusdt")
    public void setRenusdt(Renusdt renusdt) {
        this.renusdt = renusdt;
    }

    public Input withRenusdt(Renusdt renusdt) {
        this.renusdt = renusdt;
        return this;
    }

    @JsonProperty("sxpusdt")
    public Sxpusdt getSxpusdt() {
        return sxpusdt;
    }

    @JsonProperty("sxpusdt")
    public void setSxpusdt(Sxpusdt sxpusdt) {
        this.sxpusdt = sxpusdt;
    }

    public Input withSxpusdt(Sxpusdt sxpusdt) {
        this.sxpusdt = sxpusdt;
        return this;
    }

    @JsonProperty("mkrusdt")
    public Mkrusdt getMkrusdt() {
        return mkrusdt;
    }

    @JsonProperty("mkrusdt")
    public void setMkrusdt(Mkrusdt mkrusdt) {
        this.mkrusdt = mkrusdt;
    }

    public Input withMkrusdt(Mkrusdt mkrusdt) {
        this.mkrusdt = mkrusdt;
        return this;
    }

    @JsonProperty("daiusdt")
    public Daiusdt getDaiusdt() {
        return daiusdt;
    }

    @JsonProperty("daiusdt")
    public void setDaiusdt(Daiusdt daiusdt) {
        this.daiusdt = daiusdt;
    }

    public Input withDaiusdt(Daiusdt daiusdt) {
        this.daiusdt = daiusdt;
        return this;
    }

    @JsonProperty("avausdt")
    public Avausdt getAvausdt() {
        return avausdt;
    }

    @JsonProperty("avausdt")
    public void setAvausdt(Avausdt avausdt) {
        this.avausdt = avausdt;
    }

    public Input withAvausdt(Avausdt avausdt) {
        this.avausdt = avausdt;
        return this;
    }

    @JsonProperty("balusdt")
    public Balusdt getBalusdt() {
        return balusdt;
    }

    @JsonProperty("balusdt")
    public void setBalusdt(Balusdt balusdt) {
        this.balusdt = balusdt;
    }

    public Input withBalusdt(Balusdt balusdt) {
        this.balusdt = balusdt;
        return this;
    }

    @JsonProperty("srmusdt")
    public Srmusdt getSrmusdt() {
        return srmusdt;
    }

    @JsonProperty("srmusdt")
    public void setSrmusdt(Srmusdt srmusdt) {
        this.srmusdt = srmusdt;
    }

    public Input withSrmusdt(Srmusdt srmusdt) {
        this.srmusdt = srmusdt;
        return this;
    }

    @JsonProperty("egldusdt")
    public Egldusdt getEgldusdt() {
        return egldusdt;
    }

    @JsonProperty("egldusdt")
    public void setEgldusdt(Egldusdt egldusdt) {
        this.egldusdt = egldusdt;
    }

    public Input withEgldusdt(Egldusdt egldusdt) {
        this.egldusdt = egldusdt;
        return this;
    }

    @JsonProperty("cosusdt")
    public Cosusdt getCosusdt() {
        return cosusdt;
    }

    @JsonProperty("cosusdt")
    public void setCosusdt(Cosusdt cosusdt) {
        this.cosusdt = cosusdt;
    }

    public Input withCosusdt(Cosusdt cosusdt) {
        this.cosusdt = cosusdt;
        return this;
    }

    @JsonProperty("nbsusdt")
    public Nbsusdt getNbsusdt() {
        return nbsusdt;
    }

    @JsonProperty("nbsusdt")
    public void setNbsusdt(Nbsusdt nbsusdt) {
        this.nbsusdt = nbsusdt;
    }

    public Input withNbsusdt(Nbsusdt nbsusdt) {
        this.nbsusdt = nbsusdt;
        return this;
    }

    @JsonProperty("aionusdt")
    public Aionusdt getAionusdt() {
        return aionusdt;
    }

    @JsonProperty("aionusdt")
    public void setAionusdt(Aionusdt aionusdt) {
        this.aionusdt = aionusdt;
    }

    public Input withAionusdt(Aionusdt aionusdt) {
        this.aionusdt = aionusdt;
        return this;
    }

    @JsonProperty("dotusdt")
    public Dotusdt getDotusdt() {
        return dotusdt;
    }

    @JsonProperty("dotusdt")
    public void setDotusdt(Dotusdt dotusdt) {
        this.dotusdt = dotusdt;
    }

    public Input withDotusdt(Dotusdt dotusdt) {
        this.dotusdt = dotusdt;
        return this;
    }

    @JsonProperty("yfiusdt")
    public Yfiusdt getYfiusdt() {
        return yfiusdt;
    }

    @JsonProperty("yfiusdt")
    public void setYfiusdt(Yfiusdt yfiusdt) {
        this.yfiusdt = yfiusdt;
    }

    public Input withYfiusdt(Yfiusdt yfiusdt) {
        this.yfiusdt = yfiusdt;
        return this;
    }

    @JsonProperty("iotxusdt")
    public Iotxusdt getIotxusdt() {
        return iotxusdt;
    }

    @JsonProperty("iotxusdt")
    public void setIotxusdt(Iotxusdt iotxusdt) {
        this.iotxusdt = iotxusdt;
    }

    public Input withIotxusdt(Iotxusdt iotxusdt) {
        this.iotxusdt = iotxusdt;
        return this;
    }

    @JsonProperty("sandusdt")
    public Sandusdt getSandusdt() {
        return sandusdt;
    }

    @JsonProperty("sandusdt")
    public void setSandusdt(Sandusdt sandusdt) {
        this.sandusdt = sandusdt;
    }

    public Input withSandusdt(Sandusdt sandusdt) {
        this.sandusdt = sandusdt;
        return this;
    }

    @JsonProperty("uniusdt")
    public Uniusdt getUniusdt() {
        return uniusdt;
    }

    @JsonProperty("uniusdt")
    public void setUniusdt(Uniusdt uniusdt) {
        this.uniusdt = uniusdt;
    }

    public Input withUniusdt(Uniusdt uniusdt) {
        this.uniusdt = uniusdt;
        return this;
    }

    @JsonProperty("datausdt")
    public Datausdt getDatausdt() {
        return datausdt;
    }

    @JsonProperty("datausdt")
    public void setDatausdt(Datausdt datausdt) {
        this.datausdt = datausdt;
    }

    public Input withDatausdt(Datausdt datausdt) {
        this.datausdt = datausdt;
        return this;
    }

    @JsonProperty("paxgusdt")
    public Paxgusdt getPaxgusdt() {
        return paxgusdt;
    }

    @JsonProperty("paxgusdt")
    public void setPaxgusdt(Paxgusdt paxgusdt) {
        this.paxgusdt = paxgusdt;
    }

    public Input withPaxgusdt(Paxgusdt paxgusdt) {
        this.paxgusdt = paxgusdt;
        return this;
    }

    @JsonProperty("creamusdt")
    public Creamusdt getCreamusdt() {
        return creamusdt;
    }

    @JsonProperty("creamusdt")
    public void setCreamusdt(Creamusdt creamusdt) {
        this.creamusdt = creamusdt;
    }

    public Input withCreamusdt(Creamusdt creamusdt) {
        this.creamusdt = creamusdt;
        return this;
    }

    @JsonProperty("swrvusdt")
    public Swrvusdt getSwrvusdt() {
        return swrvusdt;
    }

    @JsonProperty("swrvusdt")
    public void setSwrvusdt(Swrvusdt swrvusdt) {
        this.swrvusdt = swrvusdt;
    }

    public Input withSwrvusdt(Swrvusdt swrvusdt) {
        this.swrvusdt = swrvusdt;
        return this;
    }

    @JsonProperty("umausdt")
    public Umausdt getUmausdt() {
        return umausdt;
    }

    @JsonProperty("umausdt")
    public void setUmausdt(Umausdt umausdt) {
        this.umausdt = umausdt;
    }

    public Input withUmausdt(Umausdt umausdt) {
        this.umausdt = umausdt;
        return this;
    }

    @JsonProperty("diausdt")
    public Diausdt getDiausdt() {
        return diausdt;
    }

    @JsonProperty("diausdt")
    public void setDiausdt(Diausdt diausdt) {
        this.diausdt = diausdt;
    }

    public Input withDiausdt(Diausdt diausdt) {
        this.diausdt = diausdt;
        return this;
    }

    @JsonProperty("ksmusdt")
    public Ksmusdt getKsmusdt() {
        return ksmusdt;
    }

    @JsonProperty("ksmusdt")
    public void setKsmusdt(Ksmusdt ksmusdt) {
        this.ksmusdt = ksmusdt;
    }

    public Input withKsmusdt(Ksmusdt ksmusdt) {
        this.ksmusdt = ksmusdt;
        return this;
    }

    @JsonProperty("yfiiusdt")
    public Yfiiusdt getYfiiusdt() {
        return yfiiusdt;
    }

    @JsonProperty("yfiiusdt")
    public void setYfiiusdt(Yfiiusdt yfiiusdt) {
        this.yfiiusdt = yfiiusdt;
    }

    public Input withYfiiusdt(Yfiiusdt yfiiusdt) {
        this.yfiiusdt = yfiiusdt;
        return this;
    }

    @JsonProperty("bzrxusdt")
    public Bzrxusdt getBzrxusdt() {
        return bzrxusdt;
    }

    @JsonProperty("bzrxusdt")
    public void setBzrxusdt(Bzrxusdt bzrxusdt) {
        this.bzrxusdt = bzrxusdt;
    }

    public Input withBzrxusdt(Bzrxusdt bzrxusdt) {
        this.bzrxusdt = bzrxusdt;
        return this;
    }

    @JsonProperty("trbusdt")
    public Trbusdt getTrbusdt() {
        return trbusdt;
    }

    @JsonProperty("trbusdt")
    public void setTrbusdt(Trbusdt trbusdt) {
        this.trbusdt = trbusdt;
    }

    public Input withTrbusdt(Trbusdt trbusdt) {
        this.trbusdt = trbusdt;
        return this;
    }

    @JsonProperty("adxusdt")
    public Adxusdt getAdxusdt() {
        return adxusdt;
    }

    @JsonProperty("adxusdt")
    public void setAdxusdt(Adxusdt adxusdt) {
        this.adxusdt = adxusdt;
    }

    public Input withAdxusdt(Adxusdt adxusdt) {
        this.adxusdt = adxusdt;
        return this;
    }

    @JsonProperty("aaveusdt")
    public Aaveusdt getAaveusdt() {
        return aaveusdt;
    }

    @JsonProperty("aaveusdt")
    public void setAaveusdt(Aaveusdt aaveusdt) {
        this.aaveusdt = aaveusdt;
    }

    public Input withAaveusdt(Aaveusdt aaveusdt) {
        this.aaveusdt = aaveusdt;
        return this;
    }

    @JsonProperty("filusdt")
    public Filusdt getFilusdt() {
        return filusdt;
    }

    @JsonProperty("filusdt")
    public void setFilusdt(Filusdt filusdt) {
        this.filusdt = filusdt;
    }

    public Input withFilusdt(Filusdt filusdt) {
        this.filusdt = filusdt;
        return this;
    }

    @JsonProperty("crvusdt")
    public Crvusdt getCrvusdt() {
        return crvusdt;
    }

    @JsonProperty("crvusdt")
    public void setCrvusdt(Crvusdt crvusdt) {
        this.crvusdt = crvusdt;
    }

    public Input withCrvusdt(Crvusdt crvusdt) {
        this.crvusdt = crvusdt;
        return this;
    }

    @JsonProperty("nearusdt")
    public Nearusdt getNearusdt() {
        return nearusdt;
    }

    @JsonProperty("nearusdt")
    public void setNearusdt(Nearusdt nearusdt) {
        this.nearusdt = nearusdt;
    }

    public Input withNearusdt(Nearusdt nearusdt) {
        this.nearusdt = nearusdt;
        return this;
    }

    @JsonProperty("hntusdt")
    public Hntusdt getHntusdt() {
        return hntusdt;
    }

    @JsonProperty("hntusdt")
    public void setHntusdt(Hntusdt hntusdt) {
        this.hntusdt = hntusdt;
    }

    public Input withHntusdt(Hntusdt hntusdt) {
        this.hntusdt = hntusdt;
        return this;
    }

    @JsonProperty("avaxusdt")
    public Avaxusdt getAvaxusdt() {
        return avaxusdt;
    }

    @JsonProperty("avaxusdt")
    public void setAvaxusdt(Avaxusdt avaxusdt) {
        this.avaxusdt = avaxusdt;
    }

    public Input withAvaxusdt(Avaxusdt avaxusdt) {
        this.avaxusdt = avaxusdt;
        return this;
    }

    @JsonProperty("oxtusdt")
    public Oxtusdt getOxtusdt() {
        return oxtusdt;
    }

    @JsonProperty("oxtusdt")
    public void setOxtusdt(Oxtusdt oxtusdt) {
        this.oxtusdt = oxtusdt;
    }

    public Input withOxtusdt(Oxtusdt oxtusdt) {
        this.oxtusdt = oxtusdt;
        return this;
    }

    @JsonProperty("dockusdt")
    public Dockusdt getDockusdt() {
        return dockusdt;
    }

    @JsonProperty("dockusdt")
    public void setDockusdt(Dockusdt dockusdt) {
        this.dockusdt = dockusdt;
    }

    public Input withDockusdt(Dockusdt dockusdt) {
        this.dockusdt = dockusdt;
        return this;
    }

    @JsonProperty("duskusdt")
    public Duskusdt getDuskusdt() {
        return duskusdt;
    }

    @JsonProperty("duskusdt")
    public void setDuskusdt(Duskusdt duskusdt) {
        this.duskusdt = duskusdt;
    }

    public Input withDuskusdt(Duskusdt duskusdt) {
        this.duskusdt = duskusdt;
        return this;
    }

    @JsonProperty("wtcusdt")
    public Wtcusdt getWtcusdt() {
        return wtcusdt;
    }

    @JsonProperty("wtcusdt")
    public void setWtcusdt(Wtcusdt wtcusdt) {
        this.wtcusdt = wtcusdt;
    }

    public Input withWtcusdt(Wtcusdt wtcusdt) {
        this.wtcusdt = wtcusdt;
        return this;
    }

    @JsonProperty("perlusdt")
    public Perlusdt getPerlusdt() {
        return perlusdt;
    }

    @JsonProperty("perlusdt")
    public void setPerlusdt(Perlusdt perlusdt) {
        this.perlusdt = perlusdt;
    }

    public Input withPerlusdt(Perlusdt perlusdt) {
        this.perlusdt = perlusdt;
        return this;
    }

    @JsonProperty("straxusdt")
    public Straxusdt getStraxusdt() {
        return straxusdt;
    }

    @JsonProperty("straxusdt")
    public void setStraxusdt(Straxusdt straxusdt) {
        this.straxusdt = straxusdt;
    }

    public Input withStraxusdt(Straxusdt straxusdt) {
        this.straxusdt = straxusdt;
        return this;
    }

    @JsonProperty("injusdt")
    public Injusdt getInjusdt() {
        return injusdt;
    }

    @JsonProperty("injusdt")
    public void setInjusdt(Injusdt injusdt) {
        this.injusdt = injusdt;
    }

    public Input withInjusdt(Injusdt injusdt) {
        this.injusdt = injusdt;
        return this;
    }

    @JsonProperty("vetusdt")
    public Vetusdt getVetusdt() {
        return vetusdt;
    }

    @JsonProperty("vetusdt")
    public void setVetusdt(Vetusdt vetusdt) {
        this.vetusdt = vetusdt;
    }

    public Input withVetusdt(Vetusdt vetusdt) {
        this.vetusdt = vetusdt;
        return this;
    }

    @JsonProperty("mtlusdt")
    public Mtlusdt getMtlusdt() {
        return mtlusdt;
    }

    @JsonProperty("mtlusdt")
    public void setMtlusdt(Mtlusdt mtlusdt) {
        this.mtlusdt = mtlusdt;
    }

    public Input withMtlusdt(Mtlusdt mtlusdt) {
        this.mtlusdt = mtlusdt;
        return this;
    }

    @JsonProperty("frontusdt")
    public Frontusdt getFrontusdt() {
        return frontusdt;
    }

    @JsonProperty("frontusdt")
    public void setFrontusdt(Frontusdt frontusdt) {
        this.frontusdt = frontusdt;
    }

    public Input withFrontusdt(Frontusdt frontusdt) {
        this.frontusdt = frontusdt;
        return this;
    }

    @JsonProperty("glmusdt")
    public Glmusdt getGlmusdt() {
        return glmusdt;
    }

    @JsonProperty("glmusdt")
    public void setGlmusdt(Glmusdt glmusdt) {
        this.glmusdt = glmusdt;
    }

    public Input withGlmusdt(Glmusdt glmusdt) {
        this.glmusdt = glmusdt;
        return this;
    }

    @JsonProperty("sushiusdt")
    public Sushiusdt getSushiusdt() {
        return sushiusdt;
    }

    @JsonProperty("sushiusdt")
    public void setSushiusdt(Sushiusdt sushiusdt) {
        this.sushiusdt = sushiusdt;
    }

    public Input withSushiusdt(Sushiusdt sushiusdt) {
        this.sushiusdt = sushiusdt;
        return this;
    }

    @JsonProperty("firousdt")
    public Firousdt getFirousdt() {
        return firousdt;
    }

    @JsonProperty("firousdt")
    public void setFirousdt(Firousdt firousdt) {
        this.firousdt = firousdt;
    }

    public Input withFirousdt(Firousdt firousdt) {
        this.firousdt = firousdt;
        return this;
    }

    @JsonProperty("dexeusdt")
    public Dexeusdt getDexeusdt() {
        return dexeusdt;
    }

    @JsonProperty("dexeusdt")
    public void setDexeusdt(Dexeusdt dexeusdt) {
        this.dexeusdt = dexeusdt;
    }

    public Input withDexeusdt(Dexeusdt dexeusdt) {
        this.dexeusdt = dexeusdt;
        return this;
    }

    @JsonProperty("grtusdt")
    public Grtusdt getGrtusdt() {
        return grtusdt;
    }

    @JsonProperty("grtusdt")
    public void setGrtusdt(Grtusdt grtusdt) {
        this.grtusdt = grtusdt;
    }

    public Input withGrtusdt(Grtusdt grtusdt) {
        this.grtusdt = grtusdt;
        return this;
    }

    @JsonProperty("bchausdt")
    public Bchausdt getBchausdt() {
        return bchausdt;
    }

    @JsonProperty("bchausdt")
    public void setBchausdt(Bchausdt bchausdt) {
        this.bchausdt = bchausdt;
    }

    public Input withBchausdt(Bchausdt bchausdt) {
        this.bchausdt = bchausdt;
        return this;
    }

    @JsonProperty("bntusdt")
    public Bntusdt getBntusdt() {
        return bntusdt;
    }

    @JsonProperty("bntusdt")
    public void setBntusdt(Bntusdt bntusdt) {
        this.bntusdt = bntusdt;
    }

    public Input withBntusdt(Bntusdt bntusdt) {
        this.bntusdt = bntusdt;
        return this;
    }

    @JsonProperty("rsrusdt")
    public Rsrusdt getRsrusdt() {
        return rsrusdt;
    }

    @JsonProperty("rsrusdt")
    public void setRsrusdt(Rsrusdt rsrusdt) {
        this.rsrusdt = rsrusdt;
    }

    public Input withRsrusdt(Rsrusdt rsrusdt) {
        this.rsrusdt = rsrusdt;
        return this;
    }

    @JsonProperty("1inchusdt")
    public dev.mnnk.botv2.response._1inchusdt get1inchusdt() {
        return _1inchusdt;
    }

    @JsonProperty("1inchusdt")
    public void set1inchusdt(dev.mnnk.botv2.response._1inchusdt _1inchusdt) {
        this._1inchusdt = _1inchusdt;
    }

    public Input with1inchusdt(dev.mnnk.botv2.response._1inchusdt _1inchusdt) {
        this._1inchusdt = _1inchusdt;
        return this;
    }

    @JsonProperty("lunausdt")
    public Lunausdt getLunausdt() {
        return lunausdt;
    }

    @JsonProperty("lunausdt")
    public void setLunausdt(Lunausdt lunausdt) {
        this.lunausdt = lunausdt;
    }

    public Input withLunausdt(Lunausdt lunausdt) {
        this.lunausdt = lunausdt;
        return this;
    }

    @JsonProperty("uftusdt")
    public Uftusdt getUftusdt() {
        return uftusdt;
    }

    @JsonProperty("uftusdt")
    public void setUftusdt(Uftusdt uftusdt) {
        this.uftusdt = uftusdt;
    }

    public Input withUftusdt(Uftusdt uftusdt) {
        this.uftusdt = uftusdt;
        return this;
    }

    @JsonProperty("pundixusdt")
    public Pundixusdt getPundixusdt() {
        return pundixusdt;
    }

    @JsonProperty("pundixusdt")
    public void setPundixusdt(Pundixusdt pundixusdt) {
        this.pundixusdt = pundixusdt;
    }

    public Input withPundixusdt(Pundixusdt pundixusdt) {
        this.pundixusdt = pundixusdt;
        return this;
    }

    @JsonProperty("ckbusdt")
    public Ckbusdt getCkbusdt() {
        return ckbusdt;
    }

    @JsonProperty("ckbusdt")
    public void setCkbusdt(Ckbusdt ckbusdt) {
        this.ckbusdt = ckbusdt;
    }

    public Input withCkbusdt(Ckbusdt ckbusdt) {
        this.ckbusdt = ckbusdt;
        return this;
    }

    @JsonProperty("vibusdt")
    public Vibusdt getVibusdt() {
        return vibusdt;
    }

    @JsonProperty("vibusdt")
    public void setVibusdt(Vibusdt vibusdt) {
        this.vibusdt = vibusdt;
    }

    public Input withVibusdt(Vibusdt vibusdt) {
        this.vibusdt = vibusdt;
        return this;
    }

    @JsonProperty("gtousdt")
    public Gtousdt getGtousdt() {
        return gtousdt;
    }

    @JsonProperty("gtousdt")
    public void setGtousdt(Gtousdt gtousdt) {
        this.gtousdt = gtousdt;
    }

    public Input withGtousdt(Gtousdt gtousdt) {
        this.gtousdt = gtousdt;
        return this;
    }

    @JsonProperty("tkousdt")
    public Tkousdt getTkousdt() {
        return tkousdt;
    }

    @JsonProperty("tkousdt")
    public void setTkousdt(Tkousdt tkousdt) {
        this.tkousdt = tkousdt;
    }

    public Input withTkousdt(Tkousdt tkousdt) {
        this.tkousdt = tkousdt;
        return this;
    }

    @JsonProperty("pushusdt")
    public Pushusdt getPushusdt() {
        return pushusdt;
    }

    @JsonProperty("pushusdt")
    public void setPushusdt(Pushusdt pushusdt) {
        this.pushusdt = pushusdt;
    }

    public Input withPushusdt(Pushusdt pushusdt) {
        this.pushusdt = pushusdt;
        return this;
    }

    @JsonProperty("cvcusdt")
    public Cvcusdt getCvcusdt() {
        return cvcusdt;
    }

    @JsonProperty("cvcusdt")
    public void setCvcusdt(Cvcusdt cvcusdt) {
        this.cvcusdt = cvcusdt;
    }

    public Input withCvcusdt(Cvcusdt cvcusdt) {
        this.cvcusdt = cvcusdt;
        return this;
    }

    @JsonProperty("cakeusdt")
    public Cakeusdt getCakeusdt() {
        return cakeusdt;
    }

    @JsonProperty("cakeusdt")
    public void setCakeusdt(Cakeusdt cakeusdt) {
        this.cakeusdt = cakeusdt;
    }

    public Input withCakeusdt(Cakeusdt cakeusdt) {
        this.cakeusdt = cakeusdt;
        return this;
    }

    @JsonProperty("ezusdt")
    public Ezusdt getEzusdt() {
        return ezusdt;
    }

    @JsonProperty("ezusdt")
    public void setEzusdt(Ezusdt ezusdt) {
        this.ezusdt = ezusdt;
    }

    public Input withEzusdt(Ezusdt ezusdt) {
        this.ezusdt = ezusdt;
        return this;
    }

    @JsonProperty("arkusdt")
    public Arkusdt getArkusdt() {
        return arkusdt;
    }

    @JsonProperty("arkusdt")
    public void setArkusdt(Arkusdt arkusdt) {
        this.arkusdt = arkusdt;
    }

    public Input withArkusdt(Arkusdt arkusdt) {
        this.arkusdt = arkusdt;
        return this;
    }

    @JsonProperty("kmdusdt")
    public Kmdusdt getKmdusdt() {
        return kmdusdt;
    }

    @JsonProperty("kmdusdt")
    public void setKmdusdt(Kmdusdt kmdusdt) {
        this.kmdusdt = kmdusdt;
    }

    public Input withKmdusdt(Kmdusdt kmdusdt) {
        this.kmdusdt = kmdusdt;
        return this;
    }

    @JsonProperty("solusdt")
    public Solusdt getSolusdt() {
        return solusdt;
    }

    @JsonProperty("solusdt")
    public void setSolusdt(Solusdt solusdt) {
        this.solusdt = solusdt;
    }

    public Input withSolusdt(Solusdt solusdt) {
        this.solusdt = solusdt;
        return this;
    }

    @JsonProperty("shibusdt")
    public Shibusdt getShibusdt() {
        return shibusdt;
    }

    @JsonProperty("shibusdt")
    public void setShibusdt(Shibusdt shibusdt) {
        this.shibusdt = shibusdt;
    }

    public Input withShibusdt(Shibusdt shibusdt) {
        this.shibusdt = shibusdt;
        return this;
    }

    @JsonProperty("ethwrx")
    public Ethwrx getEthwrx() {
        return ethwrx;
    }

    @JsonProperty("ethwrx")
    public void setEthwrx(Ethwrx ethwrx) {
        this.ethwrx = ethwrx;
    }

    public Input withEthwrx(Ethwrx ethwrx) {
        this.ethwrx = ethwrx;
        return this;
    }

    @JsonProperty("xrpwrx")
    public Xrpwrx getXrpwrx() {
        return xrpwrx;
    }

    @JsonProperty("xrpwrx")
    public void setXrpwrx(Xrpwrx xrpwrx) {
        this.xrpwrx = xrpwrx;
    }

    public Input withXrpwrx(Xrpwrx xrpwrx) {
        this.xrpwrx = xrpwrx;
        return this;
    }

    @JsonProperty("yfiwrx")
    public Yfiwrx getYfiwrx() {
        return yfiwrx;
    }

    @JsonProperty("yfiwrx")
    public void setYfiwrx(Yfiwrx yfiwrx) {
        this.yfiwrx = yfiwrx;
    }

    public Input withYfiwrx(Yfiwrx yfiwrx) {
        this.yfiwrx = yfiwrx;
        return this;
    }

    @JsonProperty("bnbwrx")
    public Bnbwrx getBnbwrx() {
        return bnbwrx;
    }

    @JsonProperty("bnbwrx")
    public void setBnbwrx(Bnbwrx bnbwrx) {
        this.bnbwrx = bnbwrx;
    }

    public Input withBnbwrx(Bnbwrx bnbwrx) {
        this.bnbwrx = bnbwrx;
        return this;
    }

    @JsonProperty("trxwrx")
    public Trxwrx getTrxwrx() {
        return trxwrx;
    }

    @JsonProperty("trxwrx")
    public void setTrxwrx(Trxwrx trxwrx) {
        this.trxwrx = trxwrx;
    }

    public Input withTrxwrx(Trxwrx trxwrx) {
        this.trxwrx = trxwrx;
        return this;
    }

    @JsonProperty("eoswrx")
    public Eoswrx getEoswrx() {
        return eoswrx;
    }

    @JsonProperty("eoswrx")
    public void setEoswrx(Eoswrx eoswrx) {
        this.eoswrx = eoswrx;
    }

    public Input withEoswrx(Eoswrx eoswrx) {
        this.eoswrx = eoswrx;
        return this;
    }

    @JsonProperty("ltcwrx")
    public Ltcwrx getLtcwrx() {
        return ltcwrx;
    }

    @JsonProperty("ltcwrx")
    public void setLtcwrx(Ltcwrx ltcwrx) {
        this.ltcwrx = ltcwrx;
    }

    public Input withLtcwrx(Ltcwrx ltcwrx) {
        this.ltcwrx = ltcwrx;
        return this;
    }

    @JsonProperty("linkwrx")
    public Linkwrx getLinkwrx() {
        return linkwrx;
    }

    @JsonProperty("linkwrx")
    public void setLinkwrx(Linkwrx linkwrx) {
        this.linkwrx = linkwrx;
    }

    public Input withLinkwrx(Linkwrx linkwrx) {
        this.linkwrx = linkwrx;
        return this;
    }

    @JsonProperty("enjwrx")
    public Enjwrx getEnjwrx() {
        return enjwrx;
    }

    @JsonProperty("enjwrx")
    public void setEnjwrx(Enjwrx enjwrx) {
        this.enjwrx = enjwrx;
    }

    public Input withEnjwrx(Enjwrx enjwrx) {
        this.enjwrx = enjwrx;
        return this;
    }

    @JsonProperty("dogewrx")
    public Dogewrx getDogewrx() {
        return dogewrx;
    }

    @JsonProperty("dogewrx")
    public void setDogewrx(Dogewrx dogewrx) {
        this.dogewrx = dogewrx;
    }

    public Input withDogewrx(Dogewrx dogewrx) {
        this.dogewrx = dogewrx;
        return this;
    }

    @JsonProperty("maticwrx")
    public Maticwrx getMaticwrx() {
        return maticwrx;
    }

    @JsonProperty("maticwrx")
    public void setMaticwrx(Maticwrx maticwrx) {
        this.maticwrx = maticwrx;
    }

    public Input withMaticwrx(Maticwrx maticwrx) {
        this.maticwrx = maticwrx;
        return this;
    }

    @JsonProperty("adawrx")
    public Adawrx getAdawrx() {
        return adawrx;
    }

    @JsonProperty("adawrx")
    public void setAdawrx(Adawrx adawrx) {
        this.adawrx = adawrx;
    }

    public Input withAdawrx(Adawrx adawrx) {
        this.adawrx = adawrx;
        return this;
    }

    @JsonProperty("batwrx")
    public Batwrx getBatwrx() {
        return batwrx;
    }

    @JsonProperty("batwrx")
    public void setBatwrx(Batwrx batwrx) {
        this.batwrx = batwrx;
    }

    public Input withBatwrx(Batwrx batwrx) {
        this.batwrx = batwrx;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Input withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Input.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("btcinr");
        sb.append('=');
        sb.append(((this.btcinr == null)?"<null>":this.btcinr));
        sb.append(',');
        sb.append("xrpinr");
        sb.append('=');
        sb.append(((this.xrpinr == null)?"<null>":this.xrpinr));
        sb.append(',');
        sb.append("ethinr");
        sb.append('=');
        sb.append(((this.ethinr == null)?"<null>":this.ethinr));
        sb.append(',');
        sb.append("trxinr");
        sb.append('=');
        sb.append(((this.trxinr == null)?"<null>":this.trxinr));
        sb.append(',');
        sb.append("eosinr");
        sb.append('=');
        sb.append(((this.eosinr == null)?"<null>":this.eosinr));
        sb.append(',');
        sb.append("zilinr");
        sb.append('=');
        sb.append(((this.zilinr == null)?"<null>":this.zilinr));
        sb.append(',');
        sb.append("batinr");
        sb.append('=');
        sb.append(((this.batinr == null)?"<null>":this.batinr));
        sb.append(',');
        sb.append("zrxinr");
        sb.append('=');
        sb.append(((this.zrxinr == null)?"<null>":this.zrxinr));
        sb.append(',');
        sb.append("omginr");
        sb.append('=');
        sb.append(((this.omginr == null)?"<null>":this.omginr));
        sb.append(',');
        sb.append("iostinr");
        sb.append('=');
        sb.append(((this.iostinr == null)?"<null>":this.iostinr));
        sb.append(',');
        sb.append("dentinr");
        sb.append('=');
        sb.append(((this.dentinr == null)?"<null>":this.dentinr));
        sb.append(',');
        sb.append("hotinr");
        sb.append('=');
        sb.append(((this.hotinr == null)?"<null>":this.hotinr));
        sb.append(',');
        sb.append("usdtinr");
        sb.append('=');
        sb.append(((this.usdtinr == null)?"<null>":this.usdtinr));
        sb.append(',');
        sb.append("wrxinr");
        sb.append('=');
        sb.append(((this.wrxinr == null)?"<null>":this.wrxinr));
        sb.append(',');
        sb.append("maticinr");
        sb.append('=');
        sb.append(((this.maticinr == null)?"<null>":this.maticinr));
        sb.append(',');
        sb.append("bchinr");
        sb.append('=');
        sb.append(((this.bchinr == null)?"<null>":this.bchinr));
        sb.append(',');
        sb.append("bnbinr");
        sb.append('=');
        sb.append(((this.bnbinr == null)?"<null>":this.bnbinr));
        sb.append(',');
        sb.append("bttinr");
        sb.append('=');
        sb.append(((this.bttinr == null)?"<null>":this.bttinr));
        sb.append(',');
        sb.append("chzinr");
        sb.append('=');
        sb.append(((this.chzinr == null)?"<null>":this.chzinr));
        sb.append(',');
        sb.append("oneinr");
        sb.append('=');
        sb.append(((this.oneinr == null)?"<null>":this.oneinr));
        sb.append(',');
        sb.append("yfiinr");
        sb.append('=');
        sb.append(((this.yfiinr == null)?"<null>":this.yfiinr));
        sb.append(',');
        sb.append("uniinr");
        sb.append('=');
        sb.append(((this.uniinr == null)?"<null>":this.uniinr));
        sb.append(',');
        sb.append("linkinr");
        sb.append('=');
        sb.append(((this.linkinr == null)?"<null>":this.linkinr));
        sb.append(',');
        sb.append("sxpinr");
        sb.append('=');
        sb.append(((this.sxpinr == null)?"<null>":this.sxpinr));
        sb.append(',');
        sb.append("adainr");
        sb.append('=');
        sb.append(((this.adainr == null)?"<null>":this.adainr));
        sb.append(',');
        sb.append("nanoinr");
        sb.append('=');
        sb.append(((this.nanoinr == null)?"<null>":this.nanoinr));
        sb.append(',');
        sb.append("atominr");
        sb.append('=');
        sb.append(((this.atominr == null)?"<null>":this.atominr));
        sb.append(',');
        sb.append("xlminr");
        sb.append('=');
        sb.append(((this.xlminr == null)?"<null>":this.xlminr));
        sb.append(',');
        sb.append("fetinr");
        sb.append('=');
        sb.append(((this.fetinr == null)?"<null>":this.fetinr));
        sb.append(',');
        sb.append("xeminr");
        sb.append('=');
        sb.append(((this.xeminr == null)?"<null>":this.xeminr));
        sb.append(',');
        sb.append("zecinr");
        sb.append('=');
        sb.append(((this.zecinr == null)?"<null>":this.zecinr));
        sb.append(',');
        sb.append("busdinr");
        sb.append('=');
        sb.append(((this.busdinr == null)?"<null>":this.busdinr));
        sb.append(',');
        sb.append("yfiiinr");
        sb.append('=');
        sb.append(((this.yfiiinr == null)?"<null>":this.yfiiinr));
        sb.append(',');
        sb.append("dogeinr");
        sb.append('=');
        sb.append(((this.dogeinr == null)?"<null>":this.dogeinr));
        sb.append(',');
        sb.append("dotinr");
        sb.append('=');
        sb.append(((this.dotinr == null)?"<null>":this.dotinr));
        sb.append(',');
        sb.append("vetinr");
        sb.append('=');
        sb.append(((this.vetinr == null)?"<null>":this.vetinr));
        sb.append(',');
        sb.append("crvinr");
        sb.append('=');
        sb.append(((this.crvinr == null)?"<null>":this.crvinr));
        sb.append(',');
        sb.append("reninr");
        sb.append('=');
        sb.append(((this.reninr == null)?"<null>":this.reninr));
        sb.append(',');
        sb.append("enjinr");
        sb.append('=');
        sb.append(((this.enjinr == null)?"<null>":this.enjinr));
        sb.append(',');
        sb.append("manainr");
        sb.append('=');
        sb.append(((this.manainr == null)?"<null>":this.manainr));
        sb.append(',');
        sb.append("hbarinr");
        sb.append('=');
        sb.append(((this.hbarinr == null)?"<null>":this.hbarinr));
        sb.append(',');
        sb.append("umainr");
        sb.append('=');
        sb.append(((this.umainr == null)?"<null>":this.umainr));
        sb.append(',');
        sb.append("chrinr");
        sb.append('=');
        sb.append(((this.chrinr == null)?"<null>":this.chrinr));
        sb.append(',');
        sb.append("paxginr");
        sb.append('=');
        sb.append(((this.paxginr == null)?"<null>":this.paxginr));
        sb.append(',');
        sb.append("_1inchinr");
        sb.append('=');
        sb.append(((this._1inchinr == null)?"<null>":this._1inchinr));
        sb.append(',');
        sb.append("etcinr");
        sb.append('=');
        sb.append(((this.etcinr == null)?"<null>":this.etcinr));
        sb.append(',');
        sb.append("uftinr");
        sb.append('=');
        sb.append(((this.uftinr == null)?"<null>":this.uftinr));
        sb.append(',');
        sb.append("dockinr");
        sb.append('=');
        sb.append(((this.dockinr == null)?"<null>":this.dockinr));
        sb.append(',');
        sb.append("filinr");
        sb.append('=');
        sb.append(((this.filinr == null)?"<null>":this.filinr));
        sb.append(',');
        sb.append("wininr");
        sb.append('=');
        sb.append(((this.wininr == null)?"<null>":this.wininr));
        sb.append(',');
        sb.append("tkoinr");
        sb.append('=');
        sb.append(((this.tkoinr == null)?"<null>":this.tkoinr));
        sb.append(',');
        sb.append("pushinr");
        sb.append('=');
        sb.append(((this.pushinr == null)?"<null>":this.pushinr));
        sb.append(',');
        sb.append("avaxinr");
        sb.append('=');
        sb.append(((this.avaxinr == null)?"<null>":this.avaxinr));
        sb.append(',');
        sb.append("lunainr");
        sb.append('=');
        sb.append(((this.lunainr == null)?"<null>":this.lunainr));
        sb.append(',');
        sb.append("xvginr");
        sb.append('=');
        sb.append(((this.xvginr == null)?"<null>":this.xvginr));
        sb.append(',');
        sb.append("scinr");
        sb.append('=');
        sb.append(((this.scinr == null)?"<null>":this.scinr));
        sb.append(',');
        sb.append("fttinr");
        sb.append('=');
        sb.append(((this.fttinr == null)?"<null>":this.fttinr));
        sb.append(',');
        sb.append("dgbinr");
        sb.append('=');
        sb.append(((this.dgbinr == null)?"<null>":this.dgbinr));
        sb.append(',');
        sb.append("cvcinr");
        sb.append('=');
        sb.append(((this.cvcinr == null)?"<null>":this.cvcinr));
        sb.append(',');
        sb.append("cakeinr");
        sb.append('=');
        sb.append(((this.cakeinr == null)?"<null>":this.cakeinr));
        sb.append(',');
        sb.append("ezinr");
        sb.append('=');
        sb.append(((this.ezinr == null)?"<null>":this.ezinr));
        sb.append(',');
        sb.append("bzrxinr");
        sb.append('=');
        sb.append(((this.bzrxinr == null)?"<null>":this.bzrxinr));
        sb.append(',');
        sb.append("ftminr");
        sb.append('=');
        sb.append(((this.ftminr == null)?"<null>":this.ftminr));
        sb.append(',');
        sb.append("hntinr");
        sb.append('=');
        sb.append(((this.hntinr == null)?"<null>":this.hntinr));
        sb.append(',');
        sb.append("arkinr");
        sb.append('=');
        sb.append(((this.arkinr == null)?"<null>":this.arkinr));
        sb.append(',');
        sb.append("ctsiinr");
        sb.append('=');
        sb.append(((this.ctsiinr == null)?"<null>":this.ctsiinr));
        sb.append(',');
        sb.append("kmdinr");
        sb.append('=');
        sb.append(((this.kmdinr == null)?"<null>":this.kmdinr));
        sb.append(',');
        sb.append("solinr");
        sb.append('=');
        sb.append(((this.solinr == null)?"<null>":this.solinr));
        sb.append(',');
        sb.append("cotiinr");
        sb.append('=');
        sb.append(((this.cotiinr == null)?"<null>":this.cotiinr));
        sb.append(',');
        sb.append("iotxinr");
        sb.append('=');
        sb.append(((this.iotxinr == null)?"<null>":this.iotxinr));
        sb.append(',');
        sb.append("shibinr");
        sb.append('=');
        sb.append(((this.shibinr == null)?"<null>":this.shibinr));
        sb.append(',');
        sb.append("ltcinr");
        sb.append('=');
        sb.append(((this.ltcinr == null)?"<null>":this.ltcinr));
        sb.append(',');
        sb.append("dashinr");
        sb.append('=');
        sb.append(((this.dashinr == null)?"<null>":this.dashinr));
        sb.append(',');
        sb.append("xrpbtc");
        sb.append('=');
        sb.append(((this.xrpbtc == null)?"<null>":this.xrpbtc));
        sb.append(',');
        sb.append("trxbtc");
        sb.append('=');
        sb.append(((this.trxbtc == null)?"<null>":this.trxbtc));
        sb.append(',');
        sb.append("ethbtc");
        sb.append('=');
        sb.append(((this.ethbtc == null)?"<null>":this.ethbtc));
        sb.append(',');
        sb.append("zilbtc");
        sb.append('=');
        sb.append(((this.zilbtc == null)?"<null>":this.zilbtc));
        sb.append(',');
        sb.append("batbtc");
        sb.append('=');
        sb.append(((this.batbtc == null)?"<null>":this.batbtc));
        sb.append(',');
        sb.append("ltcbtc");
        sb.append('=');
        sb.append(((this.ltcbtc == null)?"<null>":this.ltcbtc));
        sb.append(',');
        sb.append("qkcbtc");
        sb.append('=');
        sb.append(((this.qkcbtc == null)?"<null>":this.qkcbtc));
        sb.append(',');
        sb.append("dashbtc");
        sb.append('=');
        sb.append(((this.dashbtc == null)?"<null>":this.dashbtc));
        sb.append(',');
        sb.append("funbtc");
        sb.append('=');
        sb.append(((this.funbtc == null)?"<null>":this.funbtc));
        sb.append(',');
        sb.append("iostbtc");
        sb.append('=');
        sb.append(((this.iostbtc == null)?"<null>":this.iostbtc));
        sb.append(',');
        sb.append("nulsbtc");
        sb.append('=');
        sb.append(((this.nulsbtc == null)?"<null>":this.nulsbtc));
        sb.append(',');
        sb.append("omgbtc");
        sb.append('=');
        sb.append(((this.omgbtc == null)?"<null>":this.omgbtc));
        sb.append(',');
        sb.append("reqbtc");
        sb.append('=');
        sb.append(((this.reqbtc == null)?"<null>":this.reqbtc));
        sb.append(',');
        sb.append("sntbtc");
        sb.append('=');
        sb.append(((this.sntbtc == null)?"<null>":this.sntbtc));
        sb.append(',');
        sb.append("thetabtc");
        sb.append('=');
        sb.append(((this.thetabtc == null)?"<null>":this.thetabtc));
        sb.append(',');
        sb.append("zrxbtc");
        sb.append('=');
        sb.append(((this.zrxbtc == null)?"<null>":this.zrxbtc));
        sb.append(',');
        sb.append("eosbtc");
        sb.append('=');
        sb.append(((this.eosbtc == null)?"<null>":this.eosbtc));
        sb.append(',');
        sb.append("icxbtc");
        sb.append('=');
        sb.append(((this.icxbtc == null)?"<null>":this.icxbtc));
        sb.append(',');
        sb.append("polybtc");
        sb.append('=');
        sb.append(((this.polybtc == null)?"<null>":this.polybtc));
        sb.append(',');
        sb.append("paxbtc");
        sb.append('=');
        sb.append(((this.paxbtc == null)?"<null>":this.paxbtc));
        sb.append(',');
        sb.append("usdcbtc");
        sb.append('=');
        sb.append(((this.usdcbtc == null)?"<null>":this.usdcbtc));
        sb.append(',');
        sb.append("xlmbtc");
        sb.append('=');
        sb.append(((this.xlmbtc == null)?"<null>":this.xlmbtc));
        sb.append(',');
        sb.append("fetbtc");
        sb.append('=');
        sb.append(((this.fetbtc == null)?"<null>":this.fetbtc));
        sb.append(',');
        sb.append("celrbtc");
        sb.append('=');
        sb.append(((this.celrbtc == null)?"<null>":this.celrbtc));
        sb.append(',');
        sb.append("maticbtc");
        sb.append('=');
        sb.append(((this.maticbtc == null)?"<null>":this.maticbtc));
        sb.append(',');
        sb.append("adabtc");
        sb.append('=');
        sb.append(((this.adabtc == null)?"<null>":this.adabtc));
        sb.append(',');
        sb.append("rvnbtc");
        sb.append('=');
        sb.append(((this.rvnbtc == null)?"<null>":this.rvnbtc));
        sb.append(',');
        sb.append("xmrbtc");
        sb.append('=');
        sb.append(((this.xmrbtc == null)?"<null>":this.xmrbtc));
        sb.append(',');
        sb.append("atombtc");
        sb.append('=');
        sb.append(((this.atombtc == null)?"<null>":this.atombtc));
        sb.append(',');
        sb.append("bnbbtc");
        sb.append('=');
        sb.append(((this.bnbbtc == null)?"<null>":this.bnbbtc));
        sb.append(',');
        sb.append("wrxbtc");
        sb.append('=');
        sb.append(((this.wrxbtc == null)?"<null>":this.wrxbtc));
        sb.append(',');
        sb.append("fttbtc");
        sb.append('=');
        sb.append(((this.fttbtc == null)?"<null>":this.fttbtc));
        sb.append(',');
        sb.append("stmxbtc");
        sb.append('=');
        sb.append(((this.stmxbtc == null)?"<null>":this.stmxbtc));
        sb.append(',');
        sb.append("glmbtc");
        sb.append('=');
        sb.append(((this.glmbtc == null)?"<null>":this.glmbtc));
        sb.append(',');
        sb.append("btcusdt");
        sb.append('=');
        sb.append(((this.btcusdt == null)?"<null>":this.btcusdt));
        sb.append(',');
        sb.append("trxusdt");
        sb.append('=');
        sb.append(((this.trxusdt == null)?"<null>":this.trxusdt));
        sb.append(',');
        sb.append("xrpusdt");
        sb.append('=');
        sb.append(((this.xrpusdt == null)?"<null>":this.xrpusdt));
        sb.append(',');
        sb.append("eosusdt");
        sb.append('=');
        sb.append(((this.eosusdt == null)?"<null>":this.eosusdt));
        sb.append(',');
        sb.append("ethusdt");
        sb.append('=');
        sb.append(((this.ethusdt == null)?"<null>":this.ethusdt));
        sb.append(',');
        sb.append("icxusdt");
        sb.append('=');
        sb.append(((this.icxusdt == null)?"<null>":this.icxusdt));
        sb.append(',');
        sb.append("ltcusdt");
        sb.append('=');
        sb.append(((this.ltcusdt == null)?"<null>":this.ltcusdt));
        sb.append(',');
        sb.append("tusdusdt");
        sb.append('=');
        sb.append(((this.tusdusdt == null)?"<null>":this.tusdusdt));
        sb.append(',');
        sb.append("hotusdt");
        sb.append('=');
        sb.append(((this.hotusdt == null)?"<null>":this.hotusdt));
        sb.append(',');
        sb.append("batusdt");
        sb.append('=');
        sb.append(((this.batusdt == null)?"<null>":this.batusdt));
        sb.append(',');
        sb.append("dashusdt");
        sb.append('=');
        sb.append(((this.dashusdt == null)?"<null>":this.dashusdt));
        sb.append(',');
        sb.append("ncashusdt");
        sb.append('=');
        sb.append(((this.ncashusdt == null)?"<null>":this.ncashusdt));
        sb.append(',');
        sb.append("qkcusdt");
        sb.append('=');
        sb.append(((this.qkcusdt == null)?"<null>":this.qkcusdt));
        sb.append(',');
        sb.append("zilusdt");
        sb.append('=');
        sb.append(((this.zilusdt == null)?"<null>":this.zilusdt));
        sb.append(',');
        sb.append("zrxusdt");
        sb.append('=');
        sb.append(((this.zrxusdt == null)?"<null>":this.zrxusdt));
        sb.append(',');
        sb.append("bchusdt");
        sb.append('=');
        sb.append(((this.bchusdt == null)?"<null>":this.bchusdt));
        sb.append(',');
        sb.append("bchsvusdt");
        sb.append('=');
        sb.append(((this.bchsvusdt == null)?"<null>":this.bchsvusdt));
        sb.append(',');
        sb.append("paxusdt");
        sb.append('=');
        sb.append(((this.paxusdt == null)?"<null>":this.paxusdt));
        sb.append(',');
        sb.append("usdcusdt");
        sb.append('=');
        sb.append(((this.usdcusdt == null)?"<null>":this.usdcusdt));
        sb.append(',');
        sb.append("omgusdt");
        sb.append('=');
        sb.append(((this.omgusdt == null)?"<null>":this.omgusdt));
        sb.append(',');
        sb.append("polyusdt");
        sb.append('=');
        sb.append(((this.polyusdt == null)?"<null>":this.polyusdt));
        sb.append(',');
        sb.append("dentusdt");
        sb.append('=');
        sb.append(((this.dentusdt == null)?"<null>":this.dentusdt));
        sb.append(',');
        sb.append("iostusdt");
        sb.append('=');
        sb.append(((this.iostusdt == null)?"<null>":this.iostusdt));
        sb.append(',');
        sb.append("funusdt");
        sb.append('=');
        sb.append(((this.funusdt == null)?"<null>":this.funusdt));
        sb.append(',');
        sb.append("sntusdt");
        sb.append('=');
        sb.append(((this.sntusdt == null)?"<null>":this.sntusdt));
        sb.append(',');
        sb.append("thetausdt");
        sb.append('=');
        sb.append(((this.thetausdt == null)?"<null>":this.thetausdt));
        sb.append(',');
        sb.append("requsdt");
        sb.append('=');
        sb.append(((this.requsdt == null)?"<null>":this.requsdt));
        sb.append(',');
        sb.append("xlmusdt");
        sb.append('=');
        sb.append(((this.xlmusdt == null)?"<null>":this.xlmusdt));
        sb.append(',');
        sb.append("xtzusdt");
        sb.append('=');
        sb.append(((this.xtzusdt == null)?"<null>":this.xtzusdt));
        sb.append(',');
        sb.append("bttusdt");
        sb.append('=');
        sb.append(((this.bttusdt == null)?"<null>":this.bttusdt));
        sb.append(',');
        sb.append("fetusdt");
        sb.append('=');
        sb.append(((this.fetusdt == null)?"<null>":this.fetusdt));
        sb.append(',');
        sb.append("tfuelusdt");
        sb.append('=');
        sb.append(((this.tfuelusdt == null)?"<null>":this.tfuelusdt));
        sb.append(',');
        sb.append("celrusdt");
        sb.append('=');
        sb.append(((this.celrusdt == null)?"<null>":this.celrusdt));
        sb.append(',');
        sb.append("maticusdt");
        sb.append('=');
        sb.append(((this.maticusdt == null)?"<null>":this.maticusdt));
        sb.append(',');
        sb.append("adausdt");
        sb.append('=');
        sb.append(((this.adausdt == null)?"<null>":this.adausdt));
        sb.append(',');
        sb.append("rvnusdt");
        sb.append('=');
        sb.append(((this.rvnusdt == null)?"<null>":this.rvnusdt));
        sb.append(',');
        sb.append("xmrusdt");
        sb.append('=');
        sb.append(((this.xmrusdt == null)?"<null>":this.xmrusdt));
        sb.append(',');
        sb.append("atomusdt");
        sb.append('=');
        sb.append(((this.atomusdt == null)?"<null>":this.atomusdt));
        sb.append(',');
        sb.append("algousdt");
        sb.append('=');
        sb.append(((this.algousdt == null)?"<null>":this.algousdt));
        sb.append(',');
        sb.append("linkusdt");
        sb.append('=');
        sb.append(((this.linkusdt == null)?"<null>":this.linkusdt));
        sb.append(',');
        sb.append("qtumusdt");
        sb.append('=');
        sb.append(((this.qtumusdt == null)?"<null>":this.qtumusdt));
        sb.append(',');
        sb.append("etcusdt");
        sb.append('=');
        sb.append(((this.etcusdt == null)?"<null>":this.etcusdt));
        sb.append(',');
        sb.append("iotausdt");
        sb.append('=');
        sb.append(((this.iotausdt == null)?"<null>":this.iotausdt));
        sb.append(',');
        sb.append("zecusdt");
        sb.append('=');
        sb.append(((this.zecusdt == null)?"<null>":this.zecusdt));
        sb.append(',');
        sb.append("wavesusdt");
        sb.append('=');
        sb.append(((this.wavesusdt == null)?"<null>":this.wavesusdt));
        sb.append(',');
        sb.append("ftmusdt");
        sb.append('=');
        sb.append(((this.ftmusdt == null)?"<null>":this.ftmusdt));
        sb.append(',');
        sb.append("enjusdt");
        sb.append('=');
        sb.append(((this.enjusdt == null)?"<null>":this.enjusdt));
        sb.append(',');
        sb.append("lskusdt");
        sb.append('=');
        sb.append(((this.lskusdt == null)?"<null>":this.lskusdt));
        sb.append(',');
        sb.append("steemusdt");
        sb.append('=');
        sb.append(((this.steemusdt == null)?"<null>":this.steemusdt));
        sb.append(',');
        sb.append("xvgusdt");
        sb.append('=');
        sb.append(((this.xvgusdt == null)?"<null>":this.xvgusdt));
        sb.append(',');
        sb.append("loomusdt");
        sb.append('=');
        sb.append(((this.loomusdt == null)?"<null>":this.loomusdt));
        sb.append(',');
        sb.append("manausdt");
        sb.append('=');
        sb.append(((this.manausdt == null)?"<null>":this.manausdt));
        sb.append(',');
        sb.append("repusdt");
        sb.append('=');
        sb.append(((this.repusdt == null)?"<null>":this.repusdt));
        sb.append(',');
        sb.append("blzusdt");
        sb.append('=');
        sb.append(((this.blzusdt == null)?"<null>":this.blzusdt));
        sb.append(',');
        sb.append("nanousdt");
        sb.append('=');
        sb.append(((this.nanousdt == null)?"<null>":this.nanousdt));
        sb.append(',');
        sb.append("scusdt");
        sb.append('=');
        sb.append(((this.scusdt == null)?"<null>":this.scusdt));
        sb.append(',');
        sb.append("btgusdt");
        sb.append('=');
        sb.append(((this.btgusdt == null)?"<null>":this.btgusdt));
        sb.append(',');
        sb.append("xemusdt");
        sb.append('=');
        sb.append(((this.xemusdt == null)?"<null>":this.xemusdt));
        sb.append(',');
        sb.append("btsusdt");
        sb.append('=');
        sb.append(((this.btsusdt == null)?"<null>":this.btsusdt));
        sb.append(',');
        sb.append("ardrusdt");
        sb.append('=');
        sb.append(((this.ardrusdt == null)?"<null>":this.ardrusdt));
        sb.append(',');
        sb.append("nasusdt");
        sb.append('=');
        sb.append(((this.nasusdt == null)?"<null>":this.nasusdt));
        sb.append(',');
        sb.append("winusdt");
        sb.append('=');
        sb.append(((this.winusdt == null)?"<null>":this.winusdt));
        sb.append(',');
        sb.append("bnbusdt");
        sb.append('=');
        sb.append(((this.bnbusdt == null)?"<null>":this.bnbusdt));
        sb.append(',');
        sb.append("chzusdt");
        sb.append('=');
        sb.append(((this.chzusdt == null)?"<null>":this.chzusdt));
        sb.append(',');
        sb.append("wrxusdt");
        sb.append('=');
        sb.append(((this.wrxusdt == null)?"<null>":this.wrxusdt));
        sb.append(',');
        sb.append("kavausdt");
        sb.append('=');
        sb.append(((this.kavausdt == null)?"<null>":this.kavausdt));
        sb.append(',');
        sb.append("ankrusdt");
        sb.append('=');
        sb.append(((this.ankrusdt == null)?"<null>":this.ankrusdt));
        sb.append(',');
        sb.append("busdusdt");
        sb.append('=');
        sb.append(((this.busdusdt == null)?"<null>":this.busdusdt));
        sb.append(',');
        sb.append("oneusdt");
        sb.append('=');
        sb.append(((this.oneusdt == null)?"<null>":this.oneusdt));
        sb.append(',');
        sb.append("ognusdt");
        sb.append('=');
        sb.append(((this.ognusdt == null)?"<null>":this.ognusdt));
        sb.append(',');
        sb.append("hiveusdt");
        sb.append('=');
        sb.append(((this.hiveusdt == null)?"<null>":this.hiveusdt));
        sb.append(',');
        sb.append("fttusdt");
        sb.append('=');
        sb.append(((this.fttusdt == null)?"<null>":this.fttusdt));
        sb.append(',');
        sb.append("bandusdt");
        sb.append('=');
        sb.append(((this.bandusdt == null)?"<null>":this.bandusdt));
        sb.append(',');
        sb.append("jstusdt");
        sb.append('=');
        sb.append(((this.jstusdt == null)?"<null>":this.jstusdt));
        sb.append(',');
        sb.append("ctsiusdt");
        sb.append('=');
        sb.append(((this.ctsiusdt == null)?"<null>":this.ctsiusdt));
        sb.append(',');
        sb.append("chrusdt");
        sb.append('=');
        sb.append(((this.chrusdt == null)?"<null>":this.chrusdt));
        sb.append(',');
        sb.append("tomousdt");
        sb.append('=');
        sb.append(((this.tomousdt == null)?"<null>":this.tomousdt));
        sb.append(',');
        sb.append("stxusdt");
        sb.append('=');
        sb.append(((this.stxusdt == null)?"<null>":this.stxusdt));
        sb.append(',');
        sb.append("stmxusdt");
        sb.append('=');
        sb.append(((this.stmxusdt == null)?"<null>":this.stmxusdt));
        sb.append(',');
        sb.append("gxsusdt");
        sb.append('=');
        sb.append(((this.gxsusdt == null)?"<null>":this.gxsusdt));
        sb.append(',');
        sb.append("mdtusdt");
        sb.append('=');
        sb.append(((this.mdtusdt == null)?"<null>":this.mdtusdt));
        sb.append(',');
        sb.append("ltousdt");
        sb.append('=');
        sb.append(((this.ltousdt == null)?"<null>":this.ltousdt));
        sb.append(',');
        sb.append("lrcusdt");
        sb.append('=');
        sb.append(((this.lrcusdt == null)?"<null>":this.lrcusdt));
        sb.append(',');
        sb.append("dogeusdt");
        sb.append('=');
        sb.append(((this.dogeusdt == null)?"<null>":this.dogeusdt));
        sb.append(',');
        sb.append("neousdt");
        sb.append('=');
        sb.append(((this.neousdt == null)?"<null>":this.neousdt));
        sb.append(',');
        sb.append("hbarusdt");
        sb.append('=');
        sb.append(((this.hbarusdt == null)?"<null>":this.hbarusdt));
        sb.append(',');
        sb.append("storjusdt");
        sb.append('=');
        sb.append(((this.storjusdt == null)?"<null>":this.storjusdt));
        sb.append(',');
        sb.append("compusdt");
        sb.append('=');
        sb.append(((this.compusdt == null)?"<null>":this.compusdt));
        sb.append(',');
        sb.append("cotiusdt");
        sb.append('=');
        sb.append(((this.cotiusdt == null)?"<null>":this.cotiusdt));
        sb.append(',');
        sb.append("dgbusdt");
        sb.append('=');
        sb.append(((this.dgbusdt == null)?"<null>":this.dgbusdt));
        sb.append(',');
        sb.append("grsusdt");
        sb.append('=');
        sb.append(((this.grsusdt == null)?"<null>":this.grsusdt));
        sb.append(',');
        sb.append("snxusdt");
        sb.append('=');
        sb.append(((this.snxusdt == null)?"<null>":this.snxusdt));
        sb.append(',');
        sb.append("renusdt");
        sb.append('=');
        sb.append(((this.renusdt == null)?"<null>":this.renusdt));
        sb.append(',');
        sb.append("sxpusdt");
        sb.append('=');
        sb.append(((this.sxpusdt == null)?"<null>":this.sxpusdt));
        sb.append(',');
        sb.append("mkrusdt");
        sb.append('=');
        sb.append(((this.mkrusdt == null)?"<null>":this.mkrusdt));
        sb.append(',');
        sb.append("daiusdt");
        sb.append('=');
        sb.append(((this.daiusdt == null)?"<null>":this.daiusdt));
        sb.append(',');
        sb.append("avausdt");
        sb.append('=');
        sb.append(((this.avausdt == null)?"<null>":this.avausdt));
        sb.append(',');
        sb.append("balusdt");
        sb.append('=');
        sb.append(((this.balusdt == null)?"<null>":this.balusdt));
        sb.append(',');
        sb.append("srmusdt");
        sb.append('=');
        sb.append(((this.srmusdt == null)?"<null>":this.srmusdt));
        sb.append(',');
        sb.append("egldusdt");
        sb.append('=');
        sb.append(((this.egldusdt == null)?"<null>":this.egldusdt));
        sb.append(',');
        sb.append("cosusdt");
        sb.append('=');
        sb.append(((this.cosusdt == null)?"<null>":this.cosusdt));
        sb.append(',');
        sb.append("nbsusdt");
        sb.append('=');
        sb.append(((this.nbsusdt == null)?"<null>":this.nbsusdt));
        sb.append(',');
        sb.append("aionusdt");
        sb.append('=');
        sb.append(((this.aionusdt == null)?"<null>":this.aionusdt));
        sb.append(',');
        sb.append("dotusdt");
        sb.append('=');
        sb.append(((this.dotusdt == null)?"<null>":this.dotusdt));
        sb.append(',');
        sb.append("yfiusdt");
        sb.append('=');
        sb.append(((this.yfiusdt == null)?"<null>":this.yfiusdt));
        sb.append(',');
        sb.append("iotxusdt");
        sb.append('=');
        sb.append(((this.iotxusdt == null)?"<null>":this.iotxusdt));
        sb.append(',');
        sb.append("sandusdt");
        sb.append('=');
        sb.append(((this.sandusdt == null)?"<null>":this.sandusdt));
        sb.append(',');
        sb.append("uniusdt");
        sb.append('=');
        sb.append(((this.uniusdt == null)?"<null>":this.uniusdt));
        sb.append(',');
        sb.append("datausdt");
        sb.append('=');
        sb.append(((this.datausdt == null)?"<null>":this.datausdt));
        sb.append(',');
        sb.append("paxgusdt");
        sb.append('=');
        sb.append(((this.paxgusdt == null)?"<null>":this.paxgusdt));
        sb.append(',');
        sb.append("creamusdt");
        sb.append('=');
        sb.append(((this.creamusdt == null)?"<null>":this.creamusdt));
        sb.append(',');
        sb.append("swrvusdt");
        sb.append('=');
        sb.append(((this.swrvusdt == null)?"<null>":this.swrvusdt));
        sb.append(',');
        sb.append("umausdt");
        sb.append('=');
        sb.append(((this.umausdt == null)?"<null>":this.umausdt));
        sb.append(',');
        sb.append("diausdt");
        sb.append('=');
        sb.append(((this.diausdt == null)?"<null>":this.diausdt));
        sb.append(',');
        sb.append("ksmusdt");
        sb.append('=');
        sb.append(((this.ksmusdt == null)?"<null>":this.ksmusdt));
        sb.append(',');
        sb.append("yfiiusdt");
        sb.append('=');
        sb.append(((this.yfiiusdt == null)?"<null>":this.yfiiusdt));
        sb.append(',');
        sb.append("bzrxusdt");
        sb.append('=');
        sb.append(((this.bzrxusdt == null)?"<null>":this.bzrxusdt));
        sb.append(',');
        sb.append("trbusdt");
        sb.append('=');
        sb.append(((this.trbusdt == null)?"<null>":this.trbusdt));
        sb.append(',');
        sb.append("adxusdt");
        sb.append('=');
        sb.append(((this.adxusdt == null)?"<null>":this.adxusdt));
        sb.append(',');
        sb.append("aaveusdt");
        sb.append('=');
        sb.append(((this.aaveusdt == null)?"<null>":this.aaveusdt));
        sb.append(',');
        sb.append("filusdt");
        sb.append('=');
        sb.append(((this.filusdt == null)?"<null>":this.filusdt));
        sb.append(',');
        sb.append("crvusdt");
        sb.append('=');
        sb.append(((this.crvusdt == null)?"<null>":this.crvusdt));
        sb.append(',');
        sb.append("nearusdt");
        sb.append('=');
        sb.append(((this.nearusdt == null)?"<null>":this.nearusdt));
        sb.append(',');
        sb.append("hntusdt");
        sb.append('=');
        sb.append(((this.hntusdt == null)?"<null>":this.hntusdt));
        sb.append(',');
        sb.append("avaxusdt");
        sb.append('=');
        sb.append(((this.avaxusdt == null)?"<null>":this.avaxusdt));
        sb.append(',');
        sb.append("oxtusdt");
        sb.append('=');
        sb.append(((this.oxtusdt == null)?"<null>":this.oxtusdt));
        sb.append(',');
        sb.append("dockusdt");
        sb.append('=');
        sb.append(((this.dockusdt == null)?"<null>":this.dockusdt));
        sb.append(',');
        sb.append("duskusdt");
        sb.append('=');
        sb.append(((this.duskusdt == null)?"<null>":this.duskusdt));
        sb.append(',');
        sb.append("wtcusdt");
        sb.append('=');
        sb.append(((this.wtcusdt == null)?"<null>":this.wtcusdt));
        sb.append(',');
        sb.append("perlusdt");
        sb.append('=');
        sb.append(((this.perlusdt == null)?"<null>":this.perlusdt));
        sb.append(',');
        sb.append("straxusdt");
        sb.append('=');
        sb.append(((this.straxusdt == null)?"<null>":this.straxusdt));
        sb.append(',');
        sb.append("injusdt");
        sb.append('=');
        sb.append(((this.injusdt == null)?"<null>":this.injusdt));
        sb.append(',');
        sb.append("vetusdt");
        sb.append('=');
        sb.append(((this.vetusdt == null)?"<null>":this.vetusdt));
        sb.append(',');
        sb.append("mtlusdt");
        sb.append('=');
        sb.append(((this.mtlusdt == null)?"<null>":this.mtlusdt));
        sb.append(',');
        sb.append("frontusdt");
        sb.append('=');
        sb.append(((this.frontusdt == null)?"<null>":this.frontusdt));
        sb.append(',');
        sb.append("glmusdt");
        sb.append('=');
        sb.append(((this.glmusdt == null)?"<null>":this.glmusdt));
        sb.append(',');
        sb.append("sushiusdt");
        sb.append('=');
        sb.append(((this.sushiusdt == null)?"<null>":this.sushiusdt));
        sb.append(',');
        sb.append("firousdt");
        sb.append('=');
        sb.append(((this.firousdt == null)?"<null>":this.firousdt));
        sb.append(',');
        sb.append("dexeusdt");
        sb.append('=');
        sb.append(((this.dexeusdt == null)?"<null>":this.dexeusdt));
        sb.append(',');
        sb.append("grtusdt");
        sb.append('=');
        sb.append(((this.grtusdt == null)?"<null>":this.grtusdt));
        sb.append(',');
        sb.append("bchausdt");
        sb.append('=');
        sb.append(((this.bchausdt == null)?"<null>":this.bchausdt));
        sb.append(',');
        sb.append("bntusdt");
        sb.append('=');
        sb.append(((this.bntusdt == null)?"<null>":this.bntusdt));
        sb.append(',');
        sb.append("rsrusdt");
        sb.append('=');
        sb.append(((this.rsrusdt == null)?"<null>":this.rsrusdt));
        sb.append(',');
        sb.append("_1inchusdt");
        sb.append('=');
        sb.append(((this._1inchusdt == null)?"<null>":this._1inchusdt));
        sb.append(',');
        sb.append("lunausdt");
        sb.append('=');
        sb.append(((this.lunausdt == null)?"<null>":this.lunausdt));
        sb.append(',');
        sb.append("uftusdt");
        sb.append('=');
        sb.append(((this.uftusdt == null)?"<null>":this.uftusdt));
        sb.append(',');
        sb.append("pundixusdt");
        sb.append('=');
        sb.append(((this.pundixusdt == null)?"<null>":this.pundixusdt));
        sb.append(',');
        sb.append("ckbusdt");
        sb.append('=');
        sb.append(((this.ckbusdt == null)?"<null>":this.ckbusdt));
        sb.append(',');
        sb.append("vibusdt");
        sb.append('=');
        sb.append(((this.vibusdt == null)?"<null>":this.vibusdt));
        sb.append(',');
        sb.append("gtousdt");
        sb.append('=');
        sb.append(((this.gtousdt == null)?"<null>":this.gtousdt));
        sb.append(',');
        sb.append("tkousdt");
        sb.append('=');
        sb.append(((this.tkousdt == null)?"<null>":this.tkousdt));
        sb.append(',');
        sb.append("pushusdt");
        sb.append('=');
        sb.append(((this.pushusdt == null)?"<null>":this.pushusdt));
        sb.append(',');
        sb.append("cvcusdt");
        sb.append('=');
        sb.append(((this.cvcusdt == null)?"<null>":this.cvcusdt));
        sb.append(',');
        sb.append("cakeusdt");
        sb.append('=');
        sb.append(((this.cakeusdt == null)?"<null>":this.cakeusdt));
        sb.append(',');
        sb.append("ezusdt");
        sb.append('=');
        sb.append(((this.ezusdt == null)?"<null>":this.ezusdt));
        sb.append(',');
        sb.append("arkusdt");
        sb.append('=');
        sb.append(((this.arkusdt == null)?"<null>":this.arkusdt));
        sb.append(',');
        sb.append("kmdusdt");
        sb.append('=');
        sb.append(((this.kmdusdt == null)?"<null>":this.kmdusdt));
        sb.append(',');
        sb.append("solusdt");
        sb.append('=');
        sb.append(((this.solusdt == null)?"<null>":this.solusdt));
        sb.append(',');
        sb.append("shibusdt");
        sb.append('=');
        sb.append(((this.shibusdt == null)?"<null>":this.shibusdt));
        sb.append(',');
        sb.append("ethwrx");
        sb.append('=');
        sb.append(((this.ethwrx == null)?"<null>":this.ethwrx));
        sb.append(',');
        sb.append("xrpwrx");
        sb.append('=');
        sb.append(((this.xrpwrx == null)?"<null>":this.xrpwrx));
        sb.append(',');
        sb.append("yfiwrx");
        sb.append('=');
        sb.append(((this.yfiwrx == null)?"<null>":this.yfiwrx));
        sb.append(',');
        sb.append("bnbwrx");
        sb.append('=');
        sb.append(((this.bnbwrx == null)?"<null>":this.bnbwrx));
        sb.append(',');
        sb.append("trxwrx");
        sb.append('=');
        sb.append(((this.trxwrx == null)?"<null>":this.trxwrx));
        sb.append(',');
        sb.append("eoswrx");
        sb.append('=');
        sb.append(((this.eoswrx == null)?"<null>":this.eoswrx));
        sb.append(',');
        sb.append("ltcwrx");
        sb.append('=');
        sb.append(((this.ltcwrx == null)?"<null>":this.ltcwrx));
        sb.append(',');
        sb.append("linkwrx");
        sb.append('=');
        sb.append(((this.linkwrx == null)?"<null>":this.linkwrx));
        sb.append(',');
        sb.append("enjwrx");
        sb.append('=');
        sb.append(((this.enjwrx == null)?"<null>":this.enjwrx));
        sb.append(',');
        sb.append("dogewrx");
        sb.append('=');
        sb.append(((this.dogewrx == null)?"<null>":this.dogewrx));
        sb.append(',');
        sb.append("maticwrx");
        sb.append('=');
        sb.append(((this.maticwrx == null)?"<null>":this.maticwrx));
        sb.append(',');
        sb.append("adawrx");
        sb.append('=');
        sb.append(((this.adawrx == null)?"<null>":this.adawrx));
        sb.append(',');
        sb.append("batwrx");
        sb.append('=');
        sb.append(((this.batwrx == null)?"<null>":this.batwrx));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.cvcinr == null)? 0 :this.cvcinr.hashCode()));
        result = ((result* 31)+((this.batwrx == null)? 0 :this.batwrx.hashCode()));
        result = ((result* 31)+((this.eosbtc == null)? 0 :this.eosbtc.hashCode()));
        result = ((result* 31)+((this.requsdt == null)? 0 :this.requsdt.hashCode()));
        result = ((result* 31)+((this.kmdusdt == null)? 0 :this.kmdusdt.hashCode()));
        result = ((result* 31)+((this.bzrxusdt == null)? 0 :this.bzrxusdt.hashCode()));
        result = ((result* 31)+((this.funusdt == null)? 0 :this.funusdt.hashCode()));
        result = ((result* 31)+((this.dentinr == null)? 0 :this.dentinr.hashCode()));
        result = ((result* 31)+((this.lskusdt == null)? 0 :this.lskusdt.hashCode()));
        result = ((result* 31)+((this.nanoinr == null)? 0 :this.nanoinr.hashCode()));
        result = ((result* 31)+((this.avaxusdt == null)? 0 :this.avaxusdt.hashCode()));
        result = ((result* 31)+((this.hiveusdt == null)? 0 :this.hiveusdt.hashCode()));
        result = ((result* 31)+((this.ctsiusdt == null)? 0 :this.ctsiusdt.hashCode()));
        result = ((result* 31)+((this.cakeinr == null)? 0 :this.cakeinr.hashCode()));
        result = ((result* 31)+((this.scusdt == null)? 0 :this.scusdt.hashCode()));
        result = ((result* 31)+((this.atombtc == null)? 0 :this.atombtc.hashCode()));
        result = ((result* 31)+((this.tkoinr == null)? 0 :this.tkoinr.hashCode()));
        result = ((result* 31)+((this.adausdt == null)? 0 :this.adausdt.hashCode()));
        result = ((result* 31)+((this.pushusdt == null)? 0 :this.pushusdt.hashCode()));
        result = ((result* 31)+((this.dockinr == null)? 0 :this.dockinr.hashCode()));
        result = ((result* 31)+((this.icxbtc == null)? 0 :this.icxbtc.hashCode()));
        result = ((result* 31)+((this.shibinr == null)? 0 :this.shibinr.hashCode()));
        result = ((result* 31)+((this.paxgusdt == null)? 0 :this.paxgusdt.hashCode()));
        result = ((result* 31)+((this.filusdt == null)? 0 :this.filusdt.hashCode()));
        result = ((result* 31)+((this.trxbtc == null)? 0 :this.trxbtc.hashCode()));
        result = ((result* 31)+((this.ethwrx == null)? 0 :this.ethwrx.hashCode()));
        result = ((result* 31)+((this.btcinr == null)? 0 :this.btcinr.hashCode()));
        result = ((result* 31)+((this.iostusdt == null)? 0 :this.iostusdt.hashCode()));
        result = ((result* 31)+((this.nasusdt == null)? 0 :this.nasusdt.hashCode()));
        result = ((result* 31)+((this.egldusdt == null)? 0 :this.egldusdt.hashCode()));
        result = ((result* 31)+((this.stmxusdt == null)? 0 :this.stmxusdt.hashCode()));
        result = ((result* 31)+((this.xrpinr == null)? 0 :this.xrpinr.hashCode()));
        result = ((result* 31)+((this._1inchinr == null)? 0 :this._1inchinr.hashCode()));
        result = ((result* 31)+((this.atomusdt == null)? 0 :this.atomusdt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.zilbtc == null)? 0 :this.zilbtc.hashCode()));
        result = ((result* 31)+((this.rsrusdt == null)? 0 :this.rsrusdt.hashCode()));
        result = ((result* 31)+((this.blzusdt == null)? 0 :this.blzusdt.hashCode()));
        result = ((result* 31)+((this.paxginr == null)? 0 :this.paxginr.hashCode()));
        result = ((result* 31)+((this.maticwrx == null)? 0 :this.maticwrx.hashCode()));
        result = ((result* 31)+((this.daiusdt == null)? 0 :this.daiusdt.hashCode()));
        result = ((result* 31)+((this.xeminr == null)? 0 :this.xeminr.hashCode()));
        result = ((result* 31)+((this.ltcbtc == null)? 0 :this.ltcbtc.hashCode()));
        result = ((result* 31)+((this.sxpusdt == null)? 0 :this.sxpusdt.hashCode()));
        result = ((result* 31)+((this.sushiusdt == null)? 0 :this.sushiusdt.hashCode()));
        result = ((result* 31)+((this.cakeusdt == null)? 0 :this.cakeusdt.hashCode()));
        result = ((result* 31)+((this.nearusdt == null)? 0 :this.nearusdt.hashCode()));
        result = ((result* 31)+((this.aaveusdt == null)? 0 :this.aaveusdt.hashCode()));
        result = ((result* 31)+((this.linkwrx == null)? 0 :this.linkwrx.hashCode()));
        result = ((result* 31)+((this.yfiiusdt == null)? 0 :this.yfiiusdt.hashCode()));
        result = ((result* 31)+((this.ankrusdt == null)? 0 :this.ankrusdt.hashCode()));
        result = ((result* 31)+((this.duskusdt == null)? 0 :this.duskusdt.hashCode()));
        result = ((result* 31)+((this.usdtinr == null)? 0 :this.usdtinr.hashCode()));
        result = ((result* 31)+((this.jstusdt == null)? 0 :this.jstusdt.hashCode()));
        result = ((result* 31)+((this.crvusdt == null)? 0 :this.crvusdt.hashCode()));
        result = ((result* 31)+((this.fttusdt == null)? 0 :this.fttusdt.hashCode()));
        result = ((result* 31)+((this.stxusdt == null)? 0 :this.stxusdt.hashCode()));
        result = ((result* 31)+((this.oneusdt == null)? 0 :this.oneusdt.hashCode()));
        result = ((result* 31)+((this.aionusdt == null)? 0 :this.aionusdt.hashCode()));
        result = ((result* 31)+((this.avausdt == null)? 0 :this.avausdt.hashCode()));
        result = ((result* 31)+((this.rvnbtc == null)? 0 :this.rvnbtc.hashCode()));
        result = ((result* 31)+((this.wrxinr == null)? 0 :this.wrxinr.hashCode()));
        result = ((result* 31)+((this.bzrxinr == null)? 0 :this.bzrxinr.hashCode()));
        result = ((result* 31)+((this.oneinr == null)? 0 :this.oneinr.hashCode()));
        result = ((result* 31)+((this.fttinr == null)? 0 :this.fttinr.hashCode()));
        result = ((result* 31)+((this.celrbtc == null)? 0 :this.celrbtc.hashCode()));
        result = ((result* 31)+((this.nanousdt == null)? 0 :this.nanousdt.hashCode()));
        result = ((result* 31)+((this.ftmusdt == null)? 0 :this.ftmusdt.hashCode()));
        result = ((result* 31)+((this.fetusdt == null)? 0 :this.fetusdt.hashCode()));
        result = ((result* 31)+((this.wavesusdt == null)? 0 :this.wavesusdt.hashCode()));
        result = ((result* 31)+((this.sxpinr == null)? 0 :this.sxpinr.hashCode()));
        result = ((result* 31)+((this.uftinr == null)? 0 :this.uftinr.hashCode()));
        result = ((result* 31)+((this.lunainr == null)? 0 :this.lunainr.hashCode()));
        result = ((result* 31)+((this.uniusdt == null)? 0 :this.uniusdt.hashCode()));
        result = ((result* 31)+((this.straxusdt == null)? 0 :this.straxusdt.hashCode()));
        result = ((result* 31)+((this.btgusdt == null)? 0 :this.btgusdt.hashCode()));
        result = ((result* 31)+((this.wrxusdt == null)? 0 :this.wrxusdt.hashCode()));
        result = ((result* 31)+((this.yfiusdt == null)? 0 :this.yfiusdt.hashCode()));
        result = ((result* 31)+((this.pushinr == null)? 0 :this.pushinr.hashCode()));
        result = ((result* 31)+((this.tusdusdt == null)? 0 :this.tusdusdt.hashCode()));
        result = ((result* 31)+((this.ethusdt == null)? 0 :this.ethusdt.hashCode()));
        result = ((result* 31)+((this.creamusdt == null)? 0 :this.creamusdt.hashCode()));
        result = ((result* 31)+((this.dogewrx == null)? 0 :this.dogewrx.hashCode()));
        result = ((result* 31)+((this.diausdt == null)? 0 :this.diausdt.hashCode()));
        result = ((result* 31)+((this.dashbtc == null)? 0 :this.dashbtc.hashCode()));
        result = ((result* 31)+((this.dogeusdt == null)? 0 :this.dogeusdt.hashCode()));
        result = ((result* 31)+((this.iostbtc == null)? 0 :this.iostbtc.hashCode()));
        result = ((result* 31)+((this.thetabtc == null)? 0 :this.thetabtc.hashCode()));
        result = ((result* 31)+((this.ftminr == null)? 0 :this.ftminr.hashCode()));
        result = ((result* 31)+((this.repusdt == null)? 0 :this.repusdt.hashCode()));
        result = ((result* 31)+((this.dexeusdt == null)? 0 :this.dexeusdt.hashCode()));
        result = ((result* 31)+((this.chzusdt == null)? 0 :this.chzusdt.hashCode()));
        result = ((result* 31)+((this.stmxbtc == null)? 0 :this.stmxbtc.hashCode()));
        result = ((result* 31)+((this.ckbusdt == null)? 0 :this.ckbusdt.hashCode()));
        result = ((result* 31)+((this.bchinr == null)? 0 :this.bchinr.hashCode()));
        result = ((result* 31)+((this.enjusdt == null)? 0 :this.enjusdt.hashCode()));
        result = ((result* 31)+((this.xrpbtc == null)? 0 :this.xrpbtc.hashCode()));
        result = ((result* 31)+((this.omginr == null)? 0 :this.omginr.hashCode()));
        result = ((result* 31)+((this.celrusdt == null)? 0 :this.celrusdt.hashCode()));
        result = ((result* 31)+((this.tomousdt == null)? 0 :this.tomousdt.hashCode()));
        result = ((result* 31)+((this.ezusdt == null)? 0 :this.ezusdt.hashCode()));
        result = ((result* 31)+((this.adawrx == null)? 0 :this.adawrx.hashCode()));
        result = ((result* 31)+((this.shibusdt == null)? 0 :this.shibusdt.hashCode()));
        result = ((result* 31)+((this.arkinr == null)? 0 :this.arkinr.hashCode()));
        result = ((result* 31)+((this.tfuelusdt == null)? 0 :this.tfuelusdt.hashCode()));
        result = ((result* 31)+((this.srmusdt == null)? 0 :this.srmusdt.hashCode()));
        result = ((result* 31)+((this.usdcbtc == null)? 0 :this.usdcbtc.hashCode()));
        result = ((result* 31)+((this.xemusdt == null)? 0 :this.xemusdt.hashCode()));
        result = ((result* 31)+((this.dockusdt == null)? 0 :this.dockusdt.hashCode()));
        result = ((result* 31)+((this.ltcusdt == null)? 0 :this.ltcusdt.hashCode()));
        result = ((result* 31)+((this.sntbtc == null)? 0 :this.sntbtc.hashCode()));
        result = ((result* 31)+((this.storjusdt == null)? 0 :this.storjusdt.hashCode()));
        result = ((result* 31)+((this.zrxbtc == null)? 0 :this.zrxbtc.hashCode()));
        result = ((result* 31)+((this.qtumusdt == null)? 0 :this.qtumusdt.hashCode()));
        result = ((result* 31)+((this.nulsbtc == null)? 0 :this.nulsbtc.hashCode()));
        result = ((result* 31)+((this.reqbtc == null)? 0 :this.reqbtc.hashCode()));
        result = ((result* 31)+((this.funbtc == null)? 0 :this.funbtc.hashCode()));
        result = ((result* 31)+((this.glmbtc == null)? 0 :this.glmbtc.hashCode()));
        result = ((result* 31)+((this.btcusdt == null)? 0 :this.btcusdt.hashCode()));
        result = ((result* 31)+((this.omgusdt == null)? 0 :this.omgusdt.hashCode()));
        result = ((result* 31)+((this.yfiwrx == null)? 0 :this.yfiwrx.hashCode()));
        result = ((result* 31)+((this.qkcbtc == null)? 0 :this.qkcbtc.hashCode()));
        result = ((result* 31)+((this.ezinr == null)? 0 :this.ezinr.hashCode()));
        result = ((result* 31)+((this.bnbwrx == null)? 0 :this.bnbwrx.hashCode()));
        result = ((result* 31)+((this.solinr == null)? 0 :this.solinr.hashCode()));
        result = ((result* 31)+((this.batbtc == null)? 0 :this.batbtc.hashCode()));
        result = ((result* 31)+((this.vibusdt == null)? 0 :this.vibusdt.hashCode()));
        result = ((result* 31)+((this.cotiusdt == null)? 0 :this.cotiusdt.hashCode()));
        result = ((result* 31)+((this.arkusdt == null)? 0 :this.arkusdt.hashCode()));
        result = ((result* 31)+((this.neousdt == null)? 0 :this.neousdt.hashCode()));
        result = ((result* 31)+((this.dashinr == null)? 0 :this.dashinr.hashCode()));
        result = ((result* 31)+((this.sandusdt == null)? 0 :this.sandusdt.hashCode()));
        result = ((result* 31)+((this.iostinr == null)? 0 :this.iostinr.hashCode()));
        result = ((result* 31)+((this.enjwrx == null)? 0 :this.enjwrx.hashCode()));
        result = ((result* 31)+((this.paxbtc == null)? 0 :this.paxbtc.hashCode()));
        result = ((result* 31)+((this.datausdt == null)? 0 :this.datausdt.hashCode()));
        result = ((result* 31)+((this.balusdt == null)? 0 :this.balusdt.hashCode()));
        result = ((result* 31)+((this.oxtusdt == null)? 0 :this.oxtusdt.hashCode()));
        result = ((result* 31)+((this.kavausdt == null)? 0 :this.kavausdt.hashCode()));
        result = ((result* 31)+((this.ltcinr == null)? 0 :this.ltcinr.hashCode()));
        result = ((result* 31)+((this.iotausdt == null)? 0 :this.iotausdt.hashCode()));
        result = ((result* 31)+((this.eosinr == null)? 0 :this.eosinr.hashCode()));
        result = ((result* 31)+((this.firousdt == null)? 0 :this.firousdt.hashCode()));
        result = ((result* 31)+((this.hotusdt == null)? 0 :this.hotusdt.hashCode()));
        result = ((result* 31)+((this.mtlusdt == null)? 0 :this.mtlusdt.hashCode()));
        result = ((result* 31)+((this.omgbtc == null)? 0 :this.omgbtc.hashCode()));
        result = ((result* 31)+((this.glmusdt == null)? 0 :this.glmusdt.hashCode()));
        result = ((result* 31)+((this.dotinr == null)? 0 :this.dotinr.hashCode()));
        result = ((result* 31)+((this.busdusdt == null)? 0 :this.busdusdt.hashCode()));
        result = ((result* 31)+((this.ethbtc == null)? 0 :this.ethbtc.hashCode()));
        result = ((result* 31)+((this.polyusdt == null)? 0 :this.polyusdt.hashCode()));
        result = ((result* 31)+((this.frontusdt == null)? 0 :this.frontusdt.hashCode()));
        result = ((result* 31)+((this.zrxusdt == null)? 0 :this.zrxusdt.hashCode()));
        result = ((result* 31)+((this.eosusdt == null)? 0 :this.eosusdt.hashCode()));
        result = ((result* 31)+((this.chrinr == null)? 0 :this.chrinr.hashCode()));
        result = ((result* 31)+((this.zrxinr == null)? 0 :this.zrxinr.hashCode()));
        result = ((result* 31)+((this.batusdt == null)? 0 :this.batusdt.hashCode()));
        result = ((result* 31)+((this.algousdt == null)? 0 :this.algousdt.hashCode()));
        result = ((result* 31)+((this.vetinr == null)? 0 :this.vetinr.hashCode()));
        result = ((result* 31)+((this.hntusdt == null)? 0 :this.hntusdt.hashCode()));
        result = ((result* 31)+((this.perlusdt == null)? 0 :this.perlusdt.hashCode()));
        result = ((result* 31)+((this.uniinr == null)? 0 :this.uniinr.hashCode()));
        result = ((result* 31)+((this.sntusdt == null)? 0 :this.sntusdt.hashCode()));
        result = ((result* 31)+((this.scinr == null)? 0 :this.scinr.hashCode()));
        result = ((result* 31)+((this.dashusdt == null)? 0 :this.dashusdt.hashCode()));
        result = ((result* 31)+((this.xmrusdt == null)? 0 :this.xmrusdt.hashCode()));
        result = ((result* 31)+((this.dgbusdt == null)? 0 :this.dgbusdt.hashCode()));
        result = ((result* 31)+((this.grsusdt == null)? 0 :this.grsusdt.hashCode()));
        result = ((result* 31)+((this.injusdt == null)? 0 :this.injusdt.hashCode()));
        result = ((result* 31)+((this.chrusdt == null)? 0 :this.chrusdt.hashCode()));
        result = ((result* 31)+((this.trbusdt == null)? 0 :this.trbusdt.hashCode()));
        result = ((result* 31)+((this.bntusdt == null)? 0 :this.bntusdt.hashCode()));
        result = ((result* 31)+((this.ncashusdt == null)? 0 :this.ncashusdt.hashCode()));
        result = ((result* 31)+((this._1inchusdt == null)? 0 :this._1inchusdt.hashCode()));
        result = ((result* 31)+((this.manausdt == null)? 0 :this.manausdt.hashCode()));
        result = ((result* 31)+((this.iotxusdt == null)? 0 :this.iotxusdt.hashCode()));
        result = ((result* 31)+((this.dentusdt == null)? 0 :this.dentusdt.hashCode()));
        result = ((result* 31)+((this.hbarinr == null)? 0 :this.hbarinr.hashCode()));
        result = ((result* 31)+((this.btsusdt == null)? 0 :this.btsusdt.hashCode()));
        result = ((result* 31)+((this.dgbinr == null)? 0 :this.dgbinr.hashCode()));
        result = ((result* 31)+((this.umausdt == null)? 0 :this.umausdt.hashCode()));
        result = ((result* 31)+((this.etcinr == null)? 0 :this.etcinr.hashCode()));
        result = ((result* 31)+((this.etcusdt == null)? 0 :this.etcusdt.hashCode()));
        result = ((result* 31)+((this.maticinr == null)? 0 :this.maticinr.hashCode()));
        result = ((result* 31)+((this.bnbusdt == null)? 0 :this.bnbusdt.hashCode()));
        result = ((result* 31)+((this.gtousdt == null)? 0 :this.gtousdt.hashCode()));
        result = ((result* 31)+((this.yfiinr == null)? 0 :this.yfiinr.hashCode()));
        result = ((result* 31)+((this.yfiiinr == null)? 0 :this.yfiiinr.hashCode()));
        result = ((result* 31)+((this.reninr == null)? 0 :this.reninr.hashCode()));
        result = ((result* 31)+((this.swrvusdt == null)? 0 :this.swrvusdt.hashCode()));
        result = ((result* 31)+((this.linkinr == null)? 0 :this.linkinr.hashCode()));
        result = ((result* 31)+((this.hntinr == null)? 0 :this.hntinr.hashCode()));
        result = ((result* 31)+((this.zilusdt == null)? 0 :this.zilusdt.hashCode()));
        result = ((result* 31)+((this.xlmusdt == null)? 0 :this.xlmusdt.hashCode()));
        result = ((result* 31)+((this.hotinr == null)? 0 :this.hotinr.hashCode()));
        result = ((result* 31)+((this.polybtc == null)? 0 :this.polybtc.hashCode()));
        result = ((result* 31)+((this.cosusdt == null)? 0 :this.cosusdt.hashCode()));
        result = ((result* 31)+((this.filinr == null)? 0 :this.filinr.hashCode()));
        result = ((result* 31)+((this.fetbtc == null)? 0 :this.fetbtc.hashCode()));
        result = ((result* 31)+((this.umainr == null)? 0 :this.umainr.hashCode()));
        result = ((result* 31)+((this.xvginr == null)? 0 :this.xvginr.hashCode()));
        result = ((result* 31)+((this.adxusdt == null)? 0 :this.adxusdt.hashCode()));
        result = ((result* 31)+((this.steemusdt == null)? 0 :this.steemusdt.hashCode()));
        result = ((result* 31)+((this.xlmbtc == null)? 0 :this.xlmbtc.hashCode()));
        result = ((result* 31)+((this.qkcusdt == null)? 0 :this.qkcusdt.hashCode()));
        result = ((result* 31)+((this.ardrusdt == null)? 0 :this.ardrusdt.hashCode()));
        result = ((result* 31)+((this.ethinr == null)? 0 :this.ethinr.hashCode()));
        result = ((result* 31)+((this.snxusdt == null)? 0 :this.snxusdt.hashCode()));
        result = ((result* 31)+((this.bchsvusdt == null)? 0 :this.bchsvusdt.hashCode()));
        result = ((result* 31)+((this.mkrusdt == null)? 0 :this.mkrusdt.hashCode()));
        result = ((result* 31)+((this.xtzusdt == null)? 0 :this.xtzusdt.hashCode()));
        result = ((result* 31)+((this.avaxinr == null)? 0 :this.avaxinr.hashCode()));
        result = ((result* 31)+((this.cotiinr == null)? 0 :this.cotiinr.hashCode()));
        result = ((result* 31)+((this.usdcusdt == null)? 0 :this.usdcusdt.hashCode()));
        result = ((result* 31)+((this.batinr == null)? 0 :this.batinr.hashCode()));
        result = ((result* 31)+((this.ltousdt == null)? 0 :this.ltousdt.hashCode()));
        result = ((result* 31)+((this.trxwrx == null)? 0 :this.trxwrx.hashCode()));
        result = ((result* 31)+((this.compusdt == null)? 0 :this.compusdt.hashCode()));
        result = ((result* 31)+((this.wtcusdt == null)? 0 :this.wtcusdt.hashCode()));
        result = ((result* 31)+((this.bchusdt == null)? 0 :this.bchusdt.hashCode()));
        result = ((result* 31)+((this.hbarusdt == null)? 0 :this.hbarusdt.hashCode()));
        result = ((result* 31)+((this.icxusdt == null)? 0 :this.icxusdt.hashCode()));
        result = ((result* 31)+((this.xvgusdt == null)? 0 :this.xvgusdt.hashCode()));
        result = ((result* 31)+((this.rvnusdt == null)? 0 :this.rvnusdt.hashCode()));
        result = ((result* 31)+((this.atominr == null)? 0 :this.atominr.hashCode()));
        result = ((result* 31)+((this.trxinr == null)? 0 :this.trxinr.hashCode()));
        result = ((result* 31)+((this.dotusdt == null)? 0 :this.dotusdt.hashCode()));
        result = ((result* 31)+((this.ctsiinr == null)? 0 :this.ctsiinr.hashCode()));
        result = ((result* 31)+((this.bnbbtc == null)? 0 :this.bnbbtc.hashCode()));
        result = ((result* 31)+((this.fttbtc == null)? 0 :this.fttbtc.hashCode()));
        result = ((result* 31)+((this.manainr == null)? 0 :this.manainr.hashCode()));
        result = ((result* 31)+((this.pundixusdt == null)? 0 :this.pundixusdt.hashCode()));
        result = ((result* 31)+((this.dogeinr == null)? 0 :this.dogeinr.hashCode()));
        result = ((result* 31)+((this.maticbtc == null)? 0 :this.maticbtc.hashCode()));
        result = ((result* 31)+((this.linkusdt == null)? 0 :this.linkusdt.hashCode()));
        result = ((result* 31)+((this.bttinr == null)? 0 :this.bttinr.hashCode()));
        result = ((result* 31)+((this.lrcusdt == null)? 0 :this.lrcusdt.hashCode()));
        result = ((result* 31)+((this.zilinr == null)? 0 :this.zilinr.hashCode()));
        result = ((result* 31)+((this.wininr == null)? 0 :this.wininr.hashCode()));
        result = ((result* 31)+((this.ksmusdt == null)? 0 :this.ksmusdt.hashCode()));
        result = ((result* 31)+((this.thetausdt == null)? 0 :this.thetausdt.hashCode()));
        result = ((result* 31)+((this.ltcwrx == null)? 0 :this.ltcwrx.hashCode()));
        result = ((result* 31)+((this.ognusdt == null)? 0 :this.ognusdt.hashCode()));
        result = ((result* 31)+((this.gxsusdt == null)? 0 :this.gxsusdt.hashCode()));
        result = ((result* 31)+((this.kmdinr == null)? 0 :this.kmdinr.hashCode()));
        result = ((result* 31)+((this.mdtusdt == null)? 0 :this.mdtusdt.hashCode()));
        result = ((result* 31)+((this.xrpusdt == null)? 0 :this.xrpusdt.hashCode()));
        result = ((result* 31)+((this.maticusdt == null)? 0 :this.maticusdt.hashCode()));
        result = ((result* 31)+((this.zecinr == null)? 0 :this.zecinr.hashCode()));
        result = ((result* 31)+((this.tkousdt == null)? 0 :this.tkousdt.hashCode()));
        result = ((result* 31)+((this.adainr == null)? 0 :this.adainr.hashCode()));
        result = ((result* 31)+((this.wrxbtc == null)? 0 :this.wrxbtc.hashCode()));
        result = ((result* 31)+((this.loomusdt == null)? 0 :this.loomusdt.hashCode()));
        result = ((result* 31)+((this.xlminr == null)? 0 :this.xlminr.hashCode()));
        result = ((result* 31)+((this.bttusdt == null)? 0 :this.bttusdt.hashCode()));
        result = ((result* 31)+((this.bandusdt == null)? 0 :this.bandusdt.hashCode()));
        result = ((result* 31)+((this.vetusdt == null)? 0 :this.vetusdt.hashCode()));
        result = ((result* 31)+((this.solusdt == null)? 0 :this.solusdt.hashCode()));
        result = ((result* 31)+((this.busdinr == null)? 0 :this.busdinr.hashCode()));
        result = ((result* 31)+((this.paxusdt == null)? 0 :this.paxusdt.hashCode()));
        result = ((result* 31)+((this.trxusdt == null)? 0 :this.trxusdt.hashCode()));
        result = ((result* 31)+((this.adabtc == null)? 0 :this.adabtc.hashCode()));
        result = ((result* 31)+((this.xrpwrx == null)? 0 :this.xrpwrx.hashCode()));
        result = ((result* 31)+((this.crvinr == null)? 0 :this.crvinr.hashCode()));
        result = ((result* 31)+((this.lunausdt == null)? 0 :this.lunausdt.hashCode()));
        result = ((result* 31)+((this.uftusdt == null)? 0 :this.uftusdt.hashCode()));
        result = ((result* 31)+((this.grtusdt == null)? 0 :this.grtusdt.hashCode()));
        result = ((result* 31)+((this.nbsusdt == null)? 0 :this.nbsusdt.hashCode()));
        result = ((result* 31)+((this.bnbinr == null)? 0 :this.bnbinr.hashCode()));
        result = ((result* 31)+((this.bchausdt == null)? 0 :this.bchausdt.hashCode()));
        result = ((result* 31)+((this.fetinr == null)? 0 :this.fetinr.hashCode()));
        result = ((result* 31)+((this.renusdt == null)? 0 :this.renusdt.hashCode()));
        result = ((result* 31)+((this.xmrbtc == null)? 0 :this.xmrbtc.hashCode()));
        result = ((result* 31)+((this.iotxinr == null)? 0 :this.iotxinr.hashCode()));
        result = ((result* 31)+((this.cvcusdt == null)? 0 :this.cvcusdt.hashCode()));
        result = ((result* 31)+((this.enjinr == null)? 0 :this.enjinr.hashCode()));
        result = ((result* 31)+((this.chzinr == null)? 0 :this.chzinr.hashCode()));
        result = ((result* 31)+((this.zecusdt == null)? 0 :this.zecusdt.hashCode()));
        result = ((result* 31)+((this.winusdt == null)? 0 :this.winusdt.hashCode()));
        result = ((result* 31)+((this.eoswrx == null)? 0 :this.eoswrx.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Input) == false) {
            return false;
        }
        Input rhs = ((Input) other);
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.cvcinr == rhs.cvcinr)||((this.cvcinr!= null)&&this.cvcinr.equals(rhs.cvcinr)))&&((this.batwrx == rhs.batwrx)||((this.batwrx!= null)&&this.batwrx.equals(rhs.batwrx))))&&((this.eosbtc == rhs.eosbtc)||((this.eosbtc!= null)&&this.eosbtc.equals(rhs.eosbtc))))&&((this.requsdt == rhs.requsdt)||((this.requsdt!= null)&&this.requsdt.equals(rhs.requsdt))))&&((this.kmdusdt == rhs.kmdusdt)||((this.kmdusdt!= null)&&this.kmdusdt.equals(rhs.kmdusdt))))&&((this.bzrxusdt == rhs.bzrxusdt)||((this.bzrxusdt!= null)&&this.bzrxusdt.equals(rhs.bzrxusdt))))&&((this.funusdt == rhs.funusdt)||((this.funusdt!= null)&&this.funusdt.equals(rhs.funusdt))))&&((this.dentinr == rhs.dentinr)||((this.dentinr!= null)&&this.dentinr.equals(rhs.dentinr))))&&((this.lskusdt == rhs.lskusdt)||((this.lskusdt!= null)&&this.lskusdt.equals(rhs.lskusdt))))&&((this.nanoinr == rhs.nanoinr)||((this.nanoinr!= null)&&this.nanoinr.equals(rhs.nanoinr))))&&((this.avaxusdt == rhs.avaxusdt)||((this.avaxusdt!= null)&&this.avaxusdt.equals(rhs.avaxusdt))))&&((this.hiveusdt == rhs.hiveusdt)||((this.hiveusdt!= null)&&this.hiveusdt.equals(rhs.hiveusdt))))&&((this.ctsiusdt == rhs.ctsiusdt)||((this.ctsiusdt!= null)&&this.ctsiusdt.equals(rhs.ctsiusdt))))&&((this.cakeinr == rhs.cakeinr)||((this.cakeinr!= null)&&this.cakeinr.equals(rhs.cakeinr))))&&((this.scusdt == rhs.scusdt)||((this.scusdt!= null)&&this.scusdt.equals(rhs.scusdt))))&&((this.atombtc == rhs.atombtc)||((this.atombtc!= null)&&this.atombtc.equals(rhs.atombtc))))&&((this.tkoinr == rhs.tkoinr)||((this.tkoinr!= null)&&this.tkoinr.equals(rhs.tkoinr))))&&((this.adausdt == rhs.adausdt)||((this.adausdt!= null)&&this.adausdt.equals(rhs.adausdt))))&&((this.pushusdt == rhs.pushusdt)||((this.pushusdt!= null)&&this.pushusdt.equals(rhs.pushusdt))))&&((this.dockinr == rhs.dockinr)||((this.dockinr!= null)&&this.dockinr.equals(rhs.dockinr))))&&((this.icxbtc == rhs.icxbtc)||((this.icxbtc!= null)&&this.icxbtc.equals(rhs.icxbtc))))&&((this.shibinr == rhs.shibinr)||((this.shibinr!= null)&&this.shibinr.equals(rhs.shibinr))))&&((this.paxgusdt == rhs.paxgusdt)||((this.paxgusdt!= null)&&this.paxgusdt.equals(rhs.paxgusdt))))&&((this.filusdt == rhs.filusdt)||((this.filusdt!= null)&&this.filusdt.equals(rhs.filusdt))))&&((this.trxbtc == rhs.trxbtc)||((this.trxbtc!= null)&&this.trxbtc.equals(rhs.trxbtc))))&&((this.ethwrx == rhs.ethwrx)||((this.ethwrx!= null)&&this.ethwrx.equals(rhs.ethwrx))))&&((this.btcinr == rhs.btcinr)||((this.btcinr!= null)&&this.btcinr.equals(rhs.btcinr))))&&((this.iostusdt == rhs.iostusdt)||((this.iostusdt!= null)&&this.iostusdt.equals(rhs.iostusdt))))&&((this.nasusdt == rhs.nasusdt)||((this.nasusdt!= null)&&this.nasusdt.equals(rhs.nasusdt))))&&((this.egldusdt == rhs.egldusdt)||((this.egldusdt!= null)&&this.egldusdt.equals(rhs.egldusdt))))&&((this.stmxusdt == rhs.stmxusdt)||((this.stmxusdt!= null)&&this.stmxusdt.equals(rhs.stmxusdt))))&&((this.xrpinr == rhs.xrpinr)||((this.xrpinr!= null)&&this.xrpinr.equals(rhs.xrpinr))))&&((this._1inchinr == rhs._1inchinr)||((this._1inchinr!= null)&&this._1inchinr.equals(rhs._1inchinr))))&&((this.atomusdt == rhs.atomusdt)||((this.atomusdt!= null)&&this.atomusdt.equals(rhs.atomusdt))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.zilbtc == rhs.zilbtc)||((this.zilbtc!= null)&&this.zilbtc.equals(rhs.zilbtc))))&&((this.rsrusdt == rhs.rsrusdt)||((this.rsrusdt!= null)&&this.rsrusdt.equals(rhs.rsrusdt))))&&((this.blzusdt == rhs.blzusdt)||((this.blzusdt!= null)&&this.blzusdt.equals(rhs.blzusdt))))&&((this.paxginr == rhs.paxginr)||((this.paxginr!= null)&&this.paxginr.equals(rhs.paxginr))))&&((this.maticwrx == rhs.maticwrx)||((this.maticwrx!= null)&&this.maticwrx.equals(rhs.maticwrx))))&&((this.daiusdt == rhs.daiusdt)||((this.daiusdt!= null)&&this.daiusdt.equals(rhs.daiusdt))))&&((this.xeminr == rhs.xeminr)||((this.xeminr!= null)&&this.xeminr.equals(rhs.xeminr))))&&((this.ltcbtc == rhs.ltcbtc)||((this.ltcbtc!= null)&&this.ltcbtc.equals(rhs.ltcbtc))))&&((this.sxpusdt == rhs.sxpusdt)||((this.sxpusdt!= null)&&this.sxpusdt.equals(rhs.sxpusdt))))&&((this.sushiusdt == rhs.sushiusdt)||((this.sushiusdt!= null)&&this.sushiusdt.equals(rhs.sushiusdt))))&&((this.cakeusdt == rhs.cakeusdt)||((this.cakeusdt!= null)&&this.cakeusdt.equals(rhs.cakeusdt))))&&((this.nearusdt == rhs.nearusdt)||((this.nearusdt!= null)&&this.nearusdt.equals(rhs.nearusdt))))&&((this.aaveusdt == rhs.aaveusdt)||((this.aaveusdt!= null)&&this.aaveusdt.equals(rhs.aaveusdt))))&&((this.linkwrx == rhs.linkwrx)||((this.linkwrx!= null)&&this.linkwrx.equals(rhs.linkwrx))))&&((this.yfiiusdt == rhs.yfiiusdt)||((this.yfiiusdt!= null)&&this.yfiiusdt.equals(rhs.yfiiusdt))))&&((this.ankrusdt == rhs.ankrusdt)||((this.ankrusdt!= null)&&this.ankrusdt.equals(rhs.ankrusdt))))&&((this.duskusdt == rhs.duskusdt)||((this.duskusdt!= null)&&this.duskusdt.equals(rhs.duskusdt))))&&((this.usdtinr == rhs.usdtinr)||((this.usdtinr!= null)&&this.usdtinr.equals(rhs.usdtinr))))&&((this.jstusdt == rhs.jstusdt)||((this.jstusdt!= null)&&this.jstusdt.equals(rhs.jstusdt))))&&((this.crvusdt == rhs.crvusdt)||((this.crvusdt!= null)&&this.crvusdt.equals(rhs.crvusdt))))&&((this.fttusdt == rhs.fttusdt)||((this.fttusdt!= null)&&this.fttusdt.equals(rhs.fttusdt))))&&((this.stxusdt == rhs.stxusdt)||((this.stxusdt!= null)&&this.stxusdt.equals(rhs.stxusdt))))&&((this.oneusdt == rhs.oneusdt)||((this.oneusdt!= null)&&this.oneusdt.equals(rhs.oneusdt))))&&((this.aionusdt == rhs.aionusdt)||((this.aionusdt!= null)&&this.aionusdt.equals(rhs.aionusdt))))&&((this.avausdt == rhs.avausdt)||((this.avausdt!= null)&&this.avausdt.equals(rhs.avausdt))))&&((this.rvnbtc == rhs.rvnbtc)||((this.rvnbtc!= null)&&this.rvnbtc.equals(rhs.rvnbtc))))&&((this.wrxinr == rhs.wrxinr)||((this.wrxinr!= null)&&this.wrxinr.equals(rhs.wrxinr))))&&((this.bzrxinr == rhs.bzrxinr)||((this.bzrxinr!= null)&&this.bzrxinr.equals(rhs.bzrxinr))))&&((this.oneinr == rhs.oneinr)||((this.oneinr!= null)&&this.oneinr.equals(rhs.oneinr))))&&((this.fttinr == rhs.fttinr)||((this.fttinr!= null)&&this.fttinr.equals(rhs.fttinr))))&&((this.celrbtc == rhs.celrbtc)||((this.celrbtc!= null)&&this.celrbtc.equals(rhs.celrbtc))))&&((this.nanousdt == rhs.nanousdt)||((this.nanousdt!= null)&&this.nanousdt.equals(rhs.nanousdt))))&&((this.ftmusdt == rhs.ftmusdt)||((this.ftmusdt!= null)&&this.ftmusdt.equals(rhs.ftmusdt))))&&((this.fetusdt == rhs.fetusdt)||((this.fetusdt!= null)&&this.fetusdt.equals(rhs.fetusdt))))&&((this.wavesusdt == rhs.wavesusdt)||((this.wavesusdt!= null)&&this.wavesusdt.equals(rhs.wavesusdt))))&&((this.sxpinr == rhs.sxpinr)||((this.sxpinr!= null)&&this.sxpinr.equals(rhs.sxpinr))))&&((this.uftinr == rhs.uftinr)||((this.uftinr!= null)&&this.uftinr.equals(rhs.uftinr))))&&((this.lunainr == rhs.lunainr)||((this.lunainr!= null)&&this.lunainr.equals(rhs.lunainr))))&&((this.uniusdt == rhs.uniusdt)||((this.uniusdt!= null)&&this.uniusdt.equals(rhs.uniusdt))))&&((this.straxusdt == rhs.straxusdt)||((this.straxusdt!= null)&&this.straxusdt.equals(rhs.straxusdt))))&&((this.btgusdt == rhs.btgusdt)||((this.btgusdt!= null)&&this.btgusdt.equals(rhs.btgusdt))))&&((this.wrxusdt == rhs.wrxusdt)||((this.wrxusdt!= null)&&this.wrxusdt.equals(rhs.wrxusdt))))&&((this.yfiusdt == rhs.yfiusdt)||((this.yfiusdt!= null)&&this.yfiusdt.equals(rhs.yfiusdt))))&&((this.pushinr == rhs.pushinr)||((this.pushinr!= null)&&this.pushinr.equals(rhs.pushinr))))&&((this.tusdusdt == rhs.tusdusdt)||((this.tusdusdt!= null)&&this.tusdusdt.equals(rhs.tusdusdt))))&&((this.ethusdt == rhs.ethusdt)||((this.ethusdt!= null)&&this.ethusdt.equals(rhs.ethusdt))))&&((this.creamusdt == rhs.creamusdt)||((this.creamusdt!= null)&&this.creamusdt.equals(rhs.creamusdt))))&&((this.dogewrx == rhs.dogewrx)||((this.dogewrx!= null)&&this.dogewrx.equals(rhs.dogewrx))))&&((this.diausdt == rhs.diausdt)||((this.diausdt!= null)&&this.diausdt.equals(rhs.diausdt))))&&((this.dashbtc == rhs.dashbtc)||((this.dashbtc!= null)&&this.dashbtc.equals(rhs.dashbtc))))&&((this.dogeusdt == rhs.dogeusdt)||((this.dogeusdt!= null)&&this.dogeusdt.equals(rhs.dogeusdt))))&&((this.iostbtc == rhs.iostbtc)||((this.iostbtc!= null)&&this.iostbtc.equals(rhs.iostbtc))))&&((this.thetabtc == rhs.thetabtc)||((this.thetabtc!= null)&&this.thetabtc.equals(rhs.thetabtc))))&&((this.ftminr == rhs.ftminr)||((this.ftminr!= null)&&this.ftminr.equals(rhs.ftminr))))&&((this.repusdt == rhs.repusdt)||((this.repusdt!= null)&&this.repusdt.equals(rhs.repusdt))))&&((this.dexeusdt == rhs.dexeusdt)||((this.dexeusdt!= null)&&this.dexeusdt.equals(rhs.dexeusdt))))&&((this.chzusdt == rhs.chzusdt)||((this.chzusdt!= null)&&this.chzusdt.equals(rhs.chzusdt))))&&((this.stmxbtc == rhs.stmxbtc)||((this.stmxbtc!= null)&&this.stmxbtc.equals(rhs.stmxbtc))))&&((this.ckbusdt == rhs.ckbusdt)||((this.ckbusdt!= null)&&this.ckbusdt.equals(rhs.ckbusdt))))&&((this.bchinr == rhs.bchinr)||((this.bchinr!= null)&&this.bchinr.equals(rhs.bchinr))))&&((this.enjusdt == rhs.enjusdt)||((this.enjusdt!= null)&&this.enjusdt.equals(rhs.enjusdt))))&&((this.xrpbtc == rhs.xrpbtc)||((this.xrpbtc!= null)&&this.xrpbtc.equals(rhs.xrpbtc))))&&((this.omginr == rhs.omginr)||((this.omginr!= null)&&this.omginr.equals(rhs.omginr))))&&((this.celrusdt == rhs.celrusdt)||((this.celrusdt!= null)&&this.celrusdt.equals(rhs.celrusdt))))&&((this.tomousdt == rhs.tomousdt)||((this.tomousdt!= null)&&this.tomousdt.equals(rhs.tomousdt))))&&((this.ezusdt == rhs.ezusdt)||((this.ezusdt!= null)&&this.ezusdt.equals(rhs.ezusdt))))&&((this.adawrx == rhs.adawrx)||((this.adawrx!= null)&&this.adawrx.equals(rhs.adawrx))))&&((this.shibusdt == rhs.shibusdt)||((this.shibusdt!= null)&&this.shibusdt.equals(rhs.shibusdt))))&&((this.arkinr == rhs.arkinr)||((this.arkinr!= null)&&this.arkinr.equals(rhs.arkinr))))&&((this.tfuelusdt == rhs.tfuelusdt)||((this.tfuelusdt!= null)&&this.tfuelusdt.equals(rhs.tfuelusdt))))&&((this.srmusdt == rhs.srmusdt)||((this.srmusdt!= null)&&this.srmusdt.equals(rhs.srmusdt))))&&((this.usdcbtc == rhs.usdcbtc)||((this.usdcbtc!= null)&&this.usdcbtc.equals(rhs.usdcbtc))))&&((this.xemusdt == rhs.xemusdt)||((this.xemusdt!= null)&&this.xemusdt.equals(rhs.xemusdt))))&&((this.dockusdt == rhs.dockusdt)||((this.dockusdt!= null)&&this.dockusdt.equals(rhs.dockusdt))))&&((this.ltcusdt == rhs.ltcusdt)||((this.ltcusdt!= null)&&this.ltcusdt.equals(rhs.ltcusdt))))&&((this.sntbtc == rhs.sntbtc)||((this.sntbtc!= null)&&this.sntbtc.equals(rhs.sntbtc))))&&((this.storjusdt == rhs.storjusdt)||((this.storjusdt!= null)&&this.storjusdt.equals(rhs.storjusdt))))&&((this.zrxbtc == rhs.zrxbtc)||((this.zrxbtc!= null)&&this.zrxbtc.equals(rhs.zrxbtc))))&&((this.qtumusdt == rhs.qtumusdt)||((this.qtumusdt!= null)&&this.qtumusdt.equals(rhs.qtumusdt))))&&((this.nulsbtc == rhs.nulsbtc)||((this.nulsbtc!= null)&&this.nulsbtc.equals(rhs.nulsbtc))))&&((this.reqbtc == rhs.reqbtc)||((this.reqbtc!= null)&&this.reqbtc.equals(rhs.reqbtc))))&&((this.funbtc == rhs.funbtc)||((this.funbtc!= null)&&this.funbtc.equals(rhs.funbtc))))&&((this.glmbtc == rhs.glmbtc)||((this.glmbtc!= null)&&this.glmbtc.equals(rhs.glmbtc))))&&((this.btcusdt == rhs.btcusdt)||((this.btcusdt!= null)&&this.btcusdt.equals(rhs.btcusdt))))&&((this.omgusdt == rhs.omgusdt)||((this.omgusdt!= null)&&this.omgusdt.equals(rhs.omgusdt))))&&((this.yfiwrx == rhs.yfiwrx)||((this.yfiwrx!= null)&&this.yfiwrx.equals(rhs.yfiwrx))))&&((this.qkcbtc == rhs.qkcbtc)||((this.qkcbtc!= null)&&this.qkcbtc.equals(rhs.qkcbtc))))&&((this.ezinr == rhs.ezinr)||((this.ezinr!= null)&&this.ezinr.equals(rhs.ezinr))))&&((this.bnbwrx == rhs.bnbwrx)||((this.bnbwrx!= null)&&this.bnbwrx.equals(rhs.bnbwrx))))&&((this.solinr == rhs.solinr)||((this.solinr!= null)&&this.solinr.equals(rhs.solinr))))&&((this.batbtc == rhs.batbtc)||((this.batbtc!= null)&&this.batbtc.equals(rhs.batbtc))))&&((this.vibusdt == rhs.vibusdt)||((this.vibusdt!= null)&&this.vibusdt.equals(rhs.vibusdt))))&&((this.cotiusdt == rhs.cotiusdt)||((this.cotiusdt!= null)&&this.cotiusdt.equals(rhs.cotiusdt))))&&((this.arkusdt == rhs.arkusdt)||((this.arkusdt!= null)&&this.arkusdt.equals(rhs.arkusdt))))&&((this.neousdt == rhs.neousdt)||((this.neousdt!= null)&&this.neousdt.equals(rhs.neousdt))))&&((this.dashinr == rhs.dashinr)||((this.dashinr!= null)&&this.dashinr.equals(rhs.dashinr))))&&((this.sandusdt == rhs.sandusdt)||((this.sandusdt!= null)&&this.sandusdt.equals(rhs.sandusdt))))&&((this.iostinr == rhs.iostinr)||((this.iostinr!= null)&&this.iostinr.equals(rhs.iostinr))))&&((this.enjwrx == rhs.enjwrx)||((this.enjwrx!= null)&&this.enjwrx.equals(rhs.enjwrx))))&&((this.paxbtc == rhs.paxbtc)||((this.paxbtc!= null)&&this.paxbtc.equals(rhs.paxbtc))))&&((this.datausdt == rhs.datausdt)||((this.datausdt!= null)&&this.datausdt.equals(rhs.datausdt))))&&((this.balusdt == rhs.balusdt)||((this.balusdt!= null)&&this.balusdt.equals(rhs.balusdt))))&&((this.oxtusdt == rhs.oxtusdt)||((this.oxtusdt!= null)&&this.oxtusdt.equals(rhs.oxtusdt))))&&((this.kavausdt == rhs.kavausdt)||((this.kavausdt!= null)&&this.kavausdt.equals(rhs.kavausdt))))&&((this.ltcinr == rhs.ltcinr)||((this.ltcinr!= null)&&this.ltcinr.equals(rhs.ltcinr))))&&((this.iotausdt == rhs.iotausdt)||((this.iotausdt!= null)&&this.iotausdt.equals(rhs.iotausdt))))&&((this.eosinr == rhs.eosinr)||((this.eosinr!= null)&&this.eosinr.equals(rhs.eosinr))))&&((this.firousdt == rhs.firousdt)||((this.firousdt!= null)&&this.firousdt.equals(rhs.firousdt))))&&((this.hotusdt == rhs.hotusdt)||((this.hotusdt!= null)&&this.hotusdt.equals(rhs.hotusdt))))&&((this.mtlusdt == rhs.mtlusdt)||((this.mtlusdt!= null)&&this.mtlusdt.equals(rhs.mtlusdt))))&&((this.omgbtc == rhs.omgbtc)||((this.omgbtc!= null)&&this.omgbtc.equals(rhs.omgbtc))))&&((this.glmusdt == rhs.glmusdt)||((this.glmusdt!= null)&&this.glmusdt.equals(rhs.glmusdt))))&&((this.dotinr == rhs.dotinr)||((this.dotinr!= null)&&this.dotinr.equals(rhs.dotinr))))&&((this.busdusdt == rhs.busdusdt)||((this.busdusdt!= null)&&this.busdusdt.equals(rhs.busdusdt))))&&((this.ethbtc == rhs.ethbtc)||((this.ethbtc!= null)&&this.ethbtc.equals(rhs.ethbtc))))&&((this.polyusdt == rhs.polyusdt)||((this.polyusdt!= null)&&this.polyusdt.equals(rhs.polyusdt))))&&((this.frontusdt == rhs.frontusdt)||((this.frontusdt!= null)&&this.frontusdt.equals(rhs.frontusdt))))&&((this.zrxusdt == rhs.zrxusdt)||((this.zrxusdt!= null)&&this.zrxusdt.equals(rhs.zrxusdt))))&&((this.eosusdt == rhs.eosusdt)||((this.eosusdt!= null)&&this.eosusdt.equals(rhs.eosusdt))))&&((this.chrinr == rhs.chrinr)||((this.chrinr!= null)&&this.chrinr.equals(rhs.chrinr))))&&((this.zrxinr == rhs.zrxinr)||((this.zrxinr!= null)&&this.zrxinr.equals(rhs.zrxinr))))&&((this.batusdt == rhs.batusdt)||((this.batusdt!= null)&&this.batusdt.equals(rhs.batusdt))))&&((this.algousdt == rhs.algousdt)||((this.algousdt!= null)&&this.algousdt.equals(rhs.algousdt))))&&((this.vetinr == rhs.vetinr)||((this.vetinr!= null)&&this.vetinr.equals(rhs.vetinr))))&&((this.hntusdt == rhs.hntusdt)||((this.hntusdt!= null)&&this.hntusdt.equals(rhs.hntusdt))))&&((this.perlusdt == rhs.perlusdt)||((this.perlusdt!= null)&&this.perlusdt.equals(rhs.perlusdt))))&&((this.uniinr == rhs.uniinr)||((this.uniinr!= null)&&this.uniinr.equals(rhs.uniinr))))&&((this.sntusdt == rhs.sntusdt)||((this.sntusdt!= null)&&this.sntusdt.equals(rhs.sntusdt))))&&((this.scinr == rhs.scinr)||((this.scinr!= null)&&this.scinr.equals(rhs.scinr))))&&((this.dashusdt == rhs.dashusdt)||((this.dashusdt!= null)&&this.dashusdt.equals(rhs.dashusdt))))&&((this.xmrusdt == rhs.xmrusdt)||((this.xmrusdt!= null)&&this.xmrusdt.equals(rhs.xmrusdt))))&&((this.dgbusdt == rhs.dgbusdt)||((this.dgbusdt!= null)&&this.dgbusdt.equals(rhs.dgbusdt))))&&((this.grsusdt == rhs.grsusdt)||((this.grsusdt!= null)&&this.grsusdt.equals(rhs.grsusdt))))&&((this.injusdt == rhs.injusdt)||((this.injusdt!= null)&&this.injusdt.equals(rhs.injusdt))))&&((this.chrusdt == rhs.chrusdt)||((this.chrusdt!= null)&&this.chrusdt.equals(rhs.chrusdt))))&&((this.trbusdt == rhs.trbusdt)||((this.trbusdt!= null)&&this.trbusdt.equals(rhs.trbusdt))))&&((this.bntusdt == rhs.bntusdt)||((this.bntusdt!= null)&&this.bntusdt.equals(rhs.bntusdt))))&&((this.ncashusdt == rhs.ncashusdt)||((this.ncashusdt!= null)&&this.ncashusdt.equals(rhs.ncashusdt))))&&((this._1inchusdt == rhs._1inchusdt)||((this._1inchusdt!= null)&&this._1inchusdt.equals(rhs._1inchusdt))))&&((this.manausdt == rhs.manausdt)||((this.manausdt!= null)&&this.manausdt.equals(rhs.manausdt))))&&((this.iotxusdt == rhs.iotxusdt)||((this.iotxusdt!= null)&&this.iotxusdt.equals(rhs.iotxusdt))))&&((this.dentusdt == rhs.dentusdt)||((this.dentusdt!= null)&&this.dentusdt.equals(rhs.dentusdt))))&&((this.hbarinr == rhs.hbarinr)||((this.hbarinr!= null)&&this.hbarinr.equals(rhs.hbarinr))))&&((this.btsusdt == rhs.btsusdt)||((this.btsusdt!= null)&&this.btsusdt.equals(rhs.btsusdt))))&&((this.dgbinr == rhs.dgbinr)||((this.dgbinr!= null)&&this.dgbinr.equals(rhs.dgbinr))))&&((this.umausdt == rhs.umausdt)||((this.umausdt!= null)&&this.umausdt.equals(rhs.umausdt))))&&((this.etcinr == rhs.etcinr)||((this.etcinr!= null)&&this.etcinr.equals(rhs.etcinr))))&&((this.etcusdt == rhs.etcusdt)||((this.etcusdt!= null)&&this.etcusdt.equals(rhs.etcusdt))))&&((this.maticinr == rhs.maticinr)||((this.maticinr!= null)&&this.maticinr.equals(rhs.maticinr))))&&((this.bnbusdt == rhs.bnbusdt)||((this.bnbusdt!= null)&&this.bnbusdt.equals(rhs.bnbusdt))))&&((this.gtousdt == rhs.gtousdt)||((this.gtousdt!= null)&&this.gtousdt.equals(rhs.gtousdt))))&&((this.yfiinr == rhs.yfiinr)||((this.yfiinr!= null)&&this.yfiinr.equals(rhs.yfiinr))))&&((this.yfiiinr == rhs.yfiiinr)||((this.yfiiinr!= null)&&this.yfiiinr.equals(rhs.yfiiinr))))&&((this.reninr == rhs.reninr)||((this.reninr!= null)&&this.reninr.equals(rhs.reninr))))&&((this.swrvusdt == rhs.swrvusdt)||((this.swrvusdt!= null)&&this.swrvusdt.equals(rhs.swrvusdt))))&&((this.linkinr == rhs.linkinr)||((this.linkinr!= null)&&this.linkinr.equals(rhs.linkinr))))&&((this.hntinr == rhs.hntinr)||((this.hntinr!= null)&&this.hntinr.equals(rhs.hntinr))))&&((this.zilusdt == rhs.zilusdt)||((this.zilusdt!= null)&&this.zilusdt.equals(rhs.zilusdt))))&&((this.xlmusdt == rhs.xlmusdt)||((this.xlmusdt!= null)&&this.xlmusdt.equals(rhs.xlmusdt))))&&((this.hotinr == rhs.hotinr)||((this.hotinr!= null)&&this.hotinr.equals(rhs.hotinr))))&&((this.polybtc == rhs.polybtc)||((this.polybtc!= null)&&this.polybtc.equals(rhs.polybtc))))&&((this.cosusdt == rhs.cosusdt)||((this.cosusdt!= null)&&this.cosusdt.equals(rhs.cosusdt))))&&((this.filinr == rhs.filinr)||((this.filinr!= null)&&this.filinr.equals(rhs.filinr))))&&((this.fetbtc == rhs.fetbtc)||((this.fetbtc!= null)&&this.fetbtc.equals(rhs.fetbtc))))&&((this.umainr == rhs.umainr)||((this.umainr!= null)&&this.umainr.equals(rhs.umainr))))&&((this.xvginr == rhs.xvginr)||((this.xvginr!= null)&&this.xvginr.equals(rhs.xvginr))))&&((this.adxusdt == rhs.adxusdt)||((this.adxusdt!= null)&&this.adxusdt.equals(rhs.adxusdt))))&&((this.steemusdt == rhs.steemusdt)||((this.steemusdt!= null)&&this.steemusdt.equals(rhs.steemusdt))))&&((this.xlmbtc == rhs.xlmbtc)||((this.xlmbtc!= null)&&this.xlmbtc.equals(rhs.xlmbtc))))&&((this.qkcusdt == rhs.qkcusdt)||((this.qkcusdt!= null)&&this.qkcusdt.equals(rhs.qkcusdt))))&&((this.ardrusdt == rhs.ardrusdt)||((this.ardrusdt!= null)&&this.ardrusdt.equals(rhs.ardrusdt))))&&((this.ethinr == rhs.ethinr)||((this.ethinr!= null)&&this.ethinr.equals(rhs.ethinr))))&&((this.snxusdt == rhs.snxusdt)||((this.snxusdt!= null)&&this.snxusdt.equals(rhs.snxusdt))))&&((this.bchsvusdt == rhs.bchsvusdt)||((this.bchsvusdt!= null)&&this.bchsvusdt.equals(rhs.bchsvusdt))))&&((this.mkrusdt == rhs.mkrusdt)||((this.mkrusdt!= null)&&this.mkrusdt.equals(rhs.mkrusdt))))&&((this.xtzusdt == rhs.xtzusdt)||((this.xtzusdt!= null)&&this.xtzusdt.equals(rhs.xtzusdt))))&&((this.avaxinr == rhs.avaxinr)||((this.avaxinr!= null)&&this.avaxinr.equals(rhs.avaxinr))))&&((this.cotiinr == rhs.cotiinr)||((this.cotiinr!= null)&&this.cotiinr.equals(rhs.cotiinr))))&&((this.usdcusdt == rhs.usdcusdt)||((this.usdcusdt!= null)&&this.usdcusdt.equals(rhs.usdcusdt))))&&((this.batinr == rhs.batinr)||((this.batinr!= null)&&this.batinr.equals(rhs.batinr))))&&((this.ltousdt == rhs.ltousdt)||((this.ltousdt!= null)&&this.ltousdt.equals(rhs.ltousdt))))&&((this.trxwrx == rhs.trxwrx)||((this.trxwrx!= null)&&this.trxwrx.equals(rhs.trxwrx))))&&((this.compusdt == rhs.compusdt)||((this.compusdt!= null)&&this.compusdt.equals(rhs.compusdt))))&&((this.wtcusdt == rhs.wtcusdt)||((this.wtcusdt!= null)&&this.wtcusdt.equals(rhs.wtcusdt))))&&((this.bchusdt == rhs.bchusdt)||((this.bchusdt!= null)&&this.bchusdt.equals(rhs.bchusdt))))&&((this.hbarusdt == rhs.hbarusdt)||((this.hbarusdt!= null)&&this.hbarusdt.equals(rhs.hbarusdt))))&&((this.icxusdt == rhs.icxusdt)||((this.icxusdt!= null)&&this.icxusdt.equals(rhs.icxusdt))))&&((this.xvgusdt == rhs.xvgusdt)||((this.xvgusdt!= null)&&this.xvgusdt.equals(rhs.xvgusdt))))&&((this.rvnusdt == rhs.rvnusdt)||((this.rvnusdt!= null)&&this.rvnusdt.equals(rhs.rvnusdt))))&&((this.atominr == rhs.atominr)||((this.atominr!= null)&&this.atominr.equals(rhs.atominr))))&&((this.trxinr == rhs.trxinr)||((this.trxinr!= null)&&this.trxinr.equals(rhs.trxinr))))&&((this.dotusdt == rhs.dotusdt)||((this.dotusdt!= null)&&this.dotusdt.equals(rhs.dotusdt))))&&((this.ctsiinr == rhs.ctsiinr)||((this.ctsiinr!= null)&&this.ctsiinr.equals(rhs.ctsiinr))))&&((this.bnbbtc == rhs.bnbbtc)||((this.bnbbtc!= null)&&this.bnbbtc.equals(rhs.bnbbtc))))&&((this.fttbtc == rhs.fttbtc)||((this.fttbtc!= null)&&this.fttbtc.equals(rhs.fttbtc))))&&((this.manainr == rhs.manainr)||((this.manainr!= null)&&this.manainr.equals(rhs.manainr))))&&((this.pundixusdt == rhs.pundixusdt)||((this.pundixusdt!= null)&&this.pundixusdt.equals(rhs.pundixusdt))))&&((this.dogeinr == rhs.dogeinr)||((this.dogeinr!= null)&&this.dogeinr.equals(rhs.dogeinr))))&&((this.maticbtc == rhs.maticbtc)||((this.maticbtc!= null)&&this.maticbtc.equals(rhs.maticbtc))))&&((this.linkusdt == rhs.linkusdt)||((this.linkusdt!= null)&&this.linkusdt.equals(rhs.linkusdt))))&&((this.bttinr == rhs.bttinr)||((this.bttinr!= null)&&this.bttinr.equals(rhs.bttinr))))&&((this.lrcusdt == rhs.lrcusdt)||((this.lrcusdt!= null)&&this.lrcusdt.equals(rhs.lrcusdt))))&&((this.zilinr == rhs.zilinr)||((this.zilinr!= null)&&this.zilinr.equals(rhs.zilinr))))&&((this.wininr == rhs.wininr)||((this.wininr!= null)&&this.wininr.equals(rhs.wininr))))&&((this.ksmusdt == rhs.ksmusdt)||((this.ksmusdt!= null)&&this.ksmusdt.equals(rhs.ksmusdt))))&&((this.thetausdt == rhs.thetausdt)||((this.thetausdt!= null)&&this.thetausdt.equals(rhs.thetausdt))))&&((this.ltcwrx == rhs.ltcwrx)||((this.ltcwrx!= null)&&this.ltcwrx.equals(rhs.ltcwrx))))&&((this.ognusdt == rhs.ognusdt)||((this.ognusdt!= null)&&this.ognusdt.equals(rhs.ognusdt))))&&((this.gxsusdt == rhs.gxsusdt)||((this.gxsusdt!= null)&&this.gxsusdt.equals(rhs.gxsusdt))))&&((this.kmdinr == rhs.kmdinr)||((this.kmdinr!= null)&&this.kmdinr.equals(rhs.kmdinr))))&&((this.mdtusdt == rhs.mdtusdt)||((this.mdtusdt!= null)&&this.mdtusdt.equals(rhs.mdtusdt))))&&((this.xrpusdt == rhs.xrpusdt)||((this.xrpusdt!= null)&&this.xrpusdt.equals(rhs.xrpusdt))))&&((this.maticusdt == rhs.maticusdt)||((this.maticusdt!= null)&&this.maticusdt.equals(rhs.maticusdt))))&&((this.zecinr == rhs.zecinr)||((this.zecinr!= null)&&this.zecinr.equals(rhs.zecinr))))&&((this.tkousdt == rhs.tkousdt)||((this.tkousdt!= null)&&this.tkousdt.equals(rhs.tkousdt))))&&((this.adainr == rhs.adainr)||((this.adainr!= null)&&this.adainr.equals(rhs.adainr))))&&((this.wrxbtc == rhs.wrxbtc)||((this.wrxbtc!= null)&&this.wrxbtc.equals(rhs.wrxbtc))))&&((this.loomusdt == rhs.loomusdt)||((this.loomusdt!= null)&&this.loomusdt.equals(rhs.loomusdt))))&&((this.xlminr == rhs.xlminr)||((this.xlminr!= null)&&this.xlminr.equals(rhs.xlminr))))&&((this.bttusdt == rhs.bttusdt)||((this.bttusdt!= null)&&this.bttusdt.equals(rhs.bttusdt))))&&((this.bandusdt == rhs.bandusdt)||((this.bandusdt!= null)&&this.bandusdt.equals(rhs.bandusdt))))&&((this.vetusdt == rhs.vetusdt)||((this.vetusdt!= null)&&this.vetusdt.equals(rhs.vetusdt))))&&((this.solusdt == rhs.solusdt)||((this.solusdt!= null)&&this.solusdt.equals(rhs.solusdt))))&&((this.busdinr == rhs.busdinr)||((this.busdinr!= null)&&this.busdinr.equals(rhs.busdinr))))&&((this.paxusdt == rhs.paxusdt)||((this.paxusdt!= null)&&this.paxusdt.equals(rhs.paxusdt))))&&((this.trxusdt == rhs.trxusdt)||((this.trxusdt!= null)&&this.trxusdt.equals(rhs.trxusdt))))&&((this.adabtc == rhs.adabtc)||((this.adabtc!= null)&&this.adabtc.equals(rhs.adabtc))))&&((this.xrpwrx == rhs.xrpwrx)||((this.xrpwrx!= null)&&this.xrpwrx.equals(rhs.xrpwrx))))&&((this.crvinr == rhs.crvinr)||((this.crvinr!= null)&&this.crvinr.equals(rhs.crvinr))))&&((this.lunausdt == rhs.lunausdt)||((this.lunausdt!= null)&&this.lunausdt.equals(rhs.lunausdt))))&&((this.uftusdt == rhs.uftusdt)||((this.uftusdt!= null)&&this.uftusdt.equals(rhs.uftusdt))))&&((this.grtusdt == rhs.grtusdt)||((this.grtusdt!= null)&&this.grtusdt.equals(rhs.grtusdt))))&&((this.nbsusdt == rhs.nbsusdt)||((this.nbsusdt!= null)&&this.nbsusdt.equals(rhs.nbsusdt))))&&((this.bnbinr == rhs.bnbinr)||((this.bnbinr!= null)&&this.bnbinr.equals(rhs.bnbinr))))&&((this.bchausdt == rhs.bchausdt)||((this.bchausdt!= null)&&this.bchausdt.equals(rhs.bchausdt))))&&((this.fetinr == rhs.fetinr)||((this.fetinr!= null)&&this.fetinr.equals(rhs.fetinr))))&&((this.renusdt == rhs.renusdt)||((this.renusdt!= null)&&this.renusdt.equals(rhs.renusdt))))&&((this.xmrbtc == rhs.xmrbtc)||((this.xmrbtc!= null)&&this.xmrbtc.equals(rhs.xmrbtc))))&&((this.iotxinr == rhs.iotxinr)||((this.iotxinr!= null)&&this.iotxinr.equals(rhs.iotxinr))))&&((this.cvcusdt == rhs.cvcusdt)||((this.cvcusdt!= null)&&this.cvcusdt.equals(rhs.cvcusdt))))&&((this.enjinr == rhs.enjinr)||((this.enjinr!= null)&&this.enjinr.equals(rhs.enjinr))))&&((this.chzinr == rhs.chzinr)||((this.chzinr!= null)&&this.chzinr.equals(rhs.chzinr))))&&((this.zecusdt == rhs.zecusdt)||((this.zecusdt!= null)&&this.zecusdt.equals(rhs.zecusdt))))&&((this.winusdt == rhs.winusdt)||((this.winusdt!= null)&&this.winusdt.equals(rhs.winusdt))))&&((this.eoswrx == rhs.eoswrx)||((this.eoswrx!= null)&&this.eoswrx.equals(rhs.eoswrx))));
    }

}
