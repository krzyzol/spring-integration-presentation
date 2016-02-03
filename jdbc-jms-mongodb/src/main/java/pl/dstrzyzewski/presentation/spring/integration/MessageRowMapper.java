package pl.dstrzyzewski.presentation.spring.integration;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageRowMapper implements RowMapper<Message> {

    @Override
    public Message mapRow(final ResultSet resultSet, final int i) throws SQLException {
        final int id = resultSet.getInt("id");
        final String text = resultSet.getString("text");
        final boolean processed = resultSet.getInt("processed") == 1;
        return new Message(id, text, processed);
    }

}
