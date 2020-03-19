package id.app.tutorialretrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {

    @SerializedName("response")
    @Expose
    private Integer response;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public class Datum {
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("imageurl")
        @Expose
        private String imageurl;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("target_balance")
        @Expose
        private Integer targetBalance;
        @SerializedName("target_day")
        @Expose
        private Integer targetDay;
        @SerializedName("balance")
        @Expose
        private Integer balance;
        @SerializedName("donator")
        @Expose
        private Integer donator;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImageurl() {
            return imageurl;
        }

        public void setImageurl(String imageurl) {
            this.imageurl = imageurl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getTargetBalance() {
            return targetBalance;
        }

        public void setTargetBalance(Integer targetBalance) {
            this.targetBalance = targetBalance;
        }

        public Integer getTargetDay() {
            return targetDay;
        }

        public void setTargetDay(Integer targetDay) {
            this.targetDay = targetDay;
        }

        public Integer getBalance() {
            return balance;
        }

        public void setBalance(Integer balance) {
            this.balance = balance;
        }

        public Integer getDonator() {
            return donator;
        }

        public void setDonator(Integer donator) {
            this.donator = donator;
        }
    }

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }
}
