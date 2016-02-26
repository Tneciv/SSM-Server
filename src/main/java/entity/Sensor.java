package entity;

import java.util.Date;

public class Sensor {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.demodulator_serial
     *
     * @mbggenerated
     */
    private String demodulatorSerial;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.channel_id
     *
     * @mbggenerated
     */
    private Integer channelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.bridge_id
     *
     * @mbggenerated
     */
    private Integer bridgeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.lane_id
     *
     * @mbggenerated
     */
    private Integer laneId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.type
     *
     * @mbggenerated
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.vendor
     *
     * @mbggenerated
     */
    private String vendor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.longitude
     *
     * @mbggenerated
     */
    private String longitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.latitude
     *
     * @mbggenerated
     */
    private String latitude;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.wave_len
     *
     * @mbggenerated
     */
    private Double waveLen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.max_wave_len
     *
     * @mbggenerated
     */
    private Double maxWaveLen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.min_wave_len
     *
     * @mbggenerated
     */
    private Double minWaveLen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.compensation_code
     *
     * @mbggenerated
     */
    private String compensationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.k
     *
     * @mbggenerated
     */
    private Double k;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.b
     *
     * @mbggenerated
     */
    private Double b;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.ord
     *
     * @mbggenerated
     */
    private Integer ord;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.next_device_distance
     *
     * @mbggenerated
     */
    private Double nextDeviceDistance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.bridge_head_distance
     *
     * @mbggenerated
     */
    private Double bridgeHeadDistance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.bridge_tail_distance
     *
     * @mbggenerated
     */
    private Double bridgeTailDistance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.areamethod_parameter_a
     *
     * @mbggenerated
     */
    private Double areamethodParameterA;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.areamethod_parameter_b
     *
     * @mbggenerated
     */
    private Double areamethodParameterB;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.peakmethod_parameter_a
     *
     * @mbggenerated
     */
    private Double peakmethodParameterA;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.peakmethod_parameter_b
     *
     * @mbggenerated
     */
    private Double peakmethodParameterB;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.status
     *
     * @mbggenerated
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.created
     *
     * @mbggenerated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.created_by
     *
     * @mbggenerated
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensor.remarks
     *
     * @mbggenerated
     */
    private String remarks;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sensor
     *
     * @mbggenerated
     */
    public Sensor(String code, String name, String demodulatorSerial, Integer channelId, Integer bridgeId, Integer laneId, String type, String vendor, String longitude, String latitude, Double waveLen, Double maxWaveLen, Double minWaveLen, String compensationCode, Double k, Double b, Integer ord, Double nextDeviceDistance, Double bridgeHeadDistance, Double bridgeTailDistance, Double areamethodParameterA, Double areamethodParameterB, Double peakmethodParameterA, Double peakmethodParameterB, String status, Date created, String createdBy, String remarks) {
        this.code = code;
        this.name = name;
        this.demodulatorSerial = demodulatorSerial;
        this.channelId = channelId;
        this.bridgeId = bridgeId;
        this.laneId = laneId;
        this.type = type;
        this.vendor = vendor;
        this.longitude = longitude;
        this.latitude = latitude;
        this.waveLen = waveLen;
        this.maxWaveLen = maxWaveLen;
        this.minWaveLen = minWaveLen;
        this.compensationCode = compensationCode;
        this.k = k;
        this.b = b;
        this.ord = ord;
        this.nextDeviceDistance = nextDeviceDistance;
        this.bridgeHeadDistance = bridgeHeadDistance;
        this.bridgeTailDistance = bridgeTailDistance;
        this.areamethodParameterA = areamethodParameterA;
        this.areamethodParameterB = areamethodParameterB;
        this.peakmethodParameterA = peakmethodParameterA;
        this.peakmethodParameterB = peakmethodParameterB;
        this.status = status;
        this.created = created;
        this.createdBy = createdBy;
        this.remarks = remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sensor
     *
     * @mbggenerated
     */
    public Sensor() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.code
     *
     * @return the value of sensor.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.code
     *
     * @param code the value for sensor.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.name
     *
     * @return the value of sensor.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.name
     *
     * @param name the value for sensor.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.demodulator_serial
     *
     * @return the value of sensor.demodulator_serial
     *
     * @mbggenerated
     */
    public String getDemodulatorSerial() {
        return demodulatorSerial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.demodulator_serial
     *
     * @param demodulatorSerial the value for sensor.demodulator_serial
     *
     * @mbggenerated
     */
    public void setDemodulatorSerial(String demodulatorSerial) {
        this.demodulatorSerial = demodulatorSerial == null ? null : demodulatorSerial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.channel_id
     *
     * @return the value of sensor.channel_id
     *
     * @mbggenerated
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.channel_id
     *
     * @param channelId the value for sensor.channel_id
     *
     * @mbggenerated
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.bridge_id
     *
     * @return the value of sensor.bridge_id
     *
     * @mbggenerated
     */
    public Integer getBridgeId() {
        return bridgeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.bridge_id
     *
     * @param bridgeId the value for sensor.bridge_id
     *
     * @mbggenerated
     */
    public void setBridgeId(Integer bridgeId) {
        this.bridgeId = bridgeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.lane_id
     *
     * @return the value of sensor.lane_id
     *
     * @mbggenerated
     */
    public Integer getLaneId() {
        return laneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.lane_id
     *
     * @param laneId the value for sensor.lane_id
     *
     * @mbggenerated
     */
    public void setLaneId(Integer laneId) {
        this.laneId = laneId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.type
     *
     * @return the value of sensor.type
     *
     * @mbggenerated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.type
     *
     * @param type the value for sensor.type
     *
     * @mbggenerated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.vendor
     *
     * @return the value of sensor.vendor
     *
     * @mbggenerated
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.vendor
     *
     * @param vendor the value for sensor.vendor
     *
     * @mbggenerated
     */
    public void setVendor(String vendor) {
        this.vendor = vendor == null ? null : vendor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.longitude
     *
     * @return the value of sensor.longitude
     *
     * @mbggenerated
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.longitude
     *
     * @param longitude the value for sensor.longitude
     *
     * @mbggenerated
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.latitude
     *
     * @return the value of sensor.latitude
     *
     * @mbggenerated
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.latitude
     *
     * @param latitude the value for sensor.latitude
     *
     * @mbggenerated
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.wave_len
     *
     * @return the value of sensor.wave_len
     *
     * @mbggenerated
     */
    public Double getWaveLen() {
        return waveLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.wave_len
     *
     * @param waveLen the value for sensor.wave_len
     *
     * @mbggenerated
     */
    public void setWaveLen(Double waveLen) {
        this.waveLen = waveLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.max_wave_len
     *
     * @return the value of sensor.max_wave_len
     *
     * @mbggenerated
     */
    public Double getMaxWaveLen() {
        return maxWaveLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.max_wave_len
     *
     * @param maxWaveLen the value for sensor.max_wave_len
     *
     * @mbggenerated
     */
    public void setMaxWaveLen(Double maxWaveLen) {
        this.maxWaveLen = maxWaveLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.min_wave_len
     *
     * @return the value of sensor.min_wave_len
     *
     * @mbggenerated
     */
    public Double getMinWaveLen() {
        return minWaveLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.min_wave_len
     *
     * @param minWaveLen the value for sensor.min_wave_len
     *
     * @mbggenerated
     */
    public void setMinWaveLen(Double minWaveLen) {
        this.minWaveLen = minWaveLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.compensation_code
     *
     * @return the value of sensor.compensation_code
     *
     * @mbggenerated
     */
    public String getCompensationCode() {
        return compensationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.compensation_code
     *
     * @param compensationCode the value for sensor.compensation_code
     *
     * @mbggenerated
     */
    public void setCompensationCode(String compensationCode) {
        this.compensationCode = compensationCode == null ? null : compensationCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.k
     *
     * @return the value of sensor.k
     *
     * @mbggenerated
     */
    public Double getK() {
        return k;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.k
     *
     * @param k the value for sensor.k
     *
     * @mbggenerated
     */
    public void setK(Double k) {
        this.k = k;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.b
     *
     * @return the value of sensor.b
     *
     * @mbggenerated
     */
    public Double getB() {
        return b;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.b
     *
     * @param b the value for sensor.b
     *
     * @mbggenerated
     */
    public void setB(Double b) {
        this.b = b;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.ord
     *
     * @return the value of sensor.ord
     *
     * @mbggenerated
     */
    public Integer getOrd() {
        return ord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.ord
     *
     * @param ord the value for sensor.ord
     *
     * @mbggenerated
     */
    public void setOrd(Integer ord) {
        this.ord = ord;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.next_device_distance
     *
     * @return the value of sensor.next_device_distance
     *
     * @mbggenerated
     */
    public Double getNextDeviceDistance() {
        return nextDeviceDistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.next_device_distance
     *
     * @param nextDeviceDistance the value for sensor.next_device_distance
     *
     * @mbggenerated
     */
    public void setNextDeviceDistance(Double nextDeviceDistance) {
        this.nextDeviceDistance = nextDeviceDistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.bridge_head_distance
     *
     * @return the value of sensor.bridge_head_distance
     *
     * @mbggenerated
     */
    public Double getBridgeHeadDistance() {
        return bridgeHeadDistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.bridge_head_distance
     *
     * @param bridgeHeadDistance the value for sensor.bridge_head_distance
     *
     * @mbggenerated
     */
    public void setBridgeHeadDistance(Double bridgeHeadDistance) {
        this.bridgeHeadDistance = bridgeHeadDistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.bridge_tail_distance
     *
     * @return the value of sensor.bridge_tail_distance
     *
     * @mbggenerated
     */
    public Double getBridgeTailDistance() {
        return bridgeTailDistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.bridge_tail_distance
     *
     * @param bridgeTailDistance the value for sensor.bridge_tail_distance
     *
     * @mbggenerated
     */
    public void setBridgeTailDistance(Double bridgeTailDistance) {
        this.bridgeTailDistance = bridgeTailDistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.areamethod_parameter_a
     *
     * @return the value of sensor.areamethod_parameter_a
     *
     * @mbggenerated
     */
    public Double getAreamethodParameterA() {
        return areamethodParameterA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.areamethod_parameter_a
     *
     * @param areamethodParameterA the value for sensor.areamethod_parameter_a
     *
     * @mbggenerated
     */
    public void setAreamethodParameterA(Double areamethodParameterA) {
        this.areamethodParameterA = areamethodParameterA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.areamethod_parameter_b
     *
     * @return the value of sensor.areamethod_parameter_b
     *
     * @mbggenerated
     */
    public Double getAreamethodParameterB() {
        return areamethodParameterB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.areamethod_parameter_b
     *
     * @param areamethodParameterB the value for sensor.areamethod_parameter_b
     *
     * @mbggenerated
     */
    public void setAreamethodParameterB(Double areamethodParameterB) {
        this.areamethodParameterB = areamethodParameterB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.peakmethod_parameter_a
     *
     * @return the value of sensor.peakmethod_parameter_a
     *
     * @mbggenerated
     */
    public Double getPeakmethodParameterA() {
        return peakmethodParameterA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.peakmethod_parameter_a
     *
     * @param peakmethodParameterA the value for sensor.peakmethod_parameter_a
     *
     * @mbggenerated
     */
    public void setPeakmethodParameterA(Double peakmethodParameterA) {
        this.peakmethodParameterA = peakmethodParameterA;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.peakmethod_parameter_b
     *
     * @return the value of sensor.peakmethod_parameter_b
     *
     * @mbggenerated
     */
    public Double getPeakmethodParameterB() {
        return peakmethodParameterB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.peakmethod_parameter_b
     *
     * @param peakmethodParameterB the value for sensor.peakmethod_parameter_b
     *
     * @mbggenerated
     */
    public void setPeakmethodParameterB(Double peakmethodParameterB) {
        this.peakmethodParameterB = peakmethodParameterB;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.status
     *
     * @return the value of sensor.status
     *
     * @mbggenerated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.status
     *
     * @param status the value for sensor.status
     *
     * @mbggenerated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.created
     *
     * @return the value of sensor.created
     *
     * @mbggenerated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.created
     *
     * @param created the value for sensor.created
     *
     * @mbggenerated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.created_by
     *
     * @return the value of sensor.created_by
     *
     * @mbggenerated
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.created_by
     *
     * @param createdBy the value for sensor.created_by
     *
     * @mbggenerated
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensor.remarks
     *
     * @return the value of sensor.remarks
     *
     * @mbggenerated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensor.remarks
     *
     * @param remarks the value for sensor.remarks
     *
     * @mbggenerated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}