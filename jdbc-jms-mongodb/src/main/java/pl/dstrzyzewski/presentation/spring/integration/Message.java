package pl.dstrzyzewski.presentation.spring.integration;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

public class Message implements Serializable {

    private static final long serialVersionUID = 4843185108920286680L;

    private final int id;
    private final String value;
    private final boolean processed;

    public Message(final int id, final String value, final boolean processed) {
        this.id = id;
        this.value = value;
        this.processed = processed;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public boolean getProcessed() {
        return processed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", id)
                .append("value", value)
                .append("processed", processed)
                .build();
    }
}
