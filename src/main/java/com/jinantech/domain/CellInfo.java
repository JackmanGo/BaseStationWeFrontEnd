package com.jinantech.domain;

import org.springframework.data.annotation.Id;

public class CellInfo {
   
	@Id
    private int id;
     
    private String first_seen;
     
    private String last_seen;
     
    private int mcc;
     
    private int mnc;
     
    private int lac;
     
    private int cid;
     
    private int rat;
     
    private int bcch_arfcn;
     
    private int c1;
     
    private int c2;
     
    private int power_sum;
     
    private int power_count;
     
    private int gps_lon;
     
    private int gps_lat;
     
    private int msc_ver;
     
    private int combined;
     
    private int agch_blocks;
     
    private int pag_mframes;
     
    private int t3212;
     
    private int dtx;
     
    private int cro;
     
    private int temp_offset;
     
    private int pen_time;
     
    private int pwr_offset;
     
    private int gprs;
     
    private int ba_len;
     
    private int neigh_2;
     
    private int neigh_2b;
     
    private int neigh_2t;
     
    private int neigh_2q;
     
    private int neigh_5;
     
    private int neigh_5b;
     
    private int neigh_5t;
     
    private int count_si1;
     
    private int count_si2;
     
    private int count_si2b;
     
    private int count_si2t;
     
    private int count_si2q;
     
    private int count_si3;
     
    private int count_si4;
     
    private int count_si5;
     
    private int count_si5b;
     
    private int count_si5t;
     
    private int count_si6;
     
    private int count_si13;
     
    private int si1;
     
    private int si2;
     
    private int si2b;
     
    private int si2t;
     
    private int si2q;
     
    private int si3;
     
    private int si4;
     
    private int si5;
     
    private int si5b;
     
    private int si5t;
     
    private int si6;
     
    private int si13;
    private String numbers;

    public CellInfo() {

    }

