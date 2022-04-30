/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AMultFator extends PFator
{
    private PFator _fator_;
    private TMult _mult_;
    private PTermo _termo_;

    public AMultFator()
    {
        // Constructor
    }

    public AMultFator(
        @SuppressWarnings("hiding") PFator _fator_,
        @SuppressWarnings("hiding") TMult _mult_,
        @SuppressWarnings("hiding") PTermo _termo_)
    {
        // Constructor
        setFator(_fator_);

        setMult(_mult_);

        setTermo(_termo_);

    }

    @Override
    public Object clone()
    {
        return new AMultFator(
            cloneNode(this._fator_),
            cloneNode(this._mult_),
            cloneNode(this._termo_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMultFator(this);
    }

    public PFator getFator()
    {
        return this._fator_;
    }

    public void setFator(PFator node)
    {
        if(this._fator_ != null)
        {
            this._fator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fator_ = node;
    }

    public TMult getMult()
    {
        return this._mult_;
    }

    public void setMult(TMult node)
    {
        if(this._mult_ != null)
        {
            this._mult_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mult_ = node;
    }

    public PTermo getTermo()
    {
        return this._termo_;
    }

    public void setTermo(PTermo node)
    {
        if(this._termo_ != null)
        {
            this._termo_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._termo_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._fator_)
            + toString(this._mult_)
            + toString(this._termo_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fator_ == child)
        {
            this._fator_ = null;
            return;
        }

        if(this._mult_ == child)
        {
            this._mult_ = null;
            return;
        }

        if(this._termo_ == child)
        {
            this._termo_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._fator_ == oldChild)
        {
            setFator((PFator) newChild);
            return;
        }

        if(this._mult_ == oldChild)
        {
            setMult((TMult) newChild);
            return;
        }

        if(this._termo_ == oldChild)
        {
            setTermo((PTermo) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
