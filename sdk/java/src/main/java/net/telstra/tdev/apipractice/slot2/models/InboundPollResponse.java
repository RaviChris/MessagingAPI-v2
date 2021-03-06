/*
 * TelstraSMSMessagingAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package net.telstra.tdev.apipractice.slot2.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class InboundPollResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5302204966446282317L;
    private String to;
    private String from;
    private String body;
    private String receivedTimestamp;
    private Integer moreMessages;
    private String messageId;
    /** GETTER
     * The phone number (recipient) that the message was sent to(in E.164 format).
     */
    @JsonGetter("to")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * The phone number (recipient) that the message was sent to(in E.164 format).
     */
    @JsonSetter("to")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * The phone number (sender) that the message was sent from (in E.164 format).
     */
    @JsonGetter("from")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * The phone number (sender) that the message was sent from (in E.164 format).
     */
    @JsonSetter("from")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * Text body of the message that was sent
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * Text body of the message that was sent
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
    }
 
    /** GETTER
     * The date and time when the message was recieved by recipient.
     */
    @JsonGetter("receivedTimestamp")
    public String getReceivedTimestamp ( ) { 
        return this.receivedTimestamp;
    }
    
    /** SETTER
     * The date and time when the message was recieved by recipient.
     */
    @JsonSetter("receivedTimestamp")
    public void setReceivedTimestamp (String value) { 
        this.receivedTimestamp = value;
    }
 
    /** GETTER
     * Indicates if there are more messages that can be polled from the server. 0=No more messages available. Anything else indicates there are more messages on the server.
     */
    @JsonGetter("moreMessages")
    public Integer getMoreMessages ( ) { 
        return this.moreMessages;
    }
    
    /** SETTER
     * Indicates if there are more messages that can be polled from the server. 0=No more messages available. Anything else indicates there are more messages on the server.
     */
    @JsonSetter("moreMessages")
    public void setMoreMessages (Integer value) { 
        this.moreMessages = value;
    }
 
    /** GETTER
     * Optional message ID of the SMS you sent. Use this ID to view the message status or get responses.
     */
    @JsonGetter("messageId")
    public String getMessageId ( ) { 
        return this.messageId;
    }
    
    /** SETTER
     * Optional message ID of the SMS you sent. Use this ID to view the message status or get responses.
     */
    @JsonSetter("messageId")
    public void setMessageId (String value) { 
        this.messageId = value;
    }
 
}
 