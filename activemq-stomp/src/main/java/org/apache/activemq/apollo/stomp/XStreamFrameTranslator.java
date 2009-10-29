/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.activemq.apollo.stomp;


/**
 * Frame translator implementation that uses XStream to convert messages to and
 * from XML and JSON
 * 
 * @author <a href="mailto:dejan@nighttale.net">Dejan Bosanac</a>
 */
public class XStreamFrameTranslator extends DefaultFrameTranslator {
//
//	XStream xStream = null;
//
//	public ActiveMQMessage convertToOpenwireMessage(StompProtocolHandler converter,
//			StompFrame command) throws JMSException, ProtocolException {
//	    Map<String, String> headers = command.getHeaders();
//		ActiveMQMessage msg;
//		String transformation = (String) headers.get(Stomp.Headers.TRANSFORMATION);
//		if (headers.containsKey(Stomp.Headers.CONTENT_LENGTH) || transformation.equals(Stomp.Transformations.JMS_BYTE.toString())) {
//			msg = super.convertToOpenwireMessage(converter, command);
//		} else {
//			HierarchicalStreamReader in;
//
//			try {
//				String text = new String(command.getContent(), "UTF-8");
//				switch (Stomp.Transformations.getValue(transformation)) {
//				case JMS_OBJECT_XML:
//					in = new XppReader(new StringReader(text));
//					msg = createObjectMessage(in);
//					break;
//				case JMS_OBJECT_JSON:
//					in = new JettisonMappedXmlDriver().createReader(new StringReader(text));
//					msg = createObjectMessage(in);
//					break;
//				case JMS_MAP_XML:
//					in = new XppReader(new StringReader(text));
//					msg = createMapMessage(in);
//					break;
//				case JMS_MAP_JSON:
//					in = new JettisonMappedXmlDriver().createReader(new StringReader(text));
//					msg = createMapMessage(in);
//					break;
//				default:
//					throw new Exception("Unkown transformation: " + transformation);
//				}
//			} catch (Throwable e) {
//				command.getHeaders().put(Stomp.Headers.TRANSFORMATION_ERROR, e.getMessage());
//				msg = super.convertToOpenwireMessage(converter, command);
//			}
//		}
//		FrameTranslator.Helper.copyStandardHeadersFromFrameToMessage(converter, command, msg, this);
//		return msg;
//	}
//
//	public StompFrame convertFromOpenwireMessage(StompProtocolHandler converter,
//			ActiveMQMessage message) throws IOException, JMSException {
//		if (message.getDataStructureType() == ActiveMQObjectMessage.DATA_STRUCTURE_TYPE) {
//			StompFrame command = new StompFrame();
//			command.setAction(Stomp.Responses.MESSAGE);
//			Map<String, String> headers = new HashMap<String, String>(25);
//			command.setHeaders(headers);
//
//			FrameTranslator.Helper.copyStandardHeadersFromMessageToFrame(
//					converter, message, command, this);
//			ActiveMQObjectMessage msg = (ActiveMQObjectMessage) message.copy();
//			command.setContent(marshall(msg.getObject(),
//					headers.get(Stomp.Headers.TRANSFORMATION))
//					.getBytes("UTF-8"));
//			return command;
//
//		} else if (message.getDataStructureType() == ActiveMQMapMessage.DATA_STRUCTURE_TYPE) { 
//			StompFrame command = new StompFrame();
//			command.setAction(Stomp.Responses.MESSAGE);
//			Map<String, String> headers = new HashMap<String, String>(25);
//			command.setHeaders(headers);
//
//			FrameTranslator.Helper.copyStandardHeadersFromMessageToFrame(
//					converter, message, command, this);
//			ActiveMQMapMessage msg = (ActiveMQMapMessage) message.copy();
//			command.setContent(marshall((Serializable)msg.getContentMap(),
//					headers.get(Stomp.Headers.TRANSFORMATION))
//					.getBytes("UTF-8"));
//			return command;		
//		} else {
//			return super.convertFromOpenwireMessage(converter, message);
//		}
//	}
//
//	/**
//	 * Marshalls the Object to a string using XML or JSON encoding
//	 */
//	protected String marshall(Serializable object, String transformation)
//			throws JMSException {
//		StringWriter buffer = new StringWriter();
//		HierarchicalStreamWriter out;
//		if (transformation.toLowerCase().endsWith("json")) {
//			out = new JettisonMappedXmlDriver().createWriter(buffer);
//		} else {
//			out = new PrettyPrintWriter(buffer);
//		}
//		getXStream().marshal(object, out);
//		return buffer.toString();
//	}
//
//	protected ActiveMQObjectMessage createObjectMessage(HierarchicalStreamReader in) throws JMSException {
//		ActiveMQObjectMessage objMsg = new ActiveMQObjectMessage();
//		Object obj = getXStream().unmarshal(in);
//		objMsg.setObject((Serializable) obj);
//		return objMsg;
//	}
//	
//	protected ActiveMQMapMessage createMapMessage(HierarchicalStreamReader in) throws JMSException {
//		ActiveMQMapMessage mapMsg = new ActiveMQMapMessage();
//		Map<String, Object> map = (Map<String, Object>)getXStream().unmarshal(in);
//		for (String key : map.keySet()) {
//			mapMsg.setObject(key, map.get(key));
//		}
//		return mapMsg;
//	}
//	
//	
//
//	// Properties
//	// -------------------------------------------------------------------------
//	public XStream getXStream() {
//		if (xStream == null) {
//			xStream = new XStream();
//		}
//		return xStream;
//	}
//
//	public void setXStream(XStream xStream) {
//		this.xStream = xStream;
//	}


}
