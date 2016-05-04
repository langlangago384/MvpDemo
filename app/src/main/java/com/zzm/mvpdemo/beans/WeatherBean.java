package com.zzm.mvpdemo.beans;

import java.util.List;

/**
 * Created by PrettyBoy on 2016/4/29.
 */
public class WeatherBean {


    /**
     * errNum : 0
     * errMsg : success
     * retData : {"city":"北京","cityid":"101010100","today":{"date":"2016-05-03","week":"星期二","curTemp":"23℃","aqi":"42","fengxiang":"北风","fengli":"4-5级","hightemp":"27℃","lowtemp":"10℃","type":"晴","index":[{"name":"感冒指数","code":"gm","index":"","details":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。","otherName":""},{"code":"fs","details":"属强紫外辐射天气，外出时应加强防护，建议涂擦SPF在15-20之间，PA++的防晒护肤品。","index":"强","name":"防晒指数","otherName":""},{"code":"ct","details":"建议着薄外套或牛仔衫裤等服装。年老体弱者宜着夹克衫、薄毛衣等。昼夜温差较大，注意适当增减衣服。","index":"较舒适","name":"穿衣指数","otherName":""},{"code":"yd","details":"天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意避风保暖。","index":"较适宜","name":"运动指数","otherName":""},{"code":"xc","details":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","index":"较不宜","name":"洗车指数","otherName":""},{"code":"ls","details":"天气不错，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！","index":"适宜","name":"晾晒指数","otherName":""}]},"forecast":[{"date":"2016-05-04","week":"星期三","fengxiang":"无持续风向","fengli":"微风级","hightemp":"28℃","lowtemp":"15℃","type":"阴"},{"date":"2016-05-05","week":"星期四","fengxiang":"北风","fengli":"3-4级","hightemp":"27℃","lowtemp":"16℃","type":"多云"},{"date":"2016-05-06","week":"星期五","fengxiang":"北风","fengli":"4-5级","hightemp":"25℃","lowtemp":"12℃","type":"晴"},{"date":"2016-05-07","week":"星期六","fengxiang":"南风","fengli":"3-4级","hightemp":"25℃","lowtemp":"14℃","type":"晴"}],"history":[{"date":"2016-04-26","week":"星期二","aqi":"110","fengxiang":"无持续风向","fengli":"微风级","hightemp":"23℃","lowtemp":"13℃","type":"多云"},{"date":"2016-04-27","week":"星期三","aqi":"127","fengxiang":"无持续风向","fengli":"微风级","hightemp":"19℃","lowtemp":"12℃","type":"小雨"},{"date":"2016-04-28","week":"星期四","aqi":"106","fengxiang":"南风","fengli":"3-4级","hightemp":"26℃","lowtemp":"13℃","type":"多云"},{"date":"2016-04-29","week":"星期五","aqi":"233","fengxiang":"无持续风向","fengli":"微风级","hightemp":"28℃","lowtemp":"15℃","type":"多云"},{"date":"2016-04-30","week":"星期六","aqi":"155","fengxiang":"无持续风向","fengli":"微风级","hightemp":"31℃","lowtemp":"15℃","type":"霾"},{"date":"2016-05-01","week":"星期天","aqi":"244","fengxiang":"无持续风向","fengli":"微风级","hightemp":"32℃","lowtemp":"20℃","type":"霾"},{"date":"2016-05-02","week":"星期一","aqi":"85","fengxiang":"北风","fengli":"4-5级","hightemp":"22℃","lowtemp":"10℃","type":"阵雨"}]}
     */

