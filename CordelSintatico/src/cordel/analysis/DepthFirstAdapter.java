/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.analysis;

import java.util.*;
import cordel.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPAPrograma().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAArProgramaAPrograma(AArProgramaAPrograma node)
    {
        defaultIn(node);
    }

    public void outAArProgramaAPrograma(AArProgramaAPrograma node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArProgramaAPrograma(AArProgramaAPrograma node)
    {
        inAArProgramaAPrograma(node);
        {
            List<PADecVariavel> copy = new ArrayList<PADecVariavel>(node.getDeclaraVar());
            for(PADecVariavel e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PADecFuncao> copy = new ArrayList<PADecFuncao>(node.getDeclaraFunc());
            for(PADecFuncao e : copy)
            {
                e.apply(this);
            }
        }
        outAArProgramaAPrograma(node);
    }

    public void inAArDecVariavelADecVariavel(AArDecVariavelADecVariavel node)
    {
        defaultIn(node);
    }

    public void outAArDecVariavelADecVariavel(AArDecVariavelADecVariavel node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArDecVariavelADecVariavel(AArDecVariavelADecVariavel node)
    {
        inAArDecVariavelADecVariavel(node);
        if(node.getATipo() != null)
        {
            node.getATipo().apply(this);
        }
        {
            List<PAExp> copy = new ArrayList<PAExp>(node.getIdentificadores());
            for(PAExp e : copy)
            {
                e.apply(this);
            }
        }
        outAArDecVariavelADecVariavel(node);
    }

    public void inAArDecFuncaoADecFuncao(AArDecFuncaoADecFuncao node)
    {
        defaultIn(node);
    }

    public void outAArDecFuncaoADecFuncao(AArDecFuncaoADecFuncao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArDecFuncaoADecFuncao(AArDecFuncaoADecFuncao node)
    {
        inAArDecFuncaoADecFuncao(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        {
            List<PAParametros> copy = new ArrayList<PAParametros>(node.getMid());
            for(PAParametros e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArDecFuncaoADecFuncao(node);
    }

    public void inAArParametrosAParametros(AArParametrosAParametros node)
    {
        defaultIn(node);
    }

    public void outAArParametrosAParametros(AArParametrosAParametros node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArParametrosAParametros(AArParametrosAParametros node)
    {
        inAArParametrosAParametros(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArParametrosAParametros(node);
    }

    public void inAArBlocoABloco(AArBlocoABloco node)
    {
        defaultIn(node);
    }

    public void outAArBlocoABloco(AArBlocoABloco node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArBlocoABloco(AArBlocoABloco node)
    {
        inAArBlocoABloco(node);
        {
            List<PADecVariavel> copy = new ArrayList<PADecVariavel>(node.getDecVariavel());
            for(PADecVariavel e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PAComando> copy = new ArrayList<PAComando>(node.getComando());
            for(PAComando e : copy)
            {
                e.apply(this);
            }
        }
        outAArBlocoABloco(node);
    }

    public void inAArInteiroATipo(AArInteiroATipo node)
    {
        defaultIn(node);
    }

    public void outAArInteiroATipo(AArInteiroATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArInteiroATipo(AArInteiroATipo node)
    {
        inAArInteiroATipo(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAArInteiroATipo(node);
    }

    public void inAArCaractereATipo(AArCaractereATipo node)
    {
        defaultIn(node);
    }

    public void outAArCaractereATipo(AArCaractereATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArCaractereATipo(AArCaractereATipo node)
    {
        inAArCaractereATipo(node);
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outAArCaractereATipo(node);
    }

    public void inAArFloatATipo(AArFloatATipo node)
    {
        defaultIn(node);
    }

    public void outAArFloatATipo(AArFloatATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArFloatATipo(AArFloatATipo node)
    {
        inAArFloatATipo(node);
        if(node.getFloat() != null)
        {
            node.getFloat().apply(this);
        }
        outAArFloatATipo(node);
    }

    public void inAArBoolATipo(AArBoolATipo node)
    {
        defaultIn(node);
    }

    public void outAArBoolATipo(AArBoolATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArBoolATipo(AArBoolATipo node)
    {
        inAArBoolATipo(node);
        if(node.getBool() != null)
        {
            node.getBool().apply(this);
        }
        outAArBoolATipo(node);
    }

    public void inAANadaATipo(AANadaATipo node)
    {
        defaultIn(node);
    }

    public void outAANadaATipo(AANadaATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAANadaATipo(AANadaATipo node)
    {
        inAANadaATipo(node);
        if(node.getNada() != null)
        {
            node.getNada().apply(this);
        }
        outAANadaATipo(node);
    }

    public void inAArVetorATipo(AArVetorATipo node)
    {
        defaultIn(node);
    }

    public void outAArVetorATipo(AArVetorATipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArVetorATipo(AArVetorATipo node)
    {
        inAArVetorATipo(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArVetorATipo(node);
    }

    public void inAAIgualAExp(AAIgualAExp node)
    {
        defaultIn(node);
    }

    public void outAAIgualAExp(AAIgualAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIgualAExp(AAIgualAExp node)
    {
        inAAIgualAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAIgualAExp(node);
    }

    public void inAAMenorIgualAExp(AAMenorIgualAExp node)
    {
        defaultIn(node);
    }

    public void outAAMenorIgualAExp(AAMenorIgualAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMenorIgualAExp(AAMenorIgualAExp node)
    {
        inAAMenorIgualAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAMenorIgualAExp(node);
    }

    public void inAAMaiorIgualAExp(AAMaiorIgualAExp node)
    {
        defaultIn(node);
    }

    public void outAAMaiorIgualAExp(AAMaiorIgualAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMaiorIgualAExp(AAMaiorIgualAExp node)
    {
        inAAMaiorIgualAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAMaiorIgualAExp(node);
    }

    public void inAAMenorAExp(AAMenorAExp node)
    {
        defaultIn(node);
    }

    public void outAAMenorAExp(AAMenorAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMenorAExp(AAMenorAExp node)
    {
        inAAMenorAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAMenorAExp(node);
    }

    public void inAAMaiorAExp(AAMaiorAExp node)
    {
        defaultIn(node);
    }

    public void outAAMaiorAExp(AAMaiorAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMaiorAExp(AAMaiorAExp node)
    {
        inAAMaiorAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAMaiorAExp(node);
    }

    public void inAANegacaoAExp(AANegacaoAExp node)
    {
        defaultIn(node);
    }

    public void outAANegacaoAExp(AANegacaoAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAANegacaoAExp(AANegacaoAExp node)
    {
        inAANegacaoAExp(node);
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        outAANegacaoAExp(node);
    }

    public void inAAAndAExp(AAAndAExp node)
    {
        defaultIn(node);
    }

    public void outAAAndAExp(AAAndAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAAndAExp(AAAndAExp node)
    {
        inAAAndAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAAndAExp(node);
    }

    public void inAAOrAExp(AAOrAExp node)
    {
        defaultIn(node);
    }

    public void outAAOrAExp(AAOrAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAOrAExp(AAOrAExp node)
    {
        inAAOrAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAOrAExp(node);
    }

    public void inAASomaAExp(AASomaAExp node)
    {
        defaultIn(node);
    }

    public void outAASomaAExp(AASomaAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAASomaAExp(AASomaAExp node)
    {
        inAASomaAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAASomaAExp(node);
    }

    public void inAASubAExp(AASubAExp node)
    {
        defaultIn(node);
    }

    public void outAASubAExp(AASubAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAASubAExp(AASubAExp node)
    {
        inAASubAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAASubAExp(node);
    }

    public void inAAMultAExp(AAMultAExp node)
    {
        defaultIn(node);
    }

    public void outAAMultAExp(AAMultAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMultAExp(AAMultAExp node)
    {
        inAAMultAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAMultAExp(node);
    }

    public void inAADivAExp(AADivAExp node)
    {
        defaultIn(node);
    }

    public void outAADivAExp(AADivAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAADivAExp(AADivAExp node)
    {
        inAADivAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAADivAExp(node);
    }

    public void inAAMenosAExp(AAMenosAExp node)
    {
        defaultIn(node);
    }

    public void outAAMenosAExp(AAMenosAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAMenosAExp(AAMenosAExp node)
    {
        inAAMenosAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAMenosAExp(node);
    }

    public void inAANumInteiroAExp(AANumInteiroAExp node)
    {
        defaultIn(node);
    }

    public void outAANumInteiroAExp(AANumInteiroAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAANumInteiroAExp(AANumInteiroAExp node)
    {
        inAANumInteiroAExp(node);
        if(node.getNumInteiro() != null)
        {
            node.getNumInteiro().apply(this);
        }
        outAANumInteiroAExp(node);
    }

    public void inAANumRealAExp(AANumRealAExp node)
    {
        defaultIn(node);
    }

    public void outAANumRealAExp(AANumRealAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAANumRealAExp(AANumRealAExp node)
    {
        inAANumRealAExp(node);
        if(node.getNumReal() != null)
        {
            node.getNumReal().apply(this);
        }
        outAANumRealAExp(node);
    }

    public void inAACaractereAExp(AACaractereAExp node)
    {
        defaultIn(node);
    }

    public void outAACaractereAExp(AACaractereAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAACaractereAExp(AACaractereAExp node)
    {
        inAACaractereAExp(node);
        if(node.getCaractere() != null)
        {
            node.getCaractere().apply(this);
        }
        outAACaractereAExp(node);
    }

    public void inAASimAExp(AASimAExp node)
    {
        defaultIn(node);
    }

    public void outAASimAExp(AASimAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAASimAExp(AASimAExp node)
    {
        inAASimAExp(node);
        if(node.getSim() != null)
        {
            node.getSim().apply(this);
        }
        outAASimAExp(node);
    }

    public void inAANaoAExp(AANaoAExp node)
    {
        defaultIn(node);
    }

    public void outAANaoAExp(AANaoAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAANaoAExp(AANaoAExp node)
    {
        inAANaoAExp(node);
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        outAANaoAExp(node);
    }

    public void inAAStringAExp(AAStringAExp node)
    {
        defaultIn(node);
    }

    public void outAAStringAExp(AAStringAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAStringAExp(AAStringAExp node)
    {
        inAAStringAExp(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAAStringAExp(node);
    }

    public void inAAVariavelAExp(AAVariavelAExp node)
    {
        defaultIn(node);
    }

    public void outAAVariavelAExp(AAVariavelAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAVariavelAExp(AAVariavelAExp node)
    {
        inAAVariavelAExp(node);
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        outAAVariavelAExp(node);
    }

    public void inAAIdAExp(AAIdAExp node)
    {
        defaultIn(node);
    }

    public void outAAIdAExp(AAIdAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAIdAExp(AAIdAExp node)
    {
        inAAIdAExp(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAAIdAExp(node);
    }

    public void inAAVarExpAExp(AAVarExpAExp node)
    {
        defaultIn(node);
    }

    public void outAAVarExpAExp(AAVarExpAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAVarExpAExp(AAVarExpAExp node)
    {
        inAAVarExpAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAVarExpAExp(node);
    }

    public void inAAChamadaAExp(AAChamadaAExp node)
    {
        defaultIn(node);
    }

    public void outAAChamadaAExp(AAChamadaAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAChamadaAExp(AAChamadaAExp node)
    {
        inAAChamadaAExp(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        {
            List<PAExp> copy = new ArrayList<PAExp>(node.getDir());
            for(PAExp e : copy)
            {
                e.apply(this);
            }
        }
        outAAChamadaAExp(node);
    }

    public void inAAListaExpAExp(AAListaExpAExp node)
    {
        defaultIn(node);
    }

    public void outAAListaExpAExp(AAListaExpAExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAListaExpAExp(AAListaExpAExp node)
    {
        inAAListaExpAExp(node);
        {
            List<PAExp> copy = new ArrayList<PAExp>(node.getLista());
            for(PAExp e : copy)
            {
                e.apply(this);
            }
        }
        outAAListaExpAExp(node);
    }

    public void inAASeAComando(AASeAComando node)
    {
        defaultIn(node);
    }

    public void outAASeAComando(AASeAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAASeAComando(AASeAComando node)
    {
        inAASeAComando(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAASeAComando(node);
    }

    public void inAASeAbertoAComando(AASeAbertoAComando node)
    {
        defaultIn(node);
    }

    public void outAASeAbertoAComando(AASeAbertoAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAASeAbertoAComando(AASeAbertoAComando node)
    {
        inAASeAbertoAComando(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAASeAbertoAComando(node);
    }

    public void inAASeSenaoAComando(AASeSenaoAComando node)
    {
        defaultIn(node);
    }

    public void outAASeSenaoAComando(AASeSenaoAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAASeSenaoAComando(AASeSenaoAComando node)
    {
        inAASeSenaoAComando(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getMid() != null)
        {
            node.getMid().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAASeSenaoAComando(node);
    }

    public void inAAEnquantoAComando(AAEnquantoAComando node)
    {
        defaultIn(node);
    }

    public void outAAEnquantoAComando(AAEnquantoAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAEnquantoAComando(AAEnquantoAComando node)
    {
        inAAEnquantoAComando(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAEnquantoAComando(node);
    }

    public void inAAArrodeieAComando(AAArrodeieAComando node)
    {
        defaultIn(node);
    }

    public void outAAArrodeieAComando(AAArrodeieAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAArrodeieAComando(AAArrodeieAComando node)
    {
        inAAArrodeieAComando(node);
        if(node.getInit() != null)
        {
            node.getInit().apply(this);
        }
        if(node.getMid() != null)
        {
            node.getMid().apply(this);
        }
        if(node.getIncr() != null)
        {
            node.getIncr().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAArrodeieAComando(node);
    }

    public void inAASeSenaoDirectAComando(AASeSenaoDirectAComando node)
    {
        defaultIn(node);
    }

    public void outAASeSenaoDirectAComando(AASeSenaoDirectAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAASeSenaoDirectAComando(AASeSenaoDirectAComando node)
    {
        inAASeSenaoDirectAComando(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAASeSenaoDirectAComando(node);
    }

    public void inAAEnquantoDirectAComando(AAEnquantoDirectAComando node)
    {
        defaultIn(node);
    }

    public void outAAEnquantoDirectAComando(AAEnquantoDirectAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAEnquantoDirectAComando(AAEnquantoDirectAComando node)
    {
        inAAEnquantoDirectAComando(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAEnquantoDirectAComando(node);
    }

    public void inAAArrodeieDirectAComando(AAArrodeieDirectAComando node)
    {
        defaultIn(node);
    }

    public void outAAArrodeieDirectAComando(AAArrodeieDirectAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAArrodeieDirectAComando(AAArrodeieDirectAComando node)
    {
        inAAArrodeieDirectAComando(node);
        if(node.getInit() != null)
        {
            node.getInit().apply(this);
        }
        if(node.getMid() != null)
        {
            node.getMid().apply(this);
        }
        if(node.getIncr() != null)
        {
            node.getIncr().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAAArrodeieDirectAComando(node);
    }

    public void inAAReturnAComando(AAReturnAComando node)
    {
        defaultIn(node);
    }

    public void outAAReturnAComando(AAReturnAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAReturnAComando(AAReturnAComando node)
    {
        inAAReturnAComando(node);
        if(node.getAExp() != null)
        {
            node.getAExp().apply(this);
        }
        outAAReturnAComando(node);
    }

    public void inAAAtribuicaoAComando(AAAtribuicaoAComando node)
    {
        defaultIn(node);
    }

    public void outAAAtribuicaoAComando(AAAtribuicaoAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAAtribuicaoAComando(AAAtribuicaoAComando node)
    {
        inAAAtribuicaoAComando(node);
        if(node.getAAtrib() != null)
        {
            node.getAAtrib().apply(this);
        }
        outAAAtribuicaoAComando(node);
    }

    public void inAArBlocoAComando(AArBlocoAComando node)
    {
        defaultIn(node);
    }

    public void outAArBlocoAComando(AArBlocoAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArBlocoAComando(AArBlocoAComando node)
    {
        inAArBlocoAComando(node);
        if(node.getBloco() != null)
        {
            node.getBloco().apply(this);
        }
        outAArBlocoAComando(node);
    }

    public void inAArChamadaAComando(AArChamadaAComando node)
    {
        defaultIn(node);
    }

    public void outAArChamadaAComando(AArChamadaAComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArChamadaAComando(AArChamadaAComando node)
    {
        inAArChamadaAComando(node);
        if(node.getChamada() != null)
        {
            node.getChamada().apply(this);
        }
        outAArChamadaAComando(node);
    }

    public void inAArAtribuicaoAAtrib(AArAtribuicaoAAtrib node)
    {
        defaultIn(node);
    }

    public void outAArAtribuicaoAAtrib(AArAtribuicaoAAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArAtribuicaoAAtrib(AArAtribuicaoAAtrib node)
    {
        inAArAtribuicaoAAtrib(node);
        if(node.getEsq() != null)
        {
            node.getEsq().apply(this);
        }
        if(node.getDir() != null)
        {
            node.getDir().apply(this);
        }
        outAArAtribuicaoAAtrib(node);
    }

    public void inAAListaAtribAAtrib(AAListaAtribAAtrib node)
    {
        defaultIn(node);
    }

    public void outAAListaAtribAAtrib(AAListaAtribAAtrib node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAListaAtribAAtrib(AAListaAtribAAtrib node)
    {
        inAAListaAtribAAtrib(node);
        {
            List<PAAtrib> copy = new ArrayList<PAAtrib>(node.getAtribuicoes());
            for(PAAtrib e : copy)
            {
                e.apply(this);
            }
        }
        outAAListaAtribAAtrib(node);
    }
}
