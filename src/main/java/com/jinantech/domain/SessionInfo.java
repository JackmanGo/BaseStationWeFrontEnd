package com.jinantech.domain;

import org.springframework.data.annotation.Id;

public class SessionInfo {
	        @Id
            private int id;
            private String timestamp;
            private int rat;
            private int domain;
            private int mcc;
            private int mnc;
            private int lac;
            private int cid;
            private int arfcn;
            private int psc;
            private int cracked;
            private int neigh_count;
            private int unenc;
            private int unenc_rand;
            private int enc;
            private int enc_rand;
            private int enc_null;
            private int enc_null_rand;
            private int enc_si;
            private int enc_si_rand;
            private int predict;
            private int avg_power;
            private int uplink_avail;
            private int initial_seq;
            private int cipher_seq;
            private int auth;
            private int auth_req_fn;
            private int auth_resp_fn;
            private int auth_delta;
            private int cipher_missing;
            private int cipher_comp_first;
            private int cipher_comp_last;
            private int cipher_comp_count;
            private int cipher_delta;
            private int cipher;
            private int cmc_imeisv;
            private int integrity;
            private int first_fn;
            private int last_fn;
            private int duration;
            private int mobile_orig;
            private int mobile_term;
            private int paging_mi;
            private int t_unknown;
            private int t_detach;
            private int t_locupd;
            private int lu_acc;
            private int lu_type;
            private int lu_reject;
            private int lu_rej_cause;
            private int lu_mcc;
            private int lu_mnc;
            private int lu_lac;
            private int t_abort;
            private int t_raupd;
            private int t_attach;
            private int att_acc;
            private int t_pdp;
            private int pdp_ip;
            private int t_call;
            private int t_sms;
            private int t_ss;
            private int t_tmsi_realloc;
            private int t_release;
            private int rr_cause;
            private int t_gprs;
            private int iden_imsi_ac;
            private int iden_imsi_bc;
            private int iden_imei_ac;
            private int iden_imei_bc;
            private int assign;
            private int assign_cmpl;
            private int handover;
            private int forced_ho;
            private int a_timeslot;
            private int a_chan_type;
            private int a_tsc;
            private int a_hopping;
            private int a_arfcn;
            private int a_hsn;
            private int a_maio;
            private int a_ma_len;
            private int a_chan_mode;
            private int a_multirate;
            private int call_presence;
            private int sms_presence;
            private int service_req;
            private String imsi;
            private String imei;
            private String tmsi;
            private int new_tmsi;
            private int tlli;
            private int msisdn;
            private int ms_cipher_mask;
            private int ue_cipher_cap;
            private int ue_integrity_cap;
         String numbers;
    public SessionInfo(){}
    public SessionInfo(int id, String timestamp, int rat, int domain, int mcc, int mnc, int lac, int cid, int arfcn, int psc, int cracked, int neigh_count, int unenc, int unenc_rand, int enc, int enc_rand, int enc_null, int enc_null_rand, int enc_si, int enc_si_rand, int predict, int avg_power, int uplink_avail, int initial_seq, int cipher_seq, int auth, int auth_req_fn, int auth_resp_fn, int auth_delta, int cipher_missing, int cipher_comp_first, int cipher_comp_last, int cipher_comp_count, int cipher_delta, int cipher, int cmc_imeisv, int integrity, int first_fn, int last_fn, int duration, int mobile_orig, int mobile_term, int paging_mi, int t_unknown, int t_detach, int t_locupd, int lu_acc, int lu_type, int lu_reject, int lu_rej_cause, int lu_mcc, int lu_mnc, int lu_lac, int t_abort, int t_raupd, int t_attach, int att_acc, int t_pdp, int pdp_ip, int t_call, int t_sms, int t_ss, int t_tmsi_realloc, int t_release, int rr_cause, int t_gprs, int iden_imsi_ac, int iden_imsi_bc, int iden_imei_ac, int iden_imei_bc, int assign, int assign_cmpl, int handover, int forced_ho, int a_timeslot, int a_chan_type, int a_tsc, int a_hopping, int a_arfcn, int a_hsn, int a_maio, int a_ma_len, int a_chan_mode, int a_multirate, int call_presence, int sms_presence, int service_req, String imsi, String imei, String tmsi, int new_tmsi, int tlli, int msisdn, int ms_cipher_mask, int ue_cipher_cap, int ue_integrity_cap) {
        this.id = id;
        this.timestamp = timestamp;
        this.rat = rat;
        this.domain = domain;
        this.mcc = mcc;
        this.mnc = mnc;
        this.lac = lac;
        this.cid = cid;
        this.arfcn = arfcn;
        this.psc = psc;
        this.cracked = cracked;
        this.neigh_count = neigh_count;
        this.unenc = unenc;
        this.unenc_rand = unenc_rand;
        this.enc = enc;
        this.enc_rand = enc_rand;
        this.enc_null = enc_null;
        this.enc_null_rand = enc_null_rand;
        this.enc_si = enc_si;
        this.enc_si_rand = enc_si_rand;
        this.predict = predict;
        this.avg_power = avg_power;
        this.uplink_avail = uplink_avail;
        this.initial_seq = initial_seq;
        this.cipher_seq = cipher_seq;
        this.auth = auth;
        this.auth_req_fn = auth_req_fn;
        this.auth_resp_fn = auth_resp_fn;
        this.auth_delta = auth_delta;
        this.cipher_missing = cipher_missing;
        this.cipher_comp_first = cipher_comp_first;
        this.cipher_comp_last = cipher_comp_last;
        this.cipher_comp_count = cipher_comp_count;
        this.cipher_delta = cipher_delta;
        this.cipher = cipher;
        this.cmc_imeisv = cmc_imeisv;
        this.integrity = integrity;
        this.first_fn = first_fn;
        this.last_fn = last_fn;
        this.duration = duration;
        this.mobile_orig = mobile_orig;
        this.mobile_term = mobile_term;
        this.paging_mi = paging_mi;
        this.t_unknown = t_unknown;
        this.t_detach = t_detach;
        this.t_locupd = t_locupd;
        this.lu_acc = lu_acc;
        this.lu_type = lu_type;
        this.lu_reject = lu_reject;
        this.lu_rej_cause = lu_rej_cause;
        this.lu_mcc = lu_mcc;
        this.lu_mnc = lu_mnc;
        this.lu_lac = lu_lac;
        this.t_abort = t_abort;
        this.t_raupd = t_raupd;
        this.t_attach = t_attach;
        this.att_acc = att_acc;
        this.t_pdp = t_pdp;
        this.pdp_ip = pdp_ip;
        this.t_call = t_call;
        this.t_sms = t_sms;
        this.t_ss = t_ss;
        this.t_tmsi_realloc = t_tmsi_realloc;
        this.t_release = t_release;
        this.rr_cause = rr_cause;
        this.t_gprs = t_gprs;
        this.iden_imsi_ac = iden_imsi_ac;
        this.iden_imsi_bc = iden_imsi_bc;
        this.iden_imei_ac = iden_imei_ac;
        this.iden_imei_bc = iden_imei_bc;
        this.assign = assign;
        this.assign_cmpl = assign_cmpl;
        this.handover = handover;
        this.forced_ho = forced_ho;
        this.a_timeslot = a_timeslot;
        this.a_chan_type = a_chan_type;
        this.a_tsc = a_tsc;
        this.a_hopping = a_hopping;
        this.a_arfcn = a_arfcn;
        this.a_hsn = a_hsn;
        this.a_maio = a_maio;
        this.a_ma_len = a_ma_len;
        this.a_chan_mode = a_chan_mode;
        this.a_multirate = a_multirate;
        this.call_presence = call_presence;
        this.sms_presence = sms_presence;
        this.service_req = service_req;
        this.imsi = imsi;
        this.imei = imei;
        this.tmsi = tmsi;
        this.new_tmsi = new_tmsi;
        this.tlli = tlli;
        this.msisdn = msisdn;
        this.ms_cipher_mask = ms_cipher_mask;
        this.ue_cipher_cap = ue_cipher_cap;
        this.ue_integrity_cap = ue_integrity_cap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getRat() {
        return rat;
    }

    public void setRat(int rat) {
        this.rat = rat;
    }

    public int getDomain() {
        return domain;
    }

    public void setDomain(int domain) {
        this.domain = domain;
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

    public int getArfcn() {
        return arfcn;
    }

    public void setArfcn(int arfcn) {
        this.arfcn = arfcn;
    }

    public int getPsc() {
        return psc;
    }

    public void setPsc(int psc) {
        this.psc = psc;
    }

    public int getCracked() {
        return cracked;
    }

    public void setCracked(int cracked) {
        this.cracked = cracked;
    }

    public int getNeigh_count() {
        return neigh_count;
    }

    public void setNeigh_count(int neigh_count) {
        this.neigh_count = neigh_count;
    }

    public int getUnenc() {
        return unenc;
    }

    public void setUnenc(int unenc) {
        this.unenc = unenc;
    }

    public int getUnenc_rand() {
        return unenc_rand;
    }

    public void setUnenc_rand(int unenc_rand) {
        this.unenc_rand = unenc_rand;
    }

    public int getEnc() {
        return enc;
    }

    public void setEnc(int enc) {
        this.enc = enc;
    }

    public int getEnc_rand() {
        return enc_rand;
    }

    public void setEnc_rand(int enc_rand) {
        this.enc_rand = enc_rand;
    }

    public int getEnc_null() {
        return enc_null;
    }

    public void setEnc_null(int enc_null) {
        this.enc_null = enc_null;
    }

    public int getEnc_null_rand() {
        return enc_null_rand;
    }

    public void setEnc_null_rand(int enc_null_rand) {
        this.enc_null_rand = enc_null_rand;
    }

    public int getEnc_si() {
        return enc_si;
    }

    public void setEnc_si(int enc_si) {
        this.enc_si = enc_si;
    }

    public int getEnc_si_rand() {
        return enc_si_rand;
    }

    public void setEnc_si_rand(int enc_si_rand) {
        this.enc_si_rand = enc_si_rand;
    }

    public int getPredict() {
        return predict;
    }

    public void setPredict(int predict) {
        this.predict = predict;
    }

    public int getAvg_power() {
        return avg_power;
    }

    public void setAvg_power(int avg_power) {
        this.avg_power = avg_power;
    }

    public int getUplink_avail() {
        return uplink_avail;
    }

    public void setUplink_avail(int uplink_avail) {
        this.uplink_avail = uplink_avail;
    }

    public int getInitial_seq() {
        return initial_seq;
    }

    public void setInitial_seq(int initial_seq) {
        this.initial_seq = initial_seq;
    }

    public int getCipher_seq() {
        return cipher_seq;
    }

    public void setCipher_seq(int cipher_seq) {
        this.cipher_seq = cipher_seq;
    }

    public int getAuth() {
        return auth;
    }

    public void setAuth(int auth) {
        this.auth = auth;
    }

    public int getAuth_req_fn() {
        return auth_req_fn;
    }

    public void setAuth_req_fn(int auth_req_fn) {
        this.auth_req_fn = auth_req_fn;
    }

    public int getAuth_resp_fn() {
        return auth_resp_fn;
    }

    public void setAuth_resp_fn(int auth_resp_fn) {
        this.auth_resp_fn = auth_resp_fn;
    }

    public int getAuth_delta() {
        return auth_delta;
    }

    public void setAuth_delta(int auth_delta) {
        this.auth_delta = auth_delta;
    }

    public int getCipher_missing() {
        return cipher_missing;
    }

    public void setCipher_missing(int cipher_missing) {
        this.cipher_missing = cipher_missing;
    }

    public int getCipher_comp_first() {
        return cipher_comp_first;
    }

    public void setCipher_comp_first(int cipher_comp_first) {
        this.cipher_comp_first = cipher_comp_first;
    }

    public int getCipher_comp_last() {
        return cipher_comp_last;
    }

    public void setCipher_comp_last(int cipher_comp_last) {
        this.cipher_comp_last = cipher_comp_last;
    }

    public int getCipher_comp_count() {
        return cipher_comp_count;
    }

    public void setCipher_comp_count(int cipher_comp_count) {
        this.cipher_comp_count = cipher_comp_count;
    }

    public int getCipher_delta() {
        return cipher_delta;
    }

    public void setCipher_delta(int cipher_delta) {
        this.cipher_delta = cipher_delta;
    }

    public int getCipher() {
        return cipher;
    }

    public void setCipher(int cipher) {
        this.cipher = cipher;
    }

    public int getCmc_imeisv() {
        return cmc_imeisv;
    }

    public void setCmc_imeisv(int cmc_imeisv) {
        this.cmc_imeisv = cmc_imeisv;
    }

    public int getIntegrity() {
        return integrity;
    }

    public void setIntegrity(int integrity) {
        this.integrity = integrity;
    }

    public int getFirst_fn() {
        return first_fn;
    }

    public void setFirst_fn(int first_fn) {
        this.first_fn = first_fn;
    }

    public int getLast_fn() {
        return last_fn;
    }

    public void setLast_fn(int last_fn) {
        this.last_fn = last_fn;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getMobile_orig() {
        return mobile_orig;
    }

    public void setMobile_orig(int mobile_orig) {
        this.mobile_orig = mobile_orig;
    }

    public int getMobile_term() {
        return mobile_term;
    }

    public void setMobile_term(int mobile_term) {
        this.mobile_term = mobile_term;
    }

    public int getPaging_mi() {
        return paging_mi;
    }

    public void setPaging_mi(int paging_mi) {
        this.paging_mi = paging_mi;
    }

    public int getT_unknown() {
        return t_unknown;
    }

    public void setT_unknown(int t_unknown) {
        this.t_unknown = t_unknown;
    }

    public int getT_detach() {
        return t_detach;
    }

    public void setT_detach(int t_detach) {
        this.t_detach = t_detach;
    }

    public int getT_locupd() {
        return t_locupd;
    }

    public void setT_locupd(int t_locupd) {
        this.t_locupd = t_locupd;
    }

    public int getLu_acc() {
        return lu_acc;
    }

    public void setLu_acc(int lu_acc) {
        this.lu_acc = lu_acc;
    }

    public int getLu_type() {
        return lu_type;
    }

    public void setLu_type(int lu_type) {
        this.lu_type = lu_type;
    }

    public int getLu_reject() {
        return lu_reject;
    }

    public void setLu_reject(int lu_reject) {
        this.lu_reject = lu_reject;
    }

    public int getLu_rej_cause() {
        return lu_rej_cause;
    }

    public void setLu_rej_cause(int lu_rej_cause) {
        this.lu_rej_cause = lu_rej_cause;
    }

    public int getLu_mcc() {
        return lu_mcc;
    }

    public void setLu_mcc(int lu_mcc) {
        this.lu_mcc = lu_mcc;
    }

    public int getLu_mnc() {
        return lu_mnc;
    }

    public void setLu_mnc(int lu_mnc) {
        this.lu_mnc = lu_mnc;
    }

    public int getLu_lac() {
        return lu_lac;
    }

    public void setLu_lac(int lu_lac) {
        this.lu_lac = lu_lac;
    }

    public int getT_abort() {
        return t_abort;
    }

    public void setT_abort(int t_abort) {
        this.t_abort = t_abort;
    }

    public int getT_raupd() {
        return t_raupd;
    }

    public void setT_raupd(int t_raupd) {
        this.t_raupd = t_raupd;
    }

    public int getT_attach() {
        return t_attach;
    }

    public void setT_attach(int t_attach) {
        this.t_attach = t_attach;
    }

    public int getAtt_acc() {
        return att_acc;
    }

    public void setAtt_acc(int att_acc) {
        this.att_acc = att_acc;
    }

    public int getT_pdp() {
        return t_pdp;
    }

    public void setT_pdp(int t_pdp) {
        this.t_pdp = t_pdp;
    }

    public int getPdp_ip() {
        return pdp_ip;
    }

    public void setPdp_ip(int pdp_ip) {
        this.pdp_ip = pdp_ip;
    }

    public int getT_call() {
        return t_call;
    }

    public void setT_call(int t_call) {
        this.t_call = t_call;
    }

    public int getT_sms() {
        return t_sms;
    }

    public void setT_sms(int t_sms) {
        this.t_sms = t_sms;
    }

    public int getT_ss() {
        return t_ss;
    }

    public void setT_ss(int t_ss) {
        this.t_ss = t_ss;
    }

    public int getT_tmsi_realloc() {
        return t_tmsi_realloc;
    }

    public void setT_tmsi_realloc(int t_tmsi_realloc) {
        this.t_tmsi_realloc = t_tmsi_realloc;
    }

    public int getT_release() {
        return t_release;
    }

    public void setT_release(int t_release) {
        this.t_release = t_release;
    }

    public int getRr_cause() {
        return rr_cause;
    }

    public void setRr_cause(int rr_cause) {
        this.rr_cause = rr_cause;
    }

    public int getT_gprs() {
        return t_gprs;
    }

    public void setT_gprs(int t_gprs) {
        this.t_gprs = t_gprs;
    }

    public int getIden_imsi_ac() {
        return iden_imsi_ac;
    }

    public void setIden_imsi_ac(int iden_imsi_ac) {
        this.iden_imsi_ac = iden_imsi_ac;
    }

    public int getIden_imsi_bc() {
        return iden_imsi_bc;
    }

    public void setIden_imsi_bc(int iden_imsi_bc) {
        this.iden_imsi_bc = iden_imsi_bc;
    }

    public int getIden_imei_ac() {
        return iden_imei_ac;
    }

    public void setIden_imei_ac(int iden_imei_ac) {
        this.iden_imei_ac = iden_imei_ac;
    }

    public int getIden_imei_bc() {
        return iden_imei_bc;
    }

    public void setIden_imei_bc(int iden_imei_bc) {
        this.iden_imei_bc = iden_imei_bc;
    }

    public int getAssign() {
        return assign;
    }

    public void setAssign(int assign) {
        this.assign = assign;
    }

    public int getAssign_cmpl() {
        return assign_cmpl;
    }

    public void setAssign_cmpl(int assign_cmpl) {
        this.assign_cmpl = assign_cmpl;
    }

    public int getHandover() {
        return handover;
    }

    public void setHandover(int handover) {
        this.handover = handover;
    }

    public int getForced_ho() {
        return forced_ho;
    }

    public void setForced_ho(int forced_ho) {
        this.forced_ho = forced_ho;
    }

    public int getA_timeslot() {
        return a_timeslot;
    }

    public void setA_timeslot(int a_timeslot) {
        this.a_timeslot = a_timeslot;
    }

    public int getA_chan_type() {
        return a_chan_type;
    }

    public void setA_chan_type(int a_chan_type) {
        this.a_chan_type = a_chan_type;
    }

    public int getA_tsc() {
        return a_tsc;
    }

    public void setA_tsc(int a_tsc) {
        this.a_tsc = a_tsc;
    }

    public int getA_hopping() {
        return a_hopping;
    }

    public void setA_hopping(int a_hopping) {
        this.a_hopping = a_hopping;
    }

    public int getA_arfcn() {
        return a_arfcn;
    }

    public void setA_arfcn(int a_arfcn) {
        this.a_arfcn = a_arfcn;
    }

    public int getA_hsn() {
        return a_hsn;
    }

    public void setA_hsn(int a_hsn) {
        this.a_hsn = a_hsn;
    }

    public int getA_maio() {
        return a_maio;
    }

    public void setA_maio(int a_maio) {
        this.a_maio = a_maio;
    }

    public int getA_ma_len() {
        return a_ma_len;
    }

    public void setA_ma_len(int a_ma_len) {
        this.a_ma_len = a_ma_len;
    }

    public int getA_chan_mode() {
        return a_chan_mode;
    }

    public void setA_chan_mode(int a_chan_mode) {
        this.a_chan_mode = a_chan_mode;
    }

    public int getA_multirate() {
        return a_multirate;
    }

    public void setA_multirate(int a_multirate) {
        this.a_multirate = a_multirate;
    }

    public int getCall_presence() {
        return call_presence;
    }

    public void setCall_presence(int call_presence) {
        this.call_presence = call_presence;
    }

    public int getSms_presence() {
        return sms_presence;
    }

    public void setSms_presence(int sms_presence) {
        this.sms_presence = sms_presence;
    }

    public int getService_req() {
        return service_req;
    }

    public void setService_req(int service_req) {
        this.service_req = service_req;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getTmsi() {
        return tmsi;
    }

    public void setTmsi(String tmsi) {
        this.tmsi = tmsi;
    }

    public int getNew_tmsi() {
        return new_tmsi;
    }

    public void setNew_tmsi(int new_tmsi) {
        this.new_tmsi = new_tmsi;
    }

    public int getTlli() {
        return tlli;
    }

    public void setTlli(int tlli) {
        this.tlli = tlli;
    }

    public int getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(int msisdn) {
        this.msisdn = msisdn;
    }

    public int getMs_cipher_mask() {
        return ms_cipher_mask;
    }

    public void setMs_cipher_mask(int ms_cipher_mask) {
        this.ms_cipher_mask = ms_cipher_mask;
    }

    public int getUe_cipher_cap() {
        return ue_cipher_cap;
    }

    public void setUe_cipher_cap(int ue_cipher_cap) {
        this.ue_cipher_cap = ue_cipher_cap;
    }

    public int getUe_integrity_cap() {
        return ue_integrity_cap;
    }

    public void setUe_integrity_cap(int ue_integrity_cap) {
        this.ue_integrity_cap = ue_integrity_cap;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }
}
