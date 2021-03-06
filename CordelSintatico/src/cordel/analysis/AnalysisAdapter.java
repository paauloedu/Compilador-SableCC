/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.analysis;

import java.util.*;
import cordel.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArProgramaAPrograma(AArProgramaAPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArDecVariavelADecVariavel(AArDecVariavelADecVariavel node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArDecFuncaoADecFuncao(AArDecFuncaoADecFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArParametrosAParametros(AArParametrosAParametros node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArBlocoABloco(AArBlocoABloco node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArInteiroATipo(AArInteiroATipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArCaractereATipo(AArCaractereATipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArFloatATipo(AArFloatATipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArBoolATipo(AArBoolATipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAANadaATipo(AANadaATipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArVetorATipo(AArVetorATipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAIgualAExp(AAIgualAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMenorIgualAExp(AAMenorIgualAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMaiorIgualAExp(AAMaiorIgualAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMenorAExp(AAMenorAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMaiorAExp(AAMaiorAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAANegacaoAExp(AANegacaoAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAAndAExp(AAAndAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAOrAExp(AAOrAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASomaAExp(AASomaAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASubAExp(AASubAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMultAExp(AAMultAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAADivAExp(AADivAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMenosAExp(AAMenosAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAANumInteiroAExp(AANumInteiroAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAANumRealAExp(AANumRealAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAACaractereAExp(AACaractereAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASimAExp(AASimAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAANaoAExp(AANaoAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAStringAExp(AAStringAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAVariavelAExp(AAVariavelAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAIdAExp(AAIdAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAVarExpAExp(AAVarExpAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAChamadaAExp(AAChamadaAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAListaExpAExp(AAListaExpAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASeAComando(AASeAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASeAbertoAComando(AASeAbertoAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASeSenaoAComando(AASeSenaoAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAEnquantoAComando(AAEnquantoAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAArrodeieAComando(AAArrodeieAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASeSenaoDirectAComando(AASeSenaoDirectAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAEnquantoDirectAComando(AAEnquantoDirectAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAArrodeieDirectAComando(AAArrodeieDirectAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAReturnAComando(AAReturnAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAAtribuicaoAComando(AAAtribuicaoAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArBlocoAComando(AArBlocoAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArChamadaAComando(AArChamadaAComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArAtribuicaoAAtrib(AArAtribuicaoAAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAListaAtribAAtrib(AAListaAtribAAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumInteiro(TNumInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumReal(TNumReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLinhaComent(TLinhaComent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBoxComent(TBoxComent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSoma(TSoma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSubt(TSubt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAtrib(TAtrib node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSepParam(TSepParam node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParEsq(TParEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParDir(TParDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColEsq(TColEsq node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColDir(TColDir node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIg(TMenorIg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIg(TMaiorIg node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPtVirgula(TPtVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPt(TDoisPt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFloat(TFloat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTChar(TChar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBool(TBool node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNada(TNada node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFor(TFor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepeat(TRepeat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRuma(TRuma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMande(TMande node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVolta(TVolta node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArrume(TArrume node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAssim(TAssim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSim(TSim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVazio(TVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
