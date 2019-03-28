import { expect } from 'chai';
import { shallowMount } from '@vue/test-utils';
import Transactions from '@/components/account/Transactions.vue';

describe('Transactions.vue', () => {
  it('includes Recent Transactions fields', () => {
    const wrapper = shallowMount(Transactions);
    expect(wrapper.text()).to.include('Recent Transactions');
  });
});