    public CellInfo(int id, String first_seen, String last_seen, int mcc, int mnc, int lac, int cid, int rat, int bcch_arfcn, int c1, int c2, int power_sum, int power_count, int gps_lon, int gps_lat, int msc_ver, int combined, int agch_blocks, int pag_mframes, int t3212, int dtx, int cro, int temp_offset, int pen_time, int pwr_offset, int gprs, int ba_len, int neigh_2, int neigh_2b, int neigh_2t, int neigh_2q, int neigh_5, int neigh_5b, int neigh_5t, int count_si1, int count_si2, int count_si2b, int count_si2t, int count_si2q, int count_si3, int count_si4, int count_si5, int count_si5b, int count_si5t, int count_si6, int count_si13, int si1, int si2, int si2b, int si2t, int si2q, int si3, int si4, int si5, int si5b, int si5t, int si6, int si13) {
        this.id = id;
        this.first_seen = first_seen;
        this.last_seen = last_seen;
        this.mcc = mcc;
        this.mnc = mnc;
        this.lac = lac;
        this.cid = cid;
        this.rat = rat;
        this.bcch_arfcn = bcch_arfcn;
        this.c1 = c1;
        this.c2 = c2;
        this.power_sum = power_sum;
        this.power_count = power_count;
        this.gps_lon = gps_lon;
        this.gps_lat = gps_lat;
        this.msc_ver = msc_ver;
        this.combined = combined;
        this.agch_blocks = agch_blocks;
        this.pag_mframes = pag_mframes;
        this.t3212 = t3212;
        this.dtx = dtx;
        this.cro = cro;
        this.temp_offset = temp_offset;
        this.pen_time = pen_time;
        this.pwr_offset = pwr_offset;
        this.gprs = gprs;
        this.ba_len = ba_len;
        this.neigh_2 = neigh_2;
        this.neigh_2b = neigh_2b;
        this.neigh_2t = neigh_2t;
        this.neigh_2q = neigh_2q;
        this.neigh_5 = neigh_5;
        this.neigh_5b = neigh_5b;
        this.neigh_5t = neigh_5t;
        this.count_si1 = count_si1;
        this.count_si2 = count_si2;
        this.count_si2b = count_si2b;
        this.count_si2t = count_si2t;
        this.count_si2q = count_si2q;
        this.count_si3 = count_si3;
        this.count_si4 = count_si4;
        this.count_si5 = count_si5;
        this.count_si5b = count_si5b;
        this.count_si5t = count_si5t;
        this.count_si6 = count_si6;
        this.count_si13 = count_si13;
        this.si1 = si1;
        this.si2 = si2;
        this.si2b = si2b;
        this.si2t = si2t;
        this.si2q = si2q;
        this.si3 = si3;
        this.si4 = si4;
        this.si5 = si5;
        this.si5b = si5b;
        this.si5t = si5t;
        this.si6 = si6;
        this.si13 = si13;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_seen() {
        return first_seen;
    }

    public void setFirst_seen(String first_seen) {
        this.first_seen = first_seen;
    }

    public String getLast_seen() {
        return last_seen;
    }

    public void setLast_seen(String last_seen) {
        this.last_seen = last_seen;
    }

    public int getMcc() {
        return mcc;
    }

    public void setMcc(int mcc) {
        this.mcc = mcc;
    }

    public int getMnc() {
        return mnc;
    }

    public void setMnc(int mnc) {
        this.mnc = mnc;
    }

    public int getLac() {
        return lac;
    }

    public void setLac(int lac) {
        this.lac = lac;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getRat() {
        return rat;
    }

    public void setRat(int rat) {
        this.rat = rat;
    }

    public int getBcch_arfcn() {
        return bcch_arfcn;
    }

    public void setBcch_arfcn(int bcch_arfcn) {
        this.bcch_arfcn = bcch_arfcn;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }

    public int getPower_sum() {
        return power_sum;
    }

    public void setPower_sum(int power_sum) {
        this.power_sum = power_sum;
    }

    public int getPower_count() {
        return power_count;
    }

    public void setPower_count(int power_count) {
        this.power_count = power_count;
    }

    public int getGps_lon() {
        return gps_lon;
    }

    public void setGps_lon(int gps_lon) {
        this.gps_lon = gps_lon;
    }

    public int getGps_lat() {
        return gps_lat;
    }

    public void setGps_lat(int gps_lat) {
        this.gps_lat = gps_lat;
    }

    public int getMsc_ver() {
        return msc_ver;
    }

    public void setMsc_ver(int msc_ver) {
        this.msc_ver = msc_ver;
    }

    public int getCombined() {
        return combined;
    }

    public void setCombined(int combined) {
        this.combined = combined;
    }

    public int getAgch_blocks() {
        return agch_blocks;
    }

    public void setAgch_blocks(int agch_blocks) {
        this.agch_blocks = agch_blocks;
    }

    public int getPag_mframes() {
        return pag_mframes;
    }

    public void setPag_mframes(int pag_mframes) {
        this.pag_mframes = pag_mframes;
    }

    public int getT3212() {
        return t3212;
    }

    public void setT3212(int t3212) {
        this.t3212 = t3212;
    }

    public int getDtx() {
        return dtx;
    }

    public void setDtx(int dtx) {
        this.dtx = dtx;
    }

    public int getCro() {
        return cro;
    }

    public void setCro(int cro) {
        this.cro = cro;
    }

    public int getTemp_offset() {
        return temp_offset;
    }

    public void setTemp_offset(int temp_offset) {
        this.temp_offset = temp_offset;
    }

    public int getPen_time() {
        return pen_time;
    }

    public void setPen_time(int pen_time) {
        this.pen_time = pen_time;
    }

    public int getPwr_offset() {
        return pwr_offset;
    }

    public void setPwr_offset(int pwr_offset) {
        this.pwr_offset = pwr_offset;
    }

    public int getGprs() {
        return gprs;
    }

    public void setGprs(int gprs) {
        this.gprs = gprs;
    }

    public int getBa_len() {
        return ba_len;
    }

    public void setBa_len(int ba_len) {
        this.ba_len = ba_len;
    }

    public int getNeigh_2() {
        return neigh_2;
    }

    public void setNeigh_2(int neigh_2) {
        this.neigh_2 = neigh_2;
    }

    public int getNeigh_2b() {
        return neigh_2b;
    }

    public void setNeigh_2b(int neigh_2b) {
        this.neigh_2b = neigh_2b;
    }

    public int getNeigh_2t() {
        return neigh_2t;
    }

    public void setNeigh_2t(int neigh_2t) {
        this.neigh_2t = neigh_2t;
    }

    public int getNeigh_2q() {
        return neigh_2q;
    }

    public void setNeigh_2q(int neigh_2q) {
        this.neigh_2q = neigh_2q;
    }

    public int getNeigh_5() {
        return neigh_5;
    }

    public void setNeigh_5(int neigh_5) {
        this.neigh_5 = neigh_5;
    }

    public int getNeigh_5b() {
        return neigh_5b;
    }

    public void setNeigh_5b(int neigh_5b) {
        this.neigh_5b = neigh_5b;
    }

    public int getNeigh_5t() {
        return neigh_5t;
    }

    public void setNeigh_5t(int neigh_5t) {
        this.neigh_5t = neigh_5t;
    }

    public int getCount_si1() {
        return count_si1;
    }

    public void setCount_si1(int count_si1) {
        this.count_si1 = count_si1;
    }

    public int getCount_si2() {
        return count_si2;
    }

    public void setCount_si2(int count_si2) {
        this.count_si2 = count_si2;
    }

    public int getCount_si2b() {
        return count_si2b;
    }

    public void setCount_si2b(int count_si2b) {
        this.count_si2b = count_si2b;
    }

    public int getCount_si2t() {
        return count_si2t;
    }

    public void setCount_si2t(int count_si2t) {
        this.count_si2t = count_si2t;
    }

    public int getCount_si2q() {
        return count_si2q;
    }

    public void setCount_si2q(int count_si2q) {
        this.count_si2q = count_si2q;
    }

    public int getCount_si3() {
        return count_si3;
    }

    public void setCount_si3(int count_si3) {
        this.count_si3 = count_si3;
    }

    public int getCount_si4() {
        return count_si4;
    }

    public void setCount_si4(int count_si4) {
        this.count_si4 = count_si4;
    }

    public int getCount_si5() {
        return count_si5;
    }

    public void setCount_si5(int count_si5) {
        this.count_si5 = count_si5;
    }

    public int getCount_si5b() {
        return count_si5b;
    }

    public void setCount_si5b(int count_si5b) {
        this.count_si5b = count_si5b;
    }

    public int getCount_si5t() {
        return count_si5t;
    }

    public void setCount_si5t(int count_si5t) {
        this.count_si5t = count_si5t;
    }

    public int getCount_si6() {
        return count_si6;
    }

    public void setCount_si6(int count_si6) {
        this.count_si6 = count_si6;
    }

    public int getCount_si13() {
        return count_si13;
    }

    public void setCount_si13(int count_si13) {
        this.count_si13 = count_si13;
    }

    public int getSi1() {
        return si1;
    }

    public void setSi1(int si1) {
        this.si1 = si1;
    }

    public int getSi2() {
        return si2;
    }

    public void setSi2(int si2) {
        this.si2 = si2;
    }

    public int getSi2b() {
        return si2b;
    }

    public void setSi2b(int si2b) {
        this.si2b = si2b;
    }

    public int getSi2t() {
        return si2t;
    }

    public void setSi2t(int si2t) {
        this.si2t = si2t;
    }

    public int getSi2q() {
        return si2q;
    }

    public void setSi2q(int si2q) {
        this.si2q = si2q;
    }

    public int getSi3() {
        return si3;
    }

    public void setSi3(int si3) {
        this.si3 = si3;
    }

    public int getSi4() {
        return si4;
    }

    public void setSi4(int si4) {
        this.si4 = si4;
    }

    public int getSi5() {
        return si5;
    }

    public void setSi5(int si5) {
        this.si5 = si5;
    }

    public int getSi5b() {
        return si5b;
    }

    public void setSi5b(int si5b) {
        this.si5b = si5b;
    }

    public int getSi5t() {
        return si5t;
    }

    public void setSi5t(int si5t) {
        this.si5t = si5t;
    }

    public int getSi6() {
        return si6;
    }

    public void setSi6(int si6) {
        this.si6 = si6;
    }

    public int getSi13() {
        return si13;
    }

    public void setSi13(int si13) {
        this.si13 = si13;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }
}
