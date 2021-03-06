/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class ADecFuncao extends PDecFuncao
{
    private TArrume _arrume_;
    private PTipoRetorno _tipoRetorno_;
    private TAssim _assim_;
    private TDoisPt _doisPt_;
    private TId _id_;
    private TParEsq _parEsq_;
    private PParametros _parametros_;
    private TParDir _parDir_;
    private PBloco _bloco_;

    public ADecFuncao()
    {
        // Constructor
    }

    public ADecFuncao(
        @SuppressWarnings("hiding") TArrume _arrume_,
        @SuppressWarnings("hiding") PTipoRetorno _tipoRetorno_,
        @SuppressWarnings("hiding") TAssim _assim_,
        @SuppressWarnings("hiding") TDoisPt _doisPt_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TParEsq _parEsq_,
        @SuppressWarnings("hiding") PParametros _parametros_,
        @SuppressWarnings("hiding") TParDir _parDir_,
        @SuppressWarnings("hiding") PBloco _bloco_)
    {
        // Constructor
        setArrume(_arrume_);

        setTipoRetorno(_tipoRetorno_);

        setAssim(_assim_);

        setDoisPt(_doisPt_);

        setId(_id_);

        setParEsq(_parEsq_);

        setParametros(_parametros_);

        setParDir(_parDir_);

        setBloco(_bloco_);

    }

    @Override
    public Object clone()
    {
        return new ADecFuncao(
            cloneNode(this._arrume_),
            cloneNode(this._tipoRetorno_),
            cloneNode(this._assim_),
            cloneNode(this._doisPt_),
            cloneNode(this._id_),
            cloneNode(this._parEsq_),
            cloneNode(this._parametros_),
            cloneNode(this._parDir_),
            cloneNode(this._bloco_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecFuncao(this);
    }

    public TArrume getArrume()
    {
        return this._arrume_;
    }

    public void setArrume(TArrume node)
    {
        if(this._arrume_ != null)
        {
            this._arrume_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrume_ = node;
    }

    public PTipoRetorno getTipoRetorno()
    {
        return this._tipoRetorno_;
    }

    public void setTipoRetorno(PTipoRetorno node)
    {
        if(this._tipoRetorno_ != null)
        {
            this._tipoRetorno_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tipoRetorno_ = node;
    }

    public TAssim getAssim()
    {
        return this._assim_;
    }

    public void setAssim(TAssim node)
    {
        if(this._assim_ != null)
        {
            this._assim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assim_ = node;
    }

    public TDoisPt getDoisPt()
    {
        return this._doisPt_;
    }

    public void setDoisPt(TDoisPt node)
    {
        if(this._doisPt_ != null)
        {
            this._doisPt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._doisPt_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    public TParEsq getParEsq()
    {
        return this._parEsq_;
    }

    public void setParEsq(TParEsq node)
    {
        if(this._parEsq_ != null)
        {
            this._parEsq_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parEsq_ = node;
    }

    public PParametros getParametros()
    {
        return this._parametros_;
    }

    public void setParametros(PParametros node)
    {
        if(this._parametros_ != null)
        {
            this._parametros_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parametros_ = node;
    }

    public TParDir getParDir()
    {
        return this._parDir_;
    }

    public void setParDir(TParDir node)
    {
        if(this._parDir_ != null)
        {
            this._parDir_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parDir_ = node;
    }

    public PBloco getBloco()
    {
        return this._bloco_;
    }

    public void setBloco(PBloco node)
    {
        if(this._bloco_ != null)
        {
            this._bloco_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._bloco_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._arrume_)
            + toString(this._tipoRetorno_)
            + toString(this._assim_)
            + toString(this._doisPt_)
            + toString(this._id_)
            + toString(this._parEsq_)
            + toString(this._parametros_)
            + toString(this._parDir_)
            + toString(this._bloco_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._arrume_ == child)
        {
            this._arrume_ = null;
            return;
        }

        if(this._tipoRetorno_ == child)
        {
            this._tipoRetorno_ = null;
            return;
        }

        if(this._assim_ == child)
        {
            this._assim_ = null;
            return;
        }

        if(this._doisPt_ == child)
        {
            this._doisPt_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._parEsq_ == child)
        {
            this._parEsq_ = null;
            return;
        }

        if(this._parametros_ == child)
        {
            this._parametros_ = null;
            return;
        }

        if(this._parDir_ == child)
        {
            this._parDir_ = null;
            return;
        }

        if(this._bloco_ == child)
        {
            this._bloco_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._arrume_ == oldChild)
        {
            setArrume((TArrume) newChild);
            return;
        }

        if(this._tipoRetorno_ == oldChild)
        {
            setTipoRetorno((PTipoRetorno) newChild);
            return;
        }

        if(this._assim_ == oldChild)
        {
            setAssim((TAssim) newChild);
            return;
        }

        if(this._doisPt_ == oldChild)
        {
            setDoisPt((TDoisPt) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._parEsq_ == oldChild)
        {
            setParEsq((TParEsq) newChild);
            return;
        }

        if(this._parametros_ == oldChild)
        {
            setParametros((PParametros) newChild);
            return;
        }

        if(this._parDir_ == oldChild)
        {
            setParDir((TParDir) newChild);
            return;
        }

        if(this._bloco_ == oldChild)
        {
            setBloco((PBloco) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
