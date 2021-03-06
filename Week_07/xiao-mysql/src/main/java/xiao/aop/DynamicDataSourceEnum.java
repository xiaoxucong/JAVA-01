package xiao.aop;

public enum DynamicDataSourceEnum {
    dataSource("dataSource"),dataSourceSlave("dataSourceSlave");



 private String dataSourceName;
 DynamicDataSourceEnum(String dataSourceName) {
    this.dataSourceName = dataSourceName;
    }

    public String getDataSourceName() {
        return dataSourceName;
    }
}
