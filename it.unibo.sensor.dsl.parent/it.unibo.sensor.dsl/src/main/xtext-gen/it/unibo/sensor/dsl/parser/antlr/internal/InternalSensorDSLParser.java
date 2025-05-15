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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'name'", "'infos'", "'}'", "'network'", "'gateway'", "'registry'", "'cronjob'", "'port'", "'ip'", "'description'", "'type'", "'queries'", "'['", "']'", "'url'", "'registerRoute'", "'shutdownRoute'", "'detectionRoute'", "'alertRoute'", "'registryUrl'", "'key'", "'from'", "'to'", "'every'", "'at'", "':'", "'hours'", "'minutes'", "'-'", "'threshold'", "'monday'", "'tuesday'", "'wednesday'", "'thursday'", "'friday'", "'saturday'", "'sunday'", "'>'", "'<'", "'idro_level'", "'temp'", "'humidity'", "'wind'", "'rain'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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
    // InternalSensorDSL.g:108:1: ruleSensor returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'registry' otherlv_16= '{' ( (lv_registry_17_0= ruleSensorRegistryInfo ) ) otherlv_18= '}' otherlv_19= 'cronjob' otherlv_20= '{' ( (lv_cronjob_21_0= ruleGeneralCronjobInfo ) ) otherlv_22= '}' otherlv_23= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        EObject lv_infos_5_0 = null;

        EObject lv_network_9_0 = null;

        EObject lv_gateway_13_0 = null;

        EObject lv_registry_17_0 = null;

        EObject lv_cronjob_21_0 = null;



        	enterRule();

        try {
            // InternalSensorDSL.g:114:2: ( (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'registry' otherlv_16= '{' ( (lv_registry_17_0= ruleSensorRegistryInfo ) ) otherlv_18= '}' otherlv_19= 'cronjob' otherlv_20= '{' ( (lv_cronjob_21_0= ruleGeneralCronjobInfo ) ) otherlv_22= '}' otherlv_23= '}' ) )
            // InternalSensorDSL.g:115:2: (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'registry' otherlv_16= '{' ( (lv_registry_17_0= ruleSensorRegistryInfo ) ) otherlv_18= '}' otherlv_19= 'cronjob' otherlv_20= '{' ( (lv_cronjob_21_0= ruleGeneralCronjobInfo ) ) otherlv_22= '}' otherlv_23= '}' )
            {
            // InternalSensorDSL.g:115:2: (otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'registry' otherlv_16= '{' ( (lv_registry_17_0= ruleSensorRegistryInfo ) ) otherlv_18= '}' otherlv_19= 'cronjob' otherlv_20= '{' ( (lv_cronjob_21_0= ruleGeneralCronjobInfo ) ) otherlv_22= '}' otherlv_23= '}' )
            // InternalSensorDSL.g:116:3: otherlv_0= '{' otherlv_1= 'name' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= 'infos' otherlv_4= '{' ( (lv_infos_5_0= ruleGeneralSensorInfo ) ) otherlv_6= '}' otherlv_7= 'network' otherlv_8= '{' ( (lv_network_9_0= ruleGeneralNetworkInfo ) ) otherlv_10= '}' otherlv_11= 'gateway' otherlv_12= '{' ( (lv_gateway_13_0= ruleGeneralGatewayInfo ) ) otherlv_14= '}' otherlv_15= 'registry' otherlv_16= '{' ( (lv_registry_17_0= ruleSensorRegistryInfo ) ) otherlv_18= '}' otherlv_19= 'cronjob' otherlv_20= '{' ( (lv_cronjob_21_0= ruleGeneralCronjobInfo ) ) otherlv_22= '}' otherlv_23= '}'
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

            			newLeafNode(otherlv_15, grammarAccess.getSensorAccess().getRegistryKeyword_15());
            		
            otherlv_16=(Token)match(input,11,FOLLOW_14); 

            			newLeafNode(otherlv_16, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_16());
            		
            // InternalSensorDSL.g:243:3: ( (lv_registry_17_0= ruleSensorRegistryInfo ) )
            // InternalSensorDSL.g:244:4: (lv_registry_17_0= ruleSensorRegistryInfo )
            {
            // InternalSensorDSL.g:244:4: (lv_registry_17_0= ruleSensorRegistryInfo )
            // InternalSensorDSL.g:245:5: lv_registry_17_0= ruleSensorRegistryInfo
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getRegistrySensorRegistryInfoParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_8);
            lv_registry_17_0=ruleSensorRegistryInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"registry",
            						lv_registry_17_0,
            						"it.unibo.sensor.dsl.SensorDSL.SensorRegistryInfo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_18, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_19=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_19, grammarAccess.getSensorAccess().getCronjobKeyword_19());
            		
            otherlv_20=(Token)match(input,11,FOLLOW_16); 

            			newLeafNode(otherlv_20, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_20());
            		
            // InternalSensorDSL.g:274:3: ( (lv_cronjob_21_0= ruleGeneralCronjobInfo ) )
            // InternalSensorDSL.g:275:4: (lv_cronjob_21_0= ruleGeneralCronjobInfo )
            {
            // InternalSensorDSL.g:275:4: (lv_cronjob_21_0= ruleGeneralCronjobInfo )
            // InternalSensorDSL.g:276:5: lv_cronjob_21_0= ruleGeneralCronjobInfo
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getCronjobGeneralCronjobInfoParserRuleCall_21_0());
            				
            pushFollow(FOLLOW_8);
            lv_cronjob_21_0=ruleGeneralCronjobInfo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"cronjob",
            						lv_cronjob_21_0,
            						"it.unibo.sensor.dsl.SensorDSL.GeneralCronjobInfo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_22=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_22, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_22());
            		
            otherlv_23=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_23());
            		

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
    // InternalSensorDSL.g:305:1: entryRuleGeneralNetworkInfo returns [EObject current=null] : iv_ruleGeneralNetworkInfo= ruleGeneralNetworkInfo EOF ;
    public final EObject entryRuleGeneralNetworkInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralNetworkInfo = null;


        try {
            // InternalSensorDSL.g:305:59: (iv_ruleGeneralNetworkInfo= ruleGeneralNetworkInfo EOF )
            // InternalSensorDSL.g:306:2: iv_ruleGeneralNetworkInfo= ruleGeneralNetworkInfo EOF
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
    // InternalSensorDSL.g:312:1: ruleGeneralNetworkInfo returns [EObject current=null] : (otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleGeneralNetworkInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_port_1_0=null;
        Token otherlv_2=null;
        Token lv_ip_3_0=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:318:2: ( (otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) ) ) )
            // InternalSensorDSL.g:319:2: (otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) ) )
            {
            // InternalSensorDSL.g:319:2: (otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) ) )
            // InternalSensorDSL.g:320:3: otherlv_0= 'port' ( (lv_port_1_0= RULE_INT ) ) otherlv_2= 'ip' ( (lv_ip_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralNetworkInfoAccess().getPortKeyword_0());
            		
            // InternalSensorDSL.g:324:3: ( (lv_port_1_0= RULE_INT ) )
            // InternalSensorDSL.g:325:4: (lv_port_1_0= RULE_INT )
            {
            // InternalSensorDSL.g:325:4: (lv_port_1_0= RULE_INT )
            // InternalSensorDSL.g:326:5: lv_port_1_0= RULE_INT
            {
            lv_port_1_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralNetworkInfoAccess().getIpKeyword_2());
            		
            // InternalSensorDSL.g:346:3: ( (lv_ip_3_0= RULE_STRING ) )
            // InternalSensorDSL.g:347:4: (lv_ip_3_0= RULE_STRING )
            {
            // InternalSensorDSL.g:347:4: (lv_ip_3_0= RULE_STRING )
            // InternalSensorDSL.g:348:5: lv_ip_3_0= RULE_STRING
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
    // InternalSensorDSL.g:368:1: entryRuleGeneralSensorInfo returns [EObject current=null] : iv_ruleGeneralSensorInfo= ruleGeneralSensorInfo EOF ;
    public final EObject entryRuleGeneralSensorInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralSensorInfo = null;


        try {
            // InternalSensorDSL.g:368:58: (iv_ruleGeneralSensorInfo= ruleGeneralSensorInfo EOF )
            // InternalSensorDSL.g:369:2: iv_ruleGeneralSensorInfo= ruleGeneralSensorInfo EOF
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
    // InternalSensorDSL.g:375:1: ruleGeneralSensorInfo returns [EObject current=null] : (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']' ) ;
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
            // InternalSensorDSL.g:381:2: ( (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']' ) )
            // InternalSensorDSL.g:382:2: (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']' )
            {
            // InternalSensorDSL.g:382:2: (otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']' )
            // InternalSensorDSL.g:383:3: otherlv_0= 'description' ( (lv_description_1_0= RULE_STRING ) ) otherlv_2= 'type' ( (lv_type_3_0= ruleTYPES ) ) otherlv_4= 'queries' otherlv_5= '[' ( (lv_query_6_0= ruleQuery ) )* otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralSensorInfoAccess().getDescriptionKeyword_0());
            		
            // InternalSensorDSL.g:387:3: ( (lv_description_1_0= RULE_STRING ) )
            // InternalSensorDSL.g:388:4: (lv_description_1_0= RULE_STRING )
            {
            // InternalSensorDSL.g:388:4: (lv_description_1_0= RULE_STRING )
            // InternalSensorDSL.g:389:5: lv_description_1_0= RULE_STRING
            {
            lv_description_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralSensorInfoAccess().getTypeKeyword_2());
            		
            // InternalSensorDSL.g:409:3: ( (lv_type_3_0= ruleTYPES ) )
            // InternalSensorDSL.g:410:4: (lv_type_3_0= ruleTYPES )
            {
            // InternalSensorDSL.g:410:4: (lv_type_3_0= ruleTYPES )
            // InternalSensorDSL.g:411:5: lv_type_3_0= ruleTYPES
            {

            					newCompositeNode(grammarAccess.getGeneralSensorInfoAccess().getTypeTYPESEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_4=(Token)match(input,23,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralSensorInfoAccess().getQueriesKeyword_4());
            		
            otherlv_5=(Token)match(input,24,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getGeneralSensorInfoAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalSensorDSL.g:436:3: ( (lv_query_6_0= ruleQuery ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==40) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSensorDSL.g:437:4: (lv_query_6_0= ruleQuery )
            	    {
            	    // InternalSensorDSL.g:437:4: (lv_query_6_0= ruleQuery )
            	    // InternalSensorDSL.g:438:5: lv_query_6_0= ruleQuery
            	    {

            	    					newCompositeNode(grammarAccess.getGeneralSensorInfoAccess().getQueryQueryParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_23);
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

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

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
    // InternalSensorDSL.g:463:1: entryRuleGeneralGatewayInfo returns [EObject current=null] : iv_ruleGeneralGatewayInfo= ruleGeneralGatewayInfo EOF ;
    public final EObject entryRuleGeneralGatewayInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralGatewayInfo = null;


        try {
            // InternalSensorDSL.g:463:59: (iv_ruleGeneralGatewayInfo= ruleGeneralGatewayInfo EOF )
            // InternalSensorDSL.g:464:2: iv_ruleGeneralGatewayInfo= ruleGeneralGatewayInfo EOF
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
    // InternalSensorDSL.g:470:1: ruleGeneralGatewayInfo returns [EObject current=null] : (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) otherlv_4= 'registerRoute' ( (lv_register_5_0= RULE_STRING ) ) otherlv_6= 'shutdownRoute' ( (lv_shutdown_7_0= RULE_STRING ) ) otherlv_8= 'detectionRoute' ( (lv_detection_9_0= RULE_STRING ) ) otherlv_10= 'alertRoute' ( (lv_alert_11_0= RULE_STRING ) ) ) ;
    public final EObject ruleGeneralGatewayInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_url_1_0=null;
        Token otherlv_2=null;
        Token lv_port_3_0=null;
        Token otherlv_4=null;
        Token lv_register_5_0=null;
        Token otherlv_6=null;
        Token lv_shutdown_7_0=null;
        Token otherlv_8=null;
        Token lv_detection_9_0=null;
        Token otherlv_10=null;
        Token lv_alert_11_0=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:476:2: ( (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) otherlv_4= 'registerRoute' ( (lv_register_5_0= RULE_STRING ) ) otherlv_6= 'shutdownRoute' ( (lv_shutdown_7_0= RULE_STRING ) ) otherlv_8= 'detectionRoute' ( (lv_detection_9_0= RULE_STRING ) ) otherlv_10= 'alertRoute' ( (lv_alert_11_0= RULE_STRING ) ) ) )
            // InternalSensorDSL.g:477:2: (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) otherlv_4= 'registerRoute' ( (lv_register_5_0= RULE_STRING ) ) otherlv_6= 'shutdownRoute' ( (lv_shutdown_7_0= RULE_STRING ) ) otherlv_8= 'detectionRoute' ( (lv_detection_9_0= RULE_STRING ) ) otherlv_10= 'alertRoute' ( (lv_alert_11_0= RULE_STRING ) ) )
            {
            // InternalSensorDSL.g:477:2: (otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) otherlv_4= 'registerRoute' ( (lv_register_5_0= RULE_STRING ) ) otherlv_6= 'shutdownRoute' ( (lv_shutdown_7_0= RULE_STRING ) ) otherlv_8= 'detectionRoute' ( (lv_detection_9_0= RULE_STRING ) ) otherlv_10= 'alertRoute' ( (lv_alert_11_0= RULE_STRING ) ) )
            // InternalSensorDSL.g:478:3: otherlv_0= 'url' ( (lv_url_1_0= RULE_STRING ) ) otherlv_2= 'port' ( (lv_port_3_0= RULE_INT ) ) otherlv_4= 'registerRoute' ( (lv_register_5_0= RULE_STRING ) ) otherlv_6= 'shutdownRoute' ( (lv_shutdown_7_0= RULE_STRING ) ) otherlv_8= 'detectionRoute' ( (lv_detection_9_0= RULE_STRING ) ) otherlv_10= 'alertRoute' ( (lv_alert_11_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGeneralGatewayInfoAccess().getUrlKeyword_0());
            		
            // InternalSensorDSL.g:482:3: ( (lv_url_1_0= RULE_STRING ) )
            // InternalSensorDSL.g:483:4: (lv_url_1_0= RULE_STRING )
            {
            // InternalSensorDSL.g:483:4: (lv_url_1_0= RULE_STRING )
            // InternalSensorDSL.g:484:5: lv_url_1_0= RULE_STRING
            {
            lv_url_1_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getGeneralGatewayInfoAccess().getPortKeyword_2());
            		
            // InternalSensorDSL.g:504:3: ( (lv_port_3_0= RULE_INT ) )
            // InternalSensorDSL.g:505:4: (lv_port_3_0= RULE_INT )
            {
            // InternalSensorDSL.g:505:4: (lv_port_3_0= RULE_INT )
            // InternalSensorDSL.g:506:5: lv_port_3_0= RULE_INT
            {
            lv_port_3_0=(Token)match(input,RULE_INT,FOLLOW_24); 

            					newLeafNode(lv_port_3_0, grammarAccess.getGeneralGatewayInfoAccess().getPortINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"port",
            						lv_port_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getGeneralGatewayInfoAccess().getRegisterRouteKeyword_4());
            		
            // InternalSensorDSL.g:526:3: ( (lv_register_5_0= RULE_STRING ) )
            // InternalSensorDSL.g:527:4: (lv_register_5_0= RULE_STRING )
            {
            // InternalSensorDSL.g:527:4: (lv_register_5_0= RULE_STRING )
            // InternalSensorDSL.g:528:5: lv_register_5_0= RULE_STRING
            {
            lv_register_5_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_register_5_0, grammarAccess.getGeneralGatewayInfoAccess().getRegisterSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"register",
            						lv_register_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getGeneralGatewayInfoAccess().getShutdownRouteKeyword_6());
            		
            // InternalSensorDSL.g:548:3: ( (lv_shutdown_7_0= RULE_STRING ) )
            // InternalSensorDSL.g:549:4: (lv_shutdown_7_0= RULE_STRING )
            {
            // InternalSensorDSL.g:549:4: (lv_shutdown_7_0= RULE_STRING )
            // InternalSensorDSL.g:550:5: lv_shutdown_7_0= RULE_STRING
            {
            lv_shutdown_7_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            					newLeafNode(lv_shutdown_7_0, grammarAccess.getGeneralGatewayInfoAccess().getShutdownSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"shutdown",
            						lv_shutdown_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getGeneralGatewayInfoAccess().getDetectionRouteKeyword_8());
            		
            // InternalSensorDSL.g:570:3: ( (lv_detection_9_0= RULE_STRING ) )
            // InternalSensorDSL.g:571:4: (lv_detection_9_0= RULE_STRING )
            {
            // InternalSensorDSL.g:571:4: (lv_detection_9_0= RULE_STRING )
            // InternalSensorDSL.g:572:5: lv_detection_9_0= RULE_STRING
            {
            lv_detection_9_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_detection_9_0, grammarAccess.getGeneralGatewayInfoAccess().getDetectionSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"detection",
            						lv_detection_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getGeneralGatewayInfoAccess().getAlertRouteKeyword_10());
            		
            // InternalSensorDSL.g:592:3: ( (lv_alert_11_0= RULE_STRING ) )
            // InternalSensorDSL.g:593:4: (lv_alert_11_0= RULE_STRING )
            {
            // InternalSensorDSL.g:593:4: (lv_alert_11_0= RULE_STRING )
            // InternalSensorDSL.g:594:5: lv_alert_11_0= RULE_STRING
            {
            lv_alert_11_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_alert_11_0, grammarAccess.getGeneralGatewayInfoAccess().getAlertSTRINGTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGeneralGatewayInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"alert",
            						lv_alert_11_0,
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


    // $ANTLR start "entryRuleSensorRegistryInfo"
    // InternalSensorDSL.g:614:1: entryRuleSensorRegistryInfo returns [EObject current=null] : iv_ruleSensorRegistryInfo= ruleSensorRegistryInfo EOF ;
    public final EObject entryRuleSensorRegistryInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorRegistryInfo = null;


        try {
            // InternalSensorDSL.g:614:59: (iv_ruleSensorRegistryInfo= ruleSensorRegistryInfo EOF )
            // InternalSensorDSL.g:615:2: iv_ruleSensorRegistryInfo= ruleSensorRegistryInfo EOF
            {
             newCompositeNode(grammarAccess.getSensorRegistryInfoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorRegistryInfo=ruleSensorRegistryInfo();

            state._fsp--;

             current =iv_ruleSensorRegistryInfo; 
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
    // $ANTLR end "entryRuleSensorRegistryInfo"


    // $ANTLR start "ruleSensorRegistryInfo"
    // InternalSensorDSL.g:621:1: ruleSensorRegistryInfo returns [EObject current=null] : (otherlv_0= 'registryUrl' ( (lv_registryUrl_1_0= RULE_STRING ) ) otherlv_2= 'key' ( (lv_apiKey_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleSensorRegistryInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_registryUrl_1_0=null;
        Token otherlv_2=null;
        Token lv_apiKey_3_0=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:627:2: ( (otherlv_0= 'registryUrl' ( (lv_registryUrl_1_0= RULE_STRING ) ) otherlv_2= 'key' ( (lv_apiKey_3_0= RULE_STRING ) ) ) )
            // InternalSensorDSL.g:628:2: (otherlv_0= 'registryUrl' ( (lv_registryUrl_1_0= RULE_STRING ) ) otherlv_2= 'key' ( (lv_apiKey_3_0= RULE_STRING ) ) )
            {
            // InternalSensorDSL.g:628:2: (otherlv_0= 'registryUrl' ( (lv_registryUrl_1_0= RULE_STRING ) ) otherlv_2= 'key' ( (lv_apiKey_3_0= RULE_STRING ) ) )
            // InternalSensorDSL.g:629:3: otherlv_0= 'registryUrl' ( (lv_registryUrl_1_0= RULE_STRING ) ) otherlv_2= 'key' ( (lv_apiKey_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorRegistryInfoAccess().getRegistryUrlKeyword_0());
            		
            // InternalSensorDSL.g:633:3: ( (lv_registryUrl_1_0= RULE_STRING ) )
            // InternalSensorDSL.g:634:4: (lv_registryUrl_1_0= RULE_STRING )
            {
            // InternalSensorDSL.g:634:4: (lv_registryUrl_1_0= RULE_STRING )
            // InternalSensorDSL.g:635:5: lv_registryUrl_1_0= RULE_STRING
            {
            lv_registryUrl_1_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            					newLeafNode(lv_registryUrl_1_0, grammarAccess.getSensorRegistryInfoAccess().getRegistryUrlSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRegistryInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"registryUrl",
            						lv_registryUrl_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorRegistryInfoAccess().getKeyKeyword_2());
            		
            // InternalSensorDSL.g:655:3: ( (lv_apiKey_3_0= RULE_STRING ) )
            // InternalSensorDSL.g:656:4: (lv_apiKey_3_0= RULE_STRING )
            {
            // InternalSensorDSL.g:656:4: (lv_apiKey_3_0= RULE_STRING )
            // InternalSensorDSL.g:657:5: lv_apiKey_3_0= RULE_STRING
            {
            lv_apiKey_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_apiKey_3_0, grammarAccess.getSensorRegistryInfoAccess().getApiKeySTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRegistryInfoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"apiKey",
            						lv_apiKey_3_0,
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
    // $ANTLR end "ruleSensorRegistryInfo"


    // $ANTLR start "entryRuleGeneralCronjobInfo"
    // InternalSensorDSL.g:677:1: entryRuleGeneralCronjobInfo returns [EObject current=null] : iv_ruleGeneralCronjobInfo= ruleGeneralCronjobInfo EOF ;
    public final EObject entryRuleGeneralCronjobInfo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneralCronjobInfo = null;


        try {
            // InternalSensorDSL.g:677:59: (iv_ruleGeneralCronjobInfo= ruleGeneralCronjobInfo EOF )
            // InternalSensorDSL.g:678:2: iv_ruleGeneralCronjobInfo= ruleGeneralCronjobInfo EOF
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
    // InternalSensorDSL.g:684:1: ruleGeneralCronjobInfo returns [EObject current=null] : ( ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( ( ( (lv_type_6_0= 'at' ) ) ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | ( ( (lv_type_10_0= 'every' ) ) ( (lv_value_11_0= RULE_INT ) ) ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) ) ) ) ) ;
    public final EObject ruleGeneralCronjobInfo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_type_6_0=null;
        Token lv_hour_7_0=null;
        Token otherlv_8=null;
        Token lv_minute_9_0=null;
        Token lv_type_10_0=null;
        Token lv_value_11_0=null;
        Token lv_unit_12_1=null;
        Token lv_unit_12_2=null;
        Enumerator lv_from_1_0 = null;

        Enumerator lv_to_3_0 = null;

        Enumerator lv_day_5_0 = null;



        	enterRule();

        try {
            // InternalSensorDSL.g:690:2: ( ( ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( ( ( (lv_type_6_0= 'at' ) ) ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | ( ( (lv_type_10_0= 'every' ) ) ( (lv_value_11_0= RULE_INT ) ) ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) ) ) ) ) )
            // InternalSensorDSL.g:691:2: ( ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( ( ( (lv_type_6_0= 'at' ) ) ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | ( ( (lv_type_10_0= 'every' ) ) ( (lv_value_11_0= RULE_INT ) ) ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) ) ) ) )
            {
            // InternalSensorDSL.g:691:2: ( ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( ( ( (lv_type_6_0= 'at' ) ) ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | ( ( (lv_type_10_0= 'every' ) ) ( (lv_value_11_0= RULE_INT ) ) ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) ) ) ) )
            // InternalSensorDSL.g:692:3: ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) ) ( ( ( (lv_type_6_0= 'at' ) ) ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | ( ( (lv_type_10_0= 'every' ) ) ( (lv_value_11_0= RULE_INT ) ) ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) ) ) )
            {
            // InternalSensorDSL.g:692:3: ( (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) ) | (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==33) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSensorDSL.g:693:4: (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) )
                    {
                    // InternalSensorDSL.g:693:4: (otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) ) )
                    // InternalSensorDSL.g:694:5: otherlv_0= 'from' ( (lv_from_1_0= ruleDAY ) ) otherlv_2= 'to' ( (lv_to_3_0= ruleDAY ) )
                    {
                    otherlv_0=(Token)match(input,33,FOLLOW_29); 

                    					newLeafNode(otherlv_0, grammarAccess.getGeneralCronjobInfoAccess().getFromKeyword_0_0_0());
                    				
                    // InternalSensorDSL.g:698:5: ( (lv_from_1_0= ruleDAY ) )
                    // InternalSensorDSL.g:699:6: (lv_from_1_0= ruleDAY )
                    {
                    // InternalSensorDSL.g:699:6: (lv_from_1_0= ruleDAY )
                    // InternalSensorDSL.g:700:7: lv_from_1_0= ruleDAY
                    {

                    							newCompositeNode(grammarAccess.getGeneralCronjobInfoAccess().getFromDAYEnumRuleCall_0_0_1_0());
                    						
                    pushFollow(FOLLOW_30);
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

                    otherlv_2=(Token)match(input,34,FOLLOW_29); 

                    					newLeafNode(otherlv_2, grammarAccess.getGeneralCronjobInfoAccess().getToKeyword_0_0_2());
                    				
                    // InternalSensorDSL.g:721:5: ( (lv_to_3_0= ruleDAY ) )
                    // InternalSensorDSL.g:722:6: (lv_to_3_0= ruleDAY )
                    {
                    // InternalSensorDSL.g:722:6: (lv_to_3_0= ruleDAY )
                    // InternalSensorDSL.g:723:7: lv_to_3_0= ruleDAY
                    {

                    							newCompositeNode(grammarAccess.getGeneralCronjobInfoAccess().getToDAYEnumRuleCall_0_0_3_0());
                    						
                    pushFollow(FOLLOW_31);
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
                    // InternalSensorDSL.g:742:4: (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) )
                    {
                    // InternalSensorDSL.g:742:4: (otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) ) )
                    // InternalSensorDSL.g:743:5: otherlv_4= 'every' ( (lv_day_5_0= ruleDAY ) )
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_29); 

                    					newLeafNode(otherlv_4, grammarAccess.getGeneralCronjobInfoAccess().getEveryKeyword_0_1_0());
                    				
                    // InternalSensorDSL.g:747:5: ( (lv_day_5_0= ruleDAY ) )
                    // InternalSensorDSL.g:748:6: (lv_day_5_0= ruleDAY )
                    {
                    // InternalSensorDSL.g:748:6: (lv_day_5_0= ruleDAY )
                    // InternalSensorDSL.g:749:7: lv_day_5_0= ruleDAY
                    {

                    							newCompositeNode(grammarAccess.getGeneralCronjobInfoAccess().getDayDAYEnumRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_31);
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

            // InternalSensorDSL.g:768:3: ( ( ( (lv_type_6_0= 'at' ) ) ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) ) | ( ( (lv_type_10_0= 'every' ) ) ( (lv_value_11_0= RULE_INT ) ) ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==36) ) {
                alt4=1;
            }
            else if ( (LA4_0==35) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSensorDSL.g:769:4: ( ( (lv_type_6_0= 'at' ) ) ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) )
                    {
                    // InternalSensorDSL.g:769:4: ( ( (lv_type_6_0= 'at' ) ) ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) ) )
                    // InternalSensorDSL.g:770:5: ( (lv_type_6_0= 'at' ) ) ( (lv_hour_7_0= RULE_INT ) ) otherlv_8= ':' ( (lv_minute_9_0= RULE_INT ) )
                    {
                    // InternalSensorDSL.g:770:5: ( (lv_type_6_0= 'at' ) )
                    // InternalSensorDSL.g:771:6: (lv_type_6_0= 'at' )
                    {
                    // InternalSensorDSL.g:771:6: (lv_type_6_0= 'at' )
                    // InternalSensorDSL.g:772:7: lv_type_6_0= 'at'
                    {
                    lv_type_6_0=(Token)match(input,36,FOLLOW_17); 

                    							newLeafNode(lv_type_6_0, grammarAccess.getGeneralCronjobInfoAccess().getTypeAtKeyword_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralCronjobInfoRule());
                    							}
                    							setWithLastConsumed(current, "type", lv_type_6_0, "at");
                    						

                    }


                    }

                    // InternalSensorDSL.g:784:5: ( (lv_hour_7_0= RULE_INT ) )
                    // InternalSensorDSL.g:785:6: (lv_hour_7_0= RULE_INT )
                    {
                    // InternalSensorDSL.g:785:6: (lv_hour_7_0= RULE_INT )
                    // InternalSensorDSL.g:786:7: lv_hour_7_0= RULE_INT
                    {
                    lv_hour_7_0=(Token)match(input,RULE_INT,FOLLOW_32); 

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

                    otherlv_8=(Token)match(input,37,FOLLOW_17); 

                    					newLeafNode(otherlv_8, grammarAccess.getGeneralCronjobInfoAccess().getColonKeyword_1_0_2());
                    				
                    // InternalSensorDSL.g:806:5: ( (lv_minute_9_0= RULE_INT ) )
                    // InternalSensorDSL.g:807:6: (lv_minute_9_0= RULE_INT )
                    {
                    // InternalSensorDSL.g:807:6: (lv_minute_9_0= RULE_INT )
                    // InternalSensorDSL.g:808:7: lv_minute_9_0= RULE_INT
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
                    // InternalSensorDSL.g:826:4: ( ( (lv_type_10_0= 'every' ) ) ( (lv_value_11_0= RULE_INT ) ) ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) ) )
                    {
                    // InternalSensorDSL.g:826:4: ( ( (lv_type_10_0= 'every' ) ) ( (lv_value_11_0= RULE_INT ) ) ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) ) )
                    // InternalSensorDSL.g:827:5: ( (lv_type_10_0= 'every' ) ) ( (lv_value_11_0= RULE_INT ) ) ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) )
                    {
                    // InternalSensorDSL.g:827:5: ( (lv_type_10_0= 'every' ) )
                    // InternalSensorDSL.g:828:6: (lv_type_10_0= 'every' )
                    {
                    // InternalSensorDSL.g:828:6: (lv_type_10_0= 'every' )
                    // InternalSensorDSL.g:829:7: lv_type_10_0= 'every'
                    {
                    lv_type_10_0=(Token)match(input,35,FOLLOW_17); 

                    							newLeafNode(lv_type_10_0, grammarAccess.getGeneralCronjobInfoAccess().getTypeEveryKeyword_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getGeneralCronjobInfoRule());
                    							}
                    							setWithLastConsumed(current, "type", lv_type_10_0, "every");
                    						

                    }


                    }

                    // InternalSensorDSL.g:841:5: ( (lv_value_11_0= RULE_INT ) )
                    // InternalSensorDSL.g:842:6: (lv_value_11_0= RULE_INT )
                    {
                    // InternalSensorDSL.g:842:6: (lv_value_11_0= RULE_INT )
                    // InternalSensorDSL.g:843:7: lv_value_11_0= RULE_INT
                    {
                    lv_value_11_0=(Token)match(input,RULE_INT,FOLLOW_33); 

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

                    // InternalSensorDSL.g:859:5: ( ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) ) )
                    // InternalSensorDSL.g:860:6: ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) )
                    {
                    // InternalSensorDSL.g:860:6: ( (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' ) )
                    // InternalSensorDSL.g:861:7: (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' )
                    {
                    // InternalSensorDSL.g:861:7: (lv_unit_12_1= 'hours' | lv_unit_12_2= 'minutes' )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==38) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==39) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalSensorDSL.g:862:8: lv_unit_12_1= 'hours'
                            {
                            lv_unit_12_1=(Token)match(input,38,FOLLOW_2); 

                            								newLeafNode(lv_unit_12_1, grammarAccess.getGeneralCronjobInfoAccess().getUnitHoursKeyword_1_1_2_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getGeneralCronjobInfoRule());
                            								}
                            								setWithLastConsumed(current, "unit", lv_unit_12_1, null);
                            							

                            }
                            break;
                        case 2 :
                            // InternalSensorDSL.g:873:8: lv_unit_12_2= 'minutes'
                            {
                            lv_unit_12_2=(Token)match(input,39,FOLLOW_2); 

                            								newLeafNode(lv_unit_12_2, grammarAccess.getGeneralCronjobInfoAccess().getUnitMinutesKeyword_1_1_2_0_1());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getGeneralCronjobInfoRule());
                            								}
                            								setWithLastConsumed(current, "unit", lv_unit_12_2, null);
                            							

                            }
                            break;

                    }


                    }


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
    // InternalSensorDSL.g:892:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalSensorDSL.g:892:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalSensorDSL.g:893:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalSensorDSL.g:899:1: ruleQuery returns [EObject current=null] : (otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_value_4_0=null;
        Enumerator lv_comparator_3_0 = null;



        	enterRule();

        try {
            // InternalSensorDSL.g:905:2: ( (otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) ) ) )
            // InternalSensorDSL.g:906:2: (otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) ) )
            {
            // InternalSensorDSL.g:906:2: (otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) ) )
            // InternalSensorDSL.g:907:3: otherlv_0= '-' otherlv_1= 'threshold' ( (lv_name_2_0= RULE_STRING ) ) ( (lv_comparator_3_0= ruleComparator ) ) ( (lv_value_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getQueryAccess().getHyphenMinusKeyword_0());
            		
            otherlv_1=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getThresholdKeyword_1());
            		
            // InternalSensorDSL.g:915:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalSensorDSL.g:916:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalSensorDSL.g:916:4: (lv_name_2_0= RULE_STRING )
            // InternalSensorDSL.g:917:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_35); 

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

            // InternalSensorDSL.g:933:3: ( (lv_comparator_3_0= ruleComparator ) )
            // InternalSensorDSL.g:934:4: (lv_comparator_3_0= ruleComparator )
            {
            // InternalSensorDSL.g:934:4: (lv_comparator_3_0= ruleComparator )
            // InternalSensorDSL.g:935:5: lv_comparator_3_0= ruleComparator
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

            // InternalSensorDSL.g:952:3: ( (lv_value_4_0= RULE_STRING ) )
            // InternalSensorDSL.g:953:4: (lv_value_4_0= RULE_STRING )
            {
            // InternalSensorDSL.g:953:4: (lv_value_4_0= RULE_STRING )
            // InternalSensorDSL.g:954:5: lv_value_4_0= RULE_STRING
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
    // InternalSensorDSL.g:974:1: ruleDAY returns [Enumerator current=null] : ( (enumLiteral_0= 'monday' ) | (enumLiteral_1= 'tuesday' ) | (enumLiteral_2= 'wednesday' ) | (enumLiteral_3= 'thursday' ) | (enumLiteral_4= 'friday' ) | (enumLiteral_5= 'saturday' ) | (enumLiteral_6= 'sunday' ) ) ;
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
            // InternalSensorDSL.g:980:2: ( ( (enumLiteral_0= 'monday' ) | (enumLiteral_1= 'tuesday' ) | (enumLiteral_2= 'wednesday' ) | (enumLiteral_3= 'thursday' ) | (enumLiteral_4= 'friday' ) | (enumLiteral_5= 'saturday' ) | (enumLiteral_6= 'sunday' ) ) )
            // InternalSensorDSL.g:981:2: ( (enumLiteral_0= 'monday' ) | (enumLiteral_1= 'tuesday' ) | (enumLiteral_2= 'wednesday' ) | (enumLiteral_3= 'thursday' ) | (enumLiteral_4= 'friday' ) | (enumLiteral_5= 'saturday' ) | (enumLiteral_6= 'sunday' ) )
            {
            // InternalSensorDSL.g:981:2: ( (enumLiteral_0= 'monday' ) | (enumLiteral_1= 'tuesday' ) | (enumLiteral_2= 'wednesday' ) | (enumLiteral_3= 'thursday' ) | (enumLiteral_4= 'friday' ) | (enumLiteral_5= 'saturday' ) | (enumLiteral_6= 'sunday' ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt5=1;
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            case 44:
                {
                alt5=3;
                }
                break;
            case 45:
                {
                alt5=4;
                }
                break;
            case 46:
                {
                alt5=5;
                }
                break;
            case 47:
                {
                alt5=6;
                }
                break;
            case 48:
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
                    // InternalSensorDSL.g:982:3: (enumLiteral_0= 'monday' )
                    {
                    // InternalSensorDSL.g:982:3: (enumLiteral_0= 'monday' )
                    // InternalSensorDSL.g:983:4: enumLiteral_0= 'monday'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getMondayEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDAYAccess().getMondayEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensorDSL.g:990:3: (enumLiteral_1= 'tuesday' )
                    {
                    // InternalSensorDSL.g:990:3: (enumLiteral_1= 'tuesday' )
                    // InternalSensorDSL.g:991:4: enumLiteral_1= 'tuesday'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getTuesdayEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDAYAccess().getTuesdayEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSensorDSL.g:998:3: (enumLiteral_2= 'wednesday' )
                    {
                    // InternalSensorDSL.g:998:3: (enumLiteral_2= 'wednesday' )
                    // InternalSensorDSL.g:999:4: enumLiteral_2= 'wednesday'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getWednesdayEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDAYAccess().getWednesdayEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSensorDSL.g:1006:3: (enumLiteral_3= 'thursday' )
                    {
                    // InternalSensorDSL.g:1006:3: (enumLiteral_3= 'thursday' )
                    // InternalSensorDSL.g:1007:4: enumLiteral_3= 'thursday'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getThursdayEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDAYAccess().getThursdayEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSensorDSL.g:1014:3: (enumLiteral_4= 'friday' )
                    {
                    // InternalSensorDSL.g:1014:3: (enumLiteral_4= 'friday' )
                    // InternalSensorDSL.g:1015:4: enumLiteral_4= 'friday'
                    {
                    enumLiteral_4=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getFridayEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDAYAccess().getFridayEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalSensorDSL.g:1022:3: (enumLiteral_5= 'saturday' )
                    {
                    // InternalSensorDSL.g:1022:3: (enumLiteral_5= 'saturday' )
                    // InternalSensorDSL.g:1023:4: enumLiteral_5= 'saturday'
                    {
                    enumLiteral_5=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDAYAccess().getSaturdayEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDAYAccess().getSaturdayEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalSensorDSL.g:1030:3: (enumLiteral_6= 'sunday' )
                    {
                    // InternalSensorDSL.g:1030:3: (enumLiteral_6= 'sunday' )
                    // InternalSensorDSL.g:1031:4: enumLiteral_6= 'sunday'
                    {
                    enumLiteral_6=(Token)match(input,48,FOLLOW_2); 

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
    // InternalSensorDSL.g:1041:1: ruleComparator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) ) ;
    public final Enumerator ruleComparator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:1047:2: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) ) )
            // InternalSensorDSL.g:1048:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) )
            {
            // InternalSensorDSL.g:1048:2: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '<' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==49) ) {
                alt6=1;
            }
            else if ( (LA6_0==50) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSensorDSL.g:1049:3: (enumLiteral_0= '>' )
                    {
                    // InternalSensorDSL.g:1049:3: (enumLiteral_0= '>' )
                    // InternalSensorDSL.g:1050:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getComparatorAccess().getGREATEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparatorAccess().getGREATEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensorDSL.g:1057:3: (enumLiteral_1= '<' )
                    {
                    // InternalSensorDSL.g:1057:3: (enumLiteral_1= '<' )
                    // InternalSensorDSL.g:1058:4: enumLiteral_1= '<'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

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
    // InternalSensorDSL.g:1068:1: ruleTYPES returns [Enumerator current=null] : ( (enumLiteral_0= 'idro_level' ) | (enumLiteral_1= 'temp' ) | (enumLiteral_2= 'humidity' ) | (enumLiteral_3= 'wind' ) | (enumLiteral_4= 'rain' ) ) ;
    public final Enumerator ruleTYPES() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSensorDSL.g:1074:2: ( ( (enumLiteral_0= 'idro_level' ) | (enumLiteral_1= 'temp' ) | (enumLiteral_2= 'humidity' ) | (enumLiteral_3= 'wind' ) | (enumLiteral_4= 'rain' ) ) )
            // InternalSensorDSL.g:1075:2: ( (enumLiteral_0= 'idro_level' ) | (enumLiteral_1= 'temp' ) | (enumLiteral_2= 'humidity' ) | (enumLiteral_3= 'wind' ) | (enumLiteral_4= 'rain' ) )
            {
            // InternalSensorDSL.g:1075:2: ( (enumLiteral_0= 'idro_level' ) | (enumLiteral_1= 'temp' ) | (enumLiteral_2= 'humidity' ) | (enumLiteral_3= 'wind' ) | (enumLiteral_4= 'rain' ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt7=1;
                }
                break;
            case 52:
                {
                alt7=2;
                }
                break;
            case 53:
                {
                alt7=3;
                }
                break;
            case 54:
                {
                alt7=4;
                }
                break;
            case 55:
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
                    // InternalSensorDSL.g:1076:3: (enumLiteral_0= 'idro_level' )
                    {
                    // InternalSensorDSL.g:1076:3: (enumLiteral_0= 'idro_level' )
                    // InternalSensorDSL.g:1077:4: enumLiteral_0= 'idro_level'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getTYPESAccess().getHydroEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTYPESAccess().getHydroEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSensorDSL.g:1084:3: (enumLiteral_1= 'temp' )
                    {
                    // InternalSensorDSL.g:1084:3: (enumLiteral_1= 'temp' )
                    // InternalSensorDSL.g:1085:4: enumLiteral_1= 'temp'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getTYPESAccess().getTemperatureEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTYPESAccess().getTemperatureEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSensorDSL.g:1092:3: (enumLiteral_2= 'humidity' )
                    {
                    // InternalSensorDSL.g:1092:3: (enumLiteral_2= 'humidity' )
                    // InternalSensorDSL.g:1093:4: enumLiteral_2= 'humidity'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTYPESAccess().getHumidityEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTYPESAccess().getHumidityEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSensorDSL.g:1100:3: (enumLiteral_3= 'wind' )
                    {
                    // InternalSensorDSL.g:1100:3: (enumLiteral_3= 'wind' )
                    // InternalSensorDSL.g:1101:4: enumLiteral_3= 'wind'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTYPESAccess().getWindEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTYPESAccess().getWindEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSensorDSL.g:1108:3: (enumLiteral_4= 'rain' )
                    {
                    // InternalSensorDSL.g:1108:3: (enumLiteral_4= 'rain' )
                    // InternalSensorDSL.g:1109:4: enumLiteral_4= 'rain'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_2); 

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00F8000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001FC0000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0006000000000000L});

}