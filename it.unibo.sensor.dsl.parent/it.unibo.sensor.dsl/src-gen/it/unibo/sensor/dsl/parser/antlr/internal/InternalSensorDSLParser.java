package it.unibo.sensor.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.unibo.sensor.dsl.services.SensorDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSensorDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'name'", "'infos'", "'}'", "'network'", "'gateway'", "'cronjob'", "'port'", "'ip'", "'description'", "'type'", "'queries'", "'['", "']'", "'url'", "'registerRoute'", "'shutdownRoute'", "'detectionRoute'", "'alertRoute'", "'from'", "'to'", "'every'", "'at'", "':'", "'hours'", "'minutes'", "'-'", "'threshold'", "'monday'", "'tuesday'", "'wednesday'", "'thursday'", "'friday'", "'saturday'", "'sunday'", "'>'", "'<'", "'idro_level'", "'temp'", "'humidity'", "'wind'", "'rain'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSensorDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSensorDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSensorDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSensorDSL.g"; }



     	private SensorDSLGrammarAccess grammarAccess;

        public InternalSensorDSLParser(TokenStream input, SensorDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "SensorDefinition";
       	}

       	@Override
       	protected SensorDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSensorDefinition"
    // InternalSensorDSL.g:65:1: entryRuleSensorDefinition returns [EObject current=null] : iv_ruleSensorDefinition= ruleSensorDefinition EOF ;
    public final EObject entryRuleSensorDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDefinition = null;


        try {
            // InternalSensorDSL.g:65:57: (iv_ruleSensorDefinition= ruleSensorDefinition EOF )
            // InternalSensorDSL.g:66:2: iv_ruleSensorDefinition= ruleSensorDefinition EOF
            {
             newCompositeNode(grammarAccess.getSensorDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorDefinition=ruleSensorDefinition();

            state._fsp--;

             current =iv_ruleSensorDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorDefinition"


    // $ANTLR start "ruleSensorDefinition"
    // InternalSensorDSL.g:72:1: ruleSensorDefinition returns [EObject current=null] : ( (lv_sensor_0_0= ruleSensor ) ) ;
    public final EObject ruleSensorDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_sensor_0_0 = null;



        	enterRule();

        try {
            // InternalSensorDSL.g:78:2: ( ( (lv_sensor_0_0= ruleSensor ) ) )
            // InternalSensorDSL.g:79:2: ( (lv_sensor_0_0= ruleSensor ) )
            {
            // InternalSensorDSL.g:79:2: ( (lv_sensor_0_0= ruleSensor ) )
            // InternalSensorDSL.g:80:3: (lv_sensor_0_0= ruleSensor )
            {
            // InternalSensorDSL.g:80:3: (lv_sensor_0_0= ruleSensor )
            // InternalSensorDSL.g:81:4: lv_sensor_0_0= ruleSensor
            {

            				newCompositeNode(grammarAccess.getSensorDefinitionAccess().getSensorSensorParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_sensor_0_0=ruleSensor();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSensorDefinitionRule());
            				}
            				set(
            					current,
            					"sensor",
            					lv_sensor_0_0,
            					"it.unibo.sensor.dsl.SensorDSL.Sensor");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorDefinition"


    // $ANTLR start "entryRuleSensor"
    // InternalSensorDSL.g:101:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSensorDSL.g:101:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSensorDSL.g:102:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSensorDSL.g:108:1: ruleSensor returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'cronjob' otherlv_16= '{' ( (lv_cronjob_17_0= ruleGeneralCronjobInfo ) ) otherlv_18= '}' otherlv_19= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_infos_5_0 = null;

        EObject lv_network_9_0 = null;

        EObject lv_gateway_13_0 = null;

        EObject lv_cronjob_17_0 = null;



        	enterRule();

        try {
            // InternalSensorDSL.g:114:2: ( (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'cronjob' otherlv_16= '{' ( (lv_cronjob_17_0= ruleGeneralCronjobInfo ) ) otherlv_18= '}' otherlv_19= '}' ) )
            // InternalSensorDSL.g:115:2: (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'cronjob' otherlv_16= '{' ( (lv_cronjob_17_0= ruleGeneralCronjobInfo ) ) otherlv_18= '}' otherlv_19= '}' )
            {
            // InternalSensorDSL.g:115:2: (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'cronjob' otherlv_16= '{' ( (lv_cronjob_17_0= ruleGeneralCronjobInfo ) ) otherlv_18= '}' otherlv_19= '}' )
            // InternalSensorDSL.g:116:3: otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'cronjob' otherlv_16= '{' ( (lv_cronjob_17_0= ruleGeneralCronjobInfo ) ) otherlv_18= '}' otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getNameKeyword_1());
            		
            // InternalSensorDSL.g:124:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSensorDSL.g:125:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSensorDSL.g:125:4: (lv_name_2_0= RULE_STRING )
            // InternalSensorDSL.g:126:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSensorAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getInfosKeyword_3());
            		
            otherlv_4=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSensorDSL.g:150:3: ( (lv_infos_5_0= ruleGeneralSensorInfo ) )
            // InternalSensorDSL.g:151:4: (lv_infos_5_0= ruleGeneralSensorInfo )
            {
            // InternalSensorDSL.g:151:4: (lv_infos_5_0= ruleGeneralSensorInfo )
            // InternalSensorDSL.g:152:5: lv_infos_5_0= ruleGeneralSensorInfo
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getInfosGeneralSensorInfoParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_infos_5_0=ruleGeneralSensorInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"infos",
            						lv_infos_5_0,
            						"it.unibo.sensor.dsl.SensorDSL.GeneralSensorInfo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getNetworkKeyword_7());
            		
            otherlv_8=(Token)match(input,11,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalSensorDSL.g:181:3: ( (lv_network_9_0= ruleGeneralNetworkInfo ) )
            // InternalSensorDSL.g:182:4: (lv_network_9_0= ruleGeneralNetworkInfo )
            {
            // InternalSensorDSL.g:182:4: (lv_network_9_0= ruleGeneralNetworkInfo )
            // InternalSensorDSL.g:183:5: lv_network_9_0= ruleGeneralNetworkInfo
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNetworkGeneralNetworkInfoParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_8);
            lv_network_9_0=ruleGeneralNetworkInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"network",
            						lv_network_9_0,
            						"it.unibo.sensor.dsl.SensorDSL.GeneralNetworkInfo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_11=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getGatewayKeyword_11());
            		
            otherlv_12=(Token)match(input,11,FOLLOW_12); 

            			newLeafNode(otherlv_12, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalSensorDSL.g:212:3: ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) )
            // InternalSensorDSL.g:213:4: (lv_gateway_13_0= ruleGeneralGatewayInfo )
            {
            // InternalSensorDSL.g:213:4: (lv_gateway_13_0= ruleGeneralGatewayInfo )
            // InternalSensorDSL.g:214:5: lv_gateway_13_0= ruleGeneralGatewayInfo
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getGatewayGeneralGatewayInfoParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_gateway_13_0=ruleGeneralGatewayInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"gateway",
            						lv_gateway_13_0,
            						"it.unibo.sensor.dsl.SensorDSL.GeneralGatewayInfo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_14, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_15=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getSensorAccess().getCronjobKeyword_15());
            		
            otherlv_16=(Token)match(input,11,FOLLOW_14); 

            			newLeafNode(otherlv_16, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalSensorDSL.g:243:3: ( (lv_cronjob_17_0= ruleGeneralCronjobInfo ) )
            // InternalSensorDSL.g:244:4: (lv_cronjob_17_0= ruleGeneralCronjobInfo )
            {
            // InternalSensorDSL.g:244:4: (lv_cronjob_17_0= ruleGeneralCronjobInfo )
            // InternalSensorDSL.g:245:5: lv_cronjob_17_0= ruleGeneralCronjobInfo
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getCronjobGeneralCronjobInfoParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_8);
            lv_cronjob_17_0=ruleGeneralCronjobInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"cronjob",
            						lv_cronjob_17_0,
            						"it.unibo.sensor.dsl.SensorDSL.GeneralCronjobInfo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_18, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleGeneralNetworkInfo"
    // InternalSensorDSL.g:274:1: entryRuleGeneralNetworkInfo returns [EObject current=null] : iv_ruleGeneralNetworkInfo= ruleGeneralNetworkInfo EOF ;
    public final EObject entryRuleGeneralNetworkInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralNetworkInfo = null;


        try {
            // InternalSensorDSL.g:274:59: (iv_ruleGeneralNetworkInfo= ruleGeneralNetworkInfo EOF )
            // InternalSensorDSL.g:275:2: iv_ruleGeneralNetworkInfo= ruleGeneralNetworkInfo EOF
            {
             newCompositeNode(grammarAccess.getGeneralNetworkInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralNetworkInfo=ruleGeneralNetworkInfo();

            state._fsp--;

             current =iv_ruleGeneralNetworkInfo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralNetworkInfo"


    // $ANTLR start "ruleGeneralNetworkInfo"
    // InternalSensorDSL.g:281:1: ruleGeneralNetworkInfo returns [EObject current=null] : (otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleGeneralNetworkInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_port_1_0=null;
        Token otherlv_2=null;
        Token lv_ip_3_0=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:287:2: ( (otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) ) ) )
            // InternalSensorDSL.g:288:2: (otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) ) )
            {
            // InternalSensorDSL.g:288:2: (otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) ) )
            // InternalSensorDSL.g:289:3: otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralNetworkInfoAccess().getPortKeyword_0());
            		
            // InternalSensorDSL.g:293:3: ( (lv_port_1_0= RULE_INT ) )
            // InternalSensorDSL.g:294:4: (lv_port_1_0= RULE_INT )
            {
            // InternalSensorDSL.g:294:4: (lv_port_1_0= RULE_INT )
            // InternalSensorDSL.g:295:5: lv_port_1_0= RULE_INT
            {
            lv_port_1_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_port_1_0, grammarAccess.getGeneralNetworkInfoAccess().getPortINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralNetworkInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralNetworkInfoAccess().getIpKeyword_2());
            		
            // InternalSensorDSL.g:315:3: ( (lv_ip_3_0= RULE_STRING ) )
            // InternalSensorDSL.g:316:4: (lv_ip_3_0= RULE_STRING )
            {
            // InternalSensorDSL.g:316:4: (lv_ip_3_0= RULE_STRING )
            // InternalSensorDSL.g:317:5: lv_ip_3_0= RULE_STRING
            {
            lv_ip_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_ip_3_0, grammarAccess.getGeneralNetworkInfoAccess().getIpSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralNetworkInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ip",
            						lv_ip_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralNetworkInfo"


    // $ANTLR start "entryRuleGeneralSensorInfo"
    // InternalSensorDSL.g:337:1: entryRuleGeneralSensorInfo returns [EObject current=null] : iv_ruleGeneralSensorInfo= ruleGeneralSensorInfo EOF ;
    public final EObject entryRuleGeneralSensorInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralSensorInfo = null;


        try {
            // InternalSensorDSL.g:337:58: (iv_ruleGeneralSensorInfo= ruleGeneralSensorInfo EOF )
            // InternalSensorDSL.g:338:2: iv_ruleGeneralSensorInfo= ruleGeneralSensorInfo EOF
            {
             newCompositeNode(grammarAccess.getGeneralSensorInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralSensorInfo=ruleGeneralSensorInfo();

            state._fsp--;

             current =iv_ruleGeneralSensorInfo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralSensorInfo"


    // $ANTLR start "ruleGeneralSensorInfo"
    // InternalSensorDSL.g:344:1: ruleGeneralSensorInfo returns [EObject current=null] : (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']' ) ;
    public final EObject ruleGeneralSensorInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_description_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_query_6_0 = null;



        	enterRule();

        try {
            // InternalSensorDSL.g:350:2: ( (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']' ) )
            // InternalSensorDSL.g:351:2: (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']' )
            {
            // InternalSensorDSL.g:351:2: (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']' )
            // InternalSensorDSL.g:352:3: otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralSensorInfoAccess().getDescriptionKeyword_0());
            		
            // InternalSensorDSL.g:356:3: ( (lv_description_1_0= RULE_STRING ) )
            // InternalSensorDSL.g:357:4: (lv_description_1_0= RULE_STRING )
            {
            // InternalSensorDSL.g:357:4: (lv_description_1_0= RULE_STRING )
            // InternalSensorDSL.g:358:5: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            					newLeafNode(lv_description_1_0, grammarAccess.getGeneralSensorInfoAccess().getDescriptionSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralSensorInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralSensorInfoAccess().getTypeKeyword_2());
            		
            // InternalSensorDSL.g:378:3: ( (lv_type_3_0= ruleTYPES ) )
            // InternalSensorDSL.g:379:4: (lv_type_3_0= ruleTYPES )
            {
            // InternalSensorDSL.g:379:4: (lv_type_3_0= ruleTYPES )
            // InternalSensorDSL.g:380:5: lv_type_3_0= ruleTYPES
            {

            					newCompositeNode(grammarAccess.getGeneralSensorInfoAccess().getTypeTYPESEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_type_3_0=ruleTYPES();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGeneralSensorInfoRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"it.unibo.sensor.dsl.SensorDSL.TYPES");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralSensorInfoAccess().getQueriesKeyword_4());
            		
            otherlv_5=(Token)match(input,23,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralSensorInfoAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalSensorDSL.g:405:3: ( (lv_query_6_0= ruleQuery ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==37) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSensorDSL.g:406:4: (lv_query_6_0= ruleQuery )
            	    {
            	    // InternalSensorDSL.g:406:4: (lv_query_6_0= ruleQuery )
            	    // InternalSensorDSL.g:407:5: lv_query_6_0= ruleQuery
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralSensorInfoAccess().getQueryQueryParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_query_6_0=ruleQuery();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGeneralSensorInfoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"query",
            	    						lv_query_6_0,
            	    						"it.unibo.sensor.dsl.SensorDSL.Query");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGeneralSensorInfoAccess().getRightSquareBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralSensorInfo"


    // $ANTLR start "entryRuleGeneralGatewayInfo"
    // InternalSensorDSL.g:432:1: entryRuleGeneralGatewayInfo returns [EObject current=null] : iv_ruleGeneralGatewayInfo= ruleGeneralGatewayInfo EOF ;
    public final EObject entryRuleGeneralGatewayInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralGatewayInfo = null;


        try {
            // InternalSensorDSL.g:432:59: (iv_ruleGeneralGatewayInfo= ruleGeneralGatewayInfo EOF )
            // InternalSensorDSL.g:433:2: iv_ruleGeneralGatewayInfo= ruleGeneralGatewayInfo EOF
            {
             newCompositeNode(grammarAccess.getGeneralGatewayInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralGatewayInfo=ruleGeneralGatewayInfo();

            state._fsp--;

             current =iv_ruleGeneralGatewayInfo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralGatewayInfo"


    // $ANTLR start "ruleGeneralGatewayInfo"
    // InternalSensorDSL.g:439:1: ruleGeneralGatewayInfo returns [EObject current=null] : (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'registerRoute' ( (lv_register_3_0= RULE_STRING ) ) otherlv_4= 'shutdownRoute' ( (lv_shutdown_5_0= RULE_STRING ) ) otherlv_6= 'detectionRoute' ( (lv_detection_7_0= RULE_STRING ) ) otherlv_8= 'alertRoute' ( (lv_alert_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleGeneralGatewayInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_register_3_0=null;
        Token otherlv_4=null;
        Token lv_shutdown_5_0=null;
        Token otherlv_6=null;
        Token lv_detection_7_0=null;
        Token otherlv_8=null;
        Token lv_alert_9_0=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:445:2: ( (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'registerRoute' ( (lv_register_3_0= RULE_STRING ) ) otherlv_4= 'shutdownRoute' ( (lv_shutdown_5_0= RULE_STRING ) ) otherlv_6= 'detectionRoute' ( (lv_detection_7_0= RULE_STRING ) ) otherlv_8= 'alertRoute' ( (lv_alert_9_0= RULE_STRING ) ) ) )
            // InternalSensorDSL.g:446:2: (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'registerRoute' ( (lv_register_3_0= RULE_STRING ) ) otherlv_4= 'shutdownRoute' ( (lv_shutdown_5_0= RULE_STRING ) ) otherlv_6= 'detectionRoute' ( (lv_detection_7_0= RULE_STRING ) ) otherlv_8= 'alertRoute' ( (lv_alert_9_0= RULE_STRING ) ) )
            {
            // InternalSensorDSL.g:446:2: (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'registerRoute' ( (lv_register_3_0= RULE_STRING ) ) otherlv_4= 'shutdownRoute' ( (lv_shutdown_5_0= RULE_STRING ) ) otherlv_6= 'detectionRoute' ( (lv_detection_7_0= RULE_STRING ) ) otherlv_8= 'alertRoute' ( (lv_alert_9_0= RULE_STRING ) ) )
            // InternalSensorDSL.g:447:3: otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'registerRoute' ( (lv_register_3_0= RULE_STRING ) ) otherlv_4= 'shutdownRoute' ( (lv_shutdown_5_0= RULE_STRING ) ) otherlv_6= 'detectionRoute' ( (lv_detection_7_0= RULE_STRING ) ) otherlv_8= 'alertRoute' ( (lv_alert_9_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralGatewayInfoAccess().getUrlKeyword_0());
            		
            // InternalSensorDSL.g:451:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalSensorDSL.g:452:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalSensorDSL.g:452:4: (lv_url_1_0= RULE_STRING )
            // InternalSensorDSL.g:453:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_url_1_0, grammarAccess.getGeneralGatewayInfoAccess().getUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"url",
            						lv_url_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralGatewayInfoAccess().getRegisterRouteKeyword_2());
            		
            // InternalSensorDSL.g:473:3: ( (lv_register_3_0= RULE_STRING ) )
            // InternalSensorDSL.g:474:4: (lv_register_3_0= RULE_STRING )
            {
            // InternalSensorDSL.g:474:4: (lv_register_3_0= RULE_STRING )
            // InternalSensorDSL.g:475:5: lv_register_3_0= RULE_STRING
            {
            lv_register_3_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

            					newLeafNode(lv_register_3_0, grammarAccess.getGeneralGatewayInfoAccess().getRegisterSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"register",
            						lv_register_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralGatewayInfoAccess().getShutdownRouteKeyword_4());
            		
            // InternalSensorDSL.g:495:3: ( (lv_shutdown_5_0= RULE_STRING ) )
            // InternalSensorDSL.g:496:4: (lv_shutdown_5_0= RULE_STRING )
            {
            // InternalSensorDSL.g:496:4: (lv_shutdown_5_0= RULE_STRING )
            // InternalSensorDSL.g:497:5: lv_shutdown_5_0= RULE_STRING
            {
            lv_shutdown_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_shutdown_5_0, grammarAccess.getGeneralGatewayInfoAccess().getShutdownSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shutdown",
            						lv_shutdown_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getGeneralGatewayInfoAccess().getDetectionRouteKeyword_6());
            		
            // InternalSensorDSL.g:517:3: ( (lv_detection_7_0= RULE_STRING ) )
            // InternalSensorDSL.g:518:4: (lv_detection_7_0= RULE_STRING )
            {
            // InternalSensorDSL.g:518:4: (lv_detection_7_0= RULE_STRING )
            // InternalSensorDSL.g:519:5: lv_detection_7_0= RULE_STRING
            {
            lv_detection_7_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_detection_7_0, grammarAccess.getGeneralGatewayInfoAccess().getDetectionSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"detection",
            						lv_detection_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getGeneralGatewayInfoAccess().getAlertRouteKeyword_8());
            		
            // InternalSensorDSL.g:539:3: ( (lv_alert_9_0= RULE_STRING ) )
            // InternalSensorDSL.g:540:4: (lv_alert_9_0= RULE_STRING )
            {
            // InternalSensorDSL.g:540:4: (lv_alert_9_0= RULE_STRING )
            // InternalSensorDSL.g:541:5: lv_alert_9_0= RULE_STRING
            {
            lv_alert_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_alert_9_0, grammarAccess.getGeneralGatewayInfoAccess().getAlertSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"alert",
            						lv_alert_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralGatewayInfo"


    // $ANTLR start "entryRuleGeneralCronjobInfo"
    // InternalSensorDSL.g:561:1: entryRuleGeneralCronjobInfo returns [EObject current=null] : iv_ruleGeneralCronjobInfo= ruleGeneralCronjobInfo EOF ;
    public final EObject entryRuleGeneralCronjobInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralCronjobInfo = null;


        try {
            // InternalSensorDSL.g:561:59: (iv_ruleGeneralCronjobInfo= ruleGeneralCronjobInfo EOF )
            // InternalSensorDSL.g:562:2: iv_ruleGeneralCronjobInfo= ruleGeneralCronjobInfo EOF
            {
             newCompositeNode(grammarAccess.getGeneralCronjobInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeneralCronjobInfo=ruleGeneralCronjobInfo();

            state._fsp--;

             current =iv_ruleGeneralCronjobInfo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneralCronjobInfo"


    // $ANTLR start "ruleGeneralCronjobInfo"
    // InternalSensorDSL.g:568:1: ruleGeneralCronjobInfo returns [EObject current=null] : ( ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( (otherlv_6= 'at' ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | (otherlv_10= 'every' ( (lv_value_11_0= RULE_INT ) ) (otherlv_12= 'hours' | otherlv_13= 'minutes' ) ) ) ) ;
    public final EObject ruleGeneralCronjobInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_hour_7_0=null;
        Token otherlv_8=null;
        Token lv_minute_9_0=null;
        Token otherlv_10=null;
        Token lv_value_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Enumerator lv_from_1_0 = null;

        Enumerator lv_to_3_0 = null;

        Enumerator lv_day_5_0 = null;



        	enterRule();

        try {
            // InternalSensorDSL.g:574:2: ( ( ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( (otherlv_6= 'at' ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | (otherlv_10= 'every' ( (lv_value_11_0= RULE_INT ) ) (otherlv_12= 'hours' | otherlv_13= 'minutes' ) ) ) ) )
            // InternalSensorDSL.g:575:2: ( ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( (otherlv_6= 'at' ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | (otherlv_10= 'every' ( (lv_value_11_0= RULE_INT ) ) (otherlv_12= 'hours' | otherlv_13= 'minutes' ) ) ) )
            {
            // InternalSensorDSL.g:575:2: ( ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( (otherlv_6= 'at' ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | (otherlv_10= 'every' ( (lv_value_11_0= RULE_INT ) ) (otherlv_12= 'hours' | otherlv_13= 'minutes' ) ) ) )
            // InternalSensorDSL.g:576:3: ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( (otherlv_6= 'at' ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | (otherlv_10= 'every' ( (lv_value_11_0= RULE_INT ) ) (otherlv_12= 'hours' | otherlv_13= 'minutes' ) ) )
            {
            // InternalSensorDSL.g:576:3: ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==32) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSensorDSL.g:577:4: (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) )
                    {
                    // InternalSensorDSL.g:577:4: (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) )
                    // InternalSensorDSL.g:578:5: otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_26); 

                    					newLeafNode(otherlv_0, grammarAccess.getGeneralCronjobInfoAccess().getFromKeyword_0_0_0());
                    				
                    // InternalSensorDSL.g:582:5: ( (lv_from_1_0= ruleDAY ) )
                    // InternalSensorDSL.g:583:6: (lv_from_1_0= ruleDAY )
                    {
                    // InternalSensorDSL.g:583:6: (lv_from_1_0= ruleDAY )
                    // InternalSensorDSL.g:584:7: lv_from_1_0= ruleDAY
                    {

                    							newCompositeNode(grammarAccess.getGeneralCronjobInfoAccess().getFromDAYEnumRuleCall_0_0_1_0());
                    						
                    pushFollow(FOLLOW_27);
                    lv_from_1_0=ruleDAY();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getGeneralCronjobInfoRule());
                    							}
                    							set(
                    								current,
                    								"from",
                    								lv_from_1_0,
                    								"it.unibo.sensor.dsl.SensorDSL.DAY");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_26); 

                    					newLeafNode(otherlv_2, grammarAccess.getGeneralCronjobInfoAccess().getToKeyword_0_0_2());
                    				
                    // InternalSensorDSL.g:605:5: ( (lv_to_3_0= ruleDAY ) )
                    // InternalSensorDSL.g:606:6: (lv_to_3_0= ruleDAY )
                    {
                    // InternalSensorDSL.g:606:6: (lv_to_3_0= ruleDAY )
                    // InternalSensorDSL.g:607:7: lv_to_3_0= ruleDAY
                    {

                    							newCompositeNode(grammarAccess.getGeneralCronjobInfoAccess().getToDAYEnumRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_28);
                    lv_to_3_0=ruleDAY();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getGeneralCronjobInfoRule());
                    							}
                    							set(
                    								current,
                    								"to",
                    								lv_to_3_0,
                    								"it.unibo.sensor.dsl.SensorDSL.DAY");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSensorDSL.g:626:4: (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) )
                    {
                    // InternalSensorDSL.g:626:4: (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) )
                    // InternalSensorDSL.g:627:5: otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_26); 

                    					newLeafNode(otherlv_4, grammarAccess.getGeneralCronjobInfoAccess().getEveryKeyword_0_1_0());
                    				
                    // InternalSensorDSL.g:631:5: ( (lv_day_5_0= ruleDAY ) )
                    // InternalSensorDSL.g:632:6: (lv_day_5_0= ruleDAY )
                    {
                    // InternalSensorDSL.g:632:6: (lv_day_5_0= ruleDAY )
                    // InternalSensorDSL.g:633:7: lv_day_5_0= ruleDAY
                    {

                    							newCompositeNode(grammarAccess.getGeneralCronjobInfoAccess().getDayDAYEnumRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_28);
                    lv_day_5_0=ruleDAY();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getGeneralCronjobInfoRule());
                    							}
                    							set(
                    								current,
                    								"day",
                    								lv_day_5_0,
                    								"it.unibo.sensor.dsl.SensorDSL.DAY");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalSensorDSL.g:652:3: ( (otherlv_6= 'at' ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | (otherlv_10= 'every' ( (lv_value_11_0= RULE_INT ) ) (otherlv_12= 'hours' | otherlv_13= 'minutes' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==33) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSensorDSL.g:653:4: (otherlv_6= 'at' ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) )
                    {
                    // InternalSensorDSL.g:653:4: (otherlv_6= 'at' ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) )
                    // InternalSensorDSL.g:654:5: otherlv_6= 'at' ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_15); 

                    					newLeafNode(otherlv_6, grammarAccess.getGeneralCronjobInfoAccess().getAtKeyword_1_0_0());
                    				
                    // InternalSensorDSL.g:658:5: ( (lv_hour_7_0= RULE_INT ) )
                    // InternalSensorDSL.g:659:6: (lv_hour_7_0= RULE_INT )
                    {
                    // InternalSensorDSL.g:659:6: (lv_hour_7_0= RULE_INT )
                    // InternalSensorDSL.g:660:7: lv_hour_7_0= RULE_INT
                    {
                    lv_hour_7_0=(Token)match(input,RULE_INT,FOLLOW_29); 

                    							newLeafNode(lv_hour_7_0, grammarAccess.getGeneralCronjobInfoAccess().getHourINTTerminalRuleCall_1_0_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralCronjobInfoRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"hour",
                    								lv_hour_7_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_15); 

                    					newLeafNode(otherlv_8, grammarAccess.getGeneralCronjobInfoAccess().getColonKeyword_1_0_2());
                    				
                    // InternalSensorDSL.g:680:5: ( (lv_minute_9_0= RULE_INT ) )
                    // InternalSensorDSL.g:681:6: (lv_minute_9_0= RULE_INT )
                    {
                    // InternalSensorDSL.g:681:6: (lv_minute_9_0= RULE_INT )
                    // InternalSensorDSL.g:682:7: lv_minute_9_0= RULE_INT
                    {
                    lv_minute_9_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    							newLeafNode(lv_minute_9_0, grammarAccess.getGeneralCronjobInfoAccess().getMinuteINTTerminalRuleCall_1_0_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralCronjobInfoRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"minute",
                    								lv_minute_9_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSensorDSL.g:700:4: (otherlv_10= 'every' ( (lv_value_11_0= RULE_INT ) ) (otherlv_12= 'hours' | otherlv_13= 'minutes' ) )
                    {
                    // InternalSensorDSL.g:700:4: (otherlv_10= 'every' ( (lv_value_11_0= RULE_INT ) ) (otherlv_12= 'hours' | otherlv_13= 'minutes' ) )
                    // InternalSensorDSL.g:701:5: otherlv_10= 'every' ( (lv_value_11_0= RULE_INT ) ) (otherlv_12= 'hours' | otherlv_13= 'minutes' )
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_15); 

                    					newLeafNode(otherlv_10, grammarAccess.getGeneralCronjobInfoAccess().getEveryKeyword_1_1_0());
                    				
                    // InternalSensorDSL.g:705:5: ( (lv_value_11_0= RULE_INT ) )
                    // InternalSensorDSL.g:706:6: (lv_value_11_0= RULE_INT )
                    {
                    // InternalSensorDSL.g:706:6: (lv_value_11_0= RULE_INT )
                    // InternalSensorDSL.g:707:7: lv_value_11_0= RULE_INT
                    {
                    lv_value_11_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    							newLeafNode(lv_value_11_0, grammarAccess.getGeneralCronjobInfoAccess().getValueINTTerminalRuleCall_1_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralCronjobInfoRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"value",
                    								lv_value_11_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    // InternalSensorDSL.g:723:5: (otherlv_12= 'hours' | otherlv_13= 'minutes' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==35) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==36) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSensorDSL.g:724:6: otherlv_12= 'hours'
                            {
                            otherlv_12=(Token)match(input,35,FOLLOW_2); 

                            						newLeafNode(otherlv_12, grammarAccess.getGeneralCronjobInfoAccess().getHoursKeyword_1_1_2_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalSensorDSL.g:729:6: otherlv_13= 'minutes'
                            {
                            otherlv_13=(Token)match(input,36,FOLLOW_2); 

                            						newLeafNode(otherlv_13, grammarAccess.getGeneralCronjobInfoAccess().getMinutesKeyword_1_1_2_1());
                            					

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneralCronjobInfo"


    // $ANTLR start "entryRuleQuery"
    // InternalSensorDSL.g:740:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSensorDSL.g:740:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSensorDSL.g:741:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalSensorDSL.g:747:1: ruleQuery returns [EObject current=null] : (otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_value_4_0=null;
        Enumerator lv_comparator_3_0 = null;



        	enterRule();

        try {
            // InternalSensorDSL.g:753:2: ( (otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalSensorDSL.g:754:2: (otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalSensorDSL.g:754:2: (otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalSensorDSL.g:755:3: otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getThresholdKeyword_1());
            		
            // InternalSensorDSL.g:763:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSensorDSL.g:764:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSensorDSL.g:764:4: (lv_name_2_0= RULE_STRING )
            // InternalSensorDSL.g:765:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

            					newLeafNode(lv_name_2_0, grammarAccess.getQueryAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalSensorDSL.g:781:3: ( (lv_comparator_3_0= ruleComparator ) )
            // InternalSensorDSL.g:782:4: (lv_comparator_3_0= ruleComparator )
            {
            // InternalSensorDSL.g:782:4: (lv_comparator_3_0= ruleComparator )
            // InternalSensorDSL.g:783:5: lv_comparator_3_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getComparatorComparatorEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_comparator_3_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"comparator",
            						lv_comparator_3_0,
            						"it.unibo.sensor.dsl.SensorDSL.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSensorDSL.g:800:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalSensorDSL.g:801:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalSensorDSL.g:801:4: (lv_value_4_0= RULE_STRING )
            // InternalSensorDSL.g:802:5: lv_value_4_0= RULE_STRING
            {
            lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_4_0, grammarAccess.getQueryAccess().getValueSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "ruleDAY"
    // InternalSensorDSL.g:822:1: ruleDAY returns [Enumerator current=null] : ( (enumLiteral_0= 'monday' ) | (enumLiteral_1= 'tuesday' ) | (enumLiteral_2= 'wednesday' ) | (enumLiteral_3= 'thursday' ) | (enumLiteral_4= 'friday' ) | (enumLiteral_5= 'saturday' ) | (enumLiteral_6= 'sunday' ) ) ;
    public final Enumerator ruleDAY() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:828:2: ( ( (enumLiteral_0= 'monday' ) | (enumLiteral_1= 'tuesday' ) | (enumLiteral_2= 'wednesday' ) | (enumLiteral_3= 'thursday' ) | (enumLiteral_4= 'friday' ) | (enumLiteral_5= 'saturday' ) | (enumLiteral_6= 'sunday' ) ) )
            // InternalSensorDSL.g:829:2: ( (enumLiteral_0= 'monday' ) | (enumLiteral_1= 'tuesday' ) | (enumLiteral_2= 'wednesday' ) | (enumLiteral_3= 'thursday' ) | (enumLiteral_4= 'friday' ) | (enumLiteral_5= 'saturday' ) | (enumLiteral_6= 'sunday' ) )
            {
            // InternalSensorDSL.g:829:2: ( (enumLiteral_0= 'monday' ) | (enumLiteral_1= 'tuesday' ) | (enumLiteral_2= 'wednesday' ) | (enumLiteral_3= 'thursday' ) | (enumLiteral_4= 'friday' ) | (enumLiteral_5= 'saturday' ) | (enumLiteral_6= 'sunday' ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 40:
                {
                alt5=2;
                }
                break;
            case 41:
                {
                alt5=3;
                }
                break;
            case 42:
                {
                alt5=4;
                }
                break;
            case 43:
                {
                alt5=5;
                }
                break;
            case 44:
                {
                alt5=6;
                }
                break;
            case 45:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalSensorDSL.g:830:3: (enumLiteral_0= 'monday' )
                    {
                    // InternalSensorDSL.g:830:3: (enumLiteral_0= 'monday' )
                    // InternalSensorDSL.g:831:4: enumLiteral_0= 'monday'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDAYAccess().getMondayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensorDSL.g:838:3: (enumLiteral_1= 'tuesday' )
                    {
                    // InternalSensorDSL.g:838:3: (enumLiteral_1= 'tuesday' )
                    // InternalSensorDSL.g:839:4: enumLiteral_1= 'tuesday'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDAYAccess().getTuesdayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSensorDSL.g:846:3: (enumLiteral_2= 'wednesday' )
                    {
                    // InternalSensorDSL.g:846:3: (enumLiteral_2= 'wednesday' )
                    // InternalSensorDSL.g:847:4: enumLiteral_2= 'wednesday'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDAYAccess().getWednesdayEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSensorDSL.g:854:3: (enumLiteral_3= 'thursday' )
                    {
                    // InternalSensorDSL.g:854:3: (enumLiteral_3= 'thursday' )
                    // InternalSensorDSL.g:855:4: enumLiteral_3= 'thursday'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDAYAccess().getThursdayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSensorDSL.g:862:3: (enumLiteral_4= 'friday' )
                    {
                    // InternalSensorDSL.g:862:3: (enumLiteral_4= 'friday' )
                    // InternalSensorDSL.g:863:4: enumLiteral_4= 'friday'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDAYAccess().getFridayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSensorDSL.g:870:3: (enumLiteral_5= 'saturday' )
                    {
                    // InternalSensorDSL.g:870:3: (enumLiteral_5= 'saturday' )
                    // InternalSensorDSL.g:871:4: enumLiteral_5= 'saturday'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDAYAccess().getSaturdayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSensorDSL.g:878:3: (enumLiteral_6= 'sunday' )
                    {
                    // InternalSensorDSL.g:878:3: (enumLiteral_6= 'sunday' )
                    // InternalSensorDSL.g:879:4: enumLiteral_6= 'sunday'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getSundayEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDAYAccess().getSundayEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDAY"


    // $ANTLR start "ruleComparator"
    // InternalSensorDSL.g:889:1: ruleComparator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) ) ;
    public final Enumerator ruleComparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:895:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) ) )
            // InternalSensorDSL.g:896:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) )
            {
            // InternalSensorDSL.g:896:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==46) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSensorDSL.g:897:3: (enumLiteral_0= '>' )
                    {
                    // InternalSensorDSL.g:897:3: (enumLiteral_0= '>' )
                    // InternalSensorDSL.g:898:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getComparatorAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensorDSL.g:905:3: (enumLiteral_1= '<' )
                    {
                    // InternalSensorDSL.g:905:3: (enumLiteral_1= '<' )
                    // InternalSensorDSL.g:906:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getComparatorAccess().getSMALLEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparatorAccess().getSMALLEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "ruleTYPES"
    // InternalSensorDSL.g:916:1: ruleTYPES returns [Enumerator current=null] : ( (enumLiteral_0= 'idro_level' ) | (enumLiteral_1= 'temp' ) | (enumLiteral_2= 'humidity' ) | (enumLiteral_3= 'wind' ) | (enumLiteral_4= 'rain' ) ) ;
    public final Enumerator ruleTYPES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:922:2: ( ( (enumLiteral_0= 'idro_level' ) | (enumLiteral_1= 'temp' ) | (enumLiteral_2= 'humidity' ) | (enumLiteral_3= 'wind' ) | (enumLiteral_4= 'rain' ) ) )
            // InternalSensorDSL.g:923:2: ( (enumLiteral_0= 'idro_level' ) | (enumLiteral_1= 'temp' ) | (enumLiteral_2= 'humidity' ) | (enumLiteral_3= 'wind' ) | (enumLiteral_4= 'rain' ) )
            {
            // InternalSensorDSL.g:923:2: ( (enumLiteral_0= 'idro_level' ) | (enumLiteral_1= 'temp' ) | (enumLiteral_2= 'humidity' ) | (enumLiteral_3= 'wind' ) | (enumLiteral_4= 'rain' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt7=1;
                }
                break;
            case 49:
                {
                alt7=2;
                }
                break;
            case 50:
                {
                alt7=3;
                }
                break;
            case 51:
                {
                alt7=4;
                }
                break;
            case 52:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSensorDSL.g:924:3: (enumLiteral_0= 'idro_level' )
                    {
                    // InternalSensorDSL.g:924:3: (enumLiteral_0= 'idro_level' )
                    // InternalSensorDSL.g:925:4: enumLiteral_0= 'idro_level'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getTYPESAccess().getHydroEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPESAccess().getHydroEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensorDSL.g:932:3: (enumLiteral_1= 'temp' )
                    {
                    // InternalSensorDSL.g:932:3: (enumLiteral_1= 'temp' )
                    // InternalSensorDSL.g:933:4: enumLiteral_1= 'temp'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getTYPESAccess().getTemperatureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPESAccess().getTemperatureEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSensorDSL.g:940:3: (enumLiteral_2= 'humidity' )
                    {
                    // InternalSensorDSL.g:940:3: (enumLiteral_2= 'humidity' )
                    // InternalSensorDSL.g:941:4: enumLiteral_2= 'humidity'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getTYPESAccess().getHumidityEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPESAccess().getHumidityEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSensorDSL.g:948:3: (enumLiteral_3= 'wind' )
                    {
                    // InternalSensorDSL.g:948:3: (enumLiteral_3= 'wind' )
                    // InternalSensorDSL.g:949:4: enumLiteral_3= 'wind'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTYPESAccess().getWindEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTYPESAccess().getWindEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSensorDSL.g:956:3: (enumLiteral_4= 'rain' )
                    {
                    // InternalSensorDSL.g:956:3: (enumLiteral_4= 'rain' )
                    // InternalSensorDSL.g:957:4: enumLiteral_4= 'rain'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTYPESAccess().getRainEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTYPESAccess().getRainEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPES"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00003F8000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000C00000000000L});

}