    private int errNum;
    private String errMsg;
    /**
     * city : 北京
     * cityid : 101010100
     * today : {"date":"2016-05-03","week":"星期二","curTemp":"23℃","aqi":"42","fengxiang":"北风","fengli":"4-5级","hightemp":"27℃","lowtemp":"10℃","type":"晴","index":[{"name":"感冒指数","code":"gm","index":"","details":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。","otherName":""},{"code":"fs","details":"属强紫外辐射天气，外出时应加强防护，建议涂擦SPF在15-20之间，PA++的防晒护肤品。","index":"强","name":"防晒指数","otherName":""},{"code":"ct","details":"建议着薄外套或牛仔衫裤等服装。年老体弱者宜着夹克衫、薄毛衣等。昼夜温差较大，注意适当增减衣服。","index":"较舒适","name":"穿衣指数","otherName":""},{"code":"yd","details":"天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意避风保暖。","index":"较适宜","name":"运动指数","otherName":""},{"code":"xc","details":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","index":"较不宜","name":"洗车指数","otherName":""},{"code":"ls","details":"天气不错，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！","index":"适宜","name":"晾晒指数","otherName":""}]}
     * forecast : [{"date":"2016-05-04","week":"星期三","fengxiang":"无持续风向","fengli":"微风级","hightemp":"28℃","lowtemp":"15℃","type":"阴"},{"date":"2016-05-05","week":"星期四","fengxiang":"北风","fengli":"3-4级","hightemp":"27℃","lowtemp":"16℃","type":"多云"},{"date":"2016-05-06","week":"星期五","fengxiang":"北风","fengli":"4-5级","hightemp":"25℃","lowtemp":"12℃","type":"晴"},{"date":"2016-05-07","week":"星期六","fengxiang":"南风","fengli":"3-4级","hightemp":"25℃","lowtemp":"14℃","type":"晴"}]
     * history : [{"date":"2016-04-26","week":"星期二","aqi":"110","fengxiang":"无持续风向","fengli":"微风级","hightemp":"23℃","lowtemp":"13℃","type":"多云"},{"date":"2016-04-27","week":"星期三","aqi":"127","fengxiang":"无持续风向","fengli":"微风级","hightemp":"19℃","lowtemp":"12℃","type":"小雨"},{"date":"2016-04-28","week":"星期四","aqi":"106","fengxiang":"南风","fengli":"3-4级","hightemp":"26℃","lowtemp":"13℃","type":"多云"},{"date":"2016-04-29","week":"星期五","aqi":"233","fengxiang":"无持续风向","fengli":"微风级","hightemp":"28℃","lowtemp":"15℃","type":"多云"},{"date":"2016-04-30","week":"星期六","aqi":"155","fengxiang":"无持续风向","fengli":"微风级","hightemp":"31℃","lowtemp":"15℃","type":"霾"},{"date":"2016-05-01","week":"星期天","aqi":"244","fengxiang":"无持续风向","fengli":"微风级","hightemp":"32℃","lowtemp":"20℃","type":"霾"},{"date":"2016-05-02","week":"星期一","aqi":"85","fengxiang":"北风","fengli":"4-5级","hightemp":"22℃","lowtemp":"10℃","type":"阵雨"}]
     */

    private RetDataBean retData;

    public int getErrNum() {
        return errNum;
    }

