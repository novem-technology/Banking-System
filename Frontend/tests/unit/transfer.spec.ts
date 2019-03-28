import { expect } from 'chai';
import { shallowMount } from '@vue/test-utils';
import Transfer from '@/components/account/Transfer.vue';

describe('Transfer.vue', () => {
  it('includes Transfer Money fields', () => {
    const wrapper = shallowMount(Transfer);
    expect(wrapper.text()).to.include('Transfer Money');
  });
});
