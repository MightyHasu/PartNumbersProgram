package models;

import interfaces.Part;

/**
 * Created by PC2 on 9/3/2016.
 */
public abstract class PartImpl implements Part{

    private String partId;
    private String partName;

    public PartImpl(String partId, String partName) {
        this.setPartId(partId);
        this.setPartName(partName);
    }

    private void setPartId(String partId) {
        this.partId = partId;
    }

    public String getPartId() {
        return this.partId;
    }

    private void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartName() {
        return this.partName;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.getPartName(), this.getPartId());
    }
}
