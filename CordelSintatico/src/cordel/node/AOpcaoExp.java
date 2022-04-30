/* This file was generated by SableCC (http://www.sablecc.org/). */

package cordel.node;

import cordel.analysis.*;

@SuppressWarnings("nls")
public final class AOpcaoExp extends PExp
{
    private POpcao _opcao_;

    public AOpcaoExp()
    {
        // Constructor
    }

    public AOpcaoExp(
        @SuppressWarnings("hiding") POpcao _opcao_)
    {
        // Constructor
        setOpcao(_opcao_);

    }

    @Override
    public Object clone()
    {
        return new AOpcaoExp(
            cloneNode(this._opcao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAOpcaoExp(this);
    }

    public POpcao getOpcao()
    {
        return this._opcao_;
    }

    public void setOpcao(POpcao node)
    {
        if(this._opcao_ != null)
        {
            this._opcao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._opcao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._opcao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._opcao_ == child)
        {
            this._opcao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._opcao_ == oldChild)
        {
            setOpcao((POpcao) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
