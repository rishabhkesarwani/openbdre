/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wipro.ats.bdre.md.beans;

import java.sql.Timestamp;

/**
 * Created by kapil on 04-02-2015.
 */

/**
 * This class contains all the setter and getter methods for Semantic Job variables.
 */
public class SemanticInfo {
    private Integer processId;
    private String uuid;
    private String serialNumber;

    public Timestamp getAddTS() {
        return addTS;
    }

    public void setAddTS(Timestamp addTS) {
        this.addTS = addTS;
    }

    public Integer getBusDomainId() {
        return busDomainId;
    }

    public void setBusDomainId(Integer busDomainId) {
        this.busDomainId = busDomainId;
    }

    private String description;
    private Timestamp addTS;
    private String processName;
    private Integer busDomainId;
    private Integer processTypeId;
    private Integer parentProcessId = new Integer(0); //To avoid NPE during parent row processing
    private Boolean canRecover;

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }

    private Integer enqId;
    private String nextProcessIds;
    private String batchPattern;
    private Integer page;
    private Integer counter;

    public String getBatchPattern() {
        return batchPattern;
    }

    public void setBatchPattern(String batchPattern) {
        this.batchPattern = batchPattern;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public Integer getProcessTypeId() {
        return processTypeId;
    }

    public void setProcessTypeId(Integer processTypeId) {
        this.processTypeId = processTypeId;
    }

    public Integer getParentProcessId() {
        return parentProcessId;
    }

    public void setParentProcessId(Integer parentProcessId) {
        this.parentProcessId = parentProcessId;
    }

    public Boolean getCanRecover() {
        return canRecover;
    }

    public void setCanRecover(Boolean canRecover) {
        this.canRecover = canRecover;
    }

    public Integer getEnqId() {
        return enqId;
    }

    public void setEnqId(Integer enqId) {
        this.enqId = enqId;
    }

    public String getNextProcessIds() {
        return nextProcessIds;
    }

    public void setNextProcessIds(String nextProcessIds) {
        this.nextProcessIds = nextProcessIds;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