    public void setErrNum(int errNum) {
        this.errNum = errNum;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public RetDataBean getRetData() {
        return retData;
    }

    public void setRetData(RetDataBean retData) {
        this.retData = retData;
    }

    public static class RetDataBean {
        private String city;
        private String cityid;
        /**
         * date : 2016-05-03
         * week : 星期二
         * curTemp : 23℃
         * aqi : 42
         * fengxiang : 北风
         * fengli : 4-5级
         * hightemp : 27℃
         * lowtemp : 10℃
         * type : 晴
         * index : [{"name":"感冒指数","code":"gm","index":"","details":"昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。","otherName":""},{"code":"fs","details":"属强紫外辐射天气，外出时应加强防护，建议涂擦SPF在15-20之间，PA++的防晒护肤品。","index":"强","name":"防晒指数","otherName":""},{"code":"ct","details":"建议着薄外套或牛仔衫裤等服装。年老体弱者宜着夹克衫、薄毛衣等。昼夜温差较大，注意适当增减衣服。","index":"较舒适","name":"穿衣指数","otherName":""},{"code":"yd","details":"天气较好，但风力较大，推荐您进行室内运动，若在户外运动请注意避风保暖。","index":"较适宜","name":"运动指数","otherName":""},{"code":"xc","details":"较不宜洗车，未来一天无雨，风力较大，如果执意擦洗汽车，要做好蒙上污垢的心理准备。","index":"较不宜","name":"洗车指数","otherName":""},{"code":"ls","details":"天气不错，适宜晾晒。赶紧把久未见阳光的衣物搬出来吸收一下太阳的味道吧！","index":"适宜","name":"晾晒指数","otherName":""}]
         */

        private TodayBean today;
        /**
         * date : 2016-05-04
         * week : 星期三
         * fengxiang : 无持续风向
         * fengli : 微风级
         * hightemp : 28℃
         * lowtemp : 15℃
         * type : 阴
         */

        private List<ForecastBean> forecast;
        /**
         * date : 2016-04-26
         * week : 星期二
         * aqi : 110
         * fengxiang : 无持续风向
         * fengli : 微风级
         * hightemp : 23℃
         * lowtemp : 13℃
         * type : 多云
         */

        private List<HistoryBean> history;

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCityid() {
            return cityid;
        }

        public void setCityid(String cityid) {
            this.cityid = cityid;
        }

        public TodayBean getToday() {
            return today;
        }

        public void setToday(TodayBean today) {
            this.today = today;
        }

        public List<ForecastBean> getForecast() {
            return forecast;
        }

        public void setForecast(List<ForecastBean> forecast) {
            this.forecast = forecast;
        }

        public List<HistoryBean> getHistory() {
            return history;
        }

        public void setHistory(List<HistoryBean> history) {
            this.history = history;
        }

        public static class TodayBean {
            private String date;
            private String week;
            private String curTemp;
            private String aqi;
            private String fengxiang;
            private String fengli;
            private String hightemp;
            private String lowtemp;
            private String type;
            /**
             * name : 感冒指数
             * code : gm
             * index :
             * details : 昼夜温差大，风力较强，易发生感冒，请注意适当增减衣服，加强自我防护避免感冒。
             * otherName :
             */

            private List<IndexBean> index;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getCurTemp() {
                return curTemp;
            }

            public void setCurTemp(String curTemp) {
                this.curTemp = curTemp;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getHightemp() {
                return hightemp;
            }

            public void setHightemp(String hightemp) {
                this.hightemp = hightemp;
            }

            public String getLowtemp() {
                return lowtemp;
            }

            public void setLowtemp(String lowtemp) {
                this.lowtemp = lowtemp;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<IndexBean> getIndex() {
                return index;
            }

            public void setIndex(List<IndexBean> index) {
                this.index = index;
            }

            public static class IndexBean {
                private String name;
                private String code;
                private String index;
                private String details;
                private String otherName;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }

                public String getOtherName() {
                    return otherName;
                }

                public void setOtherName(String otherName) {
                    this.otherName = otherName;
                }
            }
        }

        public static class ForecastBean {
            private String date;
            private String week;
            private String fengxiang;
            private String fengli;
            private String hightemp;
            private String lowtemp;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getHightemp() {
                return hightemp;
            }

            public void setHightemp(String hightemp) {
                this.hightemp = hightemp;
            }

            public String getLowtemp() {
                return lowtemp;
            }

            public void setLowtemp(String lowtemp) {
                this.lowtemp = lowtemp;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class HistoryBean {
            private String date;
            private String week;
            private String aqi;
            private String fengxiang;
            private String fengli;
            private String hightemp;
            private String lowtemp;
            private String type;

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getWeek() {
                return week;
            }

            public void setWeek(String week) {
                this.week = week;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getFengxiang() {
                return fengxiang;
            }

            public void setFengxiang(String fengxiang) {
                this.fengxiang = fengxiang;
            }

            public String getFengli() {
                return fengli;
            }

            public void setFengli(String fengli) {
                this.fengli = fengli;
            }

            public String getHightemp() {
                return hightemp;
            }

            public void setHightemp(String hightemp) {
                this.hightemp = hightemp;
            }

            public String getLowtemp() {
                return lowtemp;
            }

            public void setLowtemp(String lowtemp) {
                this.lowtemp = lowtemp;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }
}